package app;

import entidades.Producto;
import entidades.DetalleVenta;
import logica.Tienda;

public class Main {

    public static void main(String[] args) {

        Tienda tienda = new Tienda("Sistema Tienda POO");

        Producto producto1 = new Producto(
                1,
                "Audifonos JBL",
                35000,
                10,
                "Audio"
        );

        Producto producto2 = new Producto(
                2,
                "Teclado Logitech",
                25000,
                5,
                "Computacion"
        );

        tienda.agregarProducto(producto1);
        tienda.agregarProducto(producto2);

        System.out.println("=== PRODUCTOS ===");
        tienda.mostrarProductos();

        DetalleVenta detalle = new DetalleVenta(producto1,2);

        System.out.println("\n=== DETALLE DE VENTA ===");
        System.out.println(detalle);

    }


}
