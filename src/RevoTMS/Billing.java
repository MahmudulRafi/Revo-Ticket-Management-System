/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RevoTMS;

import static RevoTMS.my_con.getConnection;
import java.awt.Color;
import java.awt.event.ActionEvent;
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
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.border.Border;
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
public class Billing extends javax.swing.JFrame {

    private String seatvar;
    public static String selectedSeat;
    public static String selectedQuantity;

    public Billing() {
        initComponents();
        AutoCompleteDecorator.decorate(combobox1);
        my_con connection = null;
        calc();


        timele.setVisible(false);
        seattf.setText("");
        login_name.setText(String.valueOf(FnClass.empname).toString());

        // table resizer
        table1.setAutoResizeMode(table1.AUTO_RESIZE_OFF);
        TableColumn col = table1.getColumnModel().getColumn(0);
        col.setPreferredWidth(177);
        col = table1.getColumnModel().getColumn(1);
        col.setPreferredWidth(80);
        col = table1.getColumnModel().getColumn(2);
        col.setPreferredWidth(80);
        col = table1.getColumnModel().getColumn(3);
        col.setPreferredWidth(80);
        col = table1.getColumnModel().getColumn(4);
        col.setPreferredWidth(80);

        // focus tranparent color 
        UIDefaults defaults = UIManager.getLookAndFeelDefaults();
        defaults.put("Button.focus", new ColorUIResource(new Color(0, 0, 0, 0)));

        // combobox focus off
        JTextField editorComponent = (JTextField) combobox1.getEditor().getEditorComponent();
        editorComponent.addActionListener(e -> {
            editorComponent.transferFocus();
        });

        //table data to center
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        int alignment = 0;
        centerRenderer.setHorizontalAlignment(alignment);
        TableModel model = table1.getModel();
        for (int columnindex = 0; columnindex < model.getColumnCount(); columnindex++) {
            table1.getColumnModel().getColumn(columnindex).setCellRenderer(centerRenderer);

            productdropdown();
        }
    }

    public Billing(String seat_selected, String seat_quan) {

        initComponents();
//        seattf.setText(selectedSeat);
//        quantitytf.setText(selectedQuantity);
    }

    public void setData() {
        seattf_hidden.setText("" +selectedSeat+ "");
        String seatsel;
        seatsel = seattf_hidden.getText();
        seattf.setText("<html>"+seatsel+"</html>");
        quantitytf.setText(selectedQuantity);
    }

    public void setSeats(String seat_selected, String seat_quan) {

        seattf_hidden.setText(""+seat_selected+"");
        String seatsel;
        seatsel = seattf_hidden.getText();
        seattf.setText("<html>"+seatsel+"</html>");
        quantitytf.setText("" + seat_quan);
    }

    public void openseatFrame() {
        new seatFrame(this).setVisible(true);
        this.dispose();
    }

    public void calc() {

        DecimalFormat df = new DecimalFormat("0.00");
        double stotal = 0;
        double tax = 0;
        double total = 0;
        final double taxrate = 0.00;
        for (int i = 0; i < table1.getRowCount(); i++) {
            stotal += (Double.parseDouble(table1.getValueAt(i, 4).toString()));
            tax = stotal * taxrate;
            total = stotal + tax;

        }
        String otaxs = df.format(tax);
        String osubtotal = df.format(stotal);
        String ototal = df.format(total);
        stotal_label.setText(osubtotal);
        tax_label.setText(otaxs);
        total_label.setText(ototal);
    }

    public void executeSQLQuery(String query, String message){
        Connection con = getConnection();
        Statement st;
        try{
            st = con.createStatement();
            if(st.executeUpdate(query) == 1)
            {
                
                JOptionPane.showMessageDialog(null," " +message+ " Successfully");
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
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nametf = new javax.swing.JTextField();
        phonetf = new javax.swing.JTextField();
        combobox1 = new javax.swing.JComboBox<>();
        pricelabel = new javax.swing.JLabel();
        addbutton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        savabutton = new javax.swing.JButton();
        generatebutton = new javax.swing.JButton();
        clrbtn = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        timele = new javax.swing.JLabel();
        timecb = new javax.swing.JComboBox<>();
        sel_leb = new javax.swing.JLabel();
        quantitytf = new javax.swing.JLabel();
        seattf = new javax.swing.JLabel();
        seattf_hidden = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        namelabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        phonelabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        datelabel = new javax.swing.JLabel();
        datelabel2 = new javax.swing.JLabel();
        datelabel3 = new javax.swing.JLabel();
        timelabel = new javax.swing.JLabel();
        updatebutton = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        stotal_label = new javax.swing.JLabel();
        tax_label = new javax.swing.JLabel();
        total_label = new javax.swing.JLabel();
        seatl = new javax.swing.JLabel();
        seattext = new javax.swing.JLabel();
        seatshow = new javax.swing.JLabel();
        seattf_hidden2 = new javax.swing.JLabel();
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

        jLabel15.setText("jLabel15");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Phone");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Route");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, -1, -1));

