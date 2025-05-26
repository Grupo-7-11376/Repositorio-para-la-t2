package TiendaPeluches;

public class Empleado {
private String Nombre;
private String Apellido;
private String Cargo;


public Empleado(String nombre, String apellido, String cargo) {
	
	Nombre = nombre;
	Apellido = apellido;
	Cargo = cargo;
}


public  String ObtenerEmpleado()
{
	return "-Nombre"+Nombre+"-Apellido"+Apellido+"-Cargo"+Cargo;
}
}
