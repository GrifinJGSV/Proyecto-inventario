/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConsultasSQL;

/**
 *
 * @author Andrea
 */
public class QuerysProductos {
    private int id;
    private String nombreProducto;
    private String tipoInventario;
    private Double precio; 
    
     // Métodos getter y setter para el campo "id"
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Métodos getter y setter para el campo "nombreProducto"
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    // Métodos getter y setter para el campo "tipoInventario"
    public String getTipoInventario() {
        return tipoInventario;
    }

    public void setTipoInventario(String tipoInventario) {
        this.tipoInventario = tipoInventario;
    }

    // Métodos getter y setter para el campo "precio"
    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    // Consulta SQL para registrar un producto en la base de datos
    public static String RegistraProducto = "INSERT INTO productos("
            + "nombreProducto," + "tipoInventario," + "precio)"
            + "VALUES(?,?,?)";

    // Consulta SQL para listar todos los productos de la base de datos
    public static String LISTARPRODUCTOS = "SELECT * FROM productos";
    
    // Consulta SQL para actualizar un producto en la base de datos
    public static String ACTUALIZARPRODUCTO = "UPDATE productos SET nombreProducto = ?,"
            + " tipoInventario = ?, precio = ? WHERE id = ?";
}


