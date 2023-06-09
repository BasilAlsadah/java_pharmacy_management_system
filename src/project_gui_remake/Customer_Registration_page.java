/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project_gui_remake;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class Customer_Registration_page extends javax.swing.JFrame {

    /**
     * Creates new form Customer_Registration_page
     */
    public Customer_Registration_page() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        NameTextField = new javax.swing.JTextField();
        DoBTextField = new javax.swing.JTextField();
        IDTextField = new javax.swing.JTextField();
        PhoneTextField = new javax.swing.JTextField();
        GenderComboBox = new javax.swing.JComboBox<>();
        PasswordField = new javax.swing.JPasswordField();
        ConfirmPasswordField = new javax.swing.JPasswordField();
        EmptyErrorLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer Registration Page");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(235, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/user-resized.png"))); // NOI18N
        jLabel1.setText("Customer Registration");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 260, -1));

        jLabel2.setText("name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        jLabel3.setText("ID:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, -1, -1));

        jLabel4.setText("Password:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, -1));

        jLabel5.setText("Confirmed Password:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 205, -1, -1));

        jLabel6.setText("gender:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, -1, -1));

        jLabel7.setText("Date of Birth:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, -1, -1));

        jLabel8.setText("Phone:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 215, -1, -1));

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1RegisterButtonActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2CancelButtonActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, -1, -1));
        jPanel1.add(NameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 60, 20));
        jPanel1.add(DoBTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 60, 20));
        jPanel1.add(IDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 140, 60, 20));
        jPanel1.add(PhoneTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 215, 60, 20));

        GenderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        jPanel1.add(GenderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, 20));

        PasswordField.setToolTipText("");
        jPanel1.add(PasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 80, 20));
        jPanel1.add(ConfirmPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 205, 80, 20));
        jPanel1.add(EmptyErrorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1RegisterButtonActionPerformed

        Customer customer_account = new Customer();
        customer_account.name = NameTextField.getText();
        String id_string = IDTextField.getText();
        customer_account.gender = GenderComboBox.getSelectedItem().toString();
        String phone_string = PhoneTextField.getText();
        customer_account.dob = DoBTextField.getText();
        customer_account.password = PasswordField.getPassword().toString();
        String mypassword=new String(PasswordField.getPassword());
        String mypassword2=new String(ConfirmPasswordField.getPassword());
        
        if(NameTextField.getText().isEmpty() || IDTextField.getText().isEmpty()
                || PhoneTextField.getText().isEmpty() || DoBTextField.getText().isEmpty()
                || PasswordField.getText().isEmpty() || ConfirmPasswordField.getText().isEmpty())
        {
            EmptyErrorLabel.setText("Sorry.. You Should Fill All information");
        }
        else
        {
            if(mypassword.equals(mypassword2))
            {
                customer_account.id = new BigInteger(id_string);
                customer_account.phone = new BigInteger(phone_string);
                try
                {
                    Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/milestone2_ver5?zeroDateTimeBehavior=convertToNull","root","pass123");
                    Statement stm = connect.createStatement(); 
                    String sqlQuery = "INSERT INTO CUSTOMER VALUES("+customer_account.id+" , '"+customer_account.name+"',"+ 
                    customer_account.phone+",'"+customer_account.gender+"',"+mypassword+",'"+customer_account.dob+"')";
                    String sqlQuery2 = "INSERT INTO CUSTOMER_LOGIN VALUES ("+customer_account.id+", '" +mypassword+"')";
                    stm.executeUpdate(sqlQuery);
                    stm.executeUpdate(sqlQuery2);
                    JOptionPane.showMessageDialog(this,"Account Has Created Successfully!");
                    stm.close();
                    connect.close();
                }
                catch(Exception er)
                {
                    System.out.println(er.getMessage());
                }
            }
            else
            {
                EmptyErrorLabel.setText("Password Isn't Identical");
            }
                
        }
    }//GEN-LAST:event_jButton1RegisterButtonActionPerformed

    private void jButton2CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2CancelButtonActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2CancelButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Customer_Registration_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer_Registration_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer_Registration_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer_Registration_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer_Registration_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ConfirmPasswordField;
    private javax.swing.JTextField DoBTextField;
    private javax.swing.JLabel EmptyErrorLabel;
    private javax.swing.JComboBox<String> GenderComboBox;
    private javax.swing.JTextField IDTextField;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JTextField PhoneTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
