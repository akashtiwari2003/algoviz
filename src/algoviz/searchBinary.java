/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package algoviz;
import com.k33ptoo.components.KGradientPanel;
import com.k33ptoo.components.KButton;
import java.awt.Color;
import static java.awt.Color.white;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
/**
 *
 * @author Lenovo
 */
public class searchBinary extends javax.swing.JFrame {

    /**
     * Creates new form searchBinary
     */
    public searchBinary() {
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

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        kGradientPanel2 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        kGradientPanel3 = new com.k33ptoo.components.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        kGradientPanel4 = new com.k33ptoo.components.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        kGradientPanel5 = new com.k33ptoo.components.KGradientPanel();
        jLabel4 = new javax.swing.JLabel();
        kGradientPanel6 = new com.k33ptoo.components.KGradientPanel();
        jLabel5 = new javax.swing.JLabel();
        kGradientPanel7 = new com.k33ptoo.components.KGradientPanel();
        jLabel6 = new javax.swing.JLabel();
        kGradientPanel8 = new com.k33ptoo.components.KGradientPanel();
        jLabel7 = new javax.swing.JLabel();
        kGradientPanel9 = new com.k33ptoo.components.KGradientPanel();
        jLabel8 = new javax.swing.JLabel();
        kGradientPanel10 = new com.k33ptoo.components.KGradientPanel();
        jLabel9 = new javax.swing.JLabel();
        kGradientPanel11 = new com.k33ptoo.components.KGradientPanel();
        jLabel10 = new javax.swing.JLabel();
        kButton1 = new com.k33ptoo.components.KButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 800));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        kGradientPanel1.setkStartColor(new java.awt.Color(153, 51, 0));
        kGradientPanel1.setMinimumSize(new java.awt.Dimension(900, 800));
        kGradientPanel1.setOpaque(false);
        kGradientPanel1.setLayout(null);

        kGradientPanel2.setOpaque(false);
        kGradientPanel2.setLayout(null);

        jLabel1.setText("jLabel1");
        kGradientPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 60, 40);

        kGradientPanel1.add(kGradientPanel2);
        kGradientPanel2.setBounds(20, 550, 60, 40);

        kGradientPanel3.setOpaque(false);
        kGradientPanel3.setLayout(null);

        jLabel2.setText("jLabel2");
        kGradientPanel3.add(jLabel2);
        jLabel2.setBounds(0, 0, 60, 70);

        kGradientPanel1.add(kGradientPanel3);
        kGradientPanel3.setBounds(80, 520, 60, 70);

        kGradientPanel4.setOpaque(false);
        kGradientPanel4.setLayout(null);

        jLabel3.setText("jLabel3");
        kGradientPanel4.add(jLabel3);
        jLabel3.setBounds(0, 0, 60, 100);

        kGradientPanel1.add(kGradientPanel4);
        kGradientPanel4.setBounds(140, 490, 60, 100);

        kGradientPanel5.setOpaque(false);
        kGradientPanel5.setLayout(null);

        jLabel4.setText("jLabel4");
        kGradientPanel5.add(jLabel4);
        jLabel4.setBounds(0, 0, 60, 130);

        kGradientPanel1.add(kGradientPanel5);
        kGradientPanel5.setBounds(200, 460, 60, 130);

        kGradientPanel6.setOpaque(false);
        kGradientPanel6.setLayout(null);

        jLabel5.setText("jLabel5");
        kGradientPanel6.add(jLabel5);
        jLabel5.setBounds(0, 0, 60, 160);

        kGradientPanel1.add(kGradientPanel6);
        kGradientPanel6.setBounds(260, 430, 60, 160);

        kGradientPanel7.setOpaque(false);
        kGradientPanel7.setLayout(null);

        jLabel6.setText("jLabel6");
        kGradientPanel7.add(jLabel6);
        jLabel6.setBounds(0, 0, 60, 190);

        kGradientPanel1.add(kGradientPanel7);
        kGradientPanel7.setBounds(320, 400, 60, 190);

        kGradientPanel8.setOpaque(false);
        kGradientPanel8.setLayout(null);

        jLabel7.setText("jLabel7");
        kGradientPanel8.add(jLabel7);
        jLabel7.setBounds(0, 0, 60, 220);

        kGradientPanel1.add(kGradientPanel8);
        kGradientPanel8.setBounds(380, 370, 60, 220);

        kGradientPanel9.setOpaque(false);
        kGradientPanel9.setLayout(null);

        jLabel8.setText("jLabel8");
        kGradientPanel9.add(jLabel8);
        jLabel8.setBounds(0, 0, 60, 260);

        kGradientPanel1.add(kGradientPanel9);
        kGradientPanel9.setBounds(440, 330, 60, 260);

        kGradientPanel10.setOpaque(false);
        kGradientPanel10.setLayout(null);

        jLabel9.setText("jLabel9");
        kGradientPanel10.add(jLabel9);
        jLabel9.setBounds(0, 0, 60, 290);

        kGradientPanel1.add(kGradientPanel10);
        kGradientPanel10.setBounds(500, 300, 60, 290);

        kGradientPanel11.setOpaque(false);
        kGradientPanel11.setLayout(null);

        jLabel10.setText("jLabel10");
        kGradientPanel11.add(jLabel10);
        jLabel10.setBounds(0, 0, 60, 320);

        kGradientPanel1.add(kGradientPanel11);
        kGradientPanel11.setBounds(560, 270, 60, 320);

        kButton1.setText("Binary Search");
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(kButton1);
        kButton1.setBounds(260, 630, 185, 45);

        jButton3.setText("jButton1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(jButton3);
        jButton3.setBounds(720, 520, 75, 23);

        getContentPane().add(kGradientPanel1);
        kGradientPanel1.setBounds(0, 0, 900, 800);

        pack();
    }// </editor-fold>//GEN-END:initComponents
