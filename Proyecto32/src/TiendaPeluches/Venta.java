package TiendaPeluches;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venta {
private int idventa;
private LocalDate fecha;
private int Cantidad;
private String TipoEntrega;
private String Costo;
private static List<DetalleVenta>detalleventas;
public Venta(int idventa, LocalDate fecha, int cantidad, String tipoEntrega, String costo) {

	this.idventa = idventa;
	this.fecha = fecha;
	Cantidad = cantidad;
	TipoEntrega = tipoEntrega;
	Costo = costo;
	this.detalleventas = new ArrayList<>();	
}
public static List<DetalleVenta>ObtenerDetalleVenta()
{
  return detalleventas;
}

public void AgregarDetaLLeventa(DetalleVenta detalle)
{
  detalleventas.add(detalle);
}

public String MostrarVenta()
{
	return "-idVenta"+idventa+"-fecha"+fecha.now()+"-Cantidad"+Cantidad+"-Tipo de Entrega"+TipoEntrega+"-Costo"+Costo;
}




}
