package Producto;

public class DetalleVenta {
	  private Producto producto;
	    private int cantidadVendida;


		public Producto getProducto() {
			return producto;
		}


		public void setProducto(Producto producto) {
			this.producto = producto;
		}


		public int getCantidadVendida() {
			return cantidadVendida;
		}


		public void setCantidadVendida(int cantidadVendida) {
			this.cantidadVendida = cantidadVendida;
		}


		public DetalleVenta(Producto producto, int cantidadVendida) {
			
			this.producto = producto;
			this.cantidadVendida = cantidadVendida;
		}


		// Constructor, getters y setters
	    public double calcularImporte() {
	        return producto.getPrecio() * cantidadVendida;
	    }
}
