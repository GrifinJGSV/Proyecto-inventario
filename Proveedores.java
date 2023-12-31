/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Conexion.Conexion;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import ConsultasSQL.QuerysProveedores;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import Vistas.MostrarProveedores;
import java.sql.SQLException;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
/**
 *
 * @author Josue
 */
public class Proveedores {
    
    private static Conexion con = new Conexion();
    private static Connection conexion = con.getConexion();
    private static PreparedStatement ps = null;
    
    public static void MostrarProvedores(String buscar){
        DefaultTableModel model = (DefaultTableModel)MostrarProveedores.tblMostrarProveedores.getModel();
        while(model.getRowCount() > 0 ){
                model.removeRow(0);
                
                MostrarProveedores.tblMostrarProveedores.getColumnModel().getColumn(0).setMaxWidth(0);
                MostrarProveedores.tblMostrarProveedores.getColumnModel().getColumn(0).setMinWidth(0);
               MostrarProveedores.tblMostrarProveedores.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
                 MostrarProveedores.tblMostrarProveedores.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
            }
            
            String sql = "";
            if(buscar.equals("")){
                sql = QuerysProveedores.LISTARPROVEEDORES;
                
            } 
            
        // es 6 por el numero de columnas que exite en la tabla
        String datos[] = new String[6];
        
        try{
        
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
           
            // este es para listar los proveedores que hace referencia a la base de datos
            while(rs.next()){
                datos[0] = rs.getString("id");
                datos[1] = rs.getString("nombre");
                datos[2] = rs.getString("empresa");
                datos[3] = rs.getString("rtn");
                datos[4] = rs.getString("telefono");
                datos[5] = rs.getString("direccion");
                model.addRow(datos);
                DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
                tcr.setHorizontalAlignment(SwingConstants.RIGHT);
                MostrarProveedores.tblMostrarProveedores.setModel(model);
                
                //MostrarProveedores.tblMostrarProveedores.getColumnModel().getColumn(4).setCellRenderer(tcr);
                
                
                
            }
           // MOSTRARCARGO.tblCa.setModel(modelo);//la tabla se actualiza. HacerCalculos(r);
        }catch (SQLException ex){
            Logger.getLogger(Proveedores.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
    }
    
    public static boolean Guardar(QuerysProveedores qp){
        String sql = QuerysProveedores.RegistraProveedor;
        
        try{
        ps = conexion.prepareStatement(sql);
        ps.setString(1, qp.getNombre());
        ps.setString(2, qp.getEmpresa());
        ps.setString(3, qp.getRtn());
        ps.setString(4, qp.getTelefono());
        ps.setString(5, qp.getDireccion());
        
        
        ps.executeUpdate();
        return true;
        } catch (SQLException ex){
            return false;
//            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    public static boolean Editar(QuerysProveedores qp) {
    String sql = QuerysProveedores.ModificarProveedor; // Obtener la consulta SQL para modificar un desde QuerysProductos

        try {
            ps = conexion.prepareStatement(sql); // Preparar la sentencia SQL
            
            ps.setString(1, qp.getNombre()); 
            ps.setString(2, qp.getEmpresa()); 
            ps.setString(3, qp.getRtn()); 
            ps.setString(4, qp.getTelefono()); 
            ps.setString(5,qp.getDireccion());
            ps.setInt(6,qp.getId());//   se agrego aqui tembien                            Establecer id en la consulta  

            ps.executeUpdate(); // Ejecutar la consulta de inserción en la base de datos* actualiza la información de la base de datos
            return true; // Indicar que el guardado fue exitoso
        } catch (SQLException ex) {
            return false; // Indicar que ocurrió un error durante el guardado
//         Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
