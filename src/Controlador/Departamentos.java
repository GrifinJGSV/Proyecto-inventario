/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Conexion.Conexion;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import ConsultasSQL.QuerysDepartamentos;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Andrea
 */
public class Departamentos {
    //establecer la conexión con la base de datos
    private static Conexion con = new Conexion();
    private static Connection conexion = con.getConexion();
    private static PreparedStatement ps = null;
    
    //guardar departamento
    public static boolean Guardar(QuerysDepartamentos qp){
        String sql = QuerysDepartamentos.RegistraDepartamento;
        
        try{
            ps = conexion.prepareStatement(sql);
            ps.setString(1,qp.getNombreDepartamento());
            ps.setString(2,qp.getPrefijo());
            ps.setString(3,qp.getUbicacion());
            
            ps.executeUpdate(); // Ejecutar la consulta de inserción en la base de datos
            return true;
        } catch (SQLException ex) {
            return false; // Indicar que ocurrió un error durante el guardado
//            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
