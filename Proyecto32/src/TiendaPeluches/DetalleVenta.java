package TiendaPeluches;

import java.util.ArrayList;
import java.util.List;

public class DetalleVenta {
private int CantidadVendida;
private static  List<Empleado>empleados;
public DetalleVenta(int cantidadVendida, List<Empleado> empleados) {
	CantidadVendida = cantidadVendida;
	this.empleados = new ArrayList<>();
}

public static  void AgregarVenta(Empleado empleado)
{
	empleados.add(empleado);
}

public static  List<Empleado>ObtenerEmpleados()
{
	return empleados;
}

public String ObtenerCantidadVendida()
{
	return "-CantidadVentidad"+CantidadVendida+"" ;
}

}
