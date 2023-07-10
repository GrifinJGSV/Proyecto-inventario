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
        String[] titulos = {"<html><b>Num.Factura</b></html>","<html><b>RTN</b></html>","<html><b>CAI</b></html>",
            "<html><b>Tipo de compra</b></html>","<html><b>Fecha</b></html>","<html><b>Total</b></html>"};
        DefaultTableModel model = new DefaultTableModel(null,titulos);
        
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
                
                datos[0] = rs.getString("numeroDocumento");
                datos[1] = rs.getString("rtn");
                datos[2] = rs.getString("cai");
                datos[3] = rs.getString("tipoCompra");
                //datos[4] = rs.getString("fk_proveedor");
                datos[4] = rs.getString("fecha");
                datos[5] = rs.getString("total");
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

    public static Object getItemAt(int selectedIndex) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

}
