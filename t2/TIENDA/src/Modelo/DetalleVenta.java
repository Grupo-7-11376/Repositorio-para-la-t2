package Modelo;

public class DetalleVenta {
	private String idDetalle;
    private Venta venta;
    private Producto producto;
    private int cantidad;
    
    public DetalleVenta(String idDetalle, Producto producto, int cantidad) {
		this.idDetalle = idDetalle;
		this.producto = producto;
		this.cantidad = cantidad;
	}
	public String getIdDetalle() { return idDetalle; }
    public Producto getProducto() { return producto; }
    public int getCantidad() { return cantidad; }

    public double calcularSubtotal() {
        return producto.getPrecio() * cantidad;
    }
    public String toString() {
        return idDetalle + " - Producto: " + producto.getNombre() + " - Cant: " + cantidad + " - Subtotal: $" + calcularSubtotal();
    }
	public Double calcularImporte() {
		return producto.getPrecio() * cantidad;
	
	}
}
