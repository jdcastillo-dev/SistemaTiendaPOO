package logica;

import entidades.Producto;
import java.util.ArrayList;
import entidades.Cliente;
import entidades.Venta;


public class Tienda {

    // Atributos
    private String nombre;
    private ArrayList<Producto> productos;
    private ArrayList<Cliente> clientes;
    private ArrayList<Venta> ventas;

    // Metodos
    // Constructor
    public Tienda(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.ventas = new ArrayList<>();
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void setVentas(ArrayList<Venta> ventas) {
        this.ventas = ventas;
    }

    // Agrega un producto
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Agrega un cliente
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    // Agrega una venta
    public void agregarVenta(Venta venta) {
        ventas.add(venta);
    }

    // Muestra los productos
    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    // Muestra los clientes
    public void mostrarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    // Muestra las ventas
    public void mostrarVentas() {
        for (Venta venta : ventas) {
            System.out.println(venta);
        }
    }

    // toString()
    @Override
    public String toString() {
        return "Tienda{" +
                "nombre='" + nombre + '\'' +
                ", cantidadProductos=" + productos.size() +
                ", cantidadClientes=" + clientes.size() +
                ", cantidadVentas=" + ventas.size() +
                '}';
    }
}
