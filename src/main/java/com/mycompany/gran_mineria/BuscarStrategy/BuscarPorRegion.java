package com.mycompany.gran_mineria.BuscarStrategy;

import com.mycompany.gran_mineria.*;
import static com.mycompany.gran_mineria.ControladoraMinas.mapaRegiones;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class BuscarPorRegion extends javax.swing.JFrame implements BuscarStrategy, LimpiadorVentanas {

    /**
     * Creates new form MinasRegion
     */
    public BuscarPorRegion() {
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

        jLabel1 = new javax.swing.JLabel();
        RegionTextField = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MinasRegionTable = new javax.swing.JTable();
        CleanButton = new javax.swing.JButton();
        CloseButton = new javax.swing.JButton();
        mayorProduccionButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese el nombre de la Region a buscar:");

        RegionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegionTextFieldActionPerformed(evt);
            }
        });

        SearchButton.setText("Buscar");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        MinasRegionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Mineral de extracción", "Cantidad de producción", "Cantidad de personal"
            }
        ));
        jScrollPane1.setViewportView(MinasRegionTable);

        CleanButton.setText("Limpiar Tabla");
        CleanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CleanButtonActionPerformed(evt);
            }
        });

        CloseButton.setText("Volver");
        CloseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseButtonActionPerformed(evt);
            }
        });

        mayorProduccionButton.setText("Buscar mina de mayor producción de la región");
        mayorProduccionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mayorProduccionButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Menor producción");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(CleanButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CloseButton)
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RegionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SearchButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(mayorProduccionButton)
                        .addGap(32, 32, 32)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(RegionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CleanButton)
                    .addComponent(CloseButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mayorProduccionButton)
                    .addComponent(jButton1))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed

        mostrarEnGUI();

    }//GEN-LAST:event_SearchButtonActionPerformed
    //LIMPIA LA VENTANA DE LOS DATOS QUE QUEDEN
    private void CleanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CleanButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) MinasRegionTable.getModel();
        model.setRowCount(0);
        limpiarVista();
    }//GEN-LAST:event_CleanButtonActionPerformed
    //CIERRA LA VENTANA
    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_CloseButtonActionPerformed

    private void RegionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RegionTextFieldActionPerformed
    /*METODO ENCARGADO DE MOSTRAR LA MINA CON MAYOR PRODUCCION DE LA REGION*/
    private void mayorProduccionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mayorProduccionButtonActionPerformed
        // TODO add your handling code here:
        Region metodo = new Region();      
        Minas mina = new Minas();
        mina = metodo.mayorProduccion(RegionTextField.getText());
        DefaultTableModel model = (DefaultTableModel) MinasRegionTable.getModel();
        Object rowData[] = new Object[4];
        rowData[0] = mina.getNombre();
        rowData[1] = mina.getMineral();
        rowData[2] = mina.getProduccion();
        rowData[3] = mina.getPersonal();
        model.addRow(rowData);
    }//GEN-LAST:event_mayorProduccionButtonActionPerformed
    /*METODO ENCARGADO DE MOSTRAR LOS DATOS DE TODAS LAS MINAS DE UNA REGION*/
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Region metodo = new Region();      
        Minas mina = new Minas();
        mina = metodo.menorProduccion(RegionTextField.getText());
        DefaultTableModel model = (DefaultTableModel) MinasRegionTable.getModel();
        Object rowData[] = new Object[4];
        rowData[0] = mina.getNombre();
        rowData[1] = mina.getMineral();
        rowData[2] = mina.getProduccion();
        rowData[3] = mina.getPersonal();
        model.addRow(rowData);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarPorRegion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarPorRegion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarPorRegion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarPorRegion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarPorRegion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CleanButton;
    private javax.swing.JButton CloseButton;
    private javax.swing.JTable MinasRegionTable;
    private javax.swing.JTextField RegionTextField;
    private javax.swing.JButton SearchButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mayorProduccionButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void limpiarVista() {
        RegionTextField.setText("");
    }
    
    public Object obtenerDatosBuscados(String key){
        ArrayList<Minas> listaMinas = null;
        try {
            Region aux = new Region();
            aux = aux.verificarRegion(mapaRegiones, key);
            if (aux==null) return null;
            listaMinas=aux.getlistaMinas();
        } catch (IOException ex) {
            Logger.getLogger(BuscarPorRegion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaMinas;
    }
    
    public void mostrarEnGUI(){
        // TODO add your handling code here:
        String region = RegionTextField.getText();
        DefaultTableModel model = (DefaultTableModel) MinasRegionTable.getModel();
        ArrayList<Minas> listaMinas = (ArrayList<Minas>) obtenerDatosBuscados(region);
        Object rowData[] = new Object[4];
        if(listaMinas == null){
            Alertamsj("Region no encontrada", "Gran Mineria");
        }else{
            for (int i = 0; i < listaMinas.size();i++){
                Minas mina=listaMinas.get(i);
                rowData[0] =  mina.getNombre();
                rowData[1] =  mina.getMineral();
                rowData[2] =  mina.getProduccion();
                rowData[3] =  mina.getPersonal();
                model.addRow(rowData);
            }
        }
    }

}
