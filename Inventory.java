
import com.mysql.cj.xdevapi.Statement;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author babul
 */
public class Inventory extends javax.swing.JFrame {

    /**
     * Creates new form Inventory
     */
    public Inventory() {
        initComponents();
    }
    String pno,npno;
    public Inventory(String pno) {
        Connect();
        initComponents();
        this.pno=pno;
        npno=pno;
        
        lblpid.setText(npno);
    }
    
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public void Connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/gayatrihospital","root","");     
               
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserCreation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserCreation.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
//    public void sales() throws ClassNotFoundException{
//        
//        try {
//            DateTimeFormatter daa=DateTimeFormatter.ofPattern("yyyy/mm/dd");
//            LocalDateTime now=LocalDateTime.now();
//            String date=daa.format(now);
//            
//            String totalcost=txttc.getText();
//            String pay=txtpay.getText();
//            String balance=txtbal.getText();
//            
//            
//            int lastInsertId=0;
//            
//            String query="insert into sales(date,subtotal,pay,balance) values(?,?,?,?) ";
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost/gayatrihospital","root","");
//            pst=con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
//            
//            pst.setString(1,date);
//            pst.setString(2,totalcost);
//            pst.setString(3,pay);
//            pst.setString(4,balance);
//            
//            pst.executeUpdate();
//            
//            rs=pst.getGeneratedKeys();
//            
//            if(rs.next()){
//                
//                lastInsertId=rs.getInt(1);
//            }
//            int rows=jTable1.getRowCount();
//            
//            String query1="insert into sales_product(sales_id,prod_id,sellprice,qty,total)";
//            pst=con.prepareStatement(query1);
//            String pres_id;
//            String item_id;
//            String price;
//            String qty;
//            int total;
//            for(int i=0;i<jTable1.getRowCount();i++){
//                
//                pres_id=(String)jTable1.getValueAt(i,0);
//                item_id=(String)jTable1.getValueAt(i,1);
//                qty=jTable1.getValueAt(i,3).toString();
//                int qty1=Integer.parseInt(qty);
//                price=(String)jTable1.getValueAt(i,4);
//               
//                total=(int)jTable1.getValueAt(i,5);
//                
//                pst.setInt(1,lastInsertId);
//                pst.setString(2,item_id);
//                pst.setInt(3,qty1);
//                pst.setString(4,price);
//                pst.setInt(5,total);
//                
//                pst.executeUpdate();
//                JOptionPane.showMessageDialog(this,"Record Added");
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//    }
//    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblpid = new javax.swing.JLabel();
        txtdcode = new javax.swing.JTextField();
        txtdname = new javax.swing.JTextField();
        txtqty = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txttc = new javax.swing.JTextField();
        txtpay = new javax.swing.JTextField();
        txtbal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 51));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("Prescription Id");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Drug Code");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("Drug Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("Quantity");

        lblpid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblpid.setForeground(new java.awt.Color(255, 255, 255));
        lblpid.setText("jLabel6");

        txtdcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtdcodeKeyPressed(evt);
            }
        });

        txtdname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdnameActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Prescription Id", "Drug Code", "Drug Name", "Qty", "Price", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("TotalCost");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("Pay");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 0));
        jLabel9.setText("Balance");

        txtbal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbalActionPerformed(evt);
            }
        });

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Sales Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblpid, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdcode, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(txtdname)
                            .addComponent(txtqty))
                        .addGap(138, 138, 138)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtbal, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(txtpay)
                            .addComponent(txttc)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(50, 50, 50)
                                .addComponent(jButton2)
                                .addGap(43, 43, 43)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblpid)
                    .addComponent(jLabel7)
                    .addComponent(txttc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtdcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtpay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtdname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtbal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Sales");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String dcode=txtdcode.getText();
        try {
            pst=con.prepareStatement("Select * from item where itemid=? ");
            pst.setString(1,dcode);
            rs=pst.executeQuery();
            
            while(rs.next()){
                int currqty,sellprice,reqqty;
                
                currqty=rs.getInt("qty");
                sellprice=rs.getInt("sellprice");
                
                reqqty=Integer.parseInt(txtqty.getValue().toString());
                
                int total=reqqty*sellprice;
                
                if(reqqty>currqty){
                    JOptionPane.showMessageDialog(this,"Quantity not enough");
                    JOptionPane.showMessageDialog(this,"Available qty   "+currqty);   
                }
                else{
                    DefaultTableModel df=(DefaultTableModel)jTable1.getModel();
                    df.addRow(new Object[]{
                        lblpid.getText(),
                        txtdcode.getText(),
                        txtdname.getText(),
                        txtqty.getValue().toString(),
                        sellprice,
                        total
                
                    
                    });
//                    int rem=currqty-reqqty;
//                    pst=con.prepareStatement("update item set item=?,itemname=?,description=?,sellprice=?,buyprice=?,qty=? where itemid=?");
//                    pst.setString(1,dcode);
//                    pst.setString(2,txtdname.getText());
//                    pst.setString(3,rem);
//                    pst.setString(2,dcode);
//                    pst.setString(1,rem);
//                    pst.setString(2,dcode);
//                    pst.setString(1,rem);
//                    pst.setString(2,dcode);
//            
                    int sum=0;
                    
                    for(int i=0;i<jTable1.getRowCount();i++){
                        sum+=Integer.parseInt(jTable1.getValueAt(i,5).toString());
                    }
                    txttc.setText(Integer.toString(sum));
                    txtdcode.setText("");
                    txtdname.setText("");
                    txtqty.setValue(0);
                    txtdcode.requestFocus();
            
                }
                
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        int pay=Integer.parseInt(txtpay.getText());
        int totalcost=Integer.parseInt(txttc.getText());
        
        int balance=pay-totalcost;
        
        txtbal.setText(Integer.toString(balance));
        //sales();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtdnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdnameActionPerformed

    private void txtbalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbalActionPerformed

    private void txtdcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdcodeKeyPressed
        // TODO add your handling code here:
        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            
            String dcode=txtdcode.getText();
            try {
                pst=con.prepareStatement("Select * from item where itemid=? ");
                pst.setString(1,dcode);
                rs=pst.executeQuery();
                
                if(rs.next()==false){
                    JOptionPane.showMessageDialog(this,"Item Not Found");
                }
                else{
                    String dname=rs.getString("itemname");
                    txtdname.setText(dname.trim());
                    txtdcode.requestFocus();
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        
    }//GEN-LAST:event_txtdcodeKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblpid;
    private javax.swing.JTextField txtbal;
    private javax.swing.JTextField txtdcode;
    private javax.swing.JTextField txtdname;
    private javax.swing.JTextField txtpay;
    private javax.swing.JSpinner txtqty;
    private javax.swing.JTextField txttc;
    // End of variables declaration//GEN-END:variables
}
