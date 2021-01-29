package dbms;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JFrame;

public class seats extends javax.swing.JFrame {

    public static Billing billing;

    public seats() {
        initComponents();

        selectbutton.addActionListener(e -> selectbuttonActionPerformed());

        Handler hand = new Handler();
        a1.addActionListener(hand);
        b1.addActionListener(hand);
        c1.addActionListener(hand);
        d1.addActionListener(hand);
        e1.addActionListener(hand);
        f1.addActionListener(hand);
        g1.addActionListener(hand);
        g2.addActionListener(hand);
        g3.addActionListener(hand);
        g4.addActionListener(hand);
        h1.addActionListener(hand);
        h2.addActionListener(hand);
        i1.addActionListener(hand);
        i2.addActionListener(hand);
        j1.addActionListener(hand);
        j2.addActionListener(hand);
        k1.addActionListener(hand);
        k2.addActionListener(hand);
        l1.addActionListener(hand);
        l2.addActionListener(hand);
        m1.addActionListener(hand);
        m2.addActionListener(hand);

    }

    private void selectbuttonActionPerformed() {

    }

    public class seatFrame extends JFrame {

        private Billing parent;

        public seatFrame(Billing parent) {
            this.parent = parent;
        }

        private void selectbuttonActionPerformed() {
            String seat_selected = seat_label.getText();
            String seat_quan = seat_q.getText();
            parent.setSeats(seat_selected, seat_quan);
            parent.setVisible(true);
            this.dispose();
        }
    }

