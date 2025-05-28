package Modelo;

import java.util.ArrayList;
import java.util.Date;

public class Venta {
	private String idVenta;
    private Cliente cliente;
    private Date fecha;
    private ArrayList<DetalleVenta> detalles;
    public Venta(String idVenta, Cliente cliente, Date fecha) {
        this.idVenta = idVenta;
        this.cliente = cliente;
        this.fecha = fecha;
    }

    public Venta(int idVenta2, Cliente cliente2) {
    	this.idVenta = idVenta;
        this.cliente = cliente;
        this.fecha = fecha;
	}

	public String getIdVenta() { return idVenta; }
    public Cliente getCliente() { return cliente; }
    public Date getFecha() { return fecha; }
    public String toString() {
        return idVenta + " - Cliente: " + cliente.getNombre() + " - Fecha: " + fecha;
    }

    public void registrarDetalleVenta(Producto producto, int cantidad) {
        if (producto.getStock() >= cantidad) {
            producto.setStock(producto.getStock() - cantidad); // reducir stock
            detalles.add(new DetalleVenta(idVenta, producto, cantidad));
        } else {
            System.out.println("Stock insuficiente para el producto: " + producto.getNombre());
        }
       
    }

    public ArrayList<DetalleVenta> getDetalles() {
        return detalles;
    }

	public Double calcularTotal() {
		Double total = 0.0;
	    for (DetalleVenta detalle : detalles) {
	        total += detalle.calcularImporte();
	    }
	    return total;
		
	}
}
