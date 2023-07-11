/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;
import ConsultasSQL.QuerysProductos;
import Controlador.Productos;//llamado a la clase producto que está dentro del paquete Controlador
import javax.swing.JOptionPane;
/**
 *
 * @author Cristhian Avila
 */
public class EditarProductos extends javax.swing.JFrame {

    /**
     * Creates new form EditarProductos
     */
    public EditarProductos() {
        initComponents();
        setResizable(false);//deshabilitael boton maximizar
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreProducto = new javax.swing.JTextField();
        cbxTipoInventario = new javax.swing.JComboBox<>();
        txtPrecio = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 0, 0));

        jLabel2.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel2.setText("Nombre del Producto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel3.setText("Tipo de Inventario");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel4.setText("Precio");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        txtNombreProducto.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
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
        jPanel1.add(txtNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 200, 40));

        cbxTipoInventario.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        cbxTipoInventario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bienes consumible", "Equipo de oficina", "Equipo de cómputo", "Maquinaria", "Terrenos" }));
        jPanel1.add(cbxTipoInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, -1, 40));

        txtPrecio.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
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
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 200, 40));

        btnCancelar.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 160, 60));

        btnActualizar.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Editar.png"))); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 170, 60));

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel1.setText("Editar Producto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("Lps");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen1.jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProductoActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        //String idText = txtId.getText().trim();
        int idText = Integer.parseInt(txtId.getText().trim());

        
        // Obtener el nombre del producto del campo de texto txtNombreProducto
        String nombreProducto = txtNombreProducto.getText().trim(); // Eliminar espacios en blanco al inicio y al final
        if (nombreProducto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El espacio de nombre de producto está vacío");
            return; // Salir del método si el campo está vacío
        }
        if (!nombreProducto.matches("[a-zA-Z0-9 ]+")) {
            JOptionPane.showMessageDialog(this, "El nombre de producto solo puede contener letras");
            return; // Salir del método si el nombre contiene caracteres no válidos
        }

        // Obtener el tipo de inventario seleccionado del ComboBox cbxTipoInventario
        String tipoInventario = cbxTipoInventario.getSelectedItem().toString();

        // Obtener el precio del campo de texto txtPrecio y validar que sea un número válido
        String precioText = txtPrecio.getText().trim(); // Eliminar espacios en blanco al inicio y al final
        if (precioText.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El espacio de precio está vacío");
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
            querys.setId(idText);

            // Llamar al método Guardar de la clase Productos para guardar los datos
            if (Productos.Editar(querys)) {
                JOptionPane.showMessageDialog(this, "Produto Editado Exitosamente");
                //Productos.MostrarProductos("");
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Algo falló, consulte con el Administrador de sistema");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El valor del precio no es válido");
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtNombreProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreProductoKeyTyped
          //String valor = txtNombreProducto.getText();
         char character = evt.getKeyChar();
                if (!Character.isLetterOrDigit(character) && character != ' ') {
                    evt.consume(); // Ignorar el evento de tecla
                     getToolkit().beep();
                }
        if(txtNombreProducto.getText().length() >=45){
            evt.consume();
             getToolkit().beep();
        }
    }//GEN-LAST:event_txtNombreProductoKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
                char validar = evt.getKeyChar();
     if (Character.isLetter(validar) || !Character.isDigit(validar)) {
         getToolkit().beep();
         evt.consume();
        // JOptionPane.showMessageDialog(rootPane, "Ingresar solo números");
     }

        if(txtPrecio.getText().length() >=7){
            evt.consume();  
             getToolkit().beep();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

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
            java.util.logging.Logger.getLogger(EditarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelar;
    public static javax.swing.JComboBox<String> cbxTipoInventario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField txtId;
    public static javax.swing.JTextField txtNombreProducto;
    public static javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

}
