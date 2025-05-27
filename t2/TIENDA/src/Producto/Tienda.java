package Producto;

import java.util.ArrayList;

public class Tienda {
    private ArrayList<Producto> productos;
    private ArrayList<Cliente> clientes;
    private ArrayList<Venta> ventas;

    public Tienda() {
        productos = new ArrayList<>();
        clientes = new ArrayList<>();
        ventas = new ArrayList<>();
    }

    public void registrarProducto(Producto p) {
        productos.add(p);
    }

    public void registrarCliente(Cliente c) {
        clientes.add(c);
    }
    
    

    public Producto buscarProductoPorNombre(String nombre) {
        for (Producto p : productos) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }

    public Cliente buscarClientePorId(int id) {
        for (Cliente c : clientes) {
            if (c.getIdCliente() == id) {
                return c;
            }
        }
        return null;
    }
}
