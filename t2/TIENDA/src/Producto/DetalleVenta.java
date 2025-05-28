package Producto;

public class DetalleVenta {
	  private Producto producto;
	    private int cantidadVendida;

	    public class DetalleVenta {
	        private Producto producto;
	        private int cantidad;

	        public DetalleVenta(Producto producto, int cantidad) {
	            this.producto = producto;
	            this.cantidad = cantidad;
	        }
	        
	        
		public Producto getProducto() {
			return producto;
		}


		public void setProducto(Producto producto) {
			this.producto = producto;
		}


		public int getCantidadVendida() {
			return cantidadVendida;
		}
		
		

		    public double calcularImporte() {
		        return producto.getPrecio() * cantidad;
		    }

		    // Getters si los necesitas
		    public Producto getProducto() {
		        return producto;
		    }

		    public int getCantidad() {
		        return cantidad;
		    }


		public void setCantidadVendida(int cantidadVendida) {
			this.cantidadVendida = cantidadVendida;
		}

		public void registrarDetalleVenta(Producto producto, int cantidad) {
		    if (producto.getStock() >= cantidad) {
		        producto.setStock(producto.getStock() - cantidad); // reducir stock
		        detalles.add(new DetalleVenta(producto, cantidad));
		    } else {
		        System.out.println("Stock insuficiente para el producto: " + producto.getNombre());
		    }
		}
		


		// Constructor, getters y setters
	    public double calcularImporte() {
	        return producto.getPrecio() * cantidadVendida;
	    }
}