    class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            ArrayList list = new ArrayList();
            if (a1.isSelected()) {
                list.add("A1");
                a1.setBackground(Color.orange);
                a1.setForeground(Color.black);
            } else {
                a1.setBackground(new Color(51, 51, 51));
                a1.setForeground(Color.white);
            }
            if (b1.isSelected()) {
                list.add("B1");
                b1.setBackground(Color.orange);
                b1.setForeground(Color.black);
            } else {
                b1.setBackground(new Color(51, 51, 51));
                b1.setForeground(Color.white);
            }
            if (c1.isSelected()) {
                list.add("C1");
                c1.setBackground(Color.orange);
                c1.setForeground(Color.black);
            } else {
                c1.setBackground(new Color(51, 51, 51));
                c1.setForeground(Color.white);
            }
            if (d1.isSelected()) {
                list.add("D1");
                d1.setBackground(Color.orange);
                d1.setForeground(Color.black);
            } else {
                d1.setBackground(new Color(51, 51, 51));
                d1.setForeground(Color.white);
            }
            if (e1.isSelected()) {
                list.add("E1");
                e1.setBackground(Color.orange);
                e1.setForeground(Color.black);
            } else {
                e1.setBackground(new Color(51, 51, 51));
                e1.setForeground(Color.white);
            }
            if (f1.isSelected()) {
                list.add("F1");
                f1.setBackground(Color.orange);
                f1.setForeground(Color.black);
            } else {
                f1.setBackground(new Color(51, 51, 51));
                f1.setForeground(Color.white);
            }
            if (g1.isSelected()) {
                list.add("G1");
                g1.setBackground(Color.orange);
                g1.setForeground(Color.black);
            } else {
                g1.setBackground(new Color(51, 51, 51));
                g1.setForeground(Color.white);
            }
            if (g2.isSelected()) {
                list.add("G2");
                g2.setBackground(Color.orange);
                g2.setForeground(Color.black);
            } else {
                g2.setBackground(new Color(51, 51, 51));
                g2.setForeground(Color.white);
            }
            if (g3.isSelected()) {
                list.add("G3");
                g3.setBackground(Color.orange);
                g3.setForeground(Color.black);
            } else {
                g3.setBackground(new Color(51, 51, 51));
                g3.setForeground(Color.white);
            }
            if (g4.isSelected()) {
                list.add("G4");
                g4.setBackground(Color.orange);
                g4.setForeground(Color.black);
            } else {
                g4.setBackground(new Color(51, 51, 51));
                g4.setForeground(Color.white);
            }
            if (h1.isSelected()) {
                list.add("H1");
                h1.setBackground(Color.orange);
                h1.setForeground(Color.black);
            } else {
                h1.setBackground(new Color(51, 51, 51));
                h1.setForeground(Color.white);
            }
            if (h2.isSelected()) {
                list.add("H2");
                h2.setBackground(Color.orange);
                h2.setForeground(Color.black);
            } else {
                h2.setBackground(new Color(51, 51, 51));
                h2.setForeground(Color.white);
            }
            if (i1.isSelected()) {
                list.add("I1");
                i1.setBackground(Color.orange);
                i1.setForeground(Color.black);
            } else {
                i1.setBackground(new Color(51, 51, 51));
                i1.setForeground(Color.white);
            }
            if (i2.isSelected()) {
                list.add("I2");
                i2.setBackground(Color.orange);
                i2.setForeground(Color.black);
            } else {
                i2.setBackground(new Color(51, 51, 51));
                i2.setForeground(Color.white);
            }
            if (j1.isSelected()) {
                list.add("J1");
                j1.setBackground(Color.orange);
                j1.setForeground(Color.black);
            } else {
                j1.setBackground(new Color(51, 51, 51));
                j1.setForeground(Color.white);
            }
            if (j2.isSelected()) {
                list.add("J2");
                j2.setBackground(Color.orange);
                j2.setForeground(Color.black);
            } else {
                j2.setBackground(new Color(51, 51, 51));
                j2.setForeground(Color.white);
            }
            if (k1.isSelected()) {
                list.add("K1");
                k1.setBackground(Color.orange);
                k1.setForeground(Color.black);
            } else {
                k1.setBackground(new Color(51, 51, 51));
                k1.setForeground(Color.white);
            }
            if (k2.isSelected()) {
                list.add("K2");
                k2.setBackground(Color.orange);
                k2.setForeground(Color.black);
            } else {
                k2.setBackground(new Color(51, 51, 51));
                k2.setForeground(Color.white);
            }
            if (l1.isSelected()) {
                list.add("L1");
                l1.setBackground(Color.orange);
                l1.setForeground(Color.black);
            } else {
                l1.setBackground(new Color(51, 51, 51));
                l1.setForeground(Color.white);
            }
            if (l2.isSelected()) {
                list.add("L2");
                l2.setBackground(Color.orange);
                l2.setForeground(Color.black);
            } else {
                l2.setBackground(new Color(51, 51, 51));
                l2.setForeground(Color.white);
            }
            if (m1.isSelected()) {
                list.add("M1");
                m1.setBackground(Color.orange);
                m1.setForeground(Color.black);
            } else {
                m1.setBackground(new Color(51, 51, 51));
                m1.setForeground(Color.white);
            }
            if (m2.isSelected()) {
                list.add("M2");
                m2.setBackground(Color.orange);
                m2.setForeground(Color.black);
            } else {
                m2.setBackground(new Color(51, 51, 51));
                m2.setForeground(Color.white);
            }


//            for(int i = 0; i< list.size();i++){
//            
//            System.out.print(list.get(i));
//
//            }
            

            
           
            seat_label.setText("" +list);
            seat_q.setText("" + list.size());

