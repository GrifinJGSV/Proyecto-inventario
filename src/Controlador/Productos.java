/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Conexion.Conexion;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import ConsultasSQL.QuerysProductos;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import Vistas.MostrarProductos;
import java.sql.SQLException;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Andrea
 */
public class Productos {
    
    // Establecer la conexión a la base de datos
    private static Conexion con = new Conexion();
    private static Connection conexion = con.getConexion();
    private static PreparedStatement ps = null;

    /**
     
Guarda un producto en la base de datos.*
@param qp El objeto QuerysProductos que contiene la información del producto a guardar.
@return true si el producto se guarda exitosamente, false en caso contrario.*/
public static boolean Guardar(QuerysProductos qp) {
    String sql = QuerysProductos.RegistraProducto; // Obtener la consulta SQL para guardar un producto desde QuerysProductos

        try {
            ps = conexion.prepareStatement(sql); // Preparar la sentencia SQL
            ps.setString(1, qp.getNombreProducto()); // Establecer el nombre del producto en la consulta
            ps.setString(2, qp.getTipoInventario()); // Establecer el tipo de inventario en la consulta
            ps.setDouble(3, qp.getPrecio()); // Establecer el precio en la consulta

            ps.executeUpdate(); // Ejecutar la consulta de inserción en la base de datos
            return true; // Indicar que el guardado fue exitoso
        } catch (SQLException ex) {
            return false; // Indicar que ocurrió un error durante el guardado
//            Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
