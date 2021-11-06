
package RevoTMS;

import static RevoTMS.my_con.getConnection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;


public class Route extends javax.swing.JFrame {
    
    public Route() {
        initComponents();
        
       //DB to table data 
        show_list();
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
         login_name.setText(String.valueOf(FnClass.empname).toString());
        
        // table resizer
        table2.setAutoResizeMode(table2.AUTO_RESIZE_OFF);
        TableColumn col = table2.getColumnModel().getColumn(0);
        col.setPreferredWidth(120);
        col = table2.getColumnModel().getColumn(1);
        col.setPreferredWidth(252);
        col = table2.getColumnModel().getColumn(2);
        col.setPreferredWidth(135);
        
        // focus tranparent color 
        UIDefaults defaults = UIManager.getLookAndFeelDefaults();
        defaults.put("Button.focus", new ColorUIResource(new Color(0,0,0,0)));
        
        //table data to show center
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        int alignment = 0;
        centerRenderer.setHorizontalAlignment(alignment);
        TableModel model = table2.getModel();
        for (int columnindex = 0; columnindex < model.getColumnCount(); columnindex++) {
            table2.getColumnModel().getColumn(columnindex).setCellRenderer(centerRenderer);
        
        }
       
        
        }
    
    public ArrayList <Route_class> RouteList(){
        ArrayList <Route_class> RouteList = new ArrayList<>();
        try{
            
            String queryl = "SELECT * FROM route_list";
             Statement st = my_con.getConnection().createStatement();
             ResultSet rs = st.executeQuery(queryl);
           
             Route_class route;
            
            while(rs.next()){
                route = new Route_class(rs.getInt("route_no"), rs.getString("routes"), rs.getInt("price"));
                RouteList.add(route);
            }
        }catch(Exception e){
            
        }
        return RouteList;
    }
        

    public void show_list(){
        ArrayList<Route_class> list = RouteList();
        
        DefaultTableModel model = (DefaultTableModel) table2.getModel();
        Object[] row = new Object[3];
        
        for(int i=0; i<list.size(); i++)
        {
            row[0] = list.get(i).getroute_no();
            row[1] = list.get(i).getroutes();
            row[2] = list.get(i).getprice();
            
            model.addRow(row);
            table2.setRowHeight(i,29);
        }
    }
       public void executeSQLQuery(String query, String message){
        Connection con = getConnection();
        Statement st;
        try{
            st = con.createStatement();
            if(st.executeUpdate(query) == 1)
            {
                DefaultTableModel dtm = (DefaultTableModel) table2.getModel();
                dtm.setRowCount(0);
                show_list();
                
                route_no.setText("");
                route.setText("");
                t_price.setText("");
                
                JOptionPane.showMessageDialog(null,"Route " +message+ " Successfully");
            }
            else{
                 JOptionPane.showMessageDialog(null," Not " +message);
            }
        }catch(Exception ex){
            
        }
        
    }
           
    
   


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        route_no = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        route = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t_price = new javax.swing.JTextField();
        insertbutton = new javax.swing.JButton();
        updatebutton = new javax.swing.JButton();
        Deletebutton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
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

