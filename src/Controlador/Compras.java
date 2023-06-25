/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Conexion.Conexion;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import ConsultasSQL.QuerysCompras;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.table.DefaultTableModel;
import Vistas.MostrarCompras;
import java.sql.SQLException;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

//Dentro del metodo publico se realiza la conexion a la base de datos para las compras
public class Compras {
    private static Conexion con = new Conexion();
    private static Connection conexion = con.getConexion();
    private static PreparedStatement ps = null;
    
    
    public static void MostrarCompras(String buscar){
        DefaultTableModel model = (DefaultTableModel)MostrarCompras.tblMostrarCompras.getModel();
        
        while(model.getRowCount() > 0 ){
            model.removeRow(0);
        }
        
        String sql = "";
            if(buscar.equals("")){
                sql = QuerysCompras.LISTARCOMPRAS;        
        }
        
        String datos[] = new String[8];
        
        try{
        
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                datos[0] = rs.getString("id");
                datos[1] = rs.getString("numeroDocumento");
                datos[2] = rs.getString("rtn");
                datos[3] = rs.getString("CAI");
                datos[4] = rs.getString("tipoCompra");
                datos[5] = rs.getString("fk_proveedor");
                datos[6] = rs.getString("fecha");
                datos[7] = rs.getString("total");
                model.addRow(datos);
                DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
                tcr.setHorizontalAlignment(SwingConstants.RIGHT);
                MostrarCompras.tblMostrarCompras.setModel(model);
                //MostrarProveedores.tblMostrarProveedores.getColumnModel().getColumn(4).setCellRenderer(tcr);
                
                
            }
           // MOSTRARCARGO.tblCa.setModel(modelo);//la tabla se actualiza. HacerCalculos(r);
        }catch (SQLException ex){
            Logger.getLogger(Compras.class.getName()).log(Level.SEVERE, null, ex);
            
        }
            
    }
}
