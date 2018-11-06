/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bl.WetterTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Sabrina
 */
public class WetterGUI extends javax.swing.JFrame {

    private WetterTableModel wtm = new WetterTableModel();
    /**
     * Creates new form WetterGUI
     */
    public WetterGUI() {
        initComponents();
        this.setLocationRelativeTo(this);
        tbWetter.setModel(wtm);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbWetter = new javax.swing.JTable();
        mbWetter = new javax.swing.JMenuBar();
        muStations = new javax.swing.JMenu();
        miAddWeatherStation = new javax.swing.JMenuItem();
        miRemoveWeatherStation = new javax.swing.JMenuItem();
        muValues = new javax.swing.JMenu();
        miSetTemperature = new javax.swing.JMenuItem();
        miSetHumidity = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbWetter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbWetter);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        muStations.setText("Stations");

        miAddWeatherStation.setText("Add Weather Station");
        miAddWeatherStation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onAddWeatherStations(evt);
            }
        });
        muStations.add(miAddWeatherStation);

        miRemoveWeatherStation.setText("Remove Weather Station");
        miRemoveWeatherStation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onRemoveWeatherStation(evt);
            }
        });
        muStations.add(miRemoveWeatherStation);

        mbWetter.add(muStations);

        muValues.setText("Values");

        miSetTemperature.setText("Set Temperature");
        miSetTemperature.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onSetTemperature(evt);
            }
        });
        muValues.add(miSetTemperature);

        miSetHumidity.setText("SetHumidity");
        miSetHumidity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onSetHumidity(evt);
            }
        });
        muValues.add(miSetHumidity);

        mbWetter.add(muValues);

        setJMenuBar(mbWetter);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onAddWeatherStations(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onAddWeatherStations
        try
        {
            WetterDlg wdlg = new WetterDlg(this, true);
            wdlg.setVisible(true);
            
            if(wdlg.isOk())
            {
                wtm.add(wdlg.getWetter());
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_onAddWeatherStations

    private void onRemoveWeatherStation(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onRemoveWeatherStation
        try
        {
            
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_onRemoveWeatherStation

    private void onSetTemperature(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onSetTemperature
        try
        {
            
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_onSetTemperature

    private void onSetHumidity(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onSetHumidity
        try
        {
            
        }
        catch(Exception ex)
        {
            
        }
    }//GEN-LAST:event_onSetHumidity

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
            java.util.logging.Logger.getLogger(WetterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WetterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WetterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WetterGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WetterGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar mbWetter;
    private javax.swing.JMenuItem miAddWeatherStation;
    private javax.swing.JMenuItem miRemoveWeatherStation;
    private javax.swing.JMenuItem miSetHumidity;
    private javax.swing.JMenuItem miSetTemperature;
    private javax.swing.JMenu muStations;
    private javax.swing.JMenu muValues;
    private javax.swing.JTable tbWetter;
    // End of variables declaration//GEN-END:variables
}
