
package dbms;

import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.table.TableModel;


public class Print extends javax.swing.JFrame {

    private String lname;
    private String lphone;

   
    public Print() {
        initComponents();
      
    }
    
    public Print(String name, String phone,String seat, String subtotal, String tax , String total, TableModel model) {
    
        initComponents();
 
        this.lname = name;
        this.lphone = phone;
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("E   dd.MM.yyyy");
        String reportDate = ft.format(date);
        
        Date obj = new Date();
        String datetime = obj.toString();
       
       area.setText(area.getText()+" *****************************************\n");
       area.setText(area.getText()+" *****  Revo Ticket Management System  ***");
       area.setText(area.getText()+"\n *****************************************");
       area.setText(area.getText()+"\n");
       area.setText(area.getText()+"\n    Reservation Name :  "+name+"\n");
       area.setText(area.getText()+"           Mobile No :  "+phone+"");
       area.setText(area.getText()+"\n");
       area.setText(area.getText()+"\n");
       for(int i = 0; i<model.getRowCount();i++){
            String route = (String)model.getValueAt(i, 0);
            String time = (String)model.getValueAt(i, 1);
            String unit = (String)model.getValueAt(i, 2);
            String qty = (String)model.getValueAt(i, 3);
            String mtotal = (String)model.getValueAt(i, 4);
       
       area.setText(area.getText()+"   -------------------------------------");
       area.setText(area.getText()+"\n");
       area.setText(area.getText()+"\n");
       area.setText(area.getText()+"\tRoute : "+route);
       area.setText(area.getText()+"\n");
       area.setText(area.getText()+"\tJourney Date : "+reportDate);
       area.setText(area.getText()+"\n");
//       area.setText(area.getText()+"   -------------------------------------");
      // area.setText(area.getText()+"     --------\t ----\t ---\t -----");
       area.setText(area.getText()+"\tDeparture Time : "+time);
       area.setText(area.getText()+"\n");
       area.setText(area.getText()+"\tSeats : "+seat+" #"+qty+"");
       area.setText(area.getText()+"\n");
       area.setText(area.getText()+"\tSeat Fare : "+unit+" Tk");
       area.setText(area.getText()+"\n");
        area.setText(area.getText()+"\tTotal : "+mtotal+" Tk");
//            area.setText(area.getText()+"  "+route+"\t"+unit+"\t  "+qty+"\t"+mtotal+"");
            area.setText(area.getText()+"\n");
            
       }
       area.setText(area.getText()+"\n");
       area.setText(area.getText()+"\n");
       area.setText(area.getText()+"\n");
       area.setText(area.getText()+"\t\t\t  Authorized Seal");
       area.setText(area.getText()+"\n");
       area.setText(area.getText()+"   -------------------------------------");
//        area.setText(area.getText()+"\n");
//       area.setText(area.getText()+"\t\t      Subtotal: "+subtotal+"");
//        area.setText(area.getText()+"\n");
//       
//       area.setText(area.getText()+"\t\t           Tax: "+tax+"");
//        area.setText(area.getText()+"\n");
//       area.setText(area.getText()+"\t\t         Total: "+total+"");
//       
       
   String uname = (String.valueOf(FnClass.fullname).toString());
   area.setText(area.getText()+"\n");
   area.setText(area.getText()+"\tBill By : "+uname);
   area.setText(area.getText()+"\n");
   area.setText(area.getText()+"\t"+datetime+"");
   area.setText(area.getText()+"\n");
   area.setText(area.getText()+"   -------------------------------------");
    }

   

  
  


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        printbutton = new javax.swing.JButton();
        closebutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("         TICKET");

        area.setEditable(false);
        area.setColumns(20);
        area.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        area.setRows(5);
        area.setBorder(null);
        area.setFocusable(false);
        area.setRequestFocusEnabled(false);
        area.setSelectionColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(area);

        printbutton.setBackground(new java.awt.Color(255, 102, 102));
        printbutton.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        printbutton.setForeground(new java.awt.Color(255, 255, 255));
        printbutton.setText("Print");
        printbutton.setToolTipText("");
        printbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        printbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        printbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printbuttonActionPerformed(evt);
            }
        });
        printbutton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                printbuttonKeyPressed(evt);
            }
        });

        closebutton.setBackground(new java.awt.Color(255, 102, 102));
        closebutton.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        closebutton.setForeground(new java.awt.Color(255, 255, 255));
        closebutton.setText("Close");
        closebutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        closebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(printbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(closebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(136, 136, 136))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(closebutton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void printbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printbuttonActionPerformed
       
        try{
            area.print();
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_printbuttonActionPerformed

    private void closebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebuttonActionPerformed
                       
                            this.dispose();
    }//GEN-LAST:event_closebuttonActionPerformed

    private void printbuttonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_printbuttonKeyPressed
       
    }//GEN-LAST:event_printbuttonKeyPressed

   
    public static void main(String args[]) {
        

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Print().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JButton closebutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton printbutton;
    // End of variables declaration//GEN-END:variables
}
