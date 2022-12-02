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
        jButton1 = new javax.swing.JButton();
        usernameTF = new javax.swing.JTextField();
        passwordTF = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.setToolTipText("");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.setFocusable(false);
        jButton1.setOpaque(true);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(310, 310, 90, 30);

        usernameTF.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        usernameTF.setToolTipText("Username");
        usernameTF.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        usernameTF.setFocusable(false);
        usernameTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameTFFocusLost(evt);
            }
        });
        jPanel2.add(usernameTF);
        usernameTF.setBounds(240, 180, 220, 30);

        passwordTF.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        passwordTF.setToolTipText("Password");
        passwordTF.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        passwordTF.setFocusable(false);
        passwordTF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordTFFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordTFFocusLost(evt);
            }
        });
        jPanel2.add(passwordTF);
        passwordTF.setBounds(240, 240, 220, 30);

        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel3);
        jLabel3.setBounds(200, 130, 300, 220);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Forgot Password?");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(360, 280, 100, 16);
        jPanel2.add(jLabel4);
        jLabel4.setBounds(0, 0, 700, 500);

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
iniitComponents();
algovizFunctions a = new algovizFunctions();
a.setBackground("back.jpg",jLabel4);
a.setBackground("blurLabel.png",jLabel3);
bth = jButton1.getSize().height;
btw = jButton1.getSize().width;
/*
ImageIcon img2 = new ImageIcon(getClass().getResource("blurLabel.png"));
Image im2 = img2.getImage();
Image fin2 = im2.getScaledInstance(jButton1.getWidth(), jButton1.getHeight(), Image.SCALE_DEFAULT);
ImageIcon background_img2 = new ImageIcon(fin2);
jButton1.setIcon(background_img2);
*/
    }//GEN-LAST:event_formWindowOpened

    private void usernameTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTFFocusGained
TitledBorder tb = BorderFactory.createTitledBorder(
BorderFactory.createEtchedBorder(),"user",TitledBorder.LEFT,TitledBorder.TOP);
tb.setTitleColor(Color.white);
usernameTF.setBorder(tb);
    }//GEN-LAST:event_usernameTFFocusGained

    private void passwordTFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTFFocusGained
TitledBorder tb = BorderFactory.createTitledBorder(
BorderFactory.createEtchedBorder(),"password",TitledBorder.LEFT,TitledBorder.TOP);
tb.setTitleColor(Color.white);
passwordTF.setBorder(tb);
    }//GEN-LAST:event_passwordTFFocusGained

    private void usernameTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameTFFocusLost
usernameTF.setBorder(BorderFactory.createEtchedBorder());
    }//GEN-LAST:event_usernameTFFocusLost

    private void passwordTFFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordTFFocusLost
passwordTF.setBorder(BorderFactory.createEtchedBorder());
    }//GEN-LAST:event_passwordTFFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String username = usernameTF.getText();
String password = passwordTF.getText();

if(username.length() == 0 || password.length() == 0){
    JOptionPane.showMessageDialog(this,"Invalid Input","Error",JOptionPane.ERROR_MESSAGE);
}
else{
    try{
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/algovizdb",dbUser,dbPass);
       Statement st = con.createStatement();
       String qry = "select * from login where username = '"+username+"' and password = '"+password+"';";
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
jButton1.setSize(btw+5,bth+5);
jButton1.setBorder(BorderFactory.createBevelBorder(1));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
jButton1.setSize(btw, bth);
jButton1.setBorder(BorderFactory.createEtchedBorder());
    }//GEN-LAST:event_jButton1MouseExited
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
private void iniitComponents(){
usernameTF.setFocusable(true);
passwordTF.setFocusable(true);
usernameTF.setOpaque(false);
passwordTF.setOpaque(false);
usernameTF.setSize(223, 40);
passwordTF.setSize(223, 40);
jButton1.setFocusable(true);
jButton1.setOpaque(false);
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel parentPanel;
    private javax.swing.JPasswordField passwordTF;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}
