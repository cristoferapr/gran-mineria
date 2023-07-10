
package com.mycompany.gran_mineria.BuscarStrategy;

import com.mycompany.gran_mineria.*;
import static com.mycompany.gran_mineria.ControladoraMinas.mapaPaises;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class BuscarPorPais extends javax.swing.JFrame implements BuscarStrategy, LimpiadorVentanas {

    public BuscarPorPais() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PaisTextField = new javax.swing.JTextField();
        PaisLabel = new javax.swing.JLabel();
        BuscarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MinasTable = new javax.swing.JTable();
        CleanButton = new javax.swing.JButton();
        CloseButton = new javax.swing.JButton();
        mayorProduccionButton = new javax.swing.JButton();
        menorProduccionButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PaisLabel.setText("Ingrese el nombre del Pais a buscar:");

        BuscarButton.setText("Buscar");
        BuscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarButtonActionPerformed(evt);
            }
        });

        MinasTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Región", "Mineral de extracción", "Cantidad de producción", "Cantidad de personal"
            }
        ));
        jScrollPane1.setViewportView(MinasTable);

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

        mayorProduccionButton.setText("Mina de mayor producción del país");
        mayorProduccionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mayorProduccionButtonActionPerformed(evt);
            }
        });

        menorProduccionButton.setText("Menor producción");
        menorProduccionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menorProduccionButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PaisLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PaisTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(BuscarButton)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mayorProduccionButton)
                        .addGap(90, 90, 90)
                        .addComponent(menorProduccionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CleanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CloseButton)))
                .addGap(74, 74, 74))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {mayorProduccionButton, menorProduccionButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PaisTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PaisLabel))
                    .addComponent(BuscarButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CleanButton)
                    .addComponent(CloseButton))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mayorProduccionButton)
                    .addComponent(menorProduccionButton))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {mayorProduccionButton, menorProduccionButton});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarButtonActionPerformed
        mostrarEnGUI();
    }//GEN-LAST:event_BuscarButtonActionPerformed

    public static void Alertamsj(String infoMessage, String titleBar){
        javax.swing.JOptionPane.showMessageDialog(null, infoMessage, titleBar, javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }
    //LIMPIA LA VISTA DE LA VENTANA
    private void CleanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CleanButtonActionPerformed

        DefaultTableModel model = (DefaultTableModel) MinasTable.getModel();
        model.setRowCount(0);
        limpiarVista();
    }//GEN-LAST:event_CleanButtonActionPerformed
    //CIERRA LA VENTANA
    private void CloseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseButtonActionPerformed

        dispose();
    }//GEN-LAST:event_CloseButtonActionPerformed
    //MUESTRA LA MINA DE MAYOR PRODUCCION DE LA REGION
    private void mayorProduccionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mayorProduccionButtonActionPerformed

        Pais metodo = new Pais() {
            @Override
            public void agregarMina(String nombre, Region region, HashMap<String, Pais> mapaPais) throws IOException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };       
        Minas mina = new Minas();
        mina = metodo.mayorProduccion(PaisTextField.getText());
        DefaultTableModel model = (DefaultTableModel) MinasTable.getModel();
        Object rowData[] = new Object[5];
        rowData[0] = mina.getNombre();
        rowData[1] = mina.getRegion();
        rowData[2] = mina.getMineral();
        rowData[3] = mina.getProduccion();
        rowData[4] = mina.getPersonal();
        model.addRow(rowData);
    }//GEN-LAST:event_mayorProduccionButtonActionPerformed

    private void menorProduccionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menorProduccionButtonActionPerformed
        // TODO add your handling code here:
        Pais metodo = new Pais() {
            @Override
            public void agregarMina(String nombre, Region region, HashMap<String, Pais> mapaPais) throws IOException {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };       
        Minas mina = new Minas();
        mina = metodo.menorProduccion(PaisTextField.getText());
        DefaultTableModel model = (DefaultTableModel) MinasTable.getModel();
        Object rowData[] = new Object[5];
        rowData[0] = mina.getNombre();
        rowData[1] = mina.getRegion();
        rowData[2] = mina.getMineral();
        rowData[3] = mina.getProduccion();
        rowData[4] = mina.getPersonal();
        model.addRow(rowData);
    }//GEN-LAST:event_menorProduccionButtonActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarPorPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarPorPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarPorPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarPorPais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarPorPais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarButton;
    private javax.swing.JButton CleanButton;
    private javax.swing.JButton CloseButton;
    private javax.swing.JTable MinasTable;
    private javax.swing.JLabel PaisLabel;
    private javax.swing.JTextField PaisTextField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mayorProduccionButton;
    private javax.swing.JButton menorProduccionButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void limpiarVista() {
        PaisTextField.setText("");
    }
    
    public Object obtenerDatosBuscados(String key){
        Region aux = new Region();
        ArrayList<Region> listaRegiones=null;
        try {
            listaRegiones = (ArrayList<Region>) aux.mostrarPais(mapaPaises, key);
        } catch (IOException ex) {
            Logger.getLogger(BuscarPorPais.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(listaRegiones!=null) return listaRegiones;
        return null;
    }
    //MUESTRA LA INFORMACION DE TODAS LAS MINAS DE UNA REGION
    public void mostrarEnGUI(){
        // TODO add your handling code here:
        String pais = PaisTextField.getText();
        DefaultTableModel model = (DefaultTableModel) MinasTable.getModel();
        Object rowData[] = new Object[5];
        ArrayList<Region> listaRegiones=(ArrayList<Region>) obtenerDatosBuscados(pais);
        if(listaRegiones != null){
            for (int i = 0; i < listaRegiones.size();i++){
                Region reg=listaRegiones.get(i);
                ArrayList<Minas> min=reg.getlistaMinas();
                for (int j = 0; j < min.size();j++){
                    Minas mina=min.get(j);
                    rowData[0] = mina.getNombre();
                    rowData[1] = mina.getRegion();
                    rowData[2] = mina.getMineral();
                    rowData[3] = mina.getProduccion();
                    rowData[4] = mina.getPersonal();
                    model.addRow(rowData);
                }
            }
        }else{
            Alertamsj("Pais no encontrado", "Gran Mineria");
        }
    }
}
