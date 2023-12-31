/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Clases.IdentidadValidator;
import ConsultasSQL.QuerysEmpleados;
import javax.swing.JOptionPane;
import Controlador.Empleados;



/**
 *
 * @author Josue
 */
public class EditarEmpleados extends javax.swing.JFrame {

    /**
     * Creates new form Proveedores
     */
    public EditarEmpleados() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
       // initComponents();
        //setLocationRelativeTo(null);
        //setResizable(false);
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
        txt_Id = new javax.swing.JTextField();
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
        cbxEstado = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tex_direccion = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txt_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 0, 0));

        jLabel1.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 130, -1));

        txt_nombre.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 280, 30));

        jLabel2.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel2.setText("Apellido");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 138, -1));

        txt_apellido.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        txt_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidoKeyTyped(evt);
            }
        });
        jPanel1.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 280, 30));

        jLabel3.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel3.setText("Identidad");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 138, -1));

        try {
            fmt_identidad.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel1.add(fmt_identidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 280, -1));

        jLabel4.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel4.setText("Teléfono");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 138, -1));

        try {
            fmt_telefonoEmergencia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fmt_telefonoEmergencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fmt_telefonoEmergenciaKeyTyped(evt);
            }
        });
        jPanel1.add(fmt_telefonoEmergencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 280, -1));

        btn_guardar.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Editar.png"))); // NOI18N
        btn_guardar.setText("Actualizar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        btn_cancelar.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        btn_cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel5.setText("Editar empleado");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 190, 32));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel6.setText("Nombre contacto de emergencia");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        txt_NomEme.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        txt_NomEme.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_NomEmeKeyTyped(evt);
            }
        });
        jPanel1.add(txt_NomEme, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, 210, 30));

        jLabel7.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel7.setText("Contacto de emergencia");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        try {
            fmt_telefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        fmt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fmt_telefonoKeyTyped(evt);
            }
        });
        jPanel1.add(fmt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 280, -1));

        cbxEstado.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "activo", "inactivo" }));
        jPanel1.add(cbxEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 280, 30));

        jLabel10.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel10.setText("Estado:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        jLabel8.setText("Dirección");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        tex_direccion.setColumns(20);
        tex_direccion.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        tex_direccion.setRows(5);
        tex_direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tex_direccionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(tex_direccion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 280, 100));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/alcaldiaDepto.png"))); // NOI18N
        jLabel9.setText("5555");
        jLabel9.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -30, 520, 620));

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

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
         String nomEmp = txt_nombre.getText().trim();
         String estado = cbxEstado.getSelectedItem().toString();
         int idText = Integer.parseInt(txt_Id.getText().trim());
         
         if (Empleados.ValidarIdentidadEditar(fmt_identidad.getText(), Integer.parseInt(txt_Id.getText().trim()))) {
            JOptionPane.showMessageDialog(null, "La identidad ingresado ya existe.", "Error al guardar", JOptionPane.WARNING_MESSAGE);             
            return;
        }
          
        if (Empleados.ValidarTelefonoEditar(fmt_telefono.getText(), Integer.parseInt(txt_Id.getText().trim()))) {
            JOptionPane.showMessageDialog(null, "La teléfono ingresado ya existe.", "Error al guardar", JOptionPane.WARNING_MESSAGE);             
            return;
        }

        if (nomEmp.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre del empleado no puede estar vacio.", "Error al guardar", JOptionPane.WARNING_MESSAGE);             
            JOptionPane.showMessageDialog(this, "");
            return; // Salir del método si el campo está vacío
        }
        if (!nomEmp.matches("[a-zA-Záéíóúñ][a-zA-Z áéíóúñ]+")) {
            JOptionPane.showMessageDialog(null, "El nombre del empleado solo puede contener letras.", "Error al guardar", JOptionPane.WARNING_MESSAGE);             
            return; // Salir del método si el nombre contiene caracteres no válidos
        }
        
         String apeEmp = txt_apellido.getText().trim(); // Eliminar espacios en blanco al inicio y al final
        if (apeEmp.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El apellido del empleado no puede estar vacio.", "Error al guardar", JOptionPane.WARNING_MESSAGE);
            return; // Salir del método si el campo está vacío
        }
        if (!apeEmp.matches("[a-zA-Záéíóúñ][a-zA-Z áéíóúñ]+")) {
            JOptionPane.showMessageDialog(null, "El apellido del empleado solo puede contener letras.", "Error al guardar", JOptionPane.WARNING_MESSAGE);
            return; // Salir del método si el nombre contiene caracteres no válidos
        }
       
        String ideEmp = fmt_identidad.getText().trim(); // Eliminar espacios en blanco al inicio y al final
        if (ideEmp.isEmpty()) {
            JOptionPane.showMessageDialog(null, "el numero de identidad está vacío.", "Error al guardar", JOptionPane.WARNING_MESSAGE);
            return; // Salir del método si el campo está vacío
        }
        if (!ideEmp.matches("[0-9][-0-9]+")) {
            JOptionPane.showMessageDialog(null, "La identidad no puede estar vacio.", "Error al guardar", JOptionPane.WARNING_MESSAGE);
            return; // Salir del método si el nombre contiene caracteres no válidos
        }
        if(ideEmp.equals("0000-0000-00000")){
            JOptionPane.showMessageDialog(null, "La identidad no puede ser cero.", "Error al guardar", JOptionPane.WARNING_MESSAGE);
                        return;
            }
               
        String telEmp = fmt_telefono.getText().trim(); // Eliminar espacios en blanco al inicio y al final
        if (telEmp.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo de telefono está vacío.", "Error al guardar", JOptionPane.WARNING_MESSAGE);
            return; // Salir del método si el campo está vacío
        }
         if (!telEmp.matches("[0-9][-0-9]+")) {
            JOptionPane.showMessageDialog(null, "El telefono no debe estar vacio.", "Error al guardar", JOptionPane.WARNING_MESSAGE);
            return; // Salir del método si el nombre contiene caracteres no válidos
        }
       
       if (telEmp.equals("0000-0000")) {
           JOptionPane.showMessageDialog(null, "El teléfono no debe ser cero.", "Error al guardar", JOptionPane.WARNING_MESSAGE);
           return; // Salir del método si el teléfono no es válido
         }
       String nomEme = txt_NomEme.getText().trim(); // Eliminar espacios en blanco al inicio y al final
        if (nomEme.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre de contacto de emergencia del empleado no puede estar vacio.", "Error al guardar", JOptionPane.WARNING_MESSAGE);
            return; // Salir del método si el campo está vacío
        }
        if (!nomEme.matches("[a-zA-Záéíóúñ][a-zA-Z áéíóúñ]+")) {
            JOptionPane.showMessageDialog(null, "El nombre de contacto de emergencia del empleado solo puede contener letras.", "Error al guardar", JOptionPane.WARNING_MESSAGE);
            return; // Salir del método si el nombre contiene caracteres no válidos
        }
        
        String telEme = fmt_telefonoEmergencia.getText().trim(); // Eliminar espacios en blanco al inicio y al final
        if (telEme.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo de telefono está vacío.", "Error al guardar", JOptionPane.WARNING_MESSAGE);
            return; // Salir del método si el campo está vacío
        }
         if (!telEme.matches("[0-9][-0-9]+")) {
            JOptionPane.showMessageDialog(null, "El telefono no debe estar vacio.", "Error al guardar", JOptionPane.WARNING_MESSAGE);
            return; // Salir del método si el nombre contiene caracteres no válidos
        }
       
       if (telEme.equals("0000-0000")) {
           JOptionPane.showMessageDialog(null, "El teléfono no debe ser cero.", "Error al guardar", JOptionPane.WARNING_MESSAGE);
           return; // Salir del método si el teléfono no es válido
         }
       
        String texdire = tex_direccion.getText().trim(); // Eliminar espacios en blanco al inicio y al final
        if (texdire.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La dirección es requerida.", "Error al guardar", JOptionPane.WARNING_MESSAGE);
            return; // Salir del método si el campo está vacío
        }
        if (!texdire.matches("[a-zA-Záéíóúñ][a-zA-Záéíóúñ 0-9]+")) {
            JOptionPane.showMessageDialog(null, "La dirección solo puede contener letras y numeros.", "Error al guardar", JOptionPane.WARNING_MESSAGE);
            return; // Salir del método si el nombre contiene caracteres no válidos
        }
        
         String identidad = fmt_identidad.getText(); // Obtener el texto ingresado en el campo fmt_identidad

        // Crear una instancia del validador de identidad
        IdentidadValidator validator = new IdentidadValidator();

        // Validar la identidad utilizando el método validarIdentidad del validador
        if (validator.validarIdentidad(identidad)) {
            // Crear una instancia de QuerysProductos
            QuerysEmpleados querys = new QuerysEmpleados();
            querys.setNombre(nomEmp);
            querys.setApellido(apeEmp);
            querys.setIdentidad(ideEmp);
            querys.setTelefono(telEmp);
            querys.setNombreEmergencia(nomEme);
            querys.setTelefonoemergencia(telEme);
            querys.setDireccion(texdire);
            querys.setEstado(estado);
            querys.setId(idText);

            // Llamar al método Guardar de la clase Productos para guardar los datos
            if (Empleados.Editar(querys)) {
                JOptionPane.showMessageDialog(null, "Empleado editado exitosamente","Guardado con éxito", JOptionPane.INFORMATION_MESSAGE);

                Empleados.MostrarEmpleados("");
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "El Telefono o la identidad ya estan ingresados", "Error al guardar", JOptionPane.OK_OPTION);               
            }
        } else {
            // La identidad no es válida, mostrar mensaje de error.
            JOptionPane.showMessageDialog(null, "Identidad inválida: " + identidad, "Validación de Identidad",JOptionPane.ERROR_MESSAGE);
        }   
    

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
   

    private int getCursorPositionNombre() {
        return txt_nombre.getCaretPosition();   
    }

    // Método para establecer la posición del cursor
    private void setCursorPositionNombre(int position) {
        txt_nombre.setCaretPosition(position);
    }


    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
      String Valor = txt_nombre.getText();

            if (!Valor.isEmpty()) {
                int cursorPosition = getCursorPositionNombre(); // Obtener posición actual del cursor

                char primeraLetra = Character.toUpperCase(Valor.charAt(0));
                txt_nombre.setText(primeraLetra + Valor.substring(1));

                setCursorPositionNombre(cursorPosition); // Restaurar posición del cursor
            }
        
        
       if (Valor.startsWith(" ")){
           
             //JOptionPane.showMessageDialog(this, "el nombre no puede iniciar con espacios ");// no puede iniciar con  espacios
          txt_nombre.setText(Valor);
          return;
        }
       if(Valor.length()>=40){
     //  JOptionPane.showMessageDialog(this, "el nombre no puede contener mas de 40 letras");
     evt.consume();
       }

    }//GEN-LAST:event_txt_nombreKeyTyped

        private int getCursorPositionApellido() {
        return txt_apellido.getCaretPosition();   
    }

    // Método para establecer la posición del cursor
    private void setCursorPositionApellido(int position) {
        txt_apellido.setCaretPosition(position);
    }
    
    private void txt_apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidoKeyTyped
      String Valor =txt_apellido.getText();
        
        if (!Valor.isEmpty()) {// que la primera letra sea mayuscula
            int cursorPosition = getCursorPositionApellido();
        char primeraLetra = Character.toUpperCase(Valor.charAt(0));
         txt_apellido.setText(primeraLetra + Valor.substring(1));
         setCursorPositionApellido(cursorPosition); 
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
    String telefono = fmt_telefonoEmergencia.getText();
        if(telefono.equals("0000-0000")){
            JOptionPane.showMessageDialog(null, "No se acepta el telefono 0000-0000.", "Error al guardar", JOptionPane.WARNING_MESSAGE);
        }


        if (!telefono.isEmpty() && "014567".contains(telefono.substring(0, 1))) {
            JOptionPane.showMessageDialog(null, "AL inicio solo se permiten los siguentes numeros: 3,9,8 y 2.", "Error al guardar", JOptionPane.WARNING_MESSAGE);
            // Emitir un sonido de error
            getToolkit().beep();
            // Consumir el evento para evitar que se ingrese el dígito
            evt.consume();
        }
        
    }//GEN-LAST:event_fmt_telefonoEmergenciaKeyTyped

    private void fmt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fmt_telefonoKeyTyped
        String telefono = fmt_telefono.getText();

        if (!telefono.isEmpty() && "014567".contains(telefono.substring(0, 1))) {
            JOptionPane.showMessageDialog(null, "AL inicio solo se permiten los siguentes numeros: 3,9,8 y 2.", "Error al guardar", JOptionPane.WARNING_MESSAGE);
            // Emitir un sonido de error
            getToolkit().beep();
            // Consumir el evento para evitar que se ingrese el dígito
            evt.consume();
        }
        
         if(telefono.equals("0000-0000")){
             JOptionPane.showMessageDialog(null, "No se acepta el telefono 0000-0000.", "Error al guardar", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_fmt_telefonoKeyTyped
    
        private int getCursorPositionNombreEme() {
        return txt_NomEme.getCaretPosition();   
    }

    // Método para establecer la posición del cursor
    private void setCursorPositionNombreEme(int position) {
        txt_NomEme.setCaretPosition(position);
    }
    
    private void txt_NomEmeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NomEmeKeyTyped
        String Valor =txt_NomEme.getText();
        
        if (!Valor.isEmpty()) {// que la primera letra sea mayuscula
            int cursorPosition = getCursorPositionNombreEme();
        char primeraLetra = Character.toUpperCase(Valor.charAt(0));
         txt_NomEme.setText(primeraLetra + Valor.substring(1));
         setCursorPositionNombreEme(cursorPosition); 
        }
               
       if (Valor.startsWith(" ")){
           JOptionPane.showMessageDialog(null, "El nombre de contacto de emergencia no puede iniciar con espacios.", "Error al guardar", JOptionPane.WARNING_MESSAGE);// no puede iniciar con  espacios
          txt_NomEme.setText(Valor);
          return;
        }
       if(Valor.length()>=40){
      // JOptionPane.showMessageDialog(this, "el nombre de empresa no puede contener mas de 40 letras");
       evt.consume();
       }
    }//GEN-LAST:event_txt_NomEmeKeyTyped
    
        private int getCursorPositionDireccion() {
        return tex_direccion.getCaretPosition();   
    }

    // Método para establecer la posición del cursor
    private void setCursorPositionDireccion(int position) {
        tex_direccion.setCaretPosition(position);
    }
    
    private void tex_direccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tex_direccionKeyTyped
        String Valor =tex_direccion.getText();
        
        if (!Valor.isEmpty()) {// que la primera letra sea mayuscula
            int cursorPosition = getCursorPositionDireccion();
        char primeraLetra = Character.toUpperCase(Valor.charAt(0));
         tex_direccion.setText(primeraLetra + Valor.substring(1));
         setCursorPositionDireccion(cursorPosition);
        }
               
       if (Valor.startsWith(" ")){
           JOptionPane.showMessageDialog(null, "La direccion no puede iniciar con un espacio.", "Error al guardar", JOptionPane.WARNING_MESSAGE);// no puede iniciar con  espacios
          tex_direccion.setText(Valor);
          return;
        }
       if(Valor.length()>=80){
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
    public static javax.swing.JComboBox<String> cbxEstado;
    public static javax.swing.JFormattedTextField fmt_identidad;
    public static javax.swing.JFormattedTextField fmt_telefono;
    public static javax.swing.JFormattedTextField fmt_telefonoEmergencia;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextArea tex_direccion;
    public static javax.swing.JTextField txt_Id;
    public static javax.swing.JTextField txt_NomEme;
    public static javax.swing.JTextField txt_apellido;
    public static javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
