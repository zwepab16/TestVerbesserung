package gui;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class WeatherGUI extends javax.swing.JFrame {
private WetterTableModel model=new WetterTableModel();

   
    public WeatherGUI() {
        initComponents();
        tabWheater.setModel(model);
        tabWheater.setDefaultRenderer(Object.class, new WetterTableRenderer());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabWheater = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miAdd = new javax.swing.JMenuItem();
        miRemove = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        miSetTemp = new javax.swing.JMenuItem();
        miSetHum = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabWheater.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabWheater);

        jMenu1.setText("Stations");

        miAdd.setText("Add Weather Station");
        miAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAddActionPerformed(evt);
            }
        });
        jMenu1.add(miAdd);

        miRemove.setText("Remove Weather Station");
        miRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRemoveActionPerformed(evt);
            }
        });
        jMenu1.add(miRemove);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Values");

        miSetTemp.setText("Set Temperature");
        miSetTemp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSetTempActionPerformed(evt);
            }
        });
        jMenu2.add(miSetTemp);

        miSetHum.setText("Set Humidity");
        miSetHum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSetHumActionPerformed(evt);
            }
        });
        jMenu2.add(miSetHum);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAddActionPerformed
        WeatherDlg dlg = new WeatherDlg(this, true);
        dlg.setVisible(true);
    if(dlg.isOK()){
         model.add(dlg.getW());
        }
    }//GEN-LAST:event_miAddActionPerformed

    private void miRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRemoveActionPerformed
    int[] i=tabWheater.getSelectedRows();
    model.löschen(i);
    }//GEN-LAST:event_miRemoveActionPerformed

    private void miSetTempActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSetTempActionPerformed
    try {
        model.setTemp(tabWheater.getSelectedRow(), Integer.parseInt(JOptionPane.showInputDialog("Neue Temperatur eingeben!")));
    } catch (Exception ex) {
       JOptionPane.showMessageDialog(null,ex.getMessage());
    }
    }//GEN-LAST:event_miSetTempActionPerformed

    private void miSetHumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSetHumActionPerformed
    try {
        model.setHuman(tabWheater.getSelectedRow(), Integer.parseInt(JOptionPane.showInputDialog("Neue Humanidity eingeben!")));
    } catch (Exception ex) {
         JOptionPane.showMessageDialog(null,ex.getMessage());
    }
    }//GEN-LAST:event_miSetHumActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WeatherGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem miAdd;
    private javax.swing.JMenuItem miRemove;
    private javax.swing.JMenuItem miSetHum;
    private javax.swing.JMenuItem miSetTemp;
    private javax.swing.JTable tabWheater;
    // End of variables declaration//GEN-END:variables

}
