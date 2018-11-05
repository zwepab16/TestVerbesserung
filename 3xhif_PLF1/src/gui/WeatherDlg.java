
package gui;

public class WeatherDlg extends javax.swing.JDialog {

    private boolean ok;
    private Wetterstation w;
    public boolean isOK(){
        return ok;
    }

    public Wetterstation getW() {
        return w;
    }
   
  
    public WeatherDlg(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btOk = new javax.swing.JButton();
        btCancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfPlace = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfSeaLevel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfTemperature = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfHumidity = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setLayout(new java.awt.GridLayout(1, 2));

        btOk.setText("OK");
        btOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkActionPerformed(evt);
            }
        });
        jPanel2.add(btOk);

        btCancel.setText("Cancel");
        btCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelActionPerformed(evt);
            }
        });
        jPanel2.add(btCancel);

        getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

        jPanel1.setLayout(new java.awt.GridLayout(4, 2));

        jLabel1.setText("Place");
        jPanel1.add(jLabel1);

        tfPlace.setText("Bregenz");
        jPanel1.add(tfPlace);

        jLabel2.setText("Sea Level");
        jPanel1.add(jLabel2);

        tfSeaLevel.setText("435");
        jPanel1.add(tfSeaLevel);

        jLabel3.setText("Temperature");
        jPanel1.add(jLabel3);

        tfTemperature.setText("10.9");
        jPanel1.add(tfTemperature);

        jLabel4.setText("rel. Humidity");
        jPanel1.add(jLabel4);

        tfHumidity.setText("78");
        jPanel1.add(tfHumidity);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkActionPerformed
     
        w=new Wetterstation(tfPlace.getText(), Integer.parseInt(tfSeaLevel.getText()), Integer.parseInt(tfHumidity.getText()), Double.parseDouble(tfTemperature.getText()));
     
        
        
        ok=true;
        this.dispose();
    }//GEN-LAST:event_btOkActionPerformed

    private void btCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelActionPerformed
      ok=false;
      this.dispose();
    }//GEN-LAST:event_btCancelActionPerformed

    
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                WeatherDlg dialog = new WeatherDlg(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tfHumidity;
    private javax.swing.JTextField tfPlace;
    private javax.swing.JTextField tfSeaLevel;
    private javax.swing.JTextField tfTemperature;
    // End of variables declaration//GEN-END:variables
}
