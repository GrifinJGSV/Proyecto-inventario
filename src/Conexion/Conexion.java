/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Josue
 */
    public class Conexion {
      public static Connection conection = null;
    public Connection getConexion() {
		try {
			
		//Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                      conection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/inventarioalcaldia", "root", "nicol2022");
                      return conection;
                        
                    } 
                       catch (SQLException ex) {
			return null;
			
		}

	}

    
}
