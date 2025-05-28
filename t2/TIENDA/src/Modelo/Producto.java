package Modelo;

public class Producto {
	private String idProducto;
    private String nombre;
    private int stock;
    private double precio;
	
	public Producto(String idProducto, String nombre, int stock, double precio) {
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.stock = stock;
		this.precio = precio;
	}
	
	public String getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public String toString() {
        return idProducto + " - " + nombre + " - $" + precio + " - Stock: " + stock;
    }
}
