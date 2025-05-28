package Producto;

public class Producto {
	private int idProducto;
	private String nombre;
	private int cantidad;
	private double precio;
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Producto(int idProducto, String nombre, int cantidad, double precio) {
	
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	public int getStock() {
        return stock;
    }
	public void reducirStock(int cantidad) {
        if(cantidad <= stock) {
            stock -= cantidad;
        } else {
            System.out.println("No hay suficiente stock para la venta.");
        }
}
