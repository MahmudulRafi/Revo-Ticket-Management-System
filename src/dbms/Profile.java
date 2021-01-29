/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms;

import dbms.EditProfile;
import dbms.FnClass;
import dbms.login;
import dbms.my_con;
import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.plaf.ColorUIResource;

/**
 *
 * @author Hasan Rafi
 */
public class Profile extends javax.swing.JFrame {
    
    public Profile() throws IOException {
        initComponents();
        
    setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        login_name.setText(String.valueOf(FnClass.empname).toString());
        


        PreparedStatement st;
        ResultSet rs;
        
        String query = "SELECT * FROM `user` WHERE `username` = '"+login_name.getText()+"'";

        try {
            st = my_con.getConnection().prepareStatement(query);

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

                
            fullnamelabel.setText(fname);
            userlabel.setText(String.valueOf(FnClass.empname).toString());
            passlabel.setText(pass);
            genderlabel.setText(gen);
            phonelabel.setText(mno);
         
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
   


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        fullnamelabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userlabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        genderlabel = new javax.swing.JLabel();
        phonelabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        passlabel = new javax.swing.JPasswordField();
        genlabel = new javax.swing.JLabel();
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
        setAutoRequestFocus(false);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(1460, 530));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fullnamelabel.setFont(new java.awt.Font("Trebuchet MS", 1, 30)); // NOI18N
        fullnamelabel.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(fullnamelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 474, 55));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 82, 24));

        userlabel.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        userlabel.setForeground(new java.awt.Color(255, 255, 255));
        userlabel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), javax.swing.BorderFactory.createMatteBorder(0, 18, 0, 0, new java.awt.Color(51, 51, 51))));
        userlabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(userlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 234, 45));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Password");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 82, 24));

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gender");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 70, 24));

        genderlabel.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        genderlabel.setForeground(new java.awt.Color(255, 255, 255));
        genderlabel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), javax.swing.BorderFactory.createMatteBorder(0, 18, 0, 0, new java.awt.Color(51, 51, 51))));
        jPanel3.add(genderlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 234, 45));

        phonelabel.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        phonelabel.setForeground(new java.awt.Color(255, 255, 255));
        phonelabel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), javax.swing.BorderFactory.createMatteBorder(0, 18, 0, 0, new java.awt.Color(51, 51, 51))));
        jPanel3.add(phonelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 234, 45));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Mobile No ");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, 82, 24));

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Edit Profile");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 520, 99, 37));

        passlabel.setEditable(false);
        passlabel.setBackground(new java.awt.Color(51, 51, 51));
        passlabel.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        passlabel.setForeground(new java.awt.Color(255, 255, 255));
        passlabel.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), javax.swing.BorderFactory.createMatteBorder(0, 18, 0, 0, new java.awt.Color(51, 51, 51))));
        passlabel.setFocusable(false);
        passlabel.setRequestFocusEnabled(false);
        passlabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passlabelActionPerformed(evt);
            }
        });
        jPanel3.add(passlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 234, 41));

        genlabel.setFont(new java.awt.Font("Trebuchet MS", 1, 30)); // NOI18N
        genlabel.setForeground(new java.awt.Color(255, 204, 153));
        genlabel.setText("Hello!");
        jPanel3.add(genlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));

        image_label.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(109, 109, 109)));
        jPanel3.add(image_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 180, 160, 160));

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("     Employee Profile");
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
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(5, 5, 5)
                        .addComponent(login_name, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(262, 262, 262)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(minimize_1)
                .addGap(9, 9, 9)
                .addComponent(close_3)
                .addGap(121, 121, 121))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(minimize_1)
                            .addComponent(close_3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(login_name, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(29, 29, 29)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 811, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void passlabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passlabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passlabelActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       
        
        try {
            EditProfile epro = new EditProfile();
            epro.setVisible(true);
            epro.pack();
            epro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }//GEN-LAST:event_jButton1MouseClicked

  
 
    public static void main(String args[]) {
        
       
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                try {
                    new Profile().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel close_3;
    private javax.swing.JLabel fullnamelabel;
    private javax.swing.JLabel genderlabel;
    private javax.swing.JLabel genlabel;
    private javax.swing.JLabel image_label;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel login_name;
    private javax.swing.JLabel minimize_1;
    private javax.swing.JPasswordField passlabel;
    private javax.swing.JLabel phonelabel;
    private javax.swing.JLabel userlabel;
    // End of variables declaration//GEN-END:variables

    private void columnrenderer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}