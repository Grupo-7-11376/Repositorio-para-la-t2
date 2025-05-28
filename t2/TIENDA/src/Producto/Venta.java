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

    // Método para agregar productos verificando stock
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

    // Método alternativo (usamos este)
    public void registrarDetalleVenta(Producto producto, int cantidad) {
    	if (producto.getStock() >= cantidad) {
            producto.setStock(producto.getStock() - cantidad); // reducir stock
            detalles.add(new DetalleVenta(producto, cantidad));
        } else {
            System.out.println("Stock insuficiente para el producto: " + producto.getNombre());
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (DetalleVenta detalle : detalles) {
            total += detalle.calcularImporte();
        }
        return total;
    }

    public String toString() {
        return "Venta ID: " + idVenta + ", Cliente: " + cliente.getNombres() + ", Fecha: " + fecha;
    }

    public ArrayList<DetalleVenta> getDetalles() {
        return detalles;
    }
}