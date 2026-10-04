package entidades;

import java.util.ArrayList;

public class Cliente {

    // Atributos
    private String id;
    private String nombre;
    private String correo;
    private String telefono;
    private ArrayList<Venta> compras;

    // Constructor
    public Cliente(String id, String nombre, String correo, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.compras = new ArrayList<>();
    }

    // Getters y Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Venta> getCompras() {
        return compras;
    }

    public void setCompras(ArrayList<Venta> compras) {
        this.compras = compras;
    }

    // Agrega una venta al historial de compras del cliente
    public void agregarCompra(Venta venta) {
        compras.add(venta);
    }

    // Muestra la información del cliente
    @Override
    public String toString() {
        return "Cliente{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", cantidadCompras=" + compras.size() +
                '}';
    }
}