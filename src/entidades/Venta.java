package entidades;

import java.time.LocalDate;
import java.util.ArrayList;

public class Venta {

    // Atributos
    private String id;
    private LocalDate fecha;
    private Cliente cliente;
    private ArrayList<DetalleVenta> detalles;
    private double total;

    // Constructor
    public Venta(String id, LocalDate fecha, Cliente cliente) {
        this.id = id;
        this.fecha = fecha;
        this.cliente = cliente;
        this.detalles = new ArrayList<>();
        this.total = 0.0;
    }

    // Getters
    public String getId() {
        return id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<DetalleVenta> getDetalles() {
        return detalles;
    }

    public double getTotal() {
        calcularTotal();
        return total;
    }

    // Setters
    public void setId(String id) {
        this.id = id;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setDetalles(ArrayList<DetalleVenta> detalles) {
        this.detalles = detalles;
        calcularTotal();
    }

    // Agrega un detalle a la venta
    public void agregarDetalle(DetalleVenta detalle) {
        detalles.add(detalle);
        calcularTotal();
    }

    // Calcula automáticamente el total de la venta
    public void calcularTotal() {
        total = 0.0;

        for (DetalleVenta detalle : detalles) {
            total += detalle.getSubtotal();
        }
    }

    // toString()
    @Override
    public String toString() {
        calcularTotal();

        return "Venta{" +
                "id='" + id + '\'' +
                ", fecha=" + fecha +
                ", cliente=" + cliente.getNombre() +
                ", detalles=" + detalles +
                ", total=" + total +
                '}';
    }
}
