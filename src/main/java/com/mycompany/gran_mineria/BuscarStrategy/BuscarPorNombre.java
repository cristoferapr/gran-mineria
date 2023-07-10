
package com.mycompany.gran_mineria.BuscarStrategy;

import com.mycompany.gran_mineria.*;
import static com.mycompany.gran_mineria.ControladoraMinas.mapaMinas;
import static com.mycompany.gran_mineria.GranMineria.Alertamsj;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BuscarPorNombre extends javax.swing.JFrame implements BuscarStrategy, LimpiadorVentanas {

    public BuscarPorNombre() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TituloLabel = new javax.swing.JLabel();
        BuscarTextField = new javax.swing.JTextField();
        BuscarButton = new javax.swing.JButton();
        NombreLabel = new javax.swing.JLabel();
        PaisLabel = new javax.swing.JLabel();
        MineralLabel = new javax.swing.JLabel();
        RegionLabel = new javax.swing.JLabel();
        ProduccionLabel = new javax.swing.JLabel();
        PersonalLabel = new javax.swing.JLabel();
        VolverButton = new javax.swing.JButton();
        NombreFoundLabel = new javax.swing.JLabel();
        PaisFoundLabel = new javax.swing.JLabel();
        MineralFoundLabel = new javax.swing.JLabel();
        RegionFoundLabel = new javax.swing.JLabel();
        ProduccionFoundLabel = new javax.swing.JLabel();
        PersonalFoundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TituloLabel.setText("Ingrese Mina a Buscar:");

        BuscarTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarTextFieldActionPerformed(evt);
            }
        });

        BuscarButton.setText("Buscar");
        BuscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarButtonActionPerformed(evt);
            }
        });

        NombreLabel.setText("Nombre:");

        PaisLabel.setText("Pais:");

        MineralLabel.setText("Mineral:");

        RegionLabel.setText("Region:");

        ProduccionLabel.setText("Produccion:");

        PersonalLabel.setText("Personal:");

        VolverButton.setText("Volver");
        VolverButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolverButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(TituloLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProduccionLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BuscarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(NombreLabel)
                                                    .addComponent(PaisLabel)
                                                    .addComponent(MineralLabel))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(RegionLabel)
                                                    .addGap(6, 6, 6)))
                                            .addComponent(PersonalLabel))
                                        .addGap(56, 56, 56)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(PersonalFoundLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                            .addComponent(ProduccionFoundLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(RegionFoundLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(MineralFoundLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(PaisFoundLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(NombreFoundLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(VolverButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BuscarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TituloLabel)
                    .addComponent(BuscarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BuscarButton))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreLabel)
                    .addComponent(NombreFoundLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PaisLabel)
                    .addComponent(PaisFoundLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MineralLabel)
                    .addComponent(MineralFoundLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RegionLabel)
                    .addComponent(RegionFoundLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProduccionFoundLabel)
                    .addComponent(ProduccionLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PersonalLabel)
                    .addComponent(PersonalFoundLabel)
                    .addComponent(VolverButton))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarTextFieldActionPerformed
    //MUESTRA LA INFORMACION DE UNA MINA
    private void BuscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarButtonActionPerformed
        // TODO add your handling code here:
        limpiarVista();
        mostrarEnGUI();
    }//GEN-LAST:event_BuscarButtonActionPerformed

    private void VolverButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolverButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_VolverButtonActionPerformed

    public static void Alertamsj(String infoMessage, String titleBar){
        javax.swing.JOptionPane.showMessageDialog(null, infoMessage, titleBar, javax.swing.JOptionPane.INFORMATION_MESSAGE);
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
            java.util.logging.Logger.getLogger(BuscarPorNombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarPorNombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarPorNombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarPorNombre.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarPorNombre().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarButton;
    private javax.swing.JTextField BuscarTextField;
    private javax.swing.JLabel MineralFoundLabel;
    private javax.swing.JLabel MineralLabel;
    private javax.swing.JLabel NombreFoundLabel;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JLabel PaisFoundLabel;
    private javax.swing.JLabel PaisLabel;
    private javax.swing.JLabel PersonalFoundLabel;
    private javax.swing.JLabel PersonalLabel;
    private javax.swing.JLabel ProduccionFoundLabel;
    private javax.swing.JLabel ProduccionLabel;
    private javax.swing.JLabel RegionFoundLabel;
    private javax.swing.JLabel RegionLabel;
    private javax.swing.JLabel TituloLabel;
    private javax.swing.JButton VolverButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void limpiarVista() {
        NombreFoundLabel.setText("");
        PaisFoundLabel.setText("");
        MineralFoundLabel.setText("");
        RegionFoundLabel.setText("");
        ProduccionFoundLabel.setText("");
        PersonalFoundLabel.setText("");
    }
    
    public Object obtenerDatosBuscados(String key){
        Minas aux = new Minas();
        try {
            aux=aux.mostrarMina(ControladoraMinas.mapaMinas, key);
        } catch (IOException ex) {
            Logger.getLogger(BuscarPorNombre.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(aux==null) return null;
        return aux;
    }
    //MUESTRA LA INFORMACION DE UNA MINA
    @Override
    public void mostrarEnGUI(){
        limpiarVista();
        String BuscarString = BuscarTextField.getText();
        Minas aux = new Minas();
        aux = (Minas) obtenerDatosBuscados(BuscarString);
        if(aux==null) Alertamsj("Mina No Encontrada", "Buscador");
        NombreFoundLabel.setText(aux.getNombre());
        PaisFoundLabel.setText(aux.getPais());
        MineralFoundLabel.setText(aux.getMineral());
        RegionFoundLabel.setText(aux.getRegion());
        ProduccionFoundLabel.setText(""+aux.getProduccion());
        PersonalFoundLabel.setText(""+aux.getPersonal());
        BuscarTextField.setText("");
    }

}
