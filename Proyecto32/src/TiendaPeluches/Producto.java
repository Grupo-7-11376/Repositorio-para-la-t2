package TiendaPeluches;

public class Producto {

	private int codigo;
	private String nombre;
	private int cantidad;
	private double precio;
	public Producto(int codigo, String nombre, int cantidad, double precio) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	
	public String DatosProducto()
	{
		return "-Codigo"+codigo+"-Nombre"+nombre+"-Cantidad"+cantidad+"-Precio"+precio;
	}
	
}
