/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vistas;

import java.awt.Color;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Josue
 */
public class MostrarProveedores extends javax.swing.JPanel {

    /**
     * Creates new form MostrarProveedores
     */
    public MostrarProveedores() {
        initComponents();
        tblMostrarProveedores.getTableHeader().setReorderingAllowed(false);
        Controlador.Proveedores.MostrarProvedores("");
        
     tblMostrarProveedores.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent e){
            
            if (e.getClickCount() == 2) {
                int fila = tblMostrarProveedores.getSelectedRow();
                VerProvedor verProvedor = new VerProvedor();
               /** verProvedor.lbId.setText(tblMostrarProveedores.getValueAt(fila, 0).toString());*/
                verProvedor.lbNom.setText(tblMostrarProveedores.getValueAt(fila, 1).toString());
                verProvedor.lbEmp.setText(tblMostrarProveedores.getValueAt(fila,2).toString());
                verProvedor.lbRt.setText(tblMostrarProveedores.getValueAt(fila, 3).toString()); 
                verProvedor.lbTel.setText(tblMostrarProveedores.getValueAt(fila, 4).toString());
                verProvedor.txDes.setText(tblMostrarProveedores.getValueAt(fila, 5
                ).toString());
                
                verProvedor.setVisible(true);
            }
        }
             });
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
        tblMostrarProveedores = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        txtBusqueda = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblMostrarProveedores = new JTable(){
            public boolean isCellEditable(int row, int column){
                for(int i=0; i< tblMostrarProveedores.getRowCount(); i++){
                    if(row == i){
                        return false;
                    }
                }
                return true ;
            }
        };
        tblMostrarProveedores.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        tblMostrarProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "N°", "Nombre", "Empresa", "RTN", "Telefono", "Direccion"
            }
        ));
        tblMostrarProveedores.setSelectionForeground(new java.awt.Color(153, 255, 255));
        tblMostrarProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMostrarProveedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMostrarProveedores);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 820, 350));

        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/crear.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 50, 110, 40));

        btnImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imprimir.png"))); // NOI18N
        btnImprimir.setText("Imprimir");
        add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 50, 130, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Listado de provedores");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 206, -1));

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        add(btnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 120, 40));

        txtBusqueda.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtBusqueda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBusquedaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBusquedaFocusLost(evt);
            }
        });
        txtBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusquedaActionPerformed(evt);
            }
        });
        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyTyped(evt);
            }
        });
        add(txtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 142, -1));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jLabel4.setText("jLabel4");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        ProvedoresStore proveedores = new ProvedoresStore();
        proveedores.setVisible(true);
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void tblMostrarProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMostrarProveedoresMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblMostrarProveedoresMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
       EditarProvedor editarProvedor = new EditarProvedor();       
        int fila = tblMostrarProveedores.getSelectedRow();  
        
        if (fila>=0){
        
        editarProvedor.txt_nombre.setText(tblMostrarProveedores.getValueAt(fila, 1).toString());
        editarProvedor.txt_empresa.setText(tblMostrarProveedores.getValueAt(fila, 2).toString());
        editarProvedor.fmt_rtn.setText(tblMostrarProveedores.getValueAt(fila, 3).toString());
        editarProvedor.fmt_telefono.setText(tblMostrarProveedores.getValueAt(fila, 4).toString());
        editarProvedor.txta_direccion.setText(tblMostrarProveedores.getValueAt(fila, 5).toString());
       //ediFormProv.tfI.setText(tblMostrarProveedores.getValueAt(fila, 0).toString());
       editarProvedor.setVisible(true);
        } else {
        JOptionPane.showMessageDialog(null,  " no hay fila");
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyTyped
        
    }//GEN-LAST:event_txtBusquedaKeyTyped

    private void txtBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusquedaActionPerformed

    private void txtBusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyReleased
        String textoBusqueda = txtBusqueda.getText();
        String placeholder = "Buscar por nombre";
        Controlador.Proveedores.MostrarProvedores(textoBusqueda);
    
    }//GEN-LAST:event_txtBusquedaKeyReleased

    private void txtBusquedaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBusquedaFocusGained
        
       
    }//GEN-LAST:event_txtBusquedaFocusGained

    private void txtBusquedaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBusquedaFocusLost
        // TODO add your handling code here:
        JTextField texField = (JTextField) evt.getSource();
        String placeholder = "Bucar por nombre";
        
        if(texField.getText().isEmpty()){
            texField.setText(placeholder);
            texField.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtBusquedaFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tblMostrarProveedores;
    public static javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
