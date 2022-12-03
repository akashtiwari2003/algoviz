package algoviz;

import javax.swing.BorderFactory;
import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;

public class LoginRegister extends javax.swing.JFrame {
    public LoginRegister() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        parentPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        usernameTF = new javax.swing.JTextField();
        passwordTF = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        kButton1 = new com.k33ptoo.components.KButton();
        kButton2 = new com.k33ptoo.components.KButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        parentPanel.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(350, 500));
        jPanel2.setLayout(null);

        kGradientPanel1.setLayout(null);

        kGradientPanel2.setkBorderRadius(30);
        kGradientPanel2.setkEndColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setkStartColor(new java.awt.Color(255, 255, 255));
        kGradientPanel2.setOpaque(false);
        kGradientPanel2.setLayout(null);

        usernameTF.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        usernameTF.setToolTipText("Username");
        usernameTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 51, 255)));
        usernameTF.setOpaque(true);
        kGradientPanel2.add(usernameTF);
        usernameTF.setBounds(40, 40, 220, 30);

        passwordTF.setFont(new java.awt.Font("Segoe UI Variable", 1, 12)); // NOI18N
        passwordTF.setToolTipText("Password");
        passwordTF.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(204, 51, 255)));
        kGradientPanel2.add(passwordTF);
        passwordTF.setBounds(40, 100, 220, 30);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Forgot Password?");
        kGradientPanel2.add(jLabel1);
        jLabel1.setBounds(160, 140, 100, 16);

        kButton1.setText("Login");
        kButton1.setkBorderRadius(50);
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(kButton1);
        kButton1.setBounds(170, 170, 100, 45);

        kButton2.setText("SignUp");
        kButton2.setkBorderRadius(50);
        kButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton2ActionPerformed(evt);
            }
        });
        kGradientPanel2.add(kButton2);
        kButton2.setBounds(30, 170, 100, 45);

        kGradientPanel1.add(kGradientPanel2);
        kGradientPanel2.setBounds(200, 130, 300, 220);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("AlgoViz");
        kGradientPanel1.add(jLabel5);
        jLabel5.setBounds(260, 100, 190, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoviz/Gray Illustration Gaming Logo (4).png"))); // NOI18N
        kGradientPanel1.add(jLabel2);
        jLabel2.setBounds(230, 0, 220, 130);

        jPanel2.add(kGradientPanel1);
        kGradientPanel1.setBounds(0, 0, 690, 490);

        parentPanel.add(jPanel2);
        jPanel2.setBounds(0, 0, 700, 500);

        getContentPane().add(parentPanel);
        parentPanel.setBounds(0, 0, 700, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents
String dbUser = "root";
String dbPass = "root";
int bth; 
int btw ;
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

/*
ImageIcon img2 = new ImageIcon(getClass().getResource("blurLabel.png"));
Image im2 = img2.getImage();
Image fin2 = im2.getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), Image.SCALE_DEFAULT);
ImageIcon background_img2 = new ImageIcon(fin2);
jButton1.setIcon(background_img2);
*/
    }//GEN-LAST:event_formWindowOpened

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
String username = usernameTF.getText();
String password = passwordTF.getText();

if(username.length() == 0 || password.length() == 0){
    JOptionPane.showMessageDialog(this,"Invalid Input","Error",JOptionPane.ERROR_MESSAGE);
}
else{
    try{
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/algovizdb",dbUser,dbPass);
       Statement st = con.createStatement();
       String qry = "select * from register where username = '"+username+"' and password = '"+password+"';";
       ResultSet rs = st.executeQuery(qry);
       if(rs.next())
       {
       String query = "insert into loggedIn values('"+rs.getString(1)+"','"+rs.getString(2)+"');";    
       JOptionPane.showMessageDialog(this,"Login Successfull!");
       st.executeUpdate(query);
       Levels l = new Levels();
       l.setVisible(true);
       this.dispose();
       }
       else
       {
       JOptionPane.showMessageDialog(this,"Invalid Username or Password.","Error",JOptionPane.ERROR_MESSAGE);
       }
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(this,"An Error Occured. Try Again!","Error",JOptionPane.ERROR_MESSAGE);
    }
}
    }//GEN-LAST:event_kButton1ActionPerformed

    private void kButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton2ActionPerformed
signUp su = new signUp();
su.setVisible(true);
this.dispose();
    }//GEN-LAST:event_kButton2ActionPerformed
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
            java.util.logging.Logger.getLogger(LoginRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KButton kButton2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JPasswordField passwordTF;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}
