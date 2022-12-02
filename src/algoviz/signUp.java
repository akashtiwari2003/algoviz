/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package algoviz;

import java.awt.Color;
import javax.swing.BorderFactory;
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
        jSeparator1 = new javax.swing.JSeparator();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        leftBack = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(290, 0, 10, 600);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Security Question", "What's your favourite subject?", "Whats's your pet name?", "What's your favourite Movie?", " " }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(390, 320, 150, 22);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(390, 410, 150, 22);

        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder("Name"));
        jTextField1.setOpaque(true);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(390, 170, 150, 39);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(390, 200, 150, 22);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(390, 260, 150, 22);
        getContentPane().add(jPasswordField2);
        jPasswordField2.setBounds(390, 290, 150, 22);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(390, 230, 150, 22);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 380, 210, 220);

        leftBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/algoviz/back3.png"))); // NOI18N
        getContentPane().add(leftBack);
        leftBack.setBounds(0, 0, 290, 600);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 700, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
jTextField1.setFocusable(true);
jTextField1.setOpaque(false);
TitledBorder tb = BorderFactory.createTitledBorder(
BorderFactory.createEtchedBorder(),"user",TitledBorder.LEFT,TitledBorder.TOP);
tb.setTitleColor(Color.black);
jTextField1.setBorder(tb);
jTextField1.setSize(223, 40);
    }//GEN-LAST:event_formWindowOpened

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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel leftBack;
    // End of variables declaration//GEN-END:variables
}
