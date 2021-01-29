/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms;


import static dbms.my_con.getConnection;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Hasan Rafi
 */
public class EditProfile extends javax.swing.JFrame {
    
    String path = null;
    
    public EditProfile() throws IOException {
        initComponents();
        
        this.setFocusable(true);
        this.setLocationRelativeTo(null);
        
        login_name.setText(String.valueOf(FnClass.empname).toString());
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        PreparedStatement st;
        ResultSet rs;
        
        String query1 = "SELECT * FROM `user` WHERE `username` = '"+login_name.getText()+"'";

        try {
            st = my_con.getConnection().prepareStatement(query1);

            rs = st.executeQuery();
            
            if(rs.next()){
                

                String fname = rs.getString("full_name");

                String pass = rs.getString("password");

                String mno = rs.getString("phone");

                String gen = rs.getString("gender");
                
                BufferedImage im = ImageIO.read(rs.getBinaryStream("image"));
                ImageIcon ik = new ImageIcon(im);
                Image img = ik.getImage();
                Image newimg = img.getScaledInstance(image_label.getWidth(),image_label.getHeight(),java.awt.Image.SCALE_SMOOTH);
                ik = new ImageIcon(newimg);
                image_label.setIcon(ik); 

                
            fnametxt.setText(fname);
            unametxt.setText(String.valueOf(FnClass.empname).toString());
            passtxt.setText(pass);
            
            mnotxt.setText(mno);
         
            }
            else
            {
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
        
        // table resizer
        
        // focus tranparent color 
        UIDefaults defaults = UIManager.getLookAndFeelDefaults();
        defaults.put("Button.focus", new ColorUIResource(new Color(0,0,0,0)));
        
        // combobox focus off
        
        
        
        }
   
     public void executeSQLQuery(String query, String message){
        Connection con = getConnection();
        Statement st;
        try{
            st = con.createStatement();
            if(st.executeUpdate(query) == 1)
            {
 
                
                JOptionPane.showMessageDialog(null,"Data " +message+ " Successfully");
            }
            else{
                 JOptionPane.showMessageDialog(null,"Data Not " +message);
            }
        }catch(Exception ex){
            
        }
     }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        updatebtn = new javax.swing.JButton();
        fnametxt = new javax.swing.JTextField();
        unametxt = new javax.swing.JTextField();
        mnotxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        passtxt = new javax.swing.JTextField();
        image_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        minimize_1 = new javax.swing.JLabel();
        close_3 = new javax.swing.JLabel();
        login_name = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 82, 24));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 82, 24));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Mobile No ");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 470, -1, 24));

        updatebtn.setBackground(new java.awt.Color(0, 153, 153));
        updatebtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(255, 255, 255));
        updatebtn.setText("Update");
        updatebtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        updatebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel3.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 460, 99, 37));

        fnametxt.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        fnametxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 18, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel3.add(fnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 230, 39));

        unametxt.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        unametxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 18, 0, 0, new java.awt.Color(255, 255, 255)));
        jPanel3.add(unametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 230, 36));

        mnotxt.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        mnotxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 18, 0, 0, new java.awt.Color(255, 255, 255)));
        mnotxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnotxtActionPerformed(evt);
            }
        });
        jPanel3.add(mnotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, 230, 37));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Full Name");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 82, 24));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setForeground(new java.awt.Color(255, 255, 204));
        jButton2.setText("Change");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 310, 70, 27));

        passtxt.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        passtxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 18, 0, 0, new java.awt.Color(255, 255, 255)));
        passtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passtxtActionPerformed(evt);
            }
        });
        jPanel3.add(passtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 230, 36));
        jPanel3.add(image_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 110, 160, 160));

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("         Edit Profile");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel1KeyPressed(evt);
            }
        });

        minimize_1.setFont(new java.awt.Font("Tahoma", 1, 19)); // NOI18N
        minimize_1.setForeground(new java.awt.Color(240, 240, 240));
        minimize_1.setText(" - ");
        minimize_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        minimize_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimize_1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimize_1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimize_1MouseExited(evt);
            }
        });

        close_3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        close_3.setForeground(new java.awt.Color(240, 240, 240));
        close_3.setText(" x ");
        close_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        close_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                close_3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                close_3MouseExited(evt);
            }
        });

        login_name.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        login_name.setForeground(new java.awt.Color(255, 255, 255));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbms/images/SignOut.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Login as:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(5, 5, 5)
                        .addComponent(login_name, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(262, 262, 262)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimize_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close_3)
                .addGap(86, 86, 86))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1430, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(login_name, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(minimize_1)
                            .addComponent(close_3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(29, 29, 29)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 852, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void minimize_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_1MouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimize_1MouseClicked

    private void minimize_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_1MouseEntered
        Border label_border=BorderFactory.createMatteBorder(1, 1, 1, 1, Color.orange);
        minimize_1.setBorder(label_border);
        minimize_1.setForeground(Color.orange);
    }//GEN-LAST:event_minimize_1MouseEntered

    private void minimize_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_1MouseExited
        Border label_border=BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        minimize_1.setBorder(label_border);
        minimize_1.setForeground(Color.white);
    }//GEN-LAST:event_minimize_1MouseExited

    private void close_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_3MouseClicked

