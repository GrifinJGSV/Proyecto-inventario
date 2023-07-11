/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConsultasSQL;

/**
 *
 * @author Josue
 */
public class QuerysEmpleados {
     private int id;
    private String nombre;
    private String apellido;
    private String identidad;
    private String telefono;
    private String nombreEmergencia;
    private String telefonoemergencia;
    private String direccion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombreEmergencia() {
        return nombreEmergencia;
    }

    public void setNombreEmergencia(String nombreEmergencia) {
        this.nombreEmergencia = nombreEmergencia;
    }

    public String getTelefonoemergencia() {
        return telefonoemergencia;
    }

    public void setTelefonoemergencia(String telefonoEmergencia) {
        this.telefonoemergencia = telefonoEmergencia;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
   
     public static String RegistraEmpleado = "INSERT INTO empleados("
            +"nombre,"+"apellido,"+"identidad,"+"telefono,"+"nombreEmergencia,"+"telefonoemergencia,"+"direccion)"
            +"VALUES(?,?,?,?,?,?,?)";
    
}
