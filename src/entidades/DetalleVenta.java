package entidades;

public class DetalleVenta {

    // Atributos
    private Producto producto;
    private int cantidad;
    private double subtotal;

    // Metodos
    // Constructor
    public DetalleVenta(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.subtotal = producto.getPrecio() * cantidad;
    }

    // Getters
    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    // Setters
    public void setProducto(Producto producto) {
        this.producto = producto;
        this.subtotal = producto.getPrecio() * cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        this.subtotal = producto.getPrecio() * cantidad;
    }

    // toString()
    @Override
    public String toString() {
        return "DetalleVenta{" +
                "producto=" + producto +
                ", cantidad=" + cantidad +
                ", subtotal=" + subtotal +
                '}';
    }
}
