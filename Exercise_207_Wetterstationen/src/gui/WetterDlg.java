/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author Sabrina
 */
public class WetterDlg extends javax.swing.JDialog {

    /**
     * Creates new form WetterDg
     */
    public WetterDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        lbPlace = new javax.swing.JLabel();
        tfPlace = new javax.swing.JTextField();
        lbSealevel = new javax.swing.JLabel();
        tfSealevel = new javax.swing.JTextField();
        lbTemperature = new javax.swing.JLabel();
        tfTemperature = new javax.swing.JTextField();
        lbHumidity = new javax.swing.JLabel();
        tfHumidity = new javax.swing.JTextField();
        btOK = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(5, 2));

        lbPlace.setText("Place");
        getContentPane().add(lbPlace);
        getContentPane().add(tfPlace);

        lbSealevel.setText("Sea level");
        getContentPane().add(lbSealevel);
        getContentPane().add(tfSealevel);

        lbTemperature.setText("Temperature");
        getContentPane().add(lbTemperature);
        getContentPane().add(tfTemperature);

        lbHumidity.setText("rel. Humidity");
        getContentPane().add(lbHumidity);
        getContentPane().add(tfHumidity);

        btOK.setText("OK");
        btOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onOk(evt);
            }
        });
        getContentPane().add(btOK);

        btCancel.setText("Cancel");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onCancel(evt);
            }
        });
        getContentPane().add(btCancel);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onOk(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onOk
        // TODO add your handling code here:
    }//GEN-LAST:event_onOk

    private void onCancel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onCancel
        // TODO add your handling code here:
    }//GEN-LAST:event_onCancel

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
            java.util.logging.Logger.getLogger(WetterDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WetterDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WetterDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WetterDlg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                WetterDlg dialog = new WetterDlg(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancel;
    private javax.swing.JButton btOK;
    private javax.swing.JLabel lbHumidity;
    private javax.swing.JLabel lbPlace;
    private javax.swing.JLabel lbSealevel;
    private javax.swing.JLabel lbTemperature;
    private javax.swing.JTextField tfHumidity;
    private javax.swing.JTextField tfPlace;
    private javax.swing.JTextField tfSealevel;
    private javax.swing.JTextField tfTemperature;
    // End of variables declaration//GEN-END:variables
}