        nametf.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        nametf.setBorder(null);
        nametf.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        nametf.setSelectionColor(new java.awt.Color(204, 204, 204));
        nametf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nametfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nametfFocusLost(evt);
            }
        });
        nametf.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nametfMouseClicked(evt);
            }
        });
        nametf.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                nametfInputMethodTextChanged(evt);
            }
        });
        nametf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametfActionPerformed(evt);
            }
        });
        nametf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nametfKeyPressed(evt);
            }
        });
        jPanel3.add(nametf, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 200, 33));

        phonetf.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        phonetf.setBorder(null);
        phonetf.setSelectionColor(new java.awt.Color(204, 204, 204));
        phonetf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                phonetfFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                phonetfFocusLost(evt);
            }
        });
        phonetf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phonetfActionPerformed(evt);
            }
        });
        phonetf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phonetfKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phonetfKeyTyped(evt);
            }
        });
        jPanel3.add(phonetf, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 200, 33));

        combobox1.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        combobox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  " }));
        combobox1.setSelectedIndex(-1);
        combobox1.setBorder(null);
        combobox1.setRequestFocusEnabled(false);
        combobox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combobox1ItemStateChanged(evt);
            }
        });
        combobox1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                combobox1FocusGained(evt);
            }
        });
        combobox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combobox1ActionPerformed(evt);
            }
        });
        combobox1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combobox1KeyPressed(evt);
            }
        });
        jPanel3.add(combobox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 200, 33));

        pricelabel.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        pricelabel.setForeground(new java.awt.Color(255, 153, 51));
        pricelabel.setText("  ");
        jPanel3.add(pricelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 480, 60, 29));

        addbutton.setBackground(new java.awt.Color(255, 102, 102));
        addbutton.setForeground(new java.awt.Color(255, 255, 255));
        addbutton.setText("ADD");
        addbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addbutton.setRequestFocusEnabled(false);
        addbutton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addbuttonFocusGained(evt);
            }
        });
        addbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbuttonMouseClicked(evt);
            }
        });
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });
        addbutton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addbuttonKeyPressed(evt);
            }
        });
        jPanel3.add(addbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, 60, 28));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("T. Qty");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Time");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 50, 30));

        savabutton.setBackground(new java.awt.Color(102, 102, 102));
        savabutton.setForeground(new java.awt.Color(255, 255, 255));
        savabutton.setText("Save");
        savabutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        savabutton.setContentAreaFilled(false);
        savabutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        savabutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                savabuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                savabuttonMouseEntered(evt);
            }
        });
        savabutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savabuttonActionPerformed(evt);
            }
        });
        jPanel3.add(savabutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 570, 84, 40));

        generatebutton.setBackground(new java.awt.Color(102, 102, 102));
        generatebutton.setForeground(new java.awt.Color(255, 255, 255));
        generatebutton.setText("Print Ticket");
        generatebutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        generatebutton.setContentAreaFilled(false);
        generatebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatebuttonActionPerformed(evt);
            }
        });
        jPanel3.add(generatebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 570, 117, 40));

        clrbtn.setBackground(new java.awt.Color(102, 102, 102));
        clrbtn.setForeground(new java.awt.Color(255, 255, 255));
        clrbtn.setText("Clear");
        clrbtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        clrbtn.setContentAreaFilled(false);
        clrbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clrbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clrbtnMouseEntered(evt);
            }
        });
        clrbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrbtnActionPerformed(evt);
            }
        });
        jPanel3.add(clrbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 570, 88, 40));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Price");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText(" Seats");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 410, 55, -1));

        timele.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        timele.setForeground(new java.awt.Color(255, 153, 51));
        jPanel3.add(timele, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 320, 65, 30));

        timecb.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        timecb.setMaximumRowCount(5);
        timecb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "8:00 AM", "9:00 AM", "9:30 AM", "10:30 AM", "12:15 PM", "2:00 PM", "3:30 PM", "4:15 PM", "6:30 PM", "7:15 PM", "8:10 PM", "9:30 PM", " " }));
        timecb.setBorder(null);
        timecb.setRequestFocusEnabled(false);
        timecb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                timecbItemStateChanged(evt);
            }
        });
        timecb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timecbMouseClicked(evt);
            }
        });
        timecb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timecbActionPerformed(evt);
            }
        });
        jPanel3.add(timecb, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 100, 33));

        sel_leb.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        sel_leb.setForeground(new java.awt.Color(255, 153, 51));
        sel_leb.setText("  Select");
        sel_leb.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 51)));
        sel_leb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sel_leb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sel_lebMouseClicked(evt);
            }
        });
        jPanel3.add(sel_leb, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 40, 21));

        quantitytf.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        quantitytf.setForeground(new java.awt.Color(255, 153, 51));
        jPanel3.add(quantitytf, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, 50, 30));

        seattf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        seattf.setForeground(new java.awt.Color(255, 153, 51));
        jPanel3.add(seattf, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, 190, 110));

        seattf_hidden.setFont(new java.awt.Font("Tahoma", 0, 3)); // NOI18N
        seattf_hidden.setForeground(new java.awt.Color(51, 51, 51));
        jPanel3.add(seattf_hidden, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 120, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 121, 720, 680));

        jPanel4.setBackground(new java.awt.Color(204, 204, 255));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(499, 621));
        jPanel4.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Reservation Name :");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(40, 180, 139, 20);

        namelabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel4.add(namelabel);
        namelabel.setBounds(220, 180, 193, 24);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel7.setText("Phone :");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(120, 220, 55, 20);

        phonelabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel4.add(phonelabel);
        phonelabel.setBounds(220, 220, 193, 23);

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 0, 19)); // NOI18N
        jLabel6.setText("       Preview");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(jLabel6);
        jLabel6.setBounds(260, 30, 138, 41);

        datelabel.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jPanel4.add(datelabel);
        datelabel.setBounds(440, 110, 102, 15);
        jPanel4.add(datelabel2);
        datelabel2.setBounds(56, 104, 122, 29);
        jPanel4.add(datelabel3);
        datelabel3.setBounds(47, 102, 122, 29);

        timelabel.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jPanel4.add(timelabel);
        timelabel.setBounds(440, 130, 84, 12);

        updatebutton.setBackground(new java.awt.Color(255, 204, 255));
        updatebutton.setText("Update");
        updatebutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        updatebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updatebutton.setRequestFocusEnabled(false);
        updatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebuttonActionPerformed(evt);
            }
        });
        updatebutton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                updatebuttonKeyPressed(evt);
            }
        });
        jPanel4.add(updatebutton);
        updatebutton.setBounds(60, 570, 77, 34);

        deletebutton.setBackground(new java.awt.Color(255, 204, 255));
        deletebutton.setText("Delete");
        deletebutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        deletebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deletebutton.setRequestFocusEnabled(false);
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });
        deletebutton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                deletebuttonKeyPressed(evt);
            }
        });
        jPanel4.add(deletebutton);
        deletebutton.setBounds(160, 570, 77, 34);

        table1.setFont(new java.awt.Font("Yu Gothic UI Semilight", 0, 13)); // NOI18N
        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Route", "Time", "Price", "T. Qty", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        table1.setOpaque(false);
        table1.setRequestFocusEnabled(false);
        table1.setRowHeight(18);
        table1.setSelectionBackground(new java.awt.Color(255, 102, 102));
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table1);

        jPanel4.add(jScrollPane2);
        jScrollPane2.setBounds(90, 280, 500, 110);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("  Subtotal :");
        jPanel4.add(jLabel10);
        jLabel10.setBounds(420, 420, 70, 17);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText(" Tax :");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(450, 450, 40, 17);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("  Total :");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(440, 480, 50, 17);

        stotal_label.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        stotal_label.setForeground(new java.awt.Color(255, 0, 0));
        jPanel4.add(stotal_label);
        stotal_label.setBounds(510, 420, 89, 20);

        tax_label.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        tax_label.setForeground(new java.awt.Color(255, 0, 0));
        jPanel4.add(tax_label);
        tax_label.setBounds(510, 450, 89, 20);

        total_label.setFont(new java.awt.Font("Trebuchet MS", 0, 15)); // NOI18N
        total_label.setForeground(new java.awt.Color(255, 0, 0));
        jPanel4.add(total_label);
        total_label.setBounds(510, 480, 89, 20);

        seatl.setFont(new java.awt.Font("NSimSun", 1, 17)); // NOI18N
        seatl.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel4.add(seatl);
        seatl.setBounds(130, 350, 143, 18);

        seattext.setFont(new java.awt.Font("Myriad Pro", 0, 15)); // NOI18N
        seattext.setForeground(new java.awt.Color(102, 0, 51));
        seattext.setText("Seat No :");
        jPanel4.add(seattext);
        seattext.setBounds(90, 450, 54, 22);

        seatshow.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        seatshow.setForeground(new java.awt.Color(51, 51, 51));
        jPanel4.add(seatshow);
        seatshow.setBounds(160, 420, 170, 80);

        seattf_hidden2.setFont(new java.awt.Font("Tahoma", 0, 2)); // NOI18N
        seattf_hidden2.setForeground(new java.awt.Color(204, 204, 255));
        seattf_hidden2.setText("jLabel18");
        jPanel4.add(seattf_hidden2);
        seattf_hidden2.setBounds(130, 530, 160, 3);

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 720, 680));

        jLabel1.setFont(new java.awt.Font("Trajan Pro", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("     Billing Section");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel1KeyPressed(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 500, 70));

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
        jPanel2.add(minimize_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 20, -1, -1));

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
        jPanel2.add(close_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 20, -1, 25));

        login_name.setFont(new java.awt.Font("Yu Gothic Medium", 0, 12)); // NOI18N
        login_name.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(login_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 31, 80, 20));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RevoTMS/images/SignOut.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 31, -1, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Login as:");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 11, 40, 20));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked

        int cnf = JOptionPane.showConfirmDialog(null, "    Sign Out Your Account  \n\n", "Sign Out", JOptionPane.YES_NO_OPTION);

        if (cnf == 0) {
            login lon = new login();
            lon.setVisible(true);
            lon.pack();
            lon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
           
        }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void close_3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_3MouseExited
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        close_3.setBorder(label_border);
        close_3.setForeground(Color.white);
    }//GEN-LAST:event_close_3MouseExited

    private void close_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_3MouseEntered
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.orange);
        close_3.setBorder(label_border);
        close_3.setForeground(Color.orange);
    }//GEN-LAST:event_close_3MouseEntered

    private void close_3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_3MouseClicked

        //                            Main main = new Main();
        //                            main.setVisible(true);
        //                            main.pack();
        //                            main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_close_3MouseClicked

    private void minimize_1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_1MouseExited
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        minimize_1.setBorder(label_border);
        minimize_1.setForeground(Color.white);
    }//GEN-LAST:event_minimize_1MouseExited

    private void minimize_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_1MouseEntered
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.orange);
        minimize_1.setBorder(label_border);
        minimize_1.setForeground(Color.orange);
    }//GEN-LAST:event_minimize_1MouseEntered

    private void minimize_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimize_1MouseClicked

        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimize_1MouseClicked

    private void jLabel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel1KeyPressed

        //        int key = evt.getKeyCode();
        //
        //        if(key == 10){
        //            nametf.requestFocus();
        //        }
    }//GEN-LAST:event_jLabel1KeyPressed

    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked

        DefaultTableModel model = (DefaultTableModel) table1.getModel();

        combobox1.setSelectedItem(model.getValueAt(table1.getSelectedRow(), 0).toString());
        timecb.setSelectedItem(model.getValueAt(table1.getSelectedRow(), 1).toString());
        timele.setText(model.getValueAt(table1.getSelectedRow(), 1).toString());
        pricelabel.setText(model.getValueAt(table1.getSelectedRow(), 2).toString());
        quantitytf.setText(model.getValueAt(table1.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_table1MouseClicked

    private void deletebuttonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deletebuttonKeyPressed

    }//GEN-LAST:event_deletebuttonKeyPressed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed

        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        if (table1.getSelectedRow() == -1) {
            if (table1.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No Item Found", "Blank", 1);
            } else {
                JOptionPane.showMessageDialog(null, "You Must Select An Item", "Oho", 1);
            }
        } else {
            model.removeRow(table1.getSelectedRow());
            combobox1.setSelectedItem("");
            pricelabel.setText("");
            quantitytf.setText("");
        }
        calc();
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void updatebuttonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_updatebuttonKeyPressed

        // updatebutton.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_U,KeyEvent.VK_J), evt);
    }//GEN-LAST:event_updatebuttonKeyPressed

    private void updatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebuttonActionPerformed

        //updatebutton.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_U, KeyEvent.VK_ALT), evt);
        if (combobox1.getSelectedIndex() == 0) {

            JOptionPane.showMessageDialog(null, "You Must Select An Item", "Empty Item", 1);
        } else {
            DefaultTableModel model = (DefaultTableModel) table1.getModel();
            if (table1.getSelectedRow() == -1) {
                if (table1.getRowCount() == 0) {
                    JOptionPane.showMessageDialog(null, "No Item Found", "Blank", 1);
                } else {
                    JOptionPane.showMessageDialog(null, "You Must Select An Item", "Oho", 1);
                }
            } else {
                model.setValueAt(combobox1.getSelectedItem().toString(), table1.getSelectedRow(), 0);
                //model.setValueAt(pricelabel.getText(), table1.getSelectedRow(), 1);
                model.setValueAt(quantitytf.getText(), table1.getSelectedRow(), 3);
                model.setValueAt(timecb.getSelectedItem().toString(),table1.getSelectedRow(),1);
                model.setValueAt(timele.getText(),table1.getSelectedRow(),1);
                model.setValueAt(pricelabel.getText(),table1.getSelectedRow(),2);
                for (int i = 0; i < model.getRowCount(); i++) {
                    //Double d1 = Double.parseDouble((String) model.getValueAt(i, 1));
                    Double d1 = Double.parseDouble((String) model.getValueAt(i, 2));
                    Double d2 = Double.parseDouble((String) model.getValueAt(i, 3));
                    Double d3 = d1 * d2;
                    model.setValueAt(d3, i, 4);
                }
                table1.clearSelection();
                calc();
//                combobox1.setSelectedItem("");
//                pricelabel.setText("");
//                quantitytf.setText("");
                     String seatsetshow = seattf.getText();
                     seatshow.setText(""+seatsetshow);
                     String seattfshow = seattf_hidden.getText();
                     seattf_hidden2.setText(seattfshow);
            }
        }
    }//GEN-LAST:event_updatebuttonActionPerformed

    private void clrbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrbtnActionPerformed

        if ("".equals(nametf.getText().trim()) || "".equals(phonetf.getText().trim())) {

            JOptionPane.showMessageDialog(null, "No Data Found", "Empty", 1);

        } else {

            int nf = JOptionPane.showConfirmDialog(null, "\n             Clear All\n\n", "Clear", JOptionPane.YES_NO_OPTION);

            if (nf == 0) {
                nametf.setText("");
                phonetf.setText("");
                combobox1.setSelectedIndex(0);
                quantitytf.setText("");
                namelabel.setText("");
                phonelabel.setText("");
                pricelabel.setText("");
                stotal_label.setText("0.00");
                tax_label.setText("0.00");
                total_label.setText("0.00");
                timelabel.setText("");
                datelabel.setText("");
                seattf.setText("");
                quantitytf.setText("");
                timecb.setSelectedIndex(0);
                timele.setText("");

                DefaultTableModel model = (DefaultTableModel) table1.getModel();
                for (int i = 0; i < table1.getRowCount(); i++) {

                    model.removeRow(i);
                }
                for (int j = 0; j < table1.getRowCount(); j++) {

                    model.removeRow(j);
                }
                for (int k = 0; k < table1.getRowCount(); k++) {

                    model.removeRow(k);
                }

            }

        }
    }//GEN-LAST:event_clrbtnActionPerformed

    private void clrbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clrbtnMouseEntered

    }//GEN-LAST:event_clrbtnMouseEntered

    private void generatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatebuttonActionPerformed

        DefaultTableModel dtm;
        dtm = (DefaultTableModel) table1.getModel();

        String name = nametf.getText();
        String seat = seattf_hidden2.getText();
        String phone = phonetf.getText();
        String subtotal = stotal_label.getText();
        String tax = tax_label.getText();
        String total = total_label.getText();

        new Print(name, phone, seat, subtotal, tax, total, table1.getModel()).setVisible(true);
    }//GEN-LAST:event_generatebuttonActionPerformed

    private void savabuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savabuttonActionPerformed

         DefaultTableModel model = (DefaultTableModel) table1.getModel();
