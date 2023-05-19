/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_gui_remake;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author basil
 */
public class show_invoices_page extends javax.swing.JFrame {

    /**
     * Creates new form show_invoices_page
     */
    public show_invoices_page() {
        initComponents();
        show_mybill();
    }
    
    public void show_mybill(){
        try{
        File myfile = new File("UserId.txt");
        Scanner scan = new Scanner(myfile);
        String user_id=scan.nextLine();
        int convert_id=Integer.parseInt(user_id);
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/milestone2_ver5?zeroDateTimeBehavior=convertToNull","root","pass123"
                + "");
        Statement stm = connect.createStatement();
        String sql_query="select * from orders where cust_id="+convert_id;
        ResultSet myresult = stm.executeQuery(sql_query);
        File myfile2 = new File("specific_orders.txt");
        FileWriter filewriter = new FileWriter(myfile2);
        PrintWriter printwriter = new PrintWriter(filewriter);
        
        while(myresult.next()){
        printwriter.println("order id : "+myresult.getInt(1));
        printwriter.println("Customer id : "+myresult.getInt(2));
        printwriter.println("Customer Name : "+myresult.getString(3));
        printwriter.println("Product Id : "+myresult.getInt(4));
        printwriter.println("Product Name : "+myresult.getString(5));
        printwriter.println("Quantity : "+myresult.getInt(6));
        printwriter.println("Total Price : "+myresult.getInt(7));
        printwriter.println("Date : "+myresult.getString(8));
        printwriter.println("----------------------");  
        }
        printwriter.close();
        stm.close();
        connect.close();
       
        FileReader reader = new FileReader(myfile2);
        BufferedReader bfr = new BufferedReader(reader);
        Invoices_textarea.read(bfr,null);
        bfr.close();
        Invoices_textarea.requestFocus();
        }
        catch(Exception er){
            System.out.println(er.getMessage());
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        Invoices_textarea = new javax.swing.JTextArea();
        Back_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Invoices page");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(235, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/bill-resized.png"))); // NOI18N
        jLabel1.setText("Invoices");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 110, -1));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        Invoices_textarea.setEditable(false);
        Invoices_textarea.setColumns(20);
        Invoices_textarea.setRows(5);
        jScrollPane1.setViewportView(Invoices_textarea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 230, 150));

        Back_button.setText("Back");
        Back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Back_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(Back_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_buttonActionPerformed
        // TODO add your handling code here:
        dispose();
        Customer_Page_Remake custpage = new Customer_Page_Remake();
        custpage.setLocationRelativeTo(this);
        custpage.show();
    }//GEN-LAST:event_Back_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(show_invoices_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(show_invoices_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(show_invoices_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(show_invoices_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new show_invoices_page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back_button;
    private javax.swing.JTextArea Invoices_textarea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
