/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import ConsultasSQL.QuerysProductos;
import Controlador.Productos;//llamado a la clase producto que está dentro del paquete Controlador
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//import javax.swing.JPanel;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrea
 */
public class CrearProductos extends javax.swing.JFrame {
    
    public CrearProductos() {
        
      //  this.setContentPane(fondo);
        
        initComponents();
        setResizable(false);//deshabilitael boton maximizar
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        cbxTipoInventario = new javax.swing.JComboBox<>();
        txtPrecio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen1.jpg"))); // NOI18N
        jLabel6.setText("LPS");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel2.setText("Nombre del producto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel3.setText("Tipo de inventario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel4.setText("Precio");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, -1, -1));

        txtNombreProducto.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNombreProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProductoActionPerformed(evt);
            }
        });
        txtNombreProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreProductoKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 188, 37));

        cbxTipoInventario.setBackground(new java.awt.Color(249, 253, 250));
        cbxTipoInventario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cbxTipoInventario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bienes consumible", "Equipo de oficina", "Equipo de cómputo", "Maquinaria", "Terrenos" }));
        jPanel1.add(cbxTipoInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 188, 45));

        txtPrecio.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 188, 42));

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel1.setText("Nuevo producto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(249, 253, 250));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 160, 60));

        btnGuardar.setBackground(new java.awt.Color(249, 253, 250));
        btnGuardar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 150, 61));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Lps");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 270, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen1.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProductoActionPerformed
        
    }//GEN-LAST:event_txtNombreProductoActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();//cierra la ventana
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

            // Obtener el nombre del producto del campo de texto txtNombreProducto
        String nombreProducto = txtNombreProducto.getText(); // asignamos una variable que obtiene el valor almacenado en el txtfield txtNombreProducto
        if (nombreProducto.isEmpty()) {//si el nombre del producto está vacío se mostrará el siguiente mensaje
            JOptionPane.showMessageDialog(null, "El nombre de producto está vacío","Error al guardar",
                    JOptionPane.WARNING_MESSAGE);
            return; // Salir del método si el campo está vacío
        }
        if (!nombreProducto.matches("[a-zA-ZáéíóúñÁÉÍÓÚÑ][a-zA-Z0-9 áéíóúñÁÉÍÓÚÑ.:]+")) {//si el nombre del producto contiene caracteres diferentes se muestra el siguiente mensaje
            //mensaje de error 
            JOptionPane.showMessageDialog(null, "alguno de los caracteres que ingresó no es valido", "Error al guardar", 
                    JOptionPane.WARNING_MESSAGE);
            return; // Salir del método si el nombre contiene caracteres no válidos
        }

        // Obtener el tipo de inventario seleccionado del ComboBox cbxTipoInventario
        String tipoInventario = cbxTipoInventario.getSelectedItem().toString();

        // Obtener el precio del campo de texto txtPrecio y validar que sea un número válido
        String precioText = txtPrecio.getText().trim(); // El metodo trim se utiliza para eliminar espacios en blanco
        if (precioText.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El precio está vacío","Error al guardar", 
                    JOptionPane.WARNING_MESSAGE);
            return; // Salir del método si el campo está vacío
        }
        try {
            double precio = Double.parseDouble(precioText);
            if (precio <= 0) {
                JOptionPane.showMessageDialog(this, "El precio debe ser un número mayor que cero");
                return; // Salir del método si el precio no es válido
            }
            // Crear una instancia de QuerysProductos
            QuerysProductos querys = new QuerysProductos();
            querys.setNombreProducto(nombreProducto);
            querys.setTipoInventario(tipoInventario);
            querys.setPrecio(precio);

            // Llamar al método Guardar de la clase Productos para guardar los datos
            if (Productos.Guardar(querys)) {
                JOptionPane.showMessageDialog(null, "Nuevo produto ingresado exitosamente","Error al guardar", 
                    JOptionPane.WARNING_MESSAGE);
                //Productos.MostrarProductos("");
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Algo falló, consulte con el administrador de sistema", "Error al guardar", 
                    JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "El valor del precio no es válido", "Error al guardar", 
                    JOptionPane.WARNING_MESSAGE);
        }
                                               
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombreProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreProductoKeyTyped
        //String valor = txtNombreProducto.getText();
        if(txtNombreProducto.getText().length() >=45){
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreProductoKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            JOptionPane.showMessageDialog(rootPane,"Ingresar solo números");
        }
        
        if(txtPrecio.getText().length() >=7){
            evt.consume();  
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbxTipoInventario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
