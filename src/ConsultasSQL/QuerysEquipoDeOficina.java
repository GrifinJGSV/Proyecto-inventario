/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConsultasSQL;

/**
 *
 * @author carlo
 */
public class QuerysEquipoDeOficina {
    private int id;
    private String nombre;
    private String estado;
    private String ubicacion;
    private String fecha;
    private String fondo;
    private String n_cheque;
    private int provedor;
    private int cantidad;
    private int valor;
    private String n_inventario;

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
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }  
    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }  
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }  
    public String getFondo() {
        return fondo;
    }

    public void setFondo(String fondo) {
        this.fondo = fondo;
    }  
    public String getN_cheque() {
        return n_cheque;
    }

    public void setN_cheque(String n_cheque) {
        this.n_cheque = n_cheque;
    }  
    public int getProvedor() {
        return provedor;
    }

    public void setProvedor(int provedor) {
        this.provedor = provedor;
    }  
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }  
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }  
    public String getN_inventario() {
        return n_inventario;
    }

    public void setN_inventario(String n_inventario) {
        this.n_inventario = n_inventario;
    }  
    
    public static String ListarEquipoDeOficina = "SELECT * FROM equipo_de_oficina";
    
}
