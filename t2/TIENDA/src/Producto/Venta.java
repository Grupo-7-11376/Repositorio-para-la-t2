package Producto;

import java.util.ArrayList;
import java.util.Date;

public class Venta {
	private int idVenta;
    private Cliente cliente;
    private Date fecha;
    private ArrayList<DetalleVenta> detalles;

    // Constructor
    public Venta(int idVenta, Cliente cliente) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.fecha = new Date();
        this.detalles = new ArrayList<>();
    }

 // Métodos para agregar productos
    public boolean agregarDetalle(Producto producto, int cantidad) {
        if (producto.getCantidad() < cantidad) {
            System.out.println("Producto sin stock suficiente: " + producto.getNombre());
            return false;
        } else {
            producto.setCantidad(producto.getCantidad() - cantidad);
            detalles.add(new DetalleVenta(producto, cantidad));
            return true;
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (DetalleVenta detalle : detalles) {
            total += detalle.calcularImporte();
        }
        return total;
    }
}
