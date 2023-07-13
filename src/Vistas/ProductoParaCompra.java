/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Conexion.Conexion;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import static Vistas.IngresarCompra.tblProductosCompras;





/**
 *
 * @author PC
 */
public class ProductoParaCompra extends javax.swing.JFrame {
    
    //Variables para calcular el total de la factura
    static double totalFactura, suma;
    

    /**
     * Creates new form ProductoParaCompra
     */
    public ProductoParaCompra() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        //Inicializando la variable para calcular el total de la factura
        totalFactura = 0;
        suma = 0;
        
        tblProductosParafactura.getTableHeader().setReorderingAllowed(false);
        Controlador.ProductosFactura.ProductoParaCompra("");
        
            tblProductosParafactura.addMouseListener(new MouseAdapter() {
            public void MouseClicked(MouseEvent e){
                int fila = tblProductosParafactura.getSelectedRow();
            }
        });   
    }
    
//    public static void calcular(){
//        suma = 0;
//        for(int i = 0; i< tblProductosCompras.getRowCount(); i++){
//            float renglon;
//            renglon = (float) Float.parseFloat(tblProductosCompras.getValueAt(i, 3).toString());
//            
//            suma = suma + renglon;
//        }
//    }
    
    
    
    public void filtrarDatosProductos(String valor){
        String[] titulos = {"<html>Num.</html>","<html>Nombre del Producto</html>","<html>Tipo de inventario</html>",
            "<html>Precio</html>"};
        String[] registrosP = new String[4];
        
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        String SQL = "select * from productos WHERE "
                + "nombreProducto like '%"+valor+"%' or tipoInventario like '%"+valor+"%'";
        
        
        
        try {
            Statement st=(Statement) Conexion.getConection().createStatement();
            ResultSet rs= st.executeQuery(SQL);
            
            while(rs.next()){
                registrosP[0]=rs.getString("id");
                registrosP[1]=rs.getString("nombreProducto");
                registrosP[2]=rs.getString("tipoInventario");
                registrosP[3]=rs.getString("precio");
                
                modelo.addRow(registrosP);
                
            }
            
            ProductoParaCompra.tblProductosParafactura.setModel(modelo);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error"+e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        bntAgregarProducto = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProductosParafactura = new javax.swing.JTable();
        CuadroBuscarProducto = new javax.swing.JTextField();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingresar productos a la factura");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("Agregar Producto a la Factura");

        cantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });
        cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Cantidad");

        bntAgregarProducto.setBackground(new java.awt.Color(253, 253, 253));
        bntAgregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/añadir.png"))); // NOI18N
        bntAgregarProducto.setText("Agregar Producto");
        bntAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAgregarProductoActionPerformed(evt);
            }
        });

        cancelar.setBackground(new java.awt.Color(253, 253, 253));
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelarr.png"))); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        tblProductosParafactura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Num.", "Nombre del Producto", "Tipo de inventario", "Precio", "Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProductosParafactura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductosParafacturaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblProductosParafactura);

        CuadroBuscarProducto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                CuadroBuscarProductoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                CuadroBuscarProductoFocusLost(evt);
            }
        });
        CuadroBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CuadroBuscarProductoActionPerformed(evt);
            }
        });
        CuadroBuscarProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                CuadroBuscarProductoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CuadroBuscarProductoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(272, 272, 272)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cantidad))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(bntAgregarProducto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cancelar))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 802, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CuadroBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(CuadroBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bntAgregarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAgregarProductoActionPerformed
        // TODO add your handling code here:
        //variable para seleccionar el producto de la lista de productos
        int fila = tblProductosParafactura.getSelectedRow();

    try {
        //Variables para capturar los campos de la tabla de productos
        String nombreProd, cantid, precU, totalP;
        double tot = 0.0, calcula = 0.0;

        if (fila < 0) {
            JOptionPane.showMessageDialog(null, "No se seleccionó ningún producto",
                    "Error al agregar producto", JOptionPane.WARNING_MESSAGE);
            return; // Salir del método si no se seleccionó ningún producto
        }

        if (cantidad.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se ingresó una cantidad",
                    "Error al agregar producto", JOptionPane.WARNING_MESSAGE);
            return; // Salir del método si no se ingresó una cantidad
        }
        
        if (cantidad.getText().startsWith("0")) {
            JOptionPane.showMessageDialog(null, "Ingrese cantidades mayores a cero(0)",
                    "Error al agregar producto", JOptionPane.WARNING_MESSAGE);
            return; // Salir del método si no se ingresó una cantidad
        }

        DefaultTableModel modelo = (DefaultTableModel) tblProductosParafactura.getModel();
        nombreProd = tblProductosParafactura.getValueAt(fila, 1).toString();
        precU = tblProductosParafactura.getValueAt(fila, 3).toString();
        cantid = cantidad.getText();

        //Se realizan los cálculos para el total en la factura
        tot = (Double.parseDouble(precU) * Integer.parseInt(cantid));

        totalP = String.valueOf(tot);

        //Enviar los campos seleccionados de la tabla de productos a la tabla de factura de compras
        modelo = (DefaultTableModel) tblProductosCompras.getModel();
        
        // Buscar el producto en la tabla tblProductosCompras
        int rowCount = modelo.getRowCount();
        boolean productoEncontrado = false;

        for (int i = 0; i < rowCount; i++) {
            String productoExistente = modelo.getValueAt(i, 0).toString();
            if (productoExistente.equals(nombreProd)) {
                // El producto ya existe en la tabla, actualizar la cantidad y el total
                String cantidadExistente = modelo.getValueAt(i, 1).toString();
                int nuevaCantidad = Integer.parseInt(cantidadExistente) + Integer.parseInt(cantid);
                modelo.setValueAt(String.valueOf(nuevaCantidad), i, 1);

                String totalExistente = modelo.getValueAt(i, 3).toString();
                double precioUnitario = Double.parseDouble(precU);
                double nuevoTotal = precioUnitario * nuevaCantidad;
                modelo.setValueAt(String.valueOf(nuevoTotal), i, 3);

                productoEncontrado = true;
                break;
            }
        }

        if (!productoEncontrado) {
            // El producto no existe en la tabla, agregarlo como una nueva fila
            tot = Double.parseDouble(precU) * Integer.parseInt(cantid);
            totalP = String.valueOf(tot);

            String filaElemento[] = {nombreProd, cantid, precU, totalP};
            modelo.addRow(filaElemento);
        }
        

        

        //calculo para que se sumen los totales de la factura a uno solo y se envíe a la tabla de facturas
        calcula = Double.parseDouble(precU) * Integer.parseInt(cantidad.getText());
        totalFactura += calcula; // Sumar al total existente
        
        //this.dispose();

        // Limpiar el campo de cantidad después de agregar el producto
        cantidad.setText("");
        JOptionPane.showMessageDialog(null, "Se agrego el producto!");
    } catch (Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_bntAgregarProductoActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
         this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void CuadroBuscarProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CuadroBuscarProductoKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CuadroBuscarProductoKeyTyped

    private void CuadroBuscarProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CuadroBuscarProductoKeyReleased
        // TODO add your handling code here:
        filtrarDatosProductos(CuadroBuscarProducto.getText());
    }//GEN-LAST:event_CuadroBuscarProductoKeyReleased

    private void CuadroBuscarProductoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CuadroBuscarProductoFocusGained
        // TODO add your handling code here:
        //placeholder para notificar como realizar la busqueda
        JTextField textField = (JTextField) evt.getSource();
        String placeholder = "Buscar por nombre de producto y tipo de inventario";

        if (textField.getText().equals(placeholder)) {
            textField.setText("");
            textField.setForeground(Color.BLACK); // Establece el color de fuente adecuado
        }
    }//GEN-LAST:event_CuadroBuscarProductoFocusGained

    private void CuadroBuscarProductoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_CuadroBuscarProductoFocusLost
        // TODO add your handling code here:
        //placeholder para notificar como realizar la busqueda
          JTextField textField = (JTextField) evt.getSource();
          String placeholder = "Buscar por nombre de producto y tipo de inventario";

          if (textField.getText().isEmpty()) {
            textField.setText(placeholder);
            textField.setForeground(Color.GRAY); // Establece el color de fuente del placeholder
          }
    }//GEN-LAST:event_CuadroBuscarProductoFocusLost

    private void CuadroBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CuadroBuscarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CuadroBuscarProductoActionPerformed

    private void tblProductosParafacturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductosParafacturaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblProductosParafacturaMouseClicked

    private void cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyTyped
        // TODO add your handling code here:
        //validacion para que no acepte letras
        char validar= evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
        }
        //validacion de que no permita espacios o caracteres especiales
        if(evt.getKeyChar() >=30 && evt.getKeyChar() <= 47 || evt.getKeyChar() >=58 && evt.getKeyChar() <= 97){
            getToolkit().beep();
            evt.consume();
        }
        //Validar que solo se puedan ingresar una cantidad de 3 numeros
        if(cantidad.getText().length() >= 4){
            getToolkit().beep();
            evt.consume();
        }
        //validar que no se ingrese primero un cero
        if (cantidad.getText().startsWith("0")) {
            // Emitir un sonido de error
            getToolkit().beep();
            // Consumir el evento para evitar que se ingrese el cero
            evt.consume();
        }     
    }//GEN-LAST:event_cantidadKeyTyped

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadActionPerformed

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
            java.util.logging.Logger.getLogger(ProductoParaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductoParaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductoParaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductoParaCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductoParaCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CuadroBuscarProducto;
    public static javax.swing.JButton bntAgregarProducto;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cantidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    public static javax.swing.JTable tblProductosParafactura;
    // End of variables declaration//GEN-END:variables
}
