package app;

import entidades.Producto;
import entidades.DetalleVenta;
import logica.Tienda;
import entidades.Cliente;
import entidades.Venta;
import java.time.LocalDate;

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


// Crear cliente
        Cliente cliente1 = new Cliente(
                "C001",
                "Mario",
                "mario@email.com",
                "8888-8888"
        );

        tienda.agregarCliente(cliente1);


// Crear venta asociada al cliente
        Venta venta1 = new Venta(
                "V001",
                LocalDate.now(),
                cliente1
        );


// Agregar el detalle que ya había sido creado
        venta1.agregarDetalle(detalle);


// Crear otro detalle para probar varios productos
        DetalleVenta detalle2 = new DetalleVenta(producto2, 1);

        venta1.agregarDetalle(detalle2);


// Agregar la venta al historial del cliente
        cliente1.agregarCompra(venta1);


// Registrar la venta en la tienda
        tienda.agregarVenta(venta1);


// Mostrar clientes
        System.out.println("\n=== CLIENTES ===");
        tienda.mostrarClientes();


// Mostrar ventas
        System.out.println("\n=== VENTAS ===");
        tienda.mostrarVentas();
    }


}
