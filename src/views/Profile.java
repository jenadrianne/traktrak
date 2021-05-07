/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;

/**
 *
 * @author Jennifer Caballes
 */
public class Profile extends javax.swing.JFrame {

    
    public Profile() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(0);
        
    }

    public String carProfile="/assets/redCar.png"; 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_carIcon = new javax.swing.JLabel();
        btn_blue = new javax.swing.JButton();
        btn_green = new javax.swing.JButton();
        btn_red = new javax.swing.JButton();
        btn_orange = new javax.swing.JButton();
        btn_yellow = new javax.swing.JButton();
        btn_grey = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(895, 485));
        setMinimumSize(new java.awt.Dimension(895, 485));
        setPreferredSize(new java.awt.Dimension(895, 485));
        getContentPane().setLayout(null);
        getContentPane().add(lbl_carIcon);
        lbl_carIcon.setBounds(70, 80, 270, 310);

        btn_blue.setIcon(new javax.swing.ImageIcon("C:\\Users\\Jennifer Caballes\\Desktop\\JAVA _CARPROJECt\\bluebtn.png")); // NOI18N
        btn_blue.setBorderPainted(false);
        btn_blue.setContentAreaFilled(false);
        btn_blue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_blueActionPerformed(evt);
            }
        });
        getContentPane().add(btn_blue);
        btn_blue.setBounds(450, 310, 130, 60);

        btn_green.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/greenbtn.png"))); // NOI18N
        btn_green.setBorderPainted(false);
        btn_green.setContentAreaFilled(false);
        btn_green.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_greenActionPerformed(evt);
            }
        });
        getContentPane().add(btn_green);
        btn_green.setBounds(740, 310, 130, 60);

        btn_red.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/redbtn.png"))); // NOI18N
        btn_red.setBorderPainted(false);
        btn_red.setContentAreaFilled(false);
        btn_red.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_redActionPerformed(evt);
            }
        });
        getContentPane().add(btn_red);
        btn_red.setBounds(450, 220, 130, 70);

        btn_orange.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/orangebtn.png"))); // NOI18N
        btn_orange.setBorderPainted(false);
        btn_orange.setContentAreaFilled(false);
        btn_orange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_orangeActionPerformed(evt);
            }
        });
        getContentPane().add(btn_orange);
        btn_orange.setBounds(590, 220, 140, 70);

        btn_yellow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/yellowbtn.png"))); // NOI18N
        btn_yellow.setBorderPainted(false);
        btn_yellow.setContentAreaFilled(false);
        btn_yellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_yellowActionPerformed(evt);
            }
        });
        getContentPane().add(btn_yellow);
        btn_yellow.setBounds(740, 220, 130, 70);

        btn_grey.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/greybtn.png"))); // NOI18N
        btn_grey.setBorderPainted(false);
        btn_grey.setContentAreaFilled(false);
        btn_grey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_greyActionPerformed(evt);
            }
        });
        getContentPane().add(btn_grey);
        btn_grey.setBounds(590, 310, 140, 60);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/STARTBTN.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(560, 400, 230, 40);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/whitelogo.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(510, 50, 360, 110);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/proflogo.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(550, 170, 240, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/protfoliobackground.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 2270, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_redActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_redActionPerformed
        this.carProfile = "/assets/redCar.png";
        lbl_carIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/redCarFront.png"))); // NOI18N
        getContentPane().add(lbl_carIcon,3);
        lbl_carIcon.setBounds(100, 190, 190, 160);
    }//GEN-LAST:event_btn_redActionPerformed

    private void btn_blueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_blueActionPerformed
        this.carProfile = "/assets/blueCar.png";
        lbl_carIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/blueCarFront.png"))); // NOI18N
        getContentPane().add(lbl_carIcon,3);
        lbl_carIcon.setBounds(100, 190, 190, 160);
    }//GEN-LAST:event_btn_blueActionPerformed

    private void btn_orangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_orangeActionPerformed
        this.carProfile = "/assets/orangeCar.png";
        lbl_carIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/OrangeCarFront.png"))); // NOI18N
        getContentPane().add(lbl_carIcon,3);
        lbl_carIcon.setBounds(100, 190, 190, 160);
    }//GEN-LAST:event_btn_orangeActionPerformed

    private void btn_yellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_yellowActionPerformed
        this.carProfile = "/assets/yellowCar.png";
        lbl_carIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/yellowCarFront.png"))); // NOI18N
        getContentPane().add(lbl_carIcon,3);
        lbl_carIcon.setBounds(100, 190, 190, 160);
    }//GEN-LAST:event_btn_yellowActionPerformed

    private void btn_greyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_greyActionPerformed
        this.carProfile = "/assets/silverCar.png";
        lbl_carIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/silverCarFront.png"))); // NOI18N
        getContentPane().add(lbl_carIcon,3);
        lbl_carIcon.setBounds(100, 190, 190, 160);
    }//GEN-LAST:event_btn_greyActionPerformed

    private void btn_greenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_greenActionPerformed
        this.carProfile = "/assets/greenCar.png";
        lbl_carIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/greenCarFront.png"))); // NOI18N
        getContentPane().add(lbl_carIcon,3);
        lbl_carIcon.setBounds(100, 190, 190, 160);
    }//GEN-LAST:event_btn_greenActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        gameplay gp = new gameplay();
        gp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    public JButton getBtn_blue() {
        return btn_blue;
    }

    public void setBtn_blue(JButton btn_blue) {
        this.btn_blue = btn_blue;
    }

    public JButton getBtn_green() {
        return btn_green;
    }

    public void setBtn_green(JButton btn_green) {
        this.btn_green = btn_green;
    }

    public JButton getBtn_grey() {
        return btn_grey;
    }

    public void setBtn_grey(JButton btn_grey) {
        this.btn_grey = btn_grey;
    }

    public JButton getBtn_orange() {
        return btn_orange;
    }

    public void setBtn_orange(JButton btn_orange) {
        this.btn_orange = btn_orange;
    }

    public JButton getBtn_red() {
        return btn_red;
    }

    public void setBtn_red(JButton btn_red) {
        this.btn_red = btn_red;
    }

    public JButton getBtn_yellow() {
        return btn_yellow;
    }

    public void setBtn_yellow(JButton btn_yellow) {
        this.btn_yellow = btn_yellow;
    }

    public JLabel getLbl_carIcon() {
        return lbl_carIcon;
    }

    public void setLbl_carIcon(JLabel lbl_carIcon) {
        this.lbl_carIcon = lbl_carIcon;
    }

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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_blue;
    private javax.swing.JButton btn_green;
    private javax.swing.JButton btn_grey;
    private javax.swing.JButton btn_orange;
    private javax.swing.JButton btn_red;
    private javax.swing.JButton btn_yellow;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl_carIcon;
    // End of variables declaration//GEN-END:variables
}
