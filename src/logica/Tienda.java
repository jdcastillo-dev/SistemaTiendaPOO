package logica;

import entidades.Producto;
import java.util.ArrayList;

public class Tienda {

    // Atributos
    private String nombre;
    private ArrayList<Producto> productos;

    // Metodos
    // Constructor
    public Tienda(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    // Agrega un producto
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Muestra los productos
    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
