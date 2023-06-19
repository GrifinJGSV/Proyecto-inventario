/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import java.awt.Color;
import static javax.management.remote.JMXConnectorFactory.connect;
import java.sql.*;
import static javax.management.remote.JMXConnectorFactory.connect;
import javax.swing.JOptionPane;


/**
 *
 * @author Arturo Mendoza
 */
public class IngresarCompra extends javax.swing.JFrame {
        Conexion conexion = new Conexion(" analisis_y_diseño");
        Connection conect = conexion.conectar();
    
    public IngresarCompra() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.white);
        
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
        jLabel2 = new javax.swing.JLabel();
        tipoCompra = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        proveedor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descCompra = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        nombProducto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Ingresar Compra");

        jLabel2.setText("Tipo de compra:");

        tipoCompra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Credito", "Contado", "Normal", "Donacion" }));

        jLabel3.setText("Proveedor:");

        proveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                proveedorKeyTyped(evt);
            }
        });

        jLabel4.setText("Descripcion:");

        descCompra.setColumns(20);
        descCompra.setRows(5);
        jScrollPane1.setViewportView(descCompra);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel5.setText("Nombre del producto:");

        nombProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        nombProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nombProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombProductoActionPerformed(evt);
            }
        });
        nombProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombProductoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnGuardar)
                        .addGap(50, 50, 50)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nombProducto)
                                    .addComponent(tipoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(tipoCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nombProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(9, 9, 9)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //boton para guardar los datos en la base de datos en la tabla de compras
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try {
            PreparedStatement guardar = conect.prepareStatement("INSERT INTO  compras"
                    + "(nombre_producto, descripcion, tipo_compra, proveedor) VALUES (,?,?,?,?)");
            guardar.setString(1, nombProducto.getText());
            guardar.setString(2, descCompra.getText());
            guardar.setString(3, tipoCompra.getSelectedItem().toString());
            guardar.setString(4, proveedor.getText());
            
            guardar.executeUpdate();
            JOptionPane.showMessageDialog(null, "compras registradas");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "No se logro registrar la  "
                    + "compra");
        }
        ListaCompras newframe = new ListaCompras();
        
        newframe.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnGuardarActionPerformed

    //Boton para cancelar y cerrar la ventana de ingreso de compra
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
     this.dispose();
     ListaCompras newframe = new ListaCompras();
     newframe.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void nombProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombProductoActionPerformed

    //validacion para que en el form de agregar compra solo se acepten letras en el name
    private void nombProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombProductoKeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        if(Character.isDigit(validar)){
           getToolkit().beep();
           evt.consume();
           
           //Mensaje para que se sepa que solo se pueden ingresar letras
           JOptionPane.showMessageDialog(rootPane, "Ingrese solo letras");
        }
    }//GEN-LAST:event_nombProductoKeyTyped

    private void proveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_proveedorKeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        if(Character.isDigit(validar)){
           getToolkit().beep();
           evt.consume();
           
           //Mensaje para que se sepa que solo se pueden ingresar letras
           JOptionPane.showMessageDialog(rootPane, "Ingrese solo letras");
        }
        
    }//GEN-LAST:event_proveedorKeyTyped

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
            java.util.logging.Logger.getLogger(IngresarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JTextArea descCompra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombProducto;
    private javax.swing.JTextField proveedor;
    private javax.swing.JComboBox<String> tipoCompra;
    // End of variables declaration//GEN-END:variables
}