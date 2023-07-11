/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Conexion.Conexion;
import ConsultasSQL.QuerysEmpleados;
import ConsultasSQL.QuerysProveedores;
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
    
      public static boolean ValidarTelefono(String buscar){
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
        ps.setString(7, qp.getDireccion());
        
        
        ps.executeUpdate();
        return true;
        } catch (SQLException ex){
            return false;
//            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
           
        
    
    
}
