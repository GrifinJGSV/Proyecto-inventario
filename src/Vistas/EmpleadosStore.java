/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import ConsultasSQL.QuerysEmpleados;
import javax.swing.JOptionPane;
import Controlador.Empleados;
import java.awt.event.KeyEvent;


/**
 *
 * @author Josue
 */
public class EmpleadosStore extends javax.swing.JFrame {

    /**
     * Creates new form Proveedores
     */
    public EmpleadosStore() {
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
        txt_apellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fmt_identidad = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        fmt_telefonoEmergencia = new javax.swing.JFormattedTextField();
        btn_guardar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_NomEme = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fmt_telefono = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tex_direccion = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        combo_estado = new javax.swing.JComboBox<>();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, -1));

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 240, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Apellido");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 138, -1));

        txt_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidoKeyTyped(evt);
            }
        });
        jPanel1.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 240, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Identidad");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 138, -1));

        try {
            fmt_identidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fmt_identidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fmt_identidadActionPerformed(evt);
            }
        });
        jPanel1.add(fmt_identidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 240, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Teléfono");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 138, -1));

        try {
            fmt_telefonoEmergencia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fmt_telefonoEmergencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fmt_telefonoEmergenciaActionPerformed(evt);
            }
        });
        fmt_telefonoEmergencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fmt_telefonoEmergenciaKeyTyped(evt);
            }
        });
        jPanel1.add(fmt_telefonoEmergencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 300, 240, -1));

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 510, -1, -1));

        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 510, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Ingresar un nuevo empleado");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 260, 32));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nombre contacto de emergencia");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        txt_NomEme.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_NomEmeKeyTyped(evt);
            }
        });
        jPanel1.add(txt_NomEme, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 240, -1));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Contacto de emergencia");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

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
        jPanel1.add(fmt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 240, -1));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Dirección");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        tex_direccion.setColumns(20);
        tex_direccion.setRows(5);
        tex_direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tex_direccionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tex_direccion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, -1, -1));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Estado");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        combo_estado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Desactivado" }));
        jPanel1.add(combo_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, -1, -1));

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

    private void fmt_telefonoEmergenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fmt_telefonoEmergenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fmt_telefonoEmergenciaActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
         String nomEmp = txt_nombre.getText().trim(); // Eliminar espacios en blanco al inicio y al final
        if (nomEmp.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre del empleado no puede estar vacio");
            return; // Salir del método si el campo está vacío
        }
        if (!nomEmp.matches("[a-zA-Záéíóúñ][a-zA-Z áéíóúñ]+")) {
            JOptionPane.showMessageDialog(this, "El nombre del empleado solo puede contener letras");
            return; // Salir del método si el nombre contiene caracteres no válidos
        }
        
         String apeEmp = txt_apellido.getText().trim(); // Eliminar espacios en blanco al inicio y al final
        if (apeEmp.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El apellido del empleado no puede estar vacio");
            return; // Salir del método si el campo está vacío
        }
        if (!apeEmp.matches("[a-zA-Záéíóúñ][a-zA-Z áéíóúñ]+")) {
            JOptionPane.showMessageDialog(this, "El apellido del empleado solo puede contener letras");
            return; // Salir del método si el nombre contiene caracteres no válidos
        }
       
        String ideEmp = fmt_identidad.getText().trim(); // Eliminar espacios en blanco al inicio y al final
        if (ideEmp.isEmpty()) {
            JOptionPane.showMessageDialog(null, "el numero de identidad está vacío");
            return; // Salir del método si el campo está vacío
        }
        if (!ideEmp.matches("[0-9][-0-9]+")) {
            JOptionPane.showMessageDialog(this, "La identidad no puede estar vacio");
            return; // Salir del método si el nombre contiene caracteres no válidos
        }
        if(ideEmp.equals("0000-0000-00000")){
                JOptionPane.showMessageDialog(this,"La identidad no puede ser cero");
                        return;
            }
           
        String telEmp = fmt_telefonoEmergencia.getText().trim(); // Eliminar espacios en blanco al inicio y al final
        if (telEmp.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo de telefono está vacío");
            return; // Salir del método si el campo está vacío
        }
         if (!telEmp.matches("[0-9][-0-9]+")) {
            JOptionPane.showMessageDialog(this, "El telefono no debe estar vacio");
            return; // Salir del método si el nombre contiene caracteres no válidos
        }
       
       if (telEmp.equals("0000-0000")) {
            JOptionPane.showMessageDialog(this, "El teléfono no debe ser cero");
             return; // Salir del método si el teléfono no es válido
         }
       
         String nomEme = txt_NomEme.getText().trim(); // Eliminar espacios en blanco al inicio y al final
        if (nomEme.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre de contacto de emergencia del empleado no puede estar vacio");
            return; // Salir del método si el campo está vacío
        }
        if (!nomEme.matches("[a-zA-Záéíóúñ][a-zA-Z áéíóúñ]+")) {
            JOptionPane.showMessageDialog(this, "El nombre de contacto de emergencia del empleado solo puede contener letras");
            return; // Salir del método si el nombre contiene caracteres no válidos
        }
        
        String telEme = fmt_telefonoEmergencia.getText().trim(); // Eliminar espacios en blanco al inicio y al final
        if (telEme.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo de telefono está vacío");
            return; // Salir del método si el campo está vacío
        }
         if (!telEme.matches("[0-9][-0-9]+")) {
            JOptionPane.showMessageDialog(this, "El telefono no debe estar vacio");
            return; // Salir del método si el nombre contiene caracteres no válidos
        }
       
       if (telEme.equals("0000-0000")) {
            JOptionPane.showMessageDialog(this, "El teléfono no debe ser cero");
             return; // Salir del método si el teléfono no es válido
         }
       
       String estaEmp = combo_estado.getSelectedItem().toString();
       
        String texdire = tex_direccion.getText().trim(); // Eliminar espacios en blanco al inicio y al final
        if (texdire.isEmpty()) {
            JOptionPane.showMessageDialog(this, "La dirección es requerida ");
            return; // Salir del método si el campo está vacío
        }
        if (!texdire.matches("[a-zA-Záéíóúñ][a-zA-Záéíóúñ 0-9]+")) {
            JOptionPane.showMessageDialog(this, "La dirección solo puede contener letras y numeros");
            return; // Salir del método si el nombre contiene caracteres no válidos
        }
                        
            // Crear una instancia de QuerysProductos
            QuerysEmpleados querys = new QuerysEmpleados();
            querys.setNombre(nomEmp);
            querys.setApellido(apeEmp);
            querys.setIdentidad(ideEmp);
            querys.setTelefono(telEmp);
            querys.setNombreEmergencia(nomEme);
            querys.setTelefonoemergencia(telEme);
            querys.setDireccion(texdire);
            querys.setEstado(estaEmp);
            

            // Llamar al método Guardar de la clase Productos para guardar los datos
            if (Empleados.Guardar(querys)) {
                JOptionPane.showMessageDialog(this, "Nuevo Empleado Ingresado Exitosamente");
                
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Algo falló, consulte con el administrador de sistema", "Error al guardar", 
                    JOptionPane.OK_OPTION); }
    

    }//GEN-LAST:event_btn_guardarActionPerformed


    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed



    private void fmt_rtnKeyTyped(java.awt.event.KeyEvent evt) {                                 
        // TODO add your handling code here:
    }                                
    // TODO add your handling code here:

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
     //  JOptionPane.showMessageDialog(this, "el nombre no puede contener mas de 40 letras");
     evt.consume();
       }

    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidoKeyTyped
      String Valor =txt_apellido.getText();
        
        if (!Valor.isEmpty()) {// que la primera letra sea mayuscula
        char primeraLetra = Character.toUpperCase(Valor.charAt(0));
         txt_apellido.setText(primeraLetra + Valor.substring(1));
        }
               
       if (Valor.startsWith(" ")){
             JOptionPane.showMessageDialog(this, "el nombre de empresa no puede iniciar con espacios ");// no puede iniciar con  espacios
          txt_apellido.setText(Valor);
          return;
        }
       if(Valor.length()>=40){
      // JOptionPane.showMessageDialog(this, "el nombre de empresa no puede contener mas de 40 letras");
       evt.consume();
       }
    }//GEN-LAST:event_txt_apellidoKeyTyped

    private void fmt_telefonoEmergenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fmt_telefonoEmergenciaKeyTyped
        String Valor = fmt_telefonoEmergencia.getText();
        
        if(fmt_telefonoEmergencia.getText().equals("0000-0000")){
            JOptionPane.showMessageDialog(this, "No se acepta el telefono 0000-0000");
        }
    }//GEN-LAST:event_fmt_telefonoEmergenciaKeyTyped

    private void fmt_identidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fmt_identidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fmt_identidadActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void fmt_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fmt_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fmt_telefonoActionPerformed

    private void fmt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fmt_telefonoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_fmt_telefonoKeyTyped

    private void txt_NomEmeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NomEmeKeyTyped
        String Valor =txt_NomEme.getText();
        
        if (!Valor.isEmpty()) {// que la primera letra sea mayuscula
        char primeraLetra = Character.toUpperCase(Valor.charAt(0));
         txt_NomEme.setText(primeraLetra + Valor.substring(1));
        }
               
       if (Valor.startsWith(" ")){
             JOptionPane.showMessageDialog(this, "el nombre de contacto de emergencia no puede iniciar con espacios ");// no puede iniciar con  espacios
          txt_NomEme.setText(Valor);
          return;
        }
       if(Valor.length()>=40){
      // JOptionPane.showMessageDialog(this, "el nombre de empresa no puede contener mas de 40 letras");
       evt.consume();
       }
    }//GEN-LAST:event_txt_NomEmeKeyTyped

    private void tex_direccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tex_direccionKeyTyped
        String Valor =tex_direccion.getText();
        
        if (!Valor.isEmpty()) {// que la primera letra sea mayuscula
        char primeraLetra = Character.toUpperCase(Valor.charAt(0));
         tex_direccion.setText(primeraLetra + Valor.substring(1));
        }
               
       if (Valor.startsWith(" ")){
             JOptionPane.showMessageDialog(this, "La direccion no puede iniciar con un espacio ");// no puede iniciar con  espacios
          tex_direccion.setText(Valor);
          return;
        }
       if(Valor.length()>=120){
       //JOptionPane.showMessageDialog(this, "La direccion no puede contener mas de 60 letras");
       evt.consume();
       }
    }//GEN-LAST:event_tex_direccionKeyTyped

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
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpleadosStore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JComboBox<String> combo_estado;
    private javax.swing.JFormattedTextField fmt_identidad;
    private javax.swing.JFormattedTextField fmt_telefono;
    private javax.swing.JFormattedTextField fmt_telefonoEmergencia;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea tex_direccion;
    private javax.swing.JTextField txt_NomEme;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
