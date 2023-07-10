package com.mycompany.gran_mineria;

import static com.mycompany.gran_mineria.ControladoraMinas.mapaMinas;
import static com.mycompany.gran_mineria.ControladoraMinas.mapaPaises;
import static com.mycompany.gran_mineria.ControladoraMinas.mapaRegiones;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AñadirMina extends javax.swing.JFrame implements LimpiadorVentanas {

    public AñadirMina() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NombreLabel = new javax.swing.JLabel();
        PaisLabel = new javax.swing.JLabel();
        MineralLabel1 = new javax.swing.JLabel();
        RegionLabel = new javax.swing.JLabel();
        ProduccionLabel = new javax.swing.JLabel();
        PersonalLabel = new javax.swing.JLabel();
        NombreTextField = new javax.swing.JTextField();
        PaisTextField = new javax.swing.JTextField();
        MineralTextField = new javax.swing.JTextField();
        RegionTextField = new javax.swing.JTextField();
        ProduccionTextField = new javax.swing.JTextField();
        PersonalTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        ExitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        NombreLabel.setText("Nombre:");

        PaisLabel.setText("Pais:");

        MineralLabel1.setText("Mineral:");

        RegionLabel.setText("Region:");

        ProduccionLabel.setText("Produccion:");

        PersonalLabel.setText("Personal:");

        RegionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegionTextFieldActionPerformed(evt);
            }
        });

        ProduccionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProduccionTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese los datos de la mina:");

        AddButton.setText("Agregar");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        ExitButton.setText("Volver");
        ExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MineralLabel1)
                            .addComponent(PaisLabel)
                            .addComponent(NombreLabel))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(RegionLabel)
                            .addGap(6, 6, 6)))
                    .addComponent(ProduccionLabel)
                    .addComponent(PersonalLabel))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(NombreTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                        .addComponent(PaisTextField)
                        .addComponent(MineralTextField)
                        .addComponent(RegionTextField)
                        .addComponent(ProduccionTextField))
                    .addComponent(PersonalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ExitButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreLabel)
                    .addComponent(NombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PaisLabel)
                            .addComponent(PaisTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MineralLabel1)
                            .addComponent(MineralTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RegionLabel)
                            .addComponent(RegionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProduccionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ProduccionLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PersonalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PersonalLabel)))
                    .addComponent(ExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegionTextFieldActionPerformed

    private void ProduccionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProduccionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProduccionTextFieldActionPerformed
    //AGREGA UNA MINA A LA BASE DE DATOS DEL PROGRAMA
    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed

        try {
            // TODO add your handling code here:
            boolean success=false;
            String nombre = NombreTextField.getText();
            String pais = PaisTextField.getText();
            String mineral = MineralTextField.getText();
            String region = RegionTextField.getText();
            String produccion = ProduccionTextField.getText();
            String personal = PersonalTextField.getText();
            int prodc = Integer.parseInt(produccion);
            int perso = Integer.parseInt(personal);
            Minas minObj = new Minas();
            Minas metodo = new Minas();
            minObj.setNombre(nombre);
            minObj.setRegion(region);
            minObj.setPais(pais);
            minObj.setMineral(mineral);
            minObj.setProduccion(prodc);
            minObj.setPersonal(perso);
            success=metodo.agregarMina(mapaMinas, mapaRegiones, mapaPaises, minObj);
            if(success==true){
                Alertamsj("Mina añadida con exito", "Gran Mineria");
                limpiarVista();
            }else{
                Alertamsj("La mina ya se encontraba en el programa", "Gran Mineria");
                limpiarVista();
            }
        } catch (IOException ex) {
            Logger.getLogger(AñadirMina.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_AddButtonActionPerformed
    //CIERRA LA VENTANA
    private void ExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_ExitButtonActionPerformed

    public static void Alertamsj(String infoMessage, String titleBar){
        javax.swing.JOptionPane.showMessageDialog(null, infoMessage, titleBar, javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
    
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
            java.util.logging.Logger.getLogger(AñadirMina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AñadirMina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AñadirMina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AñadirMina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AñadirMina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton ExitButton;
    private javax.swing.JLabel MineralLabel1;
    private javax.swing.JTextField MineralTextField;
    private javax.swing.JLabel NombreLabel;
    private javax.swing.JTextField NombreTextField;
    private javax.swing.JLabel PaisLabel;
    private javax.swing.JTextField PaisTextField;
    private javax.swing.JLabel PersonalLabel;
    private javax.swing.JTextField PersonalTextField;
    private javax.swing.JLabel ProduccionLabel;
    private javax.swing.JTextField ProduccionTextField;
    private javax.swing.JLabel RegionLabel;
    private javax.swing.JTextField RegionTextField;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void limpiarVista() {
        NombreTextField.setText("");
        PaisTextField.setText("");
        MineralTextField.setText("");
        RegionTextField.setText("");
        ProduccionTextField.setText("");
        PersonalTextField.setText("");
    }
}

