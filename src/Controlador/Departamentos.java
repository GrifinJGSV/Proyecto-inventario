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
import Vistas.MostrarDepartamentos;
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
    
    public static void MostrarDepartamentos(String buscar){
        DefaultTableModel model = (DefaultTableModel)MostrarDepartamentos.tblMostrarDepartamentos.getModel();
        while (model.getRowCount() > 0 ){
                model.removeRow(0);
                MostrarDepartamentos.tblMostrarDepartamentos.getColumnModel().getColumn(4).setMaxWidth(0);
                MostrarDepartamentos.tblMostrarDepartamentos.getColumnModel().getColumn(4).setMinWidth(0);
                MostrarDepartamentos.tblMostrarDepartamentos.getTableHeader().getColumnModel().getColumn(4).setMaxWidth(0);
                MostrarDepartamentos.tblMostrarDepartamentos.getTableHeader().getColumnModel().getColumn(4).setMinWidth(0);
    }
    
            
            String sql = "";
            if(buscar.equals("")){
                sql = QuerysDepartamentos.LISTARDEPARTAMENTOS;
                
            }
            if (buscar == null){
                 sql = QuerysDepartamentos.LISTARDEPARTAMENTOS;
            } else {
                sql = "select * from departamentos  WHERE nombreDepartamento like '%"+buscar+"%' or "
                + "prefijo like '%"+buscar+"%'";
                //"SELECT * FROM departamentos p WHERE UPPER(p.nombreDepartamento) LIKE UPPER('%" + buscar + "%')"
            }
            
        
        String datos[] = new String[5];
        
        try{
        
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
           
            int count = 1;
            while(rs.next()){
                datos[0] = count+"";
                datos[1] = rs.getString("nombreDepartamento");
                datos[2] = rs.getString("prefijo");
                datos[3] = rs.getString("ubicacion");
                datos[4] = rs.getString( "Id");
                model.addRow(datos);
                
                DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
                tcr.setHorizontalAlignment(SwingConstants.RIGHT);
                MostrarDepartamentos.tblMostrarDepartamentos.setModel(model);
                //MostrarDepartamentos.tblMostrarDepartamentos.getColumnModel().getColumn(4).setCellRenderer(tcr);
                count++;
              
                
            }
           // MOSTRARCARGO.tblCa.setModel(modelo);//la tabla se actualiza. HacerCalculos(r);
        }catch (SQLException ex){
            Logger.getLogger(Departamentos.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
    }
    
    
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
