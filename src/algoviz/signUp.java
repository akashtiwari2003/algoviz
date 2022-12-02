/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package algoviz;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;

/**
 *
 * @author Lenovo
 */
public class signUp extends javax.swing.JFrame {

    /**
     * Creates new form signUp
     */
    public signUp() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nm = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        kButton1 = new com.k33ptoo.components.KButton();
        jLabel3 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        conpass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel1.setkGradientFocus(600);
        kGradientPanel1.setkStartColor(new java.awt.Color(153, 0, 153));
        kGradientPanel1.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("AlgoViz");
        kGradientPanel1.add(jLabel8);
        jLabel8.setBounds(60, 40, 90, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoviz/finally.png"))); // NOI18N
        kGradientPanel1.add(jLabel10);
        jLabel10.setBounds(-70, -1400, 430, 1930);

        kGradientPanel2.setkBorderRadius(75);
        kGradientPanel2.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setMinimumSize(new java.awt.Dimension(340, 480));
        kGradientPanel2.setOpaque(false);
        kGradientPanel2.setPreferredSize(new java.awt.Dimension(340, 480));
        kGradientPanel2.setLayout(null);

        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("password");
        kGradientPanel2.add(jLabel1);
        jLabel1.setBounds(60, 330, 60, 16);

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 0, 153));
        jLabel4.setText("SignUp");
        kGradientPanel2.add(jLabel4);
        jLabel4.setBounds(60, 30, 90, 16);

        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Name");
        kGradientPanel2.add(jLabel5);
        jLabel5.setBounds(60, 80, 60, 16);

        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Username");
        kGradientPanel2.add(jLabel6);
        jLabel6.setBounds(60, 140, 60, 16);

        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("email");
        kGradientPanel2.add(jLabel7);
        jLabel7.setBounds(60, 210, 60, 16);

        nm.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 0, 204)));
        nm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nmActionPerformed(evt);
            }
        });
        kGradientPanel2.add(nm);
        nm.setBounds(60, 100, 190, 22);

        username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 0, 204)));
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        kGradientPanel2.add(username);
        username.setBounds(60, 160, 190, 22);

        mail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 0, 204)));
        mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailActionPerformed(evt);
            }
        });
        kGradientPanel2.add(mail);
        mail.setBounds(60, 230, 190, 22);

        kButton1.setText("SignUp");
        kButton1.setkBackGroundColor(new java.awt.Color(0, 204, 204));
        kButton1.setkEndColor(new java.awt.Color(153, 0, 153));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(kButton1);
        kButton1.setBounds(60, 410, 190, 45);

        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("password");
        kGradientPanel2.add(jLabel3);
        jLabel3.setBounds(60, 270, 60, 16);

        pass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 0, 204)));
        kGradientPanel2.add(pass);
        pass.setBounds(60, 300, 190, 20);

        conpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 0, 204)));
        kGradientPanel2.add(conpass);
        conpass.setBounds(60, 360, 190, 20);

        kGradientPanel1.add(kGradientPanel2);
        kGradientPanel2.setBounds(320, 50, 310, 480);

        getContentPane().add(kGradientPanel1);
        kGradientPanel1.setBounds(0, 0, 700, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents
algovizFunctions a = new algovizFunctions();
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
/*jTextField1.setFocusable(true);
jTextField1.setOpaque(false);
TitledBorder tb = BorderFactory.createTitledBorder(
BorderFactory.createEtchedBorder(),"user",TitledBorder.LEFT,TitledBorder.TOP);
tb.setTitleColor(Color.black);
jTextField1.setBorder(tb);
jTextField1.setSize(223, 40);*/
//

    }//GEN-LAST:event_formWindowOpened

    private void nmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nmActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailActionPerformed

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        String name = nm.getText();
        String usernm = username.getText();
        String email = mail.getText();
        String password = pass.getText();
        String pass_confirm = conpass.getText();
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/algovizdb","root","root");
            Statement stmt = con.createStatement();
            String qry = "insert into register values('"+name.trim()+"','"+usernm.trim()+"','"+password.trim()+"','"+email.trim()+"');";
            if(name.trim().isEmpty() || usernm.trim().isEmpty() || password.trim().isEmpty() ||pass_confirm.trim().isEmpty()
                    ||email.trim().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"All details are not filled.","Error",JOptionPane.ERROR_MESSAGE);
            }
            else if(password.matches(pass_confirm)== false)
            {
                JOptionPane.showMessageDialog(null,"Password does not matches.","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {   
        
                String confirm = "select * from register where username = '"+usernm+"';";
                ResultSet r = stmt.executeQuery(confirm);
                if(r.next())
                {
                    JOptionPane.showMessageDialog(null,"UserID already exist");
                }
                else
                {
                    int cof = JOptionPane.showConfirmDialog(null,"Are you sure you want to register","",JOptionPane.YES_NO_OPTION);
                    if(cof == JOptionPane.YES_OPTION)
                    {
                    stmt.executeUpdate(qry);
                    JOptionPane.showMessageDialog(null,"You have been registered successfully");
                    LoginRegister info = new LoginRegister();
                    info.setVisible(true);
                    this.dispose();
                    }
                }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"An Error Occured!","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_kButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField conpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField nm;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
