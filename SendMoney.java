/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bankproject;

import java.awt.Color;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author tanvi
 */
public class SendMoney extends javax.swing.JFrame {
    String account_number;
    /**
     * Creates new form SendMoney
     */
    public SendMoney() {
        initComponents();
    }
    public SendMoney(String account_number) {
        initComponents();
        this.account_number = account_number;
        jLabel6.setText(account_number);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel1.setText("Send Money");

        jLabel2.setText("Receiver Acc. Number :");

        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setText("Receiver Account Number");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Amount :");

        jTextField2.setForeground(new java.awt.Color(153, 153, 153));
        jTextField2.setText("Enter Amount");
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });

        jLabel4.setText("Ref.       :");

        jTextField3.setForeground(new java.awt.Color(153, 153, 153));
        jTextField3.setText("Enter Reference");
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 255));
        jButton1.setText("Click To Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Siyam Rupali", 1, 18)); // NOI18N

        jLabel7.setText("Sender Account :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField2)
                    .addComponent(jTextField1)
                    .addComponent(jTextField3))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel7)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(91, 91, 91)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(177, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents




JFrame f;  
void message(String msg){  
    f=new JFrame();  
    JOptionPane.showMessageDialog(f,msg,"Alert",JOptionPane.WARNING_MESSAGE);     
}
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String tnx_id ;
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789";
  
        // create StringBuffer size of AlphaNumericString
        StringBuilder sb = new StringBuilder(13);
  
        for (int i = 0; i < 13; i++) {
  
            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                = (int)(AlphaNumericString.length()
                        * Math.random());
  
            // add Character one by one in end of sb
            sb.append(AlphaNumericString
                          .charAt(index));
        }
        tnx_id = sb.toString();
      
 
      

       String tnx_id2 ;
        String AlphaNumericString2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                                    + "0123456789";
  
        // create StringBuffer size of AlphaNumericString
        StringBuilder sb2 = new StringBuilder(13);
  
        for (int i = 0; i < 13; i++) {
  
            // generate a random number between
            // 0 to AlphaNumericString variable length
            int index
                = (int)(AlphaNumericString2.length()
                        * Math.random());
  
            // add Character one by one in end of sb
            sb2.append(AlphaNumericString
                          .charAt(index));
        }
        tnx_id2 = sb2.toString();





        



  

    ////Transextion Id


        String rec_number,ref,amount1;
        double sending_amount;
        rec_number = jTextField1.getText();
        amount1 = jTextField2.getText();
        sending_amount = Double.parseDouble(amount1);
        ref = jTextField3.getText();
       
          try {
            // TODO code application logic here
  
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/bankproject","root", "");
            System.out.println("db connection established!");  

            PreparedStatement ind = conn.prepareStatement("select phone,password from customer_info");
            ResultSet res = ind.executeQuery();
            String phone1;
            int flag=0;
            while(res.next()){
                phone1 = res.getString(1);
               if(rec_number.equals(phone1)){
                   flag = 1;
               }
            }
            if(flag >0){
            PreparedStatement qu1 = conn.prepareStatement("select phone,amount from account_info");
                ResultSet res2 = qu1.executeQuery();
                String phone3,amount2;
                double senderBalance=0;
                 int alrt=0;
                    while(res2.next()){
                        phone3 = res2.getString(1);
                        amount2 = res2.getString(2);
                        senderBalance = Double.parseDouble(amount2);
                       if(account_number.equals(phone3)){
                           System.out.println("Amount2");
                           if(senderBalance>=sending_amount){
                               System.out.println("Hello");
                              alrt =1;
                              break;
                            }
                       }

                    }
                if(alrt ==1){
                    //Sender
                        PreparedStatement qu2 = conn.prepareStatement("select phone,amount from account_info");
                        ResultSet res3 = qu2.executeQuery();
                        String phone4,amount4;
                        String type1 = "Send Money";
                        String type2 = "Recive Money";
                        double amount5=0;
                        double recFinalAmmount = 0;
                        double senFinalAmmount;
                            while(res3.next()){
                                phone4 = res3.getString(1);
                                amount4 = res3.getString(2);
                                amount5 = Double.parseDouble(amount4);
                                System.out.println("After If Receiver Amount"+recFinalAmmount);
                               if(rec_number.equals(phone4)){
                                   recFinalAmmount = amount5+sending_amount;
                                   System.out.println("Receiver Final Amount"+recFinalAmmount);  
                               }

                            }
                  //Receiver
                            
                            
                           
                          
                           senFinalAmmount = senderBalance-sending_amount;

                            PreparedStatement sendMoney = conn.prepareStatement("update account_info set amount = ? where phone = ?");
                            sendMoney.setDouble(1, recFinalAmmount); 
                                System.out.println("Set Receiver Final Amount"+recFinalAmmount);   
                            sendMoney.setString(2, rec_number); 
                                System.out.println("Set Receiver Phone Number"+rec_number);   
                            sendMoney.executeUpdate(); 


                            PreparedStatement senderUpdate = conn.prepareStatement("update account_info set amount = ? where phone = ?");
                            senderUpdate.setDouble(1,senFinalAmmount);  
                               System.out.println("Sender Final Amount"+senFinalAmmount);   
                            senderUpdate.setString(2,account_number); 
                               System.out.println("Sender Phone Number"+account_number);  
                            senderUpdate.executeUpdate(); 
                            
                            PreparedStatement transection = conn.prepareStatement("insert into transaction values (?, ?, ?, ?, ?, ?, ?)");
                            transection.setString(1,account_number);
                            transection.setString(2,type1);
                            transection.setString(3,rec_number);
                            transection.setDouble(4,sending_amount);
                            transection.setString(5,ref);
                            java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
                            transection.setTimestamp(6, date); 
                            transection.setString(7,tnx_id);
                            transection.executeUpdate();
                            
                            PreparedStatement transection2 = conn.prepareStatement("insert into transaction values (?, ?, ?, ?, ?, ?, ?)");
                            transection2.setString(1,rec_number);
                            transection2.setString(2,type2);
                            transection2.setString(3,account_number);
                            transection2.setDouble(4,sending_amount);
                            transection2.setString(5,ref);
                            transection2.setTimestamp(6, date); 
                            transection2.setString(7,tnx_id2);
                            transection2.executeUpdate();
                            
                           
                           this.dispose();
                        
                        message("Send Money SuccessFull !!!");
                         new UserFacility(account_number).setVisible(true);
                    }
                else{message("Not Enough Balanace !!");}
            }
            else{ 
               message("Account Not Found !!");
               this.dispose();
                new UserFacility(account_number).setVisible(true);

            }

            
            
            
           
            
            
        } catch (SQLException ex) {
            //Logger.getLogger(DbCon443.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("sorry, connection not established!"+ex);
        }        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
         if(jTextField1.getText().equals("Receiver Account Number")){
           jTextField1.setText("");
           jTextField1.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        if(jTextField1.getText().equals("")){
           jTextField1.setText("Receiver Account Number");
           jTextField1.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
         if(jTextField2.getText().equals("Enter Amount")){
           jTextField2.setText("");
           jTextField2.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        if(jTextField2.getText().equals("")){
           jTextField2.setText("Enter Amount");
           jTextField2.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
         if(jTextField3.getText().equals("Enter Reference")){
           jTextField3.setText("");
           jTextField3.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        if(jTextField3.getText().equals("")){
           jTextField3.setText("Enter Reference");
           jTextField3.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_jTextField3FocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         this.dispose();
       new UserFacility(account_number).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(SendMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SendMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SendMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SendMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SendMoney().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
