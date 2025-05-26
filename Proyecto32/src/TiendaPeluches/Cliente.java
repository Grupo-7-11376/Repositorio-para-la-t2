package TiendaPeluches;

import java.util.ArrayList;

import java.util.List;


public class Cliente {
private String idcliente;
private String Nombre;
private String Apellido;
private String Direccion;
private String Telefono;
private static List<Producto>productos;
public Cliente(String idcliente, String nombre, String apellido, String direccion, String telefono) {
	
	Nombre = nombre;
	Apellido = apellido;
	Direccion = direccion;
	Telefono = telefono;
	this.productos = new ArrayList<>();
}
public static void  AgregarProductos(Producto producto)
{		
	productos.add(producto);
}
public static  List<Producto>ObtenerProducto()
{
	return productos;
}

public String ObtenerCliente()
{
	return "-Nombre:" + Nombre + "-Apellido"+Apellido+"-Direccion"+Direccion+"-Telefono"+Telefono;
}

}