//
//        combobox1.setSelectedItem(model.getValueAt(table1.getSelectedRow(), 0).toString());
//        timecb.setSelectedItem(model.getValueAt(table1.getSelectedRow(), 1).toString());
//        timele.setText(model.getValueAt(table1.getSelectedRow(), 1).toString());
//        pricelabel.setText(model.getValueAt(table1.getSelectedRow(), 2).toString());
//        quantitytf.setText(model.getValueAt(table1.getSelectedRow(), 3).toString());
        

      /*  String date_label = datelabel.getText();
        String time_label = timelabel.getText();
        String Reservation_name = nametf.getText();
        String phone = phonetf.getText();
        String seat = seattf_hidden2.getText();
       // String price = table1.getValueAt(table1.getSelectedRow(), 2).toString();
        String time = timele.getText();
        String price = pricelabel.getText();
        String route = combobox1.getSelectedItem().toString();
        String quantity = quantitytf.getText();
        String total = total_label.getText();
        String billby = login_name.getText(); 

        PreparedStatement ps;
        ResultSet rs = null;

        String salesQuery = "INSERT INTO `sales`(`Date`,`Time`,`Reservation_Name`, `Phone`,`Route`,`Coach_Time`,`Seat_No`,`Unit_Price`,`Quantity`, `Total`,`Bill_By`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";

        try {
            ps = my_con.getConnection().prepareStatement(salesQuery);

            //for(int i =0 ; i<table1.getRowCount(); i++){
            ps.setString(1, date_label);
            ps.setString(2, time_label);
            ps.setString(3, Reservation_name);
            ps.setString(4, phone);
            //ps.setString(3, table1.getValueAt(i, 0).toString());
            ps.setString(5, route);
            // ps.setString(4, table1.getValueAt(i, 1).toString());
            ps.setString(6, time);
            ps.setString(7, seat);
            ps.setString(8, price);
            //ps.setString(7, table1.getValueAt(i, 2).toString());
            ps.setString(9, quantity);
            //ps.setString(8, table1.getValueAt(i, 3).toString());
            ps.setString(10, total);
            ps.setString(11, billby);

        //    ps.execute();

           if(ps.executeUpdate(salesQuery) == 1)
             {
 
                
               JOptionPane.showMessageDialog(null, "\n   Save Succesfully\n\n", "Saved", 1);
          } else {
               JOptionPane.showMessageDialog(null, "\nCheck Error\n\n", "Error", 1);
           }
        } catch (SQLException ex) {
            Logger.getLogger(registration.class.getName()).log(Level.SEVERE, null, ex);
        } */
        
        String query = "INSERT INTO `sales`(`Date`,`Time`,`Reservation_Name`, `Phone`,`Route`,`Coach_Time`,`Seat_No`,`Unit_Price`,`Quantity`, `Total`,`Bill_By`) VALUES ('"+datelabel.getText()+"','"+timelabel.getText()+"','"+nametf.getText()+"','"+phonetf.getText()+"','"+combobox1.getSelectedItem().toString()+"','"+timele.getText()+"','"+seattf_hidden2.getText()+"','"+pricelabel.getText()+"','"+quantitytf.getText()+"','"+total_label.getText()+"','"+login_name.getText()+"')";
        executeSQLQuery(query,"Saved");
    }//GEN-LAST:event_savabuttonActionPerformed

    private void savabuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savabuttonMouseEntered

    }//GEN-LAST:event_savabuttonMouseEntered

    private void savabuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savabuttonMouseClicked

    }//GEN-LAST:event_savabuttonMouseClicked

    private void addbuttonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addbuttonKeyPressed

    }//GEN-LAST:event_addbuttonKeyPressed

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed

        DecimalFormat df = new DecimalFormat("0.00");
        double price = 0;

        if (nametf.getText().trim().equals("") || phonetf.getText().trim().equals("")) {

            if (nametf.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "  Empty :   Customer Name", "Empty Field", 1);
                nametf.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "    Empty :    Phone No", "Empty Field", 1);
                phonetf.requestFocus();
            }

        } else {

            DefaultTableModel model = (DefaultTableModel) table1.getModel();

            if (combobox1.getSelectedIndex() > 0 || combobox1.getSelectedIndex() != 0) {

                if (quantitytf.getText().trim().equals("")) {

                    JOptionPane.showMessageDialog(null, "Check Out Quantity.", "Empty Field", 3);
                } else {
                    model.addRow(new Object[]{(String) combobox1.getSelectedItem(), timele.getText(),pricelabel.getText(), quantitytf.getText()});
                    for (int i = 0; i < model.getRowCount(); i++) {
                        // Double d1 = Double.parseDouble((String) model.getValueAt(i, 1));
                        Double d1 = Double.parseDouble(pricelabel.getText());
                        Double d2 = Double.parseDouble(quantitytf.getText());
                        Double d3 = d1 * d2;

                        String tprice = df.format(d3);
                        model.setValueAt(tprice, i, 4);
                        
                        table1.setRowHeight(i,27);

                     
                    }
                    combobox1.requestFocus();
                    calc();
//                    combobox1.setSelectedItem("");
//                    pricelabel.setText("");
//                    quantitytf.setText("");

                    String seatsetshow = seattf.getText();
                     seatshow.setText(""+seatsetshow);
                     String seattfshow = seattf_hidden.getText();
                     seattf_hidden2.setText(seattfshow);
                    String phone = phonetf.getText();
                    phonelabel.setText(phone);
                    
                }
            } else {
                JOptionPane.showMessageDialog(null, "Haven't Selected Item ?", "Empty Field", 3);
                combobox1.requestFocus();
            }

        }
    }//GEN-LAST:event_addbuttonActionPerformed

    private void addbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbuttonMouseClicked

    }//GEN-LAST:event_addbuttonMouseClicked

    private void addbuttonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addbuttonFocusGained

    }//GEN-LAST:event_addbuttonFocusGained

    private void combobox1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combobox1KeyPressed

    }//GEN-LAST:event_combobox1KeyPressed

    private void combobox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combobox1ActionPerformed

        if (combobox1.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Invalid Item Selected", "Invalid", 1);
            combobox1.requestFocus();
        }

        combobox1.setMaximumRowCount(6);

        try {

            String fatch_row = "SELECT * FROM `route_list` WHERE routes = ?";

            PreparedStatement statement = my_con.getConnection().prepareStatement(fatch_row);
            statement.setString(1, (String) combobox1.getSelectedItem());

            ResultSet set = statement.executeQuery();

            if (set.next()) {

                // statement.setString(2, (String)pricelabel.getText());
//                Border label_border = BorderFactory.createLineBorder(new Color(255, 153, 51), 1);
//                pricelabel.setBorder(label_border);
                pricelabel.setText(set.getString("price"));

            }

        } catch (SQLException ex) {
            Logger.getLogger(Billing.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_combobox1ActionPerformed

    private void combobox1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_combobox1FocusGained

    }//GEN-LAST:event_combobox1FocusGained

    private void combobox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combobox1ItemStateChanged

    }//GEN-LAST:event_combobox1ItemStateChanged

    private void phonetfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phonetfKeyTyped

        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_phonetfKeyTyped

    private void phonetfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phonetfKeyPressed

        int key = evt.getKeyCode();

        if (key == 10) {
            combobox1.requestFocus();
        }
    }//GEN-LAST:event_phonetfKeyPressed

    private void phonetfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phonetfActionPerformed

    }//GEN-LAST:event_phonetfActionPerformed

    private void phonetfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phonetfFocusLost
        String phone = phonetf.getText();
        phonelabel.setText(phone);
        Border field_border = BorderFactory.createMatteBorder(1, 9, 1, 1, Color.white);
        phonetf.setBorder(field_border);
    }//GEN-LAST:event_phonetfFocusLost

    private void phonetfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_phonetfFocusGained
        Border field_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        phonetf.setBorder(field_border);
    }//GEN-LAST:event_phonetfFocusGained

    private void nametfKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nametfKeyPressed

        int key = evt.getKeyCode();

        if (key == 10) {
            phonetf.requestFocus();
        }
    }//GEN-LAST:event_nametfKeyPressed

    private void nametfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametfActionPerformed

        String name = nametf.getText();
        namelabel.setText(name);
    }//GEN-LAST:event_nametfActionPerformed

    private void nametfInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_nametfInputMethodTextChanged

    }//GEN-LAST:event_nametfInputMethodTextChanged

    private void nametfMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nametfMouseClicked

    }//GEN-LAST:event_nametfMouseClicked

    private void nametfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nametfFocusLost
        String name = nametf.getText();
        namelabel.setText(name);
        Border field_border = BorderFactory.createMatteBorder(1, 9, 1, 1, Color.white);
        nametf.setBorder(field_border);
    }//GEN-LAST:event_nametfFocusLost

    private void nametfFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nametfFocusGained

        Date date = new Date();
        Date time = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat tft = new SimpleDateFormat("hh:mm:ss a");
        String reportDate = ft.format(date);
        String reportTime = tft.format(time);
        datelabel.setText(reportDate);
        timelabel.setText(reportTime);

        Border field_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        nametf.setBorder(field_border);
    }//GEN-LAST:event_nametfFocusGained

    private void timecbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timecbActionPerformed

    }//GEN-LAST:event_timecbActionPerformed

    private void timecbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timecbMouseClicked


    }//GEN-LAST:event_timecbMouseClicked

    private void timecbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_timecbItemStateChanged
        timele.setVisible(true);
        String tl = timecb.getSelectedItem().toString();
        timele.setText(tl);
        Border label_border = BorderFactory.createLineBorder(new Color(255, 153, 51), 1);
        timele.setBorder(label_border);
        
    }//GEN-LAST:event_timecbItemStateChanged

    private void sel_lebMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sel_lebMouseClicked
        seats.billing = this;
        seats form = new seats();
        form.setVisible(true);
        form.pack();
        form.setLocationRelativeTo(null);
    }//GEN-LAST:event_sel_lebMouseClicked

    private void productdropdown() {

        try {

            String product = "SELECT * FROM route_list";
            Statement statement = my_con.getConnection().createStatement();

            ResultSet set = statement.executeQuery(product);

            while (set.next()) {
                //  pricelabel.setText(set.getString("price"));
                combobox1.addItem(set.getString("routes"));

            }

        } catch (SQLException ex) {

        }

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbutton;
    private javax.swing.JLabel close_3;
    private javax.swing.JButton clrbtn;
    private javax.swing.JComboBox<String> combobox1;
    private javax.swing.JLabel datelabel;
    private javax.swing.JLabel datelabel2;
    private javax.swing.JLabel datelabel3;
    private javax.swing.JButton deletebutton;
    private javax.swing.JButton generatebutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel login_name;
    private javax.swing.JLabel minimize_1;
    private javax.swing.JLabel namelabel;
    private javax.swing.JTextField nametf;
    private javax.swing.JLabel phonelabel;
    private javax.swing.JTextField phonetf;
    private javax.swing.JLabel pricelabel;
    private javax.swing.JLabel quantitytf;
    private javax.swing.JButton savabutton;
    private javax.swing.JLabel seatl;
    private javax.swing.JLabel seatshow;
    private javax.swing.JLabel seattext;
    private javax.swing.JLabel seattf;
    private javax.swing.JLabel seattf_hidden;
    private javax.swing.JLabel seattf_hidden2;
    private javax.swing.JLabel sel_leb;
    private javax.swing.JLabel stotal_label;
    private javax.swing.JTable table1;
    private javax.swing.JLabel tax_label;
    private javax.swing.JComboBox<String> timecb;
    private javax.swing.JLabel timelabel;
    private javax.swing.JLabel timele;
    private javax.swing.JLabel total_label;
    private javax.swing.JButton updatebutton;
    // End of variables declaration//GEN-END:variables

    private void columnrenderer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class seatFrame {

        public seatFrame(Billing aThis) {
        }

        private void setVisible(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

}
