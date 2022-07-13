package ru.llax.GUI;

import java.awt.Color;
import java.awt.Cursor;
import ru.llax.swel.notification.Notification;

public class Auth extends javax.swing.JFrame {
    private String message = "Account created";
    private Notification noti= new Notification(this, Notification.Type.SUCCESS, Notification.Location.BOTTOM_RIGHT, message);
    

    public Auth() {
        initComponents();
        this.setBackground(new Color (0,0,0,0));
        main.setBackground(new Color (0,0,0,0));
        button1.setCursor(new Cursor(12));
        button2.setCursor(new Cursor(12));
        button3.setCursor(new Cursor(12));
        jLabel4.setCursor(new Cursor(12));
        setLanguage("ENG");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        passwordField1 = new ru.llax.swel.textfield.PasswordField();
        textField2 = new ru.llax.swel.textfield.TextField();
        textField1 = new ru.llax.swel.textfield.TextField();
        button3 = new ru.llax.swel.Button();
        button2 = new ru.llax.swel.Button();
        button1 = new ru.llax.swel.Button();
        combobox1 = new ru.llax.swel.Combobox();
        labImageBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        addWindowStateListener(new java.awt.event.WindowStateListener() {
            public void windowStateChanged(java.awt.event.WindowEvent evt) {
                formWindowStateChanged(evt);
            }
        });

        main.setMinimumSize(new java.awt.Dimension(1300, 650));
        main.setPreferredSize(new java.awt.Dimension(1300, 650));
        main.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                mainMouseDragged(evt);
            }
        });
        main.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mainMousePressed(evt);
            }
        });
        main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("Login");
        main.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 540, -1, -1));

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Already have an account ?");
        main.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 540, -1, -1));

        jLabel2.setFont(new java.awt.Font("UD Digi Kyokasho N-R", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("- OR -");
        main.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 430, 50));

        jLabel1.setFont(new java.awt.Font("UD Digi Kyokasho N-B", 1, 36)); // NOI18N
        jLabel1.setText("Create Account");
        main.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 640, 50));

        passwordField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        passwordField1.setLabelText("Password");
        passwordField1.setShowAndHide(true);
        main.add(passwordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, 430, -1));

        textField2.setToolTipText("");
        textField2.setLabelText("Email address");
        main.add(textField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 430, -1));

        textField1.setToolTipText("");
        textField1.setLabelText("Full name");
        main.add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 430, -1));

        button3.setBackground(new java.awt.Color(63, 162, 219));
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setText("Create Account");
        button3.setToolTipText("Sign Up");
        button3.setBorderColor(new java.awt.Color(63, 162, 219));
        button3.setBorderPainted(false);
        button3.setColor(new java.awt.Color(63, 162, 219));
        button3.setColorClick(new java.awt.Color(219, 121, 63));
        button3.setColorOver(new java.awt.Color(134, 196, 232));
        button3.setFont(new java.awt.Font("Yu Gothic UI Semilight", 1, 14)); // NOI18N
        button3.setRadius(10);
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        main.add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 430, 40));

        button2.setForeground(new java.awt.Color(51, 51, 51));
        button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/llax/res/facebook.png"))); // NOI18N
        button2.setText("Sign Up with Facebook");
        button2.setToolTipText("Sign Up");
        button2.setBorderColor(new java.awt.Color(204, 204, 255));
        button2.setBorderPainted(false);
        button2.setColorClick(new java.awt.Color(204, 204, 255));
        button2.setColorOver(new java.awt.Color(176, 216, 218));
        button2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        button2.setRadius(10);
        main.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 120, 200, 40));

        button1.setForeground(new java.awt.Color(51, 51, 51));
        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/llax/res/google.png"))); // NOI18N
        button1.setText("Sign Up with Google");
        button1.setToolTipText("Sign Up");
        button1.setBorderColor(new java.awt.Color(204, 204, 255));
        button1.setBorderPainted(false);
        button1.setColorClick(new java.awt.Color(204, 204, 255));
        button1.setColorOver(new java.awt.Color(176, 216, 218));
        button1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        button1.setRadius(10);
        main.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 120, 200, 40));

        combobox1.setForeground(new java.awt.Color(51, 51, 51));
        combobox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "English (UK)", "Russian (RF)" }));
        combobox1.setToolTipText("");
        combobox1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        combobox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combobox1ItemStateChanged(evt);
            }
        });
        main.add(combobox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 10, 140, 50));

        labImageBackground.setForeground(new java.awt.Color(255, 255, 255));
        labImageBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ru/llax/res/background.png"))); // NOI18N
        main.add(labImageBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 0, 1210, 660));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, 1206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowStateChanged(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowStateChanged
        
    }//GEN-LAST:event_formWindowStateChanged

    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        System.out.println("edit " + "w : " + this.getWidth() + ", h : " + this.getHeight());
    }//GEN-LAST:event_formComponentResized

    int locationX;
    int locationY;
    
    private void mainMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainMousePressed
        locationX = evt.getX();
        locationY = evt.getY();
    }//GEN-LAST:event_mainMousePressed

    private void mainMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - locationX, y - locationY);
    }//GEN-LAST:event_mainMouseDragged

    private void combobox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combobox1ItemStateChanged
        String item = evt.getItem().toString();
        
        if (item == "English (UK)") {
            System.out.println("changed");
            setLanguage("ENG");
        } else if (item == "Russian (RF)") {
            setLanguage("RU");
        }
    }//GEN-LAST:event_combobox1ItemStateChanged

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        noti.showNotification();
    }//GEN-LAST:event_button3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ru.llax.swel.Button button1;
    private ru.llax.swel.Button button2;
    private ru.llax.swel.Button button3;
    private ru.llax.swel.Combobox combobox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel labImageBackground;
    private javax.swing.JPanel main;
    private ru.llax.swel.textfield.PasswordField passwordField1;
    private ru.llax.swel.textfield.TextField textField1;
    private ru.llax.swel.textfield.TextField textField2;
    // End of variables declaration//GEN-END:variables

    private void setLanguage(String lang) {
        switch (lang) {
            case "RU":
                jLabel1.setText("Создать аккаунт");
                jLabel2.setText("- ИЛИ -");
                textField1.setLabelText("ФИО");
                passwordField1.setLabelText("Пароль");
                button3.setText("Создать аккаунт");
                jLabel3.setText("Уже есть аккаунт?");
                message = "Аккаунт создан";
                break;
            case "ENG":
                jLabel1.setText("Create account");
                jLabel2.setText("- OR -");
                textField1.setLabelText("Full name");
                passwordField1.setLabelText("Password");
                button3.setText("Create account");
                jLabel3.setText("Already have an account?");
                message = "Account created";
                break;
        }
    }
}
