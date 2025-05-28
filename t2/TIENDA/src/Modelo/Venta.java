package Modelo;

import java.util.Date;

public class Venta {
	private String idVenta;
    private Cliente cliente;
    private Date fecha;
    public Venta(String idVenta, Cliente cliente, Date fecha) {
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
}