            ArrayList lis = list;
            setl.setText("<html>"+lis+"</html>");
        }
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        popupMenu1 = new java.awt.PopupMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        selectbutton = new javax.swing.JButton();
        closebutton = new javax.swing.JButton();
        k2 = new javax.swing.JRadioButton();
        c1 = new javax.swing.JRadioButton();
        a1 = new javax.swing.JRadioButton();
        f1 = new javax.swing.JRadioButton();
        g2 = new javax.swing.JRadioButton();
        g3 = new javax.swing.JRadioButton();
        b1 = new javax.swing.JRadioButton();
        d1 = new javax.swing.JRadioButton();
        e1 = new javax.swing.JRadioButton();
        i1 = new javax.swing.JRadioButton();
        j1 = new javax.swing.JRadioButton();
        k1 = new javax.swing.JRadioButton();
        l1 = new javax.swing.JRadioButton();
        m1 = new javax.swing.JRadioButton();
        m2 = new javax.swing.JRadioButton();
        j2 = new javax.swing.JRadioButton();
        i2 = new javax.swing.JRadioButton();
        h2 = new javax.swing.JRadioButton();
        g4 = new javax.swing.JRadioButton();
        l2 = new javax.swing.JRadioButton();
        h1 = new javax.swing.JRadioButton();
        g1 = new javax.swing.JRadioButton();
        dfdf = new javax.swing.JLabel();
        seat_label = new javax.swing.JLabel();
        seat_q = new javax.swing.JLabel();
        setl = new javax.swing.JLabel();

        jLabel4.setBackground(new java.awt.Color(204, 255, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("  A1");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255)));
        jLabel4.setOpaque(true);

        jLabel24.setBackground(new java.awt.Color(204, 255, 204));
        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("  A1");
        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 255, 255)));
        jLabel24.setOpaque(true);

        popupMenu1.setLabel("popupMenu1");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("  Available Seats");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 210, 50));

        selectbutton.setBackground(new java.awt.Color(255, 102, 102));
        selectbutton.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        selectbutton.setForeground(new java.awt.Color(255, 255, 255));
        selectbutton.setText("Select");
        selectbutton.setToolTipText("");
        selectbutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        selectbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectbutton.setFocusable(false);
        selectbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selectbuttonMouseClicked(evt);
            }
        });
        selectbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectbuttonActionPerformed(evt);
            }
        });
        selectbutton.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                selectbuttonKeyPressed(evt);
            }
        });
        jPanel1.add(selectbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 650, 71, 31));

        closebutton.setBackground(new java.awt.Color(255, 102, 102));
        closebutton.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        closebutton.setForeground(new java.awt.Color(255, 255, 255));
        closebutton.setText("Close");
        closebutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        closebutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closebutton.setFocusable(false);
        closebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebuttonActionPerformed(evt);
            }
        });
        jPanel1.add(closebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 650, 73, 31));

        k2.setBackground(new java.awt.Color(51, 51, 51));
        k2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        k2.setForeground(new java.awt.Color(255, 255, 255));
        k2.setText("K2");
        k2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        k2.setFocusable(false);
        k2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbms/images/theater-seats-png-512_512.png"))); // NOI18N
        k2.setName(""); // NOI18N
        k2.setPreferredSize(new java.awt.Dimension(60, 47));
        k2.setRequestFocusEnabled(false);
        jPanel1.add(k2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 59, 34));

        c1.setBackground(new java.awt.Color(51, 51, 51));
        c1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        c1.setForeground(new java.awt.Color(255, 255, 255));
        c1.setText("C1");
        c1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        c1.setFocusable(false);
        c1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbms/images/theater-seats-png-512_512.png"))); // NOI18N
        c1.setName(""); // NOI18N
        c1.setPreferredSize(new java.awt.Dimension(60, 47));
        c1.setRequestFocusEnabled(false);
        jPanel1.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 59, 34));

        a1.setBackground(new java.awt.Color(51, 51, 51));
        a1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        a1.setForeground(new java.awt.Color(255, 255, 255));
        a1.setText("A1");
        a1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        a1.setFocusable(false);
        a1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbms/images/theater-seats-png-512_512.png"))); // NOI18N
        a1.setName(""); // NOI18N
        a1.setPreferredSize(new java.awt.Dimension(50, 47));
        a1.setRequestFocusEnabled(false);
        jPanel1.add(a1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 59, 34));

        f1.setBackground(new java.awt.Color(51, 51, 51));
        f1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        f1.setForeground(new java.awt.Color(255, 255, 255));
        f1.setText("F1");
        f1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        f1.setFocusable(false);
        f1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbms/images/theater-seats-png-512_512.png"))); // NOI18N
        f1.setName(""); // NOI18N
        f1.setPreferredSize(new java.awt.Dimension(60, 47));
        f1.setRequestFocusEnabled(false);
        jPanel1.add(f1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 59, 34));

        g2.setBackground(new java.awt.Color(51, 51, 51));
        g2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        g2.setForeground(new java.awt.Color(255, 255, 255));
        g2.setText("G2");
        g2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        g2.setFocusable(false);
        g2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbms/images/theater-seats-png-512_512.png"))); // NOI18N
        g2.setName(""); // NOI18N
        g2.setPreferredSize(new java.awt.Dimension(60, 47));
        g2.setRequestFocusEnabled(false);
        jPanel1.add(g2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 59, 34));

        g3.setBackground(new java.awt.Color(51, 51, 51));
        g3.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        g3.setForeground(new java.awt.Color(255, 255, 255));
        g3.setText("G3");
        g3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        g3.setFocusable(false);
        g3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbms/images/theater-seats-png-512_512.png"))); // NOI18N
        g3.setName(""); // NOI18N
        g3.setPreferredSize(new java.awt.Dimension(60, 47));
        g3.setRequestFocusEnabled(false);
        jPanel1.add(g3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 59, 34));

        b1.setBackground(new java.awt.Color(51, 51, 51));
        b1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        b1.setForeground(new java.awt.Color(255, 255, 255));
        b1.setText("B1");
        b1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b1.setFocusable(false);
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbms/images/theater-seats-png-512_512.png"))); // NOI18N
        b1.setName(""); // NOI18N
        b1.setPreferredSize(new java.awt.Dimension(50, 47));
        b1.setRequestFocusEnabled(false);
        jPanel1.add(b1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 59, 34));

        d1.setBackground(new java.awt.Color(51, 51, 51));
        d1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        d1.setForeground(new java.awt.Color(255, 255, 255));
        d1.setText("D1");
        d1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        d1.setFocusable(false);
        d1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbms/images/theater-seats-png-512_512.png"))); // NOI18N
        d1.setName(""); // NOI18N
        d1.setPreferredSize(new java.awt.Dimension(60, 47));
        d1.setRequestFocusEnabled(false);
        jPanel1.add(d1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 59, 34));

        e1.setBackground(new java.awt.Color(51, 51, 51));
        e1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        e1.setForeground(new java.awt.Color(255, 255, 255));
        e1.setText("E1");
        e1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        e1.setFocusable(false);
        e1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbms/images/theater-seats-png-512_512.png"))); // NOI18N
        e1.setName(""); // NOI18N
        e1.setPreferredSize(new java.awt.Dimension(60, 47));
        e1.setRequestFocusEnabled(false);
        jPanel1.add(e1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 380, 59, 34));

        i1.setBackground(new java.awt.Color(51, 51, 51));
        i1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        i1.setForeground(new java.awt.Color(255, 255, 255));
        i1.setText("I1");
        i1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        i1.setFocusable(false);
        i1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbms/images/theater-seats-png-512_512.png"))); // NOI18N
        i1.setName(""); // NOI18N
        i1.setPreferredSize(new java.awt.Dimension(60, 47));
        i1.setRequestFocusEnabled(false);
        jPanel1.add(i1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 59, 34));

        j1.setBackground(new java.awt.Color(51, 51, 51));
        j1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        j1.setForeground(new java.awt.Color(255, 255, 255));
        j1.setText("J1");
        j1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j1.setFocusable(false);
        j1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbms/images/theater-seats-png-512_512.png"))); // NOI18N
        j1.setName(""); // NOI18N
        j1.setPreferredSize(new java.awt.Dimension(60, 47));
        j1.setRequestFocusEnabled(false);
        jPanel1.add(j1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 59, 34));

        k1.setBackground(new java.awt.Color(51, 51, 51));
        k1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        k1.setForeground(new java.awt.Color(255, 255, 255));
        k1.setText("K1");
        k1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        k1.setFocusable(false);
        k1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbms/images/theater-seats-png-512_512.png"))); // NOI18N
        k1.setName(""); // NOI18N
        k1.setPreferredSize(new java.awt.Dimension(60, 47));
        k1.setRequestFocusEnabled(false);
        jPanel1.add(k1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 59, 34));

        l1.setBackground(new java.awt.Color(51, 51, 51));
        l1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        l1.setForeground(new java.awt.Color(255, 255, 255));
        l1.setText("L1");
        l1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l1.setFocusable(false);
        l1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbms/images/theater-seats-png-512_512.png"))); // NOI18N
        l1.setName(""); // NOI18N
        l1.setPreferredSize(new java.awt.Dimension(60, 47));
        l1.setRequestFocusEnabled(false);
        jPanel1.add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 59, 34));

        m1.setBackground(new java.awt.Color(51, 51, 51));
        m1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        m1.setForeground(new java.awt.Color(255, 255, 255));
        m1.setText("M1");
        m1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        m1.setFocusable(false);
        m1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbms/images/theater-seats-png-512_512.png"))); // NOI18N
        m1.setName(""); // NOI18N
        m1.setPreferredSize(new java.awt.Dimension(60, 47));
        m1.setRequestFocusEnabled(false);
        jPanel1.add(m1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 59, 34));

        m2.setBackground(new java.awt.Color(51, 51, 51));
        m2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        m2.setForeground(new java.awt.Color(255, 255, 255));
        m2.setText("M2");
        m2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        m2.setFocusable(false);
        m2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbms/images/theater-seats-png-512_512.png"))); // NOI18N
        m2.setName(""); // NOI18N
        m2.setPreferredSize(new java.awt.Dimension(60, 47));
        m2.setRequestFocusEnabled(false);
        jPanel1.add(m2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 59, 34));

        j2.setBackground(new java.awt.Color(51, 51, 51));
        j2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        j2.setForeground(new java.awt.Color(255, 255, 255));
        j2.setText("J2");
        j2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        j2.setFocusable(false);
        j2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbms/images/theater-seats-png-512_512.png"))); // NOI18N
        j2.setName(""); // NOI18N
        j2.setPreferredSize(new java.awt.Dimension(60, 47));
        j2.setRequestFocusEnabled(false);
        jPanel1.add(j2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 59, 34));

        i2.setBackground(new java.awt.Color(51, 51, 51));
        i2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        i2.setForeground(new java.awt.Color(255, 255, 255));
        i2.setText("I2");
        i2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        i2.setFocusable(false);
        i2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbms/images/theater-seats-png-512_512.png"))); // NOI18N
        i2.setName(""); // NOI18N
        i2.setPreferredSize(new java.awt.Dimension(60, 47));
        i2.setRequestFocusEnabled(false);
        jPanel1.add(i2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, 59, 34));

        h2.setBackground(new java.awt.Color(51, 51, 51));
        h2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        h2.setForeground(new java.awt.Color(255, 255, 255));
        h2.setText("H2");
        h2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        h2.setFocusable(false);
        h2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbms/images/theater-seats-png-512_512.png"))); // NOI18N
        h2.setName(""); // NOI18N
        h2.setPreferredSize(new java.awt.Dimension(60, 47));
        h2.setRequestFocusEnabled(false);
        jPanel1.add(h2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 59, 34));

        g4.setBackground(new java.awt.Color(51, 51, 51));
        g4.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        g4.setForeground(new java.awt.Color(255, 255, 255));
        g4.setText("G4");
        g4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        g4.setFocusable(false);
        g4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbms/images/theater-seats-png-512_512.png"))); // NOI18N
        g4.setName(""); // NOI18N
        g4.setPreferredSize(new java.awt.Dimension(60, 47));
        g4.setRequestFocusEnabled(false);
        jPanel1.add(g4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, 59, 34));

        l2.setBackground(new java.awt.Color(51, 51, 51));
        l2.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        l2.setForeground(new java.awt.Color(255, 255, 255));
        l2.setText("L2");
        l2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        l2.setFocusable(false);
        l2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbms/images/theater-seats-png-512_512.png"))); // NOI18N
        l2.setName(""); // NOI18N
        l2.setPreferredSize(new java.awt.Dimension(60, 47));
        l2.setRequestFocusEnabled(false);
        jPanel1.add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 59, 34));

        h1.setBackground(new java.awt.Color(51, 51, 51));
        h1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        h1.setForeground(new java.awt.Color(255, 255, 255));
        h1.setText("H1");
        h1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        h1.setFocusable(false);
        h1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbms/images/theater-seats-png-512_512.png"))); // NOI18N
        h1.setName(""); // NOI18N
        h1.setPreferredSize(new java.awt.Dimension(60, 47));
        h1.setRequestFocusEnabled(false);
        jPanel1.add(h1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 440, 59, 34));

        g1.setBackground(new java.awt.Color(51, 51, 51));
        g1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        g1.setForeground(new java.awt.Color(255, 255, 255));
        g1.setText("G1");
        g1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        g1.setFocusable(false);
        g1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dbms/images/theater-seats-png-512_512.png"))); // NOI18N
        g1.setName(""); // NOI18N
        g1.setPreferredSize(new java.awt.Dimension(60, 47));
        g1.setRequestFocusEnabled(false);
        jPanel1.add(g1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, 59, 34));

        dfdf.setBackground(new java.awt.Color(255, 255, 255));
        dfdf.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255), 2));
        jPanel1.add(dfdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 400, 450));

        seat_label.setFont(new java.awt.Font("Trebuchet MS", 1, 10)); // NOI18N
        seat_label.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(seat_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 610, 150, 70));

        seat_q.setBackground(new java.awt.Color(51, 51, 51));
        seat_q.setForeground(new java.awt.Color(51, 51, 51));
        seat_q.setText("jLabel2");
        jPanel1.add(seat_q, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, 40, -1));

        setl.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        setl.setForeground(new java.awt.Color(255, 153, 0));
        jPanel1.add(setl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 570, 190, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

//    public class seatFrame extends JFrame{
//        private Billing parent;
//        
//        public seatFrame(Billing parent){
//                this.parent = parent;
//    }      

    private void selectbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectbuttonActionPerformed

        Billing.selectedSeat = seat_label.getText();
        Billing.selectedQuantity = seat_q.getText();
        billing.setData();
        this.setVisible(false);

    }//GEN-LAST:event_selectbuttonActionPerformed

    private void closebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebuttonActionPerformed

        this.dispose();
    }//GEN-LAST:event_closebuttonActionPerformed

    private void selectbuttonKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_selectbuttonKeyPressed

    }//GEN-LAST:event_selectbuttonKeyPressed

    private void selectbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selectbuttonMouseClicked

    }//GEN-LAST:event_selectbuttonMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new seats().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton a1;
    private javax.swing.JRadioButton b1;
    private javax.swing.JRadioButton c1;
    private javax.swing.JButton closebutton;
    private javax.swing.JRadioButton d1;
    private javax.swing.JLabel dfdf;
    private javax.swing.JRadioButton e1;
    private javax.swing.JRadioButton f1;
    private javax.swing.JRadioButton g1;
    private javax.swing.JRadioButton g2;
    private javax.swing.JRadioButton g3;
    private javax.swing.JRadioButton g4;
    private javax.swing.JRadioButton h1;
    private javax.swing.JRadioButton h2;
    private javax.swing.JRadioButton i1;
    private javax.swing.JRadioButton i2;
    private javax.swing.JRadioButton j1;
    private javax.swing.JRadioButton j2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton k1;
    private javax.swing.JRadioButton k2;
    private javax.swing.JRadioButton l1;
    private javax.swing.JRadioButton l2;
    private javax.swing.JRadioButton m1;
    private javax.swing.JRadioButton m2;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JLabel seat_label;
    private javax.swing.JLabel seat_q;
    private javax.swing.JButton selectbutton;
    private javax.swing.JLabel setl;
    // End of variables declaration//GEN-END:variables
}