//                            Main main = new Main();
//                            main.setVisible(true);
//                            main.pack();
//                            main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            this.dispose();
    }//GEN-LAST:event_close_3MouseClicked

    private void close_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_3MouseEntered
        Border label_border=BorderFactory.createMatteBorder(1, 1, 1, 1, Color.orange);
        close_3.setBorder(label_border);
        close_3.setForeground(Color.orange);
    }//GEN-LAST:event_close_3MouseEntered

    private void close_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_3MouseExited
        Border label_border=BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        close_3.setBorder(label_border);
        close_3.setForeground(Color.white);
    }//GEN-LAST:event_close_3MouseExited

    private void jLabel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel1KeyPressed
        
//        int key = evt.getKeyCode();
//        
//        if(key == 10){
//            nametf.requestFocus();
//        }
        
    }//GEN-LAST:event_jLabel1KeyPressed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked

        int cnf = JOptionPane.showConfirmDialog(null, "    Sign Out Your Account  \n\n","Sign Out",JOptionPane.YES_NO_OPTION);

        if(cnf == 0){
            login lon = new login();
            lon.setVisible(true);
            lon.pack();
            lon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed

        
            
            
        String query ="UPDATE `user` SET `full_name`='"+fnametxt.getText()+"',`username`='"+unametxt.getText()+"',`password`='"+passtxt.getText()+"',`phone`='"+mnotxt.getText()+"' WHERE `username` = '"+login_name.getText()+"'";
        
        executeSQLQuery(query,"Updated"); 
     /* 
       
       String fname = fnametxt.getText();
       String uname = unametxt.getText();
       String pass = passtxt.getText().toString();
       String phone = mnotxt.getText();
       String log = login_name.getText();
       
       PreparedStatement ps;
       ResultSet rs = null;
       
       String UQuery = "UPDATE `user` SET `full_name` = ? , `username` = ? , `password` = ? , `phone` = ?  WHERE `username` = ? ";
              

           try{
               
               ps =  ps = my_con.getConnection().prepareStatement(UQuery);
             
               ps.setString(1, fname);
               ps.setString(2, uname);
               ps.setString(3, pass);
               ps.setString(4, phone);
    

//           try {
//               InputStream images;
//               images = new FileInputStream(new File(path));
//              //  ps.setString(5, unamet);
//           } catch (FileNotFoundException ex) {
//               Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
//           }

               ps.setString(5, log);
               
               if(ps.executeUpdate() != 0){
                   JOptionPane.showMessageDialog(null, "Updated");
                   
               }
               else
               {
                   JOptionPane.showMessageDialog(null, "Not Updated");
               }
                       
               
           }
           catch (SQLException ex) {
                    Logger.getLogger(registration.class.getName()).log(Level.SEVERE, null, ex);
                } 
           
           */
        
            try {
            Profile pro;
            pro = new Profile();
            pro.setVisible(true);
        pro.pack();
        pro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(EditProfile.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_updatebtnActionPerformed

    private void mnotxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnotxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnotxtActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        JFileChooser chooser = new JFileChooser();

        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));

        FileNameExtensionFilter extension = new FileNameExtensionFilter("*images","jpg","png","jpeg");
        chooser.addChoosableFileFilter(extension);

        int filestate = chooser.showSaveDialog(null);

        if(filestate == JFileChooser.APPROVE_OPTION){

            File selectedImage = chooser.getSelectedFile();
            path = selectedImage.getAbsolutePath();

            image_label.setIcon(resetImageSize(path,null));
            
            String img = selectedImage.getName();
//            this.photopath = path;
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void passtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passtxtActionPerformed

  
 
    public static void main(String args[]) {
        
       
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close_3;
    private javax.swing.JTextField fnametxt;
    private javax.swing.JLabel image_label;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel login_name;
    private javax.swing.JLabel minimize_1;
    private javax.swing.JTextField mnotxt;
    private javax.swing.JTextField passtxt;
    private javax.swing.JTextField unametxt;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables

    private void columnrenderer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ImageIcon resetImageSize(String path,byte[] photo){
        
        ImageIcon myphoto = null;
        
        if(path !=null){
            myphoto = new ImageIcon(path);
            
        }
        else{
            myphoto = new ImageIcon(photo);
        }
        Image img = myphoto.getImage();
        
        Image img1=img.getScaledInstance(image_label.getWidth(), image_label.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon ph = new ImageIcon(img1);
       
        return ph;
    }

}
