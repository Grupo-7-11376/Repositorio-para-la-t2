package Modelo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Almacen {
	
	private Map<String, Producto> productos;

    public Almacen() {
        productos = new HashMap<>();
    }
    
    public void agregarProducto(Producto nuevo) {
        if (productos.containsKey(nuevo.getIdProducto())) {
            Producto existente = productos.get(nuevo.getIdProducto());
            existente.setStock(existente.getStock() + nuevo.getStock());
        } else {
            productos.put(nuevo.getIdProducto(), nuevo);
        }
    }
    
    public Producto buscarProducto(String id) {
        return productos.get(id);
    }

    public Collection<Producto> getTodosLosProductos() {
        return productos.values();
    }
}
