/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Conexion {
    String bd=" analisis_y_diseño";
    String url = "jdbc:mysql://127.0.0.1:3306/";
    String usuario = "root";
    String pass = "";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection cx;


    public Conexion(String bd) {   
        this.bd = bd;
    }
    
    public Connection conectar(){
        try {
            Class.forName(driver);
            cx = DriverManager.getConnection(url+bd, usuario, pass);
            System.out.println("Se conecto a db "+bd);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("No se conecto a bd "+bd);
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cx;
    } 
    
    public void desconectar(){
        try {
            cx.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void main(String[] args){
        Conexion conexion = new Conexion(" analisis_y_diseño");
        conexion.conectar();
    }
}
