/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Conexion.Conexion;
import ConsultasSQL.QuerysEmpleados;
import ConsultasSQL.QuerysProductos;
import Vistas.MostrarEmpleados;
import Vistas.MostrarProductos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Josue
 */
public class Empleados {
    private static Conexion con = new Conexion();
    private static Connection conexion = con.getConexion();
    private static PreparedStatement ps = null;
    
   
    public static void MostrarEmpleados(String buscar){
        DefaultTableModel model = (DefaultTableModel)MostrarEmpleados.tblMostrarEmpleados.getModel();
        while (model.getRowCount() > 0 ){
                model.removeRow(0);
                MostrarEmpleados.tblMostrarEmpleados.getColumnModel().getColumn(0).setMaxWidth(0);
                MostrarEmpleados.tblMostrarEmpleados.getColumnModel().getColumn(0).setMinWidth(0);
                MostrarEmpleados.tblMostrarEmpleados.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
                MostrarEmpleados.tblMostrarEmpleados.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
    }
    
    
            String sql = "";
            if(buscar.equals("")){
                sql = QuerysEmpleados.LISTAREMPLEADOS;
                
            } else {
                sql = "select * from empleados  WHERE estado = 'Activo' and nombre like '%"+buscar+"%' or "
                + "apellido like '%"+buscar+"%'";
                //"SELECT * FROM empleados p WHERE UPPER(p.nombreEmpleados) LIKE UPPER('%" + buscar + "%')"
            }
            
        
        String datos[] = new String[9];
        
        try{
        
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
           
            int count = 1;
            while(rs.next()){
                //datos[0] = count+"";
                datos[0] = rs.getString( "id");
                datos[1] = rs.getString("nombre");
                datos[2] = rs.getString("apellido");
                datos[3] = rs.getString("identidad");
                datos[4] = rs.getString("telefono");
                datos[5] = rs.getString("nombreEmergencia");
                datos[6] = rs.getString("telefonoemergencia");
                datos[7] = rs.getString("direccion");
                datos[8] = rs.getString("estado");
                model.addRow(datos);
                
                DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
                tcr.setHorizontalAlignment(SwingConstants.RIGHT);
                MostrarEmpleados.tblMostrarEmpleados.setModel(model);
                //MostrarEmpleados.tblMostrarEmpleados.getColumnModel().getColumn(4).setCellRenderer(tcr);
                count++;
              
                
            }
           // MOSTRARCARGO.tblCa.setModel(modelo);//la tabla se actualiza. HacerCalculos(r);
        }catch (SQLException ex){
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
    }
    
    public static boolean ValidarTelefon(String buscar){
            String sql = ""; 
            sql = "SELECT * FROM empleados WHERE telefono=?";
        
        try{
             Statement st = conexion.createStatement();
            
            ps = conexion.prepareStatement(sql);
            ps.setString(1, buscar);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        }catch (SQLException ex){
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
    
    public static boolean ValidarIdentidad(String buscar){
            String sql = ""; 
            sql = "SELECT * FROM empleados WHERE identidad=?";
        
        try{
             Statement st = conexion.createStatement();
            
            ps = conexion.prepareStatement(sql);
            ps.setString(1, buscar);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        }catch (SQLException ex){
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
        
 
    public static boolean Guardar(QuerysEmpleados qp){
        String sql = QuerysEmpleados.RegistraEmpleado;
        
        try{
        ps = conexion.prepareStatement(sql);
        ps.setString(1, qp.getNombre());
        ps.setString(2, qp.getApellido());
        ps.setString(3, qp.getIdentidad());
        ps.setString(4, qp.getTelefono());
        ps.setString(5, qp.getNombreEmergencia());
        ps.setString(6, qp.getTelefonoemergencia());
        ps.setString(7, qp.getEstado());
        ps.setString(8, qp.getDireccion());
        
        
        ps.executeUpdate();
        return true;
        } catch (SQLException ex){
            return false;
//            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
           
        
    
    
}
