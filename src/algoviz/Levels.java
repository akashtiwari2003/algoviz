/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package algoviz;

/**
 *
 * @author Lenovo
 */
public class Levels extends javax.swing.JFrame {

    /**
     * Creates new form Levels
     */
    public Levels() {
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
        card6 = new javax.swing.JLabel();
        card5 = new javax.swing.JLabel();
        card4 = new javax.swing.JLabel();
        card3 = new javax.swing.JLabel();
        card2 = new javax.swing.JLabel();
        card1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 800));
        setPreferredSize(new java.awt.Dimension(900, 800));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        card6.setText("jLabel1");
        card6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        card6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                card6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                card6MouseExited(evt);
            }
        });
        jPanel1.add(card6);
        card6.setBounds(600, 430, 230, 200);

        card5.setText("jLabel1");
        card5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        card5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                card5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                card5MouseExited(evt);
            }
        });
        jPanel1.add(card5);
        card5.setBounds(330, 430, 230, 200);

        card4.setText("jLabel1");
        card4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        card4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                card4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                card4MouseExited(evt);
            }
        });
        jPanel1.add(card4);
        card4.setBounds(60, 430, 230, 200);

        card3.setText("jLabel1");
        card3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        card3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                card3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                card3MouseExited(evt);
            }
        });
        jPanel1.add(card3);
        card3.setBounds(600, 190, 230, 200);

        card2.setText("jLabel1");
        card2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        card2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                card2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                card2MouseExited(evt);
            }
        });
        jPanel1.add(card2);
        card2.setBounds(330, 190, 230, 200);

        card1.setText("jLabel1");
        card1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        card1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                card1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                card1MouseExited(evt);
            }
        });
        jPanel1.add(card1);
        card1.setBounds(60, 190, 230, 200);
        jPanel1.add(background);
        background.setBounds(0, 0, 900, 800);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 900, 800);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 900, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
algovizFunctions a = new algovizFunctions();
int height = 200;
int width = 230;
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        a.setBackground("g1.png", card1);
        a.setBackground("gradient6.jpg", card2);
        a.setBackground("gradient5.jpg", card3);
        a.setBackground("gradient3.jpg", card4);
        a.setBackground("gradient1.jpg", card5);
        a.setBackground("gradient2.jpg", card6);
        a.setBackground("blurLabel.png", background);
        System.out.println(card2.getSize());
    }//GEN-LAST:event_formWindowOpened

    private void card1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card1MouseEntered
card1.setSize(width+5, height+5);
    }//GEN-LAST:event_card1MouseEntered

    private void card1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card1MouseExited
card1.setSize(width,height);
    }//GEN-LAST:event_card1MouseExited

    private void card2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card2MouseEntered
        card2.setSize(width+5, height+5);
    }//GEN-LAST:event_card2MouseEntered

    private void card2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card2MouseExited
        card2.setSize(width,height);
    }//GEN-LAST:event_card2MouseExited

    private void card3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card3MouseEntered
        card3.setSize(width+5, height+5);
    }//GEN-LAST:event_card3MouseEntered

    private void card3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card3MouseExited
        card3.setSize(width,height);
    }//GEN-LAST:event_card3MouseExited

    private void card4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card4MouseEntered
        card4.setSize(width+5, height+5);
    }//GEN-LAST:event_card4MouseEntered

    private void card4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card4MouseExited
        card4.setSize(width,height);
    }//GEN-LAST:event_card4MouseExited

    private void card5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card5MouseEntered
        card5.setSize(width+5, height+5);
    }//GEN-LAST:event_card5MouseEntered

    private void card5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card5MouseExited
        card5.setSize(width,height);
    }//GEN-LAST:event_card5MouseExited

    private void card6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card6MouseEntered
        card6.setSize(width+5, height+5);
    }//GEN-LAST:event_card6MouseEntered

    private void card6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_card6MouseExited
        card6.setSize(width,height);
    }//GEN-LAST:event_card6MouseExited

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
            java.util.logging.Logger.getLogger(Levels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Levels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Levels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Levels.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Levels().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel card1;
    private javax.swing.JLabel card2;
    private javax.swing.JLabel card3;
    private javax.swing.JLabel card4;
    private javax.swing.JLabel card5;
    private javax.swing.JLabel card6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
