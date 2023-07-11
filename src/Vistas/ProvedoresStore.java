/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import ConsultasSQL.QuerysProveedores;
import javax.swing.JOptionPane;
import Controlador.Proveedores;
import java.awt.event.KeyEvent;


/**
 *
 * @author Josue
 */
public class ProvedoresStore extends javax.swing.JFrame {

    /**
     * Creates new form Proveedores
     */
    public ProvedoresStore() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_empresa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fmt_rtn = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        fmt_telefono = new javax.swing.JFormattedTextField();
        btn_guardar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta_direccion = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre del representante");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 50, 230, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nombre de la empresa");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 138, -1));

        txt_empresa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_empresaKeyTyped(evt);
            }
        });
        jPanel1.add(txt_empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 90, 230, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("RTN");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 138, -1));

        try {
            fmt_rtn.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fmt_rtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fmt_rtnActionPerformed(evt);
            }
        });
        jPanel1.add(fmt_rtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 130, 230, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Teléfono");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 138, -1));

        try {
            fmt_telefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fmt_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fmt_telefonoActionPerformed(evt);
            }
        });
        fmt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fmt_telefonoKeyTyped(evt);
            }
        });
        jPanel1.add(fmt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 164, 230, -1));

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, -1, -1));

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Ingresar un nuevo proveedor");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 6, 260, 32));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Dirección");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        txta_direccion.setColumns(20);
        txta_direccion.setRows(5);
        txta_direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txta_direccionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txta_direccion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 204, 240, 109));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen1.jpg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fmt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fmt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fmt_telefonoActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
         String nomProv = txt_nombre.getText().trim(); // Eliminar espacios en blanco al inicio y al final
         if (Proveedores.ValidarTelefon(fmt_telefono.getText())) {
            JOptionPane.showMessageDialog(this, "El telefono ingresado ya existe.");
            return;
        }
        if (nomProv.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre del representante no puede estar vacio");
            return; // Salir del método si el campo está vacío
        }
        if (!nomProv.matches("[a-zA-Záéíóúñ][a-zA-Z áéíóúñ]+")) {
            JOptionPane.showMessageDialog(this, "El nombre del provedor solo puede contener letras");
            return; // Salir del método si el nombre contiene caracteres no válidos
        }
        
         String empProv = txt_empresa.getText().trim(); // Eliminar espacios en blanco al inicio y al final
        if (empProv.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre de la empresa no puede estar vacio");
            return; // Salir del método si el campo está vacío
        }
        if (!empProv.matches("[a-zA-Záéíóúñ.][a-zA-Záéíóúñ 0-9.]+")) {
            JOptionPane.showMessageDialog(this, "El nombre de la empres solo puede contener letras y numeros");
            return; // Salir del método si el nombre contiene caracteres no válidos
        }
       
        String rtnPro = fmt_rtn.getText(); // Eliminar espacios en blanco al inicio y al final
        if (rtnPro.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El rtn está vacío");
            return; // Salir del método si el campo está vacío
        }
        if (!rtnPro.matches("[0-9][-0-9]+")) {
            JOptionPane.showMessageDialog(this, "El rtn etsa vacio");
            return; // Salir del método si el nombre contiene caracteres no válidos
        }
        if(rtnPro.equals("0000-0000-000000")){
                JOptionPane.showMessageDialog(this,"El rtn no puede ser cero");
                        return;
            }
        
        
        String telProv = fmt_telefono.getText(); // Eliminar espacios en blanco al inicio y al final
        if (telProv.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo de teléfono está vacío");
            return; // Salir del método si el campo está vacío
        }
         if (!telProv.matches("[0-9][-0-9]+")) {
            JOptionPane.showMessageDialog(this, "El telefono no puede estar vacio");
            return; // Salir del método si el nombre contiene caracteres no válidos
        }
       
       if (telProv.equals("0000-0000")) {
            JOptionPane.showMessageDialog(this, "El teléfono no debe ser cero");
             return; // Salir del método si el teléfono no es válido
         }
              
            
            
                  
         String desProv = txta_direccion.getText().trim(); // Eliminar espacios en blanco al inicio y al final
        if (desProv.isEmpty()) {
            JOptionPane.showMessageDialog(this, "La dirección es requerida ");
            return; // Salir del método si el campo está vacío
        }
        if (!desProv.matches("[a-zA-Záéíóúñ][a-zA-Záéíóúñ 0-9]+")) {
            JOptionPane.showMessageDialog(this, "La dirección solo puede contener letras y numeros");
            return; // Salir del método si el nombre contiene caracteres no válidos
        }
        
        
            // Crear una instancia de QuerysProductos
            QuerysProveedores querys = new QuerysProveedores();
            querys.setNombre(nomProv);
            querys.setEmpresa(empProv);
            querys.setRtn(rtnPro);
            querys.setTelefono(telProv);
            querys.setDireccion(desProv);

            // Llamar al método Guardar de la clase Productos para guardar los datos
            if (Proveedores.Guardar(querys)) {
                JOptionPane.showMessageDialog(this, "Nuevo Provedor Ingresado Exitosamente");
                Proveedores.MostrarProvedores("");
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "El Telefono o el RTN ya estan ingresados");
            }
    

    }//GEN-LAST:event_btn_guardarActionPerformed


    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed



    private void fmt_rtnKeyTyped(java.awt.event.KeyEvent evt) {                                 
        // TODO add your handling code here:
    }                                

    private void fmt_rtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fmt_rtnKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_fmt_rtnKeyPressed
   



    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
          String Valor =txt_nombre.getText();
        
        if (!Valor.isEmpty()) {// que la primera letra sea mayuscula
        char primeraLetra = Character.toUpperCase(Valor.charAt(0));
         txt_nombre.setText(primeraLetra + Valor.substring(1));
        }
         
        
       if (Valor.startsWith(" ")){
             JOptionPane.showMessageDialog(this, "el nombre no puede iniciar con espacios ");// no puede iniciar con  espacios
          txt_nombre.setText(Valor);
          return;
        }
       if(Valor.length()>=40){
      // JOptionPane.showMessageDialog(this, "el nombre no puede contener mas de 40 letras");
      evt.consume();
       }
      
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_empresaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_empresaKeyTyped
      String Valor =txt_empresa.getText();
        
        if (!Valor.isEmpty()) {// que la primera letra sea mayuscula
        char primeraLetra = Character.toUpperCase(Valor.charAt(0));
         txt_empresa.setText(primeraLetra + Valor.substring(1));
        }
               
       if (Valor.startsWith(" ")){
             JOptionPane.showMessageDialog(this, "el nombre de empresa no puede iniciar con espacios ");// no puede iniciar con  espacios
          txt_empresa.setText(Valor);
          return;
        }
       if(Valor.length()>=80){
      // JOptionPane.showMessageDialog(this, "el nombre de empresa no puede contener mas de 40 letras");
       evt.consume();
       }
    }//GEN-LAST:event_txt_empresaKeyTyped

    private void fmt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fmt_telefonoKeyTyped
        String Valor = fmt_telefono.getText();
        
        if(fmt_telefono.getText().equals("0000-0000")){
            JOptionPane.showMessageDialog(this, "No se acepta el telefono 0000-0000");
        }
    }//GEN-LAST:event_fmt_telefonoKeyTyped

    private void txta_direccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txta_direccionKeyTyped
         String Valor =txta_direccion.getText();
        
        if (!Valor.isEmpty()) {// que la primera letra sea mayuscula
        char primeraLetra = Character.toUpperCase(Valor.charAt(0));
         txta_direccion.setText(primeraLetra + Valor.substring(1));
        }
               
       if (Valor.startsWith(" ")){
             JOptionPane.showMessageDialog(this, "La direccion no puede iniciar con un espacio ");// no puede iniciar con  espacios
          txt_empresa.setText(Valor);
          return;
        }
       if(Valor.length()>=120){
       //JOptionPane.showMessageDialog(this, "La direccion no puede contener mas de 60 letras");
       evt.consume();
       }
    
    }//GEN-LAST:event_txta_direccionKeyTyped

    private void fmt_rtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fmt_rtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fmt_rtnActionPerformed

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
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProvedoresStore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JFormattedTextField fmt_rtn;
    private javax.swing.JFormattedTextField fmt_telefono;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_empresa;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextArea txta_direccion;
    // End of variables declaration//GEN-END:variables
}
