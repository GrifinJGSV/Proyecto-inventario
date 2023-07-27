/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Conexion.Conexion;
import ConsultasSQL.QuerysEquipoDeOficina;
import Vistas.MostrarEquipoDeOficina;
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
 * @author carlo
 */
public class EquipoDeOficina {
       //establecer la conexión con la base de datos
        private static Conexion con = new Conexion();
        private static Connection conexion = con.getConexion();
        private static PreparedStatement ps = null; 
        
          public static void MostrarEquipoDeOficina(String buscar){
        DefaultTableModel model = (DefaultTableModel)MostrarEquipoDeOficina.tblMostrarEquipoDeOficina.getModel();
        while (model.getRowCount() > 0 ){
                model.removeRow(0);
                MostrarEquipoDeOficina.tblMostrarEquipoDeOficina.getColumnModel().getColumn(4).setMaxWidth(0);
                MostrarEquipoDeOficina.tblMostrarEquipoDeOficina.getColumnModel().getColumn(4).setMinWidth(0);
                MostrarEquipoDeOficina.tblMostrarEquipoDeOficina.getTableHeader().getColumnModel().getColumn(4).setMaxWidth(0);
                MostrarEquipoDeOficina.tblMostrarEquipoDeOficina.getTableHeader().getColumnModel().getColumn(4).setMinWidth(0);
    }
    
            
            String sql = "";
            if(buscar.equals("")){
                sql = QuerysEquipoDeOficina.ListarEquipoDeOficina;
                
            }
            if (buscar == null){
                 sql = QuerysEquipoDeOficina.ListarEquipoDeOficina;
            } else {
                sql = "SELECT * FROM equipo_de_oficina WHERE nombre LIKE ('%" + buscar + "%')";
                
            }
            
        
        String datos[] = new String[12];
        
        try{
        
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
           
            int count = 1;
            while(rs.next()){
                datos[0] = count+"";
                datos[1] = rs.getString("nombre");
                datos[2] = rs.getString("estado");
                datos[3] = rs.getString("ubicacion");
                datos[4] = rs.getString( "fecha");
                datos[5] = rs.getString("fondo");
                datos[6] = rs.getString("n_cheque");
                datos[7] = rs.getString("provedor");
                datos[8] = rs.getString( "cantidad");
                datos[9] = rs.getString("valor");
                datos[10] = rs.getString("n_inventario");
                datos[11] = rs.getString( "Id");
                model.addRow(datos);
                
                DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
                tcr.setHorizontalAlignment(SwingConstants.RIGHT);
                MostrarEquipoDeOficina.tblMostrarEquipoDeOficina.setModel(model);
                //MostrarDepartamentos.tblMostrarDepartamentos.getColumnModel().getColumn(4).setCellRenderer(tcr);
                count++;
              
                
            }
           // MOSTRARCARGO.tblCa.setModel(modelo);//la tabla se actualiza. HacerCalculos(r);
        }catch (SQLException ex){
            Logger.getLogger(Departamentos.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
    }
  
}
