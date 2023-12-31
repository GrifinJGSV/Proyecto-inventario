/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Conexion.Conexion;
import Conexion.ModeloProveedores;
import java.util.ArrayList;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.*;
import Clases.Proveedor;
import Controlador.Compras;
import javax.swing.JTextField;
import java.util.Date;
//import static Vistas.ProductoParaCompra.suma;
import static Vistas.ProductoParaCompra.totalFactura;




/**
 *
 * @author PC
 */
public class IngresarCompra extends javax.swing.JFrame {
    Conexion enlace = new Conexion();
    Connection conection = enlace.getConexion();
    
    //Variables para calcular el total de la factura
    //para poner publico el nombre del proveedor
    static  String proveedorSeleccionadoNombre;
    


   
    public IngresarCompra() {
        initComponents();
        //para llenar el id y el nombre del proveedor al boton de seleccion desplegable
        llenarProveedor();
        
        //para que la fecha no sea mayor a la actual y menor que la actual
        Fecha.setMaxSelectableDate(new Date());
        Fecha.setMinSelectableDate(new Date());
        
        //Inicializando la variable para calcular el total de la factura
        //totalFactura = 0.0;     
    }  
    
    
 
    //metodo para poder traer el id y el nombre del proveedor
    public void llenarProveedor(){
        ModeloProveedores modProv = new ModeloProveedores();
        ArrayList<Proveedor> listaProveedores = modProv.getProveedor();
        int proveedorSeleccionadoId = 0;
        proveedorSeleccionadoNombre = "Nose";
        
        Proveedores.removeAllItems();
        
        for(int i = 0; i < listaProveedores.size(); i++ ){
            Proveedores.addItem(new Proveedor(listaProveedores.get(i).getId(),
                    listaProveedores.get(i).getNombre()));
            
            int indiceSeleccionado = Proveedores.getSelectedIndex();
            
            if (indiceSeleccionado == i) {
                // Guardar el ID del proveedor seleccionado
                proveedorSeleccionadoId = listaProveedores.get(i).getId();
                proveedorSeleccionadoNombre = listaProveedores.get(i).getNombre();
            }
        }    
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tipoCompra = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Proveedores = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnAgregar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProductosCompras = new javax.swing.JTable();
        Fecha = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        numeroDocumento = new javax.swing.JFormattedTextField();
        CAI = new javax.swing.JFormattedTextField();
        RTN = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnEliminarP = new javax.swing.JButton();
        imgInC = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel1.setText("Ingresar Compra");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 0, -1, 28));

        jLabel2.setText("No. de Factura");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 53, -1, -1));

        jLabel3.setText("Tipo de Compra:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 152, -1, -1));

        tipoCompra.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Credito", "Contado", "Normal", "Donación" }));
        tipoCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoCompraActionPerformed(evt);
            }
        });
        getContentPane().add(tipoCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 149, 176, -1));

        jLabel4.setText("Proveedor:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 186, -1, -1));

        Proveedores.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
        Proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProveedoresActionPerformed(evt);
            }
        });
        getContentPane().add(Proveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 183, 176, -1));

        jLabel5.setText("Fecha");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 217, -1, -1));

        jLabel6.setText("CAI:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 121, -1, -1));

        jLabel9.setText("Productos: ");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 34, 390, 10));

        btnAgregar.setBackground(new java.awt.Color(253, 253, 253));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/añadir.png"))); // NOI18N
        btnAgregar.setText("Agregar producto");
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMouseExited(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 239, -1, -1));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 268, 404, 10));

        tblProductosCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nombre_producto", "cantidad", "precio_unitario", "total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblProductosCompras);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 308, 410, 178));

        Fecha.setToolTipText("");
        Fecha.setDateFormatString("yyyy/MM/dd");
        Fecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FechaKeyTyped(evt);
            }
        });
        getContentPane().add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 211, 176, -1));

        jLabel8.setText("RTN:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 81, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(253, 253, 253));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salvar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
        });
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 110, 30));

        btncancelar.setBackground(new java.awt.Color(253, 253, 253));
        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelarr.png"))); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 120, 30));

        try {
            numeroDocumento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-##-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        numeroDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numeroDocumentoActionPerformed(evt);
            }
        });
        numeroDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numeroDocumentoKeyTyped(evt);
            }
        });
        getContentPane().add(numeroDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 50, 177, -1));

        try {
            CAI.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#UU#U#-##U#U#-U###UU-U##U#U-U#UU#U-#U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        CAI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAIActionPerformed(evt);
            }
        });
        CAI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CAIKeyTyped(evt);
            }
        });
        getContentPane().add(CAI, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 115, 177, -1));
        CAI.getAccessibleContext().setAccessibleParent(CAI);

        try {
            RTN.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##############")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        RTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RTNActionPerformed(evt);
            }
        });
        RTN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                RTNKeyTyped(evt);
            }
        });
        getContentPane().add(RTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 78, 177, -1));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 191, -1, -1));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, -180, 520, -1));

        btnEliminarP.setText("Eliminar producto");
        btnEliminarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        imgInC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alcaldiaDepto.png"))); // NOI18N
        getContentPane().add(imgInC, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, 480, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        //Envia al usuario a la ventana para agregar producto
        ProductoParaCompra prod = new ProductoParaCompra();
        prod.setVisible(true);
        prod.setLocationRelativeTo(null);
        
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void ProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProveedoresActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        //Guardar factura en la base de datos
        //variable que guarda la fecha
        String fcha = ((JTextField)Fecha.getDateEditor().getUiComponent()).getText();
        
            
        
        try {
            PreparedStatement guardar = conection.prepareStatement("INSERT INTO compras(numeroDocumento,"
                    + "rtn,cai,tipoCompra, fk_proveedor,fecha,total)VALUES(?,?,?,?,?,?,?)");
            
            guardar.setString(1,numeroDocumento.getText());
            guardar.setString(2,RTN.getText());
            guardar.setString(3,CAI.getText());
            guardar.setString(4,tipoCompra.getSelectedItem().toString());
            guardar.setInt(5, Proveedores.getSelectedIndex());
            guardar.setString(6, fcha);
            guardar.setDouble(7,totalFactura);
            
            //validaciones
            if(numeroDocumento.getText().equals("   -   -  -   ") || RTN.getText().equals("              ")
               || CAI.getText().equals("      -      -      -      -      -  " )||Fecha.getDate()==(null)
                    || tblProductosCompras.getRowCount() == 0){
                JOptionPane.showMessageDialog(null,"Hay datos vacios"
                ,"Error al guardar factura",JOptionPane.WARNING_MESSAGE);   
            }
            if(numeroDocumento.getText().equals("000-000-00-000") || RTN.getText().equals("00000000000000")){
                JOptionPane.showMessageDialog(null,"datos de numero de factura o RTN no validos"
                ,"Error al guardar factura",JOptionPane.WARNING_MESSAGE);
            }
            else{
                
            guardar.executeUpdate();
            this.dispose();
            Compras.MostrarCompras("");
             JOptionPane.showMessageDialog(null, "Factura guardada");
            
            }
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"error al registrar la factura"
                     + "\nYa existe una factura con estos datos"+e,"No se guardo la factura",
                    JOptionPane.WARNING_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void FechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FechaKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_FechaKeyTyped

    private void numeroDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numeroDocumentoKeyTyped
        // TODO add your handling code here:
        char validar= evt.getKeyChar();
        if(Character.isLetter(validar)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_numeroDocumentoKeyTyped

    private void CAIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CAIKeyTyped
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_CAIKeyTyped

    private void numeroDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numeroDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numeroDocumentoActionPerformed

    private void RTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RTNActionPerformed

    private void RTNKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RTNKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_RTNKeyTyped

    private void tipoCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoCompraActionPerformed

    private void btnAgregarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseEntered
        // TODO add your handling code here:
        //cambiar el color del boton
        //btnAgregar.setBackground(new Color(42, 126, 126));
    }//GEN-LAST:event_btnAgregarMouseEntered

    private void btnAgregarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseExited
        // TODO add your handling code here:
        //cambiar el color del boton al salir 
        //btnAgregar.setBackground(new Color(204,204,204));
    }//GEN-LAST:event_btnAgregarMouseExited

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        // TODO add your handling code here:
        //cambiar el color del boton
        //btnGuardar.setBackground(new Color(135, 206, 235));
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnEliminarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPActionPerformed
        
        
    }//GEN-LAST:event_btnEliminarPActionPerformed

    private void CAIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAIActionPerformed

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
    private javax.swing.JFormattedTextField CAI;
    private com.toedter.calendar.JDateChooser Fecha;
    private javax.swing.JComboBox Proveedores;
    private javax.swing.JFormattedTextField RTN;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminarP;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JLabel imgInC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JFormattedTextField numeroDocumento;
    public static javax.swing.JTable tblProductosCompras;
    private javax.swing.JComboBox<String> tipoCompra;
    // End of variables declaration//GEN-END:variables

   
}
