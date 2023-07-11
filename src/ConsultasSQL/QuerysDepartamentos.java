/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConsultasSQL;

/**
 *
 * @author Andrea
 */
public class QuerysDepartamentos {
    private int id;
    private String nombreDepartamento;
    private String prefijo;
    private String ubicacion;
    
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }
    
    public String getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
        
    }
    
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public String getUbicacion() {
        return ubicacion;
    }
    // Consulta SQL para registrar un departamento en la base de datos
    public static String RegistraDepartamento = "INSERT INTO departamentos("
            + "nombreDepartamento," + "prefijo," + "ubicacion)"
            + "VALUES(?,?,?)";
    
    // Consulta SQL para listar todos los productos de la base de datos
    public static String LISTARDEPARTAMENTOS = "SELECT * FROM departamento";
    
    public String Busqueda(String textBusqueda) {
        String query = "SELECT * FROM departamento p WHERE p.nombreDepartamento LIKE '%" + textBusqueda + "%'";
        return query;
    }
    
    // Consulta SQL para actualizar un producto en la base de datos
    public static String ACTUALIZARDEPARTAMENTOS = "UPDATE departamento SET nombreDepartamento = ?,"
            + " prefijo = ?, ubicacion = ? WHERE id = ?";
}