KGradientPanel arBt[] = new KGradientPanel[10];
KGradientPanel bt[] = new KGradientPanel[10];
JLabel btL[] = new JLabel[10];
int btnWidth = 130;
int left;
int right;
int medium;
int btnHeight = 140;
int elementFound = 0;
boolean on = false;
int fi;
int s1[] = new int[10];
int h;
int btnNWidth = 120;
int btnNHeight = 120;
public Timer timerr = new Timer(900, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(left>=right){
                timerr.stop();
            }
            for(int g = 0;g<10;++g){
                arBt[g].setSize(btnNWidth,btnNHeight);
            }
           jButton3.doClick();
        }
    });

 public Timer blinktimerr = new Timer(500, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            btL[h].setForeground( on ? Color.black : Color.white);
            on = !on;
        }
    });
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
arBt[0] = kGradientPanel2;
arBt[1] = kGradientPanel3;
arBt[2] = kGradientPanel4;
arBt[3] = kGradientPanel5;
arBt[4] = kGradientPanel6;
arBt[5] = kGradientPanel7;
arBt[6] = kGradientPanel8;
arBt[7] = kGradientPanel9;
arBt[8] = kGradientPanel10;
arBt[9] = kGradientPanel11;
btL[0] = jLabel1;
btL[1] = jLabel2;
btL[2] = jLabel3;
btL[3] = jLabel4;
btL[4] = jLabel5;
btL[5] = jLabel6;
btL[6] = jLabel7;
btL[7] = jLabel8;
btL[8] = jLabel9;
    }//GEN-LAST:event_formWindowOpened

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
if(elementFound == 1)
{
    JOptionPane.showMessageDialog(this,"Reset First!!");
}
else{
bt[0] = kGradientPanel2;
bt[1] = kGradientPanel3;
bt[2] = kGradientPanel4;
bt[3] = kGradientPanel5;
bt[4] = kGradientPanel6;
bt[5] = kGradientPanel7;
bt[6] = kGradientPanel8;
bt[7] = kGradientPanel9;
bt[8] = kGradientPanel10;
bt[9] = kGradientPanel11;
fi = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter Element to find:- "));
for(int u = 0; u<10; ++u){
    s1[u] = Integer.parseInt(btL[u].getText());
}
timerr.start();
}
    }//GEN-LAST:event_kButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
if(left<=right){
    if(s1[medium] == fi){
        timerr.stop();
        elementFound = 1;
        setBlack();
        blinktimerr.start();
        int temp = h+1;
        JOptionPane.showMessageDialog(this, "Found at "+ temp);
    }
    
    else if(s1[medium] < fi){
        left = medium + 1;
    }
    else if(s1[medium] > fi){
        right = medium-1;
    }
    if(elementFound == 0){
        bt[medium].setSize(btnWidth, btnHeight);
    ++h;
    }
}
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
            java.util.logging.Logger.getLogger(searchBinary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(searchBinary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(searchBinary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(searchBinary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchBinary().setVisible(true);
            }
        });
    }
private void setBlack(){
    for(int i = 0; i<10; ++i){
        arBt[i].setSize(btnNWidth,btnNHeight);
    }
}

private void setWhite(){
    for(int i = 0; i<10; ++i){
        btL[i].setForeground(white);
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private com.k33ptoo.components.KButton kButton1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel10;
    private com.k33ptoo.components.KGradientPanel kGradientPanel11;
    private com.k33ptoo.components.KGradientPanel kGradientPanel2;
    private com.k33ptoo.components.KGradientPanel kGradientPanel3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel4;
    private com.k33ptoo.components.KGradientPanel kGradientPanel5;
    private com.k33ptoo.components.KGradientPanel kGradientPanel6;
    private com.k33ptoo.components.KGradientPanel kGradientPanel7;
    private com.k33ptoo.components.KGradientPanel kGradientPanel8;
    private com.k33ptoo.components.KGradientPanel kGradientPanel9;
    // End of variables declaration//GEN-END:variables
}