        route_no.setEditable(false);
        route_no.setBackground(new java.awt.Color(204, 204, 204));
        route_no.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        route_no.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 7, 1, 1, new java.awt.Color(204, 204, 204)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Route No");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Details");

        route.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        route.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 7, 1, 1, new java.awt.Color(255, 255, 255)));
        route.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routeActionPerformed(evt);
            }
        });
        route.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                routeKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("T. Price");

        t_price.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        t_price.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 7, 1, 1, new java.awt.Color(255, 255, 255)));
        t_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_priceActionPerformed(evt);
            }
        });
        t_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_priceKeyTyped(evt);
            }
        });

        insertbutton.setBackground(new java.awt.Color(255, 102, 102));
        insertbutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        insertbutton.setForeground(new java.awt.Color(255, 255, 255));
        insertbutton.setText("New");
        insertbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        insertbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        insertbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertbuttonActionPerformed(evt);
            }
        });

        updatebutton.setBackground(new java.awt.Color(255, 102, 102));
        updatebutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        updatebutton.setForeground(new java.awt.Color(255, 255, 255));
        updatebutton.setText("Update");
        updatebutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        updatebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebuttonActionPerformed(evt);
            }
        });

        Deletebutton.setBackground(new java.awt.Color(255, 102, 102));
        Deletebutton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Deletebutton.setForeground(new java.awt.Color(255, 255, 255));
        Deletebutton.setText("Delete");
        Deletebutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Deletebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebuttonActionPerformed(evt);
            }
        });

        table2.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Route No", "Details", "T. Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        table2.setFocusable(false);
        table2.setOpaque(false);
        table2.setRequestFocusEnabled(false);
        table2.setSelectionBackground(new java.awt.Color(0, 204, 204));
        table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(insertbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(updatebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(Deletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t_price, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(route_no, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(route, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(197, 197, 197)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(221, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(143, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(route_no, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(route, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4))
                            .addComponent(t_price, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(136, 136, 136)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(insertbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updatebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Deletebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105))
        );

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("              Routes ");
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

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RevoTMS/images/SignOut.png"))); // NOI18N
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
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(5, 5, 5)
                        .addComponent(login_name, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(358, 358, 358)
                .addComponent(minimize_1)
                .addGap(8, 8, 8)
                .addComponent(close_3)
                .addGap(147, 147, 147))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minimize_1)
                    .addComponent(close_3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(login_name, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(26, 26, 26)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void routeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_routeActionPerformed

    private void t_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_priceActionPerformed

    private void insertbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertbuttonActionPerformed

       /* NewRoute nroute = new NewRoute();
        nroute.pack();
        nroute.setVisible(true); */
        
        
        String query = "INSERT INTO `route_list`(`routes`, `price`) VALUES ('"+route.getText()+"','"+t_price.getText()+"')";

        executeSQLQuery(query,"Inserted");
    }//GEN-LAST:event_insertbuttonActionPerformed

    private void table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table2MouseClicked

        TableModel modelo =  table2.getModel();

        route_no.setText(modelo.getValueAt(table2.getSelectedRow(), 0).toString());
        route.setText(modelo.getValueAt(table2.getSelectedRow(), 1).toString());
        t_price.setText(modelo.getValueAt(table2.getSelectedRow(), 2).toString());
    }//GEN-LAST:event_table2MouseClicked

    private void updatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebuttonActionPerformed
       
        if(route.getText().equals("") || t_price.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Check Empty Field");
        }
        else{
        String query ="UPDATE `route_list` SET `routes`='"+route.getText()+"',`price`='"+t_price.getText()+"' WHERE `route_no` = '"+route_no.getText()+"'";
        executeSQLQuery(query,"Updated");
        }
    }//GEN-LAST:event_updatebuttonActionPerformed

    private void DeletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebuttonActionPerformed
        
       String query ="DELETE FROM `route_list` WHERE `route_no` = '"+route_no.getText()+"'";
       executeSQLQuery(query,"Deleted");
    }//GEN-LAST:event_DeletebuttonActionPerformed

    private void t_priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_priceKeyTyped
       
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_t_priceKeyTyped

    private void routeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_routeKeyPressed
      
        int key = evt.getKeyCode();

        if (key == 10) {
            t_price.requestFocus();
        }
    }//GEN-LAST:event_routeKeyPressed

  
 
    public static void main(String args[]) {
        
       
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Route().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deletebutton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel close_3;
    private javax.swing.JButton insertbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel login_name;
    private javax.swing.JLabel minimize_1;
    private javax.swing.JTextField route;
    private javax.swing.JTextField route_no;
    private javax.swing.JTextField t_price;
    private javax.swing.JTable table2;
    private javax.swing.JButton updatebutton;
    // End of variables declaration//GEN-END:variables

    private void columnrenderer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}