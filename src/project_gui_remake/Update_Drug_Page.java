/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project_gui_remake;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LENOVO
 */
public class Update_Drug_Page extends javax.swing.JFrame {

    /**
     * Creates new form Update_Drug_Page
     */
    public Update_Drug_Page() {
        initComponents();
    }
    
   public void refresh_table(){
       
       try{
       Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/milestone2_ver5?zeroDateTimeBehavior=convertToNull","root","pass123");
       Statement stm = connect.createStatement();
       String sql_query="SELECT * FROM PRODUCTS";
       ResultSet myresult = stm.executeQuery(sql_query);
       ResultSetMetaData mymetadata=myresult.getMetaData();
       DefaultTableModel mymodel=(DefaultTableModel) ProductsTable.getModel();
       mymodel.setRowCount(0);
       
            Products myproducts=new Products();
            
            while(myresult.next()){
                myproducts.name=myresult.getString(1);
                myproducts.type=myresult.getString(2);
                myproducts.barcode=myresult.getString(3);
                myproducts.dose=myresult.getString(4);
                String id_string=myresult.getString(5);
                String price_string=myresult.getString(6);
                myproducts.production_data=myresult.getString(7);
                myproducts.expiration_date=myresult.getString(8);
                String quantity_string=myresult.getString(9);
                
                String []row={myproducts.name,myproducts.type,myproducts.barcode,
                              myproducts.dose,id_string,price_string,
                              myproducts.production_data,myproducts.expiration_date,quantity_string};
                mymodel.addRow(row);
            }
            stm.close();
            connect.close();
       
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
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ProductsTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        drug_name_textfield1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        drug_id_textfield = new javax.swing.JTextField();
        drug_dose_textfield = new javax.swing.JTextField();
        drug_type_textfield = new javax.swing.JTextField();
        drug_barcode_textfield = new javax.swing.JTextField();
        drug_selling_price_textfield = new javax.swing.JTextField();
        drug_production_date_textfield = new javax.swing.JTextField();
        drug_expiration_date_textfield = new javax.swing.JTextField();
        quantity_counter = new javax.swing.JSpinner();
        error_label_message = new javax.swing.JLabel();
        Refresh_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Page");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(235, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/updating-resize.png"))); // NOI18N
        jLabel1.setText("Update Drug");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 210, -1));

        jLabel2.setText("Select drug \"name\" to show its data:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jButton1.setText("Show Drug data");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowDataActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 170, -1));

        ProductsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        ProductsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductsTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(ProductsTable);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 720, 100));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/updating-resize.png"))); // NOI18N
        jButton2.setText("Update Drug");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 570, 140, -1));

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 570, 100, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Please Update Selected Drug info:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 210, -1));

        jLabel3.setText("Name :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));
        jPanel1.add(drug_name_textfield1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 100, 20));

        jLabel4.setText("Drug_Id : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        jLabel12.setText("Dose : ");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, -1, -1));

        jLabel5.setText("Type : ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, -1, -1));

        jLabel6.setText("BarCode :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 470, -1, 20));

        jLabel7.setText("Selling_Price :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, -1, 20));

        jLabel9.setText("Production_Date :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 100, 20));

        jLabel10.setText("Expiration_Date : ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, -1, 20));

        jLabel11.setText("Quantity : ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, -1, -1));

        drug_id_textfield.setEditable(false);
        drug_id_textfield.setBackground(new java.awt.Color(240, 240, 240));
        jPanel1.add(drug_id_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 100, 20));
        jPanel1.add(drug_dose_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 100, 20));
        jPanel1.add(drug_type_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, 100, 20));

        drug_barcode_textfield.setEditable(false);
        drug_barcode_textfield.setBackground(new java.awt.Color(240, 240, 240));
        jPanel1.add(drug_barcode_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 100, 20));
        jPanel1.add(drug_selling_price_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, 100, 20));
        jPanel1.add(drug_production_date_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 350, 100, 20));
        jPanel1.add(drug_expiration_date_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 100, 20));

        quantity_counter.setModel(new javax.swing.SpinnerNumberModel());
        jPanel1.add(quantity_counter, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 50, 20));
        jPanel1.add(error_label_message, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, -1, -1));

        Refresh_button.setText("Refresh");
        Refresh_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Refresh_buttonActionPerformed(evt);
            }
        });
        jPanel1.add(Refresh_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShowDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowDataActionPerformed
        try{
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/milestone2_ver5?zeroDateTimeBehavior=convertToNull","root","pass123");
            Statement stm = connect.createStatement();
            String sql_query="SELECT * FROM PRODUCTS";
            ResultSet myresult=stm.executeQuery(sql_query);
            ResultSetMetaData mymetadata=myresult.getMetaData();
            DefaultTableModel mymodel=(DefaultTableModel) ProductsTable.getModel();
            int columns_num=mymetadata.getColumnCount();
            String[] columns_name = new String[columns_num];
            
            for(int i=0;i<columns_num;i++){
                columns_name[i]=mymetadata.getColumnName(i+1);
            }
            mymodel.setColumnIdentifiers(columns_name);
            
            Products myproducts=new Products();
            
            while(myresult.next()){
                myproducts.name=myresult.getString(1);
                myproducts.type=myresult.getString(2);
                myproducts.barcode=myresult.getString(3);
                myproducts.dose=myresult.getString(4);
                String id_string=myresult.getString(5);
                String price_string=myresult.getString(6);
                myproducts.production_data=myresult.getString(7);
                myproducts.expiration_date=myresult.getString(8);
                String quantity_string=myresult.getString(9);
                
                String []row={myproducts.name,myproducts.type,myproducts.barcode,
                              myproducts.dose,id_string,price_string,
                              myproducts.production_data,myproducts.expiration_date,quantity_string};
                mymodel.addRow(row);
            }
            stm.close();
            connect.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_ShowDataActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        dispose();
        Admin_Page_Remake adminpage = new Admin_Page_Remake();
        adminpage.setLocationRelativeTo(this);
        adminpage.show();
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void UpdateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButtonActionPerformed
       Products myproduct = new Products();
       myproduct.name=drug_name_textfield1.getText();
       myproduct.type=drug_type_textfield.getText();
       myproduct.barcode=drug_barcode_textfield.getText();
       myproduct.dose=drug_dose_textfield.getText();
       String id_string=drug_id_textfield.getText();
       String price_string=drug_selling_price_textfield.getText();
       myproduct.production_data=drug_production_date_textfield.getText();
       myproduct.expiration_date=drug_expiration_date_textfield.getText();
       String quantity_string=quantity_counter.getValue().toString();
       
       
        if(drug_name_textfield1.getText().isEmpty()||drug_type_textfield.getText().isEmpty()
                ||drug_barcode_textfield.getText().isEmpty()||drug_dose_textfield.getText().isEmpty()
                ||drug_id_textfield.getText().isEmpty()||drug_selling_price_textfield.getText().isEmpty()
                ||drug_production_date_textfield.getText().isEmpty()||drug_expiration_date_textfield.getText().isEmpty()
                ){
            error_label_message.setText("You Should Fill All Information");
        }
        else{
        myproduct.product_id = Integer.parseInt(id_string);
        myproduct.selling_price=Double.valueOf(price_string);
        myproduct.quantity=Integer.parseInt(quantity_string);
        try{
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/milestone2_ver5?zeroDateTimeBehavior=convertToNull","root","pass123");
        Statement stm = connect.createStatement();
        String sql_query="SELECT * FROM PRODUCTS WHERE Product_id="+myproduct.product_id;
        ResultSet myresult = stm.executeQuery(sql_query);
        while(myresult.next()){
        //Checking if there is something new to update
        if(myproduct.name.equals(myresult.getString(1))&&myproduct.type.equals(myresult.getString(2))&&
                myproduct.barcode.equals(myresult.getString(3))&&myproduct.dose.equals(myresult.getString(4))
                &&myproduct.product_id==myresult.getInt(5)&&myproduct.selling_price==myresult.getDouble(6)
                &&myproduct.production_data.equals(myresult.getString(7))&&myproduct.expiration_date.equals(myresult.getString(8))
                &&myproduct.quantity==myresult.getInt(9)){
        error_label_message.setText("There is Nothing New To Update");   
        }
        else{
            String sql_query2="UPDATE PRODUCTS SET NAME='"+myproduct.name+"',TYPE='"+myproduct.type+"'"+
                    ",BARCODE='"+myproduct.barcode+"',DOSE='"+myproduct.dose+"',PRODUCT_ID="+myproduct.product_id+
                    ",SELLING_PRICE="+myproduct.selling_price+",PRODUCTION_DATE='"+myproduct.production_data+"',"+
                    "EXPIRATION_DATE='"+myproduct.expiration_date+"',QUANTITY="+myproduct.quantity+
                    " WHERE PRODUCT_ID="+myproduct.product_id;
            
            stm.executeUpdate(sql_query2);
            
            JOptionPane.showMessageDialog(this,"Drug Has Updated Successfully !");
        }
        
        }
        stm.close();
        connect.close();
        
        }
        catch(Exception er){
            System.out.println(er.getMessage());
        }    
        }
        
    }//GEN-LAST:event_UpdateButtonActionPerformed

    private void ProductsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductsTableMouseClicked
        try{
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/milestone2_ver5?zeroDateTimeBehavior=convertToNull","root","pass123");
            Statement stm = connect.createStatement();
            int row = ProductsTable.getSelectedRow();
            String tableClicked = ProductsTable.getModel().getValueAt(row, 0).toString();
            String sqlQuery = "SELECT * FROM PRODUCTS WHERE NAME = '"+tableClicked+"'";
            ResultSet myresult=stm.executeQuery(sqlQuery);
            if(myresult.next())
            {
                String updateName = myresult.getString("NAME");
                drug_name_textfield1.setText(updateName);
                String updateID = myresult.getString("Product_ID");
                drug_id_textfield.setText(updateID);
                String updateDose = myresult.getString("DOSE");
                drug_dose_textfield.setText(updateDose);
                String updateType = myresult.getString("TYPE");
                drug_type_textfield.setText(updateType);
                String updateBarcode = myresult.getString("BARCODE");
                drug_barcode_textfield.setText(updateBarcode);
                String updatePrice = myresult.getString("SELLING_PRICE");
                drug_selling_price_textfield.setText(updatePrice);
                String updatePD = myresult.getString("PRODUCTION_DATE");
                drug_production_date_textfield.setText(updatePD);
                String updateED = myresult.getString("EXPIRATION_DATE");
                drug_expiration_date_textfield.setText(updateED);
                int updateQuantity = Integer.parseInt(myresult.getString("QUANTITY"));
                quantity_counter.setValue(updateQuantity);
                
            }
        }        
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_ProductsTableMouseClicked

    private void Refresh_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Refresh_buttonActionPerformed
        // TODO add your handling code here:
        refresh_table();
    }//GEN-LAST:event_Refresh_buttonActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(Update_Drug_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update_Drug_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update_Drug_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update_Drug_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update_Drug_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ProductsTable;
    private javax.swing.JButton Refresh_button;
    private javax.swing.JTextField drug_barcode_textfield;
    private javax.swing.JTextField drug_dose_textfield;
    private javax.swing.JTextField drug_expiration_date_textfield;
    private javax.swing.JTextField drug_id_textfield;
    private javax.swing.JTextField drug_name_textfield1;
    private javax.swing.JTextField drug_production_date_textfield;
    private javax.swing.JTextField drug_selling_price_textfield;
    private javax.swing.JTextField drug_type_textfield;
    private javax.swing.JLabel error_label_message;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner quantity_counter;
    // End of variables declaration//GEN-END:variables
}
