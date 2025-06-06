package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Modelo.Almacen;
import Modelo.Cliente;
import Modelo.DetalleVenta;
import Modelo.Producto;
import Modelo.Venta;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.awt.event.ItemEvent;

public class Tienda extends JFrame implements ActionListener, ItemListener {

	private static final long serialVersionUID = 1L;
	private JPanel JPanel;
	private JTextField txtNombre;
	private JTextField txtCantidad;
	private JTextField txtPrecio;
	private JTextField txtIdDetalleVenta;
	private JTextField txtFecha;
	private JTextField txtApellido;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JTextField txtId_Venta;
	private JTextField txtNombreCliente;
	private JButton btnAñadir;
	private JComboBox cboPeluche;
	private JLabel lblImagen;
	private JTextArea txtS;
	private Almacen almacen = new Almacen();
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Venta> ventas = new ArrayList<>();
    private ArrayList<DetalleVenta> detalles = new ArrayList<>();
    private JButton btnStock;
    private JButton btnRegistrarVenta;
    private JLabel lblQueActividadDesea;
    private JComboBox cbActividad;
    private JButton btnMostrarVenta;
    private JButton btnBuscarProducto;
   
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tienda frame = new Tienda();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tienda() {
		setTitle("Tienda de Peluches");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 849, 734);
		JPanel = new JPanel();
		JPanel.setBackground(new Color(243, 225, 188));
		JPanel.setBorder(new EmptyBorder(5, 5, 5, 5));


		setContentPane(JPanel);
		JPanel.setLayout(null);
		
		JLabel lblProducto = new JLabel("Producto");
		lblProducto.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		lblProducto.setBounds(10, 85, 151, 26);
		JPanel.add(lblProducto);
		
		JLabel lblIdproducto = new JLabel("IdProducto");
		lblIdproducto.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		lblIdproducto.setBounds(10, 110, 151, 26);
		JPanel.add(lblIdproducto);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		lblNombre.setBounds(217, 110, 151, 26);
		JPanel.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setEditable(false);
		txtNombre.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		txtNombre.setColumns(10);
		txtNombre.setBounds(217, 145, 158, 31);
		JPanel.add(txtNombre);
		
		JLabel lblCantidad_1 = new JLabel("Cantidad");
		lblCantidad_1.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		lblCantidad_1.setBounds(397, 110, 151, 26);
		JPanel.add(lblCantidad_1);
		
		txtCantidad = new JTextField();
		txtCantidad.setEditable(false);
		txtCantidad.setFont(new Font("Javanese Text", Font.PLAIN, 10));
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(397, 146, 158, 31);
		JPanel.add(txtCantidad);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		lblPrecio.setBounds(573, 110, 120, 26);
		JPanel.add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setFont(new Font("Javanese Text", Font.PLAIN, 10));
		txtPrecio.setColumns(10);
		txtPrecio.setBounds(575, 146, 118, 31);
		JPanel.add(txtPrecio);
		
		JLabel lblIdcliente = new JLabel("IdDetalleVenta");
		lblIdcliente.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		lblIdcliente.setBounds(34, 394, 151, 26);
		JPanel.add(lblIdcliente);
		
		txtIdDetalleVenta = new JTextField();
		txtIdDetalleVenta.setEditable(false);
		txtIdDetalleVenta.setFont(new Font("Javanese Text", Font.PLAIN, 10));
		txtIdDetalleVenta.setColumns(10);
		txtIdDetalleVenta.setBounds(27, 443, 158, 31);
		JPanel.add(txtIdDetalleVenta);
		
		JLabel lblNombre_3 = new JLabel("Nombre");
		lblNombre_3.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		lblNombre_3.setBounds(202, 266, 151, 26);
		JPanel.add(lblNombre_3);
		
		txtFecha = new JTextField();
		txtFecha.setEditable(false);
		txtFecha.setFont(new Font("Javanese Text", Font.PLAIN, 10));
		txtFecha.setColumns(10);
		txtFecha.setBounds(195, 443, 158, 31);
		JPanel.add(txtFecha);
		
		JLabel lblNombre_4 = new JLabel("Apellido");
		lblNombre_4.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		lblNombre_4.setBounds(365, 253, 151, 26);
		JPanel.add(lblNombre_4);
		
		txtApellido = new JTextField();
		txtApellido.setEditable(false);
		txtApellido.setFont(new Font("Javanese Text", Font.PLAIN, 10));
		txtApellido.setColumns(10);
		txtApellido.setBounds(358, 302, 158, 31);
		JPanel.add(txtApellido);
		
		txtDireccion = new JTextField();
		txtDireccion.setEditable(false);
		txtDireccion.setFont(new Font("Javanese Text", Font.PLAIN, 10));
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(521, 302, 158, 31);
		JPanel.add(txtDireccion);
		
		JLabel lblNombre_1 = new JLabel("Direccion");
		lblNombre_1.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		lblNombre_1.setBounds(528, 253, 151, 26);
		JPanel.add(lblNombre_1);
		
		txtTelefono = new JTextField();
		txtTelefono.setEditable(false);
		txtTelefono.setFont(new Font("Javanese Text", Font.PLAIN, 10));
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(692, 302, 141, 31);
		JPanel.add(txtTelefono);
		
		JLabel lblNombre_2 = new JLabel("Telefono");
		lblNombre_2.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		lblNombre_2.setBounds(695, 253, 151, 26);
		JPanel.add(lblNombre_2);
		
		btnAñadir = new JButton("Añadir Stock");
		btnAñadir.addActionListener(this);
		btnAñadir.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		btnAñadir.setBounds(397, 352, 151, 39);
		JPanel.add(btnAñadir);
		
		txtS = new JTextArea();
		txtS.setBounds(27, 502, 754, 160);
		JPanel.add(txtS);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		lblCliente.setBounds(17, 202, 151, 26);
		JPanel.add(lblCliente);
		
		txtId_Venta = new JTextField();
		txtId_Venta.setEditable(false);
		txtId_Venta.setFont(new Font("Javanese Text", Font.PLAIN, 10));
		txtId_Venta.setColumns(10);
		txtId_Venta.setBounds(17, 302, 158, 31);
		JPanel.add(txtId_Venta);
		
		JLabel lblIdventa = new JLabel("Idcliente");
		lblIdventa.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		lblIdventa.setBounds(17, 266, 151, 26);
		JPanel.add(lblIdventa);
		
		JLabel lblCliente_1_1 = new JLabel("Fecha");
		lblCliente_1_1.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		lblCliente_1_1.setBounds(202, 394, 151, 26);
		JPanel.add(lblCliente_1_1);
		
		txtNombreCliente = new JTextField();
		txtNombreCliente.setEditable(false);
		txtNombreCliente.setFont(new Font("Javanese Text", Font.PLAIN, 10));
		txtNombreCliente.setColumns(10);
		txtNombreCliente.setBounds(188, 302, 158, 31);
		JPanel.add(txtNombreCliente);
		
		JLabel lblCliente_2 = new JLabel("Detalle Venta:");
		lblCliente_2.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		lblCliente_2.setBounds(34, 358, 151, 26);
		JPanel.add(lblCliente_2);
		
		JLabel lblTienda = new JLabel("TiendaPeluches");
		lblTienda.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		lblTienda.setBounds(278, 10, 151, 26);
		JPanel.add(lblTienda);
		
		lblImagen = new JLabel("New label");
		lblImagen.setIcon(new ImageIcon(Tienda.class.getResource("/Imagenes/eeve.jpg")));
		lblImagen.setBounds(712, 16, 113, 132);
		JPanel.add(lblImagen);
		
		btnStock = new JButton("Mostrar Stock");
		btnStock.addActionListener(this);
		btnStock.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		btnStock.setBounds(397, 404, 151, 39);
		JPanel.add(btnStock);
		{
			cboPeluche = new JComboBox();
			cboPeluche.addItemListener(this);
			cboPeluche.setModel(new DefaultComboBoxModel(new String[] {"100", "200", "300", "400", "500", "600", "700", "800", "900"}));
			cboPeluche.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			cboPeluche.setBounds(10, 144, 158, 32);
			JPanel.add(cboPeluche);
		}
		{
			btnRegistrarVenta = new JButton("Añadir Venta");
			btnRegistrarVenta.addActionListener(this);
			btnRegistrarVenta.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			btnRegistrarVenta.setBounds(557, 352, 151, 39);
			JPanel.add(btnRegistrarVenta);
		}
		{
			lblQueActividadDesea = new JLabel("Que Actividad desea realizar?");
			lblQueActividadDesea.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			lblQueActividadDesea.setBounds(34, 46, 241, 26);
			JPanel.add(lblQueActividadDesea);
		}
		{
			cbActividad = new JComboBox();
			cbActividad.addActionListener(this);
			cbActividad.setModel(new DefaultComboBoxModel(new String[] {"Venta", "Stock"}));
			cbActividad.setBounds(278, 46, 120, 21);
			JPanel.add(cbActividad);
		}
		
		btnMostrarVenta = new JButton("MostrarVenta");
		btnMostrarVenta.addActionListener(this);
		btnMostrarVenta.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		btnMostrarVenta.setBounds(558, 404, 151, 39);
		JPanel.add(btnMostrarVenta);
		
		btnBuscarProducto = new JButton("BuscarProducto");
		btnBuscarProducto.addActionListener(this);
		btnBuscarProducto.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		btnBuscarProducto.setBounds(397, 453, 151, 39);
		JPanel.add(btnBuscarProducto);
		
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnMostrarVenta) {
			do_btnMostrarVenta_actionPerformed(e);
		}
		if (e.getSource() == btnBuscarProducto) {
			do_btnBuscarProducto_actionPerformed(e);
		}
		if (e.getSource() == cbActividad) {
			do_comboBox_actionPerformed(e);
		}
		if (e.getSource() == btnRegistrarVenta) {
			do_btnRegistrarVenta_actionPerformed(e);
		}
		
		
		if (e.getSource() == btnStock) {
			do_btnStock_actionPerformed(e);
		}
		if (e.getSource() == btnAñadir) {
			do_btnAñadir_actionPerformed(e);
		}
	}
	protected void do_btnAñadir_actionPerformed(ActionEvent e) {
	    try {
	        String id = (String) cboPeluche.getSelectedItem();
	        int cantidad = Integer.parseInt(txtCantidad.getText());
	        if (cantidad <= 0) {
	            JOptionPane.showMessageDialog(this, "Ingresar una cantidad correcta");
	        } else {
	            String nombre = obtenerNombrePorId(id);
	            double precio = obtenerPrecioPorId(id);

	            Producto nuevo = new Producto(id, nombre, cantidad, precio);
	            almacen.agregarProducto(nuevo);

	            // Limpiar el área de texto txtS
	            txtS.setText("");

	            JOptionPane.showMessageDialog(null, "Stock añadido para " + nombre);
	        }
	    } catch (Exception e2) {
	        JOptionPane.showMessageDialog(this, " No ha ingresado un valor valido");
	    }
	}
	
	int leerCantidad() 
	{
		return Integer.parseInt(txtCantidad.getText()); 
	}
	private String obtenerNombrePorId(String id) {
	    switch (id) {
	        case "100": return "Eevee";
	        case "200": return "Espeon";
	        case "300": return "Flareon";
	        case "400": return "Glaceon";
	        case "500": return "Jolteon";
	        case "600": return "Leafeon";
	        case "700": return "Sylveon";
	        case "800": return "Umbreon";
	        case "900": return "Vaporeon";
	        default: return "Desconocido";
	    }
	}
	private double obtenerPrecioPorId(String id) {
	    switch (id) {
	        case "100": return 30.50; 
	        case "200": return 40.90; 
	        case "300": return 50.70; 
	        case "400": return 25.90;
	        case "500": return 33.90;
	        case "600": return 45.50;
	        case "700": return 55.90;
	        case "800": return 25.99;
	        case "900": return 50.90;
	        default: return 10.00; 
	    }
	}
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == cboPeluche) {
			do_cboPeluche_1_itemStateChanged(e);
		}
	}
	protected void do_cboPeluche_1_itemStateChanged(ItemEvent e) {
		int posi = cboPeluche.getSelectedIndex();
		String id = (String) cboPeluche.getSelectedItem();
		switch (posi) {
		case 0:
			lblImagen.setIcon(new ImageIcon(Tienda.class.getResource("/Imagenes/eeve.jpg")));
			txtNombre.setText("Pokemon Eevee ");
			txtPrecio.setText("S/30.50");
			break;
		case 1:
			lblImagen.setIcon(new ImageIcon(Tienda.class.getResource("/Imagenes/espeon.jpg")));
			txtNombre.setText("Pokemon Espeon ");
			txtPrecio.setText("S/40.90");
			break;
		case 2:
			lblImagen.setIcon(new ImageIcon(Tienda.class.getResource("/Imagenes/flareon.jpg")));
			txtNombre.setText("Pokemon Flareon ");
			txtPrecio.setText("S/50.70");
			break;
		case 3:
			lblImagen.setIcon(new ImageIcon(Tienda.class.getResource("/Imagenes/glaceon.jpg")));
			txtNombre.setText("Pokemon Glaceon ");
			txtPrecio.setText("S/25.90");
			break;
		case 4:
			lblImagen.setIcon(new ImageIcon(Tienda.class.getResource("/Imagenes/jolteon.jpg")));
			txtNombre.setText("Pokemon Jolteon ");
			txtPrecio.setText("S/33.90");
			break;
		case 5:
			lblImagen.setIcon(new ImageIcon(Tienda.class.getResource("/Imagenes/leafeon.jpg")));
			txtNombre.setText("Pokemon Leafeon ");
			txtPrecio.setText("S/45.50");
			break;
		case 6:
			lblImagen.setIcon(new ImageIcon(Tienda.class.getResource("/Imagenes/sylveon.jpg")));
			txtNombre.setText("Pokemon Sylveon ");
			txtPrecio.setText("S/55.90");
			break;
		case 7:
			lblImagen.setIcon(new ImageIcon(Tienda.class.getResource("/Imagenes/umbreon.jpg")));
			txtNombre.setText("Pokemon Umbreon ");
			txtPrecio.setText("S/25.99");
			break;
		case 8:
			lblImagen.setIcon(new ImageIcon(Tienda.class.getResource("/Imagenes/vaporeon.jpg")));
			txtNombre.setText("Pokemon Vaporeon ");
			txtPrecio.setText("S/50.90");
			break;
		default:lblImagen.setIcon(new ImageIcon(Tienda.class.getResource("/Imagenes/espeon.jpg")));
			lblImagen.setIcon(new ImageIcon(Tienda.class.getResource("/Imagenes/eeve.jpg")));
			break;
		}
	}
	protected void do_btnStock_actionPerformed(ActionEvent e) {
		 txtS.setText("");
		HashMap<String, Producto> stockAgrupado = new HashMap<>();
	    for (Producto p : almacen.getTodosLosProductos()) {
	        Producto existente = stockAgrupado.get(p.getIdProducto());
	        if (existente == null) {
	            stockAgrupado.put(p.getIdProducto(), new Producto(p.getIdProducto(), p.getNombre(), p.getStock(), p.getPrecio()));
	        } else {
	            existente.setStock(existente.getStock() + p.getStock());
	        }
	    }

	    List<Producto> productosOrdenados = new ArrayList<>(stockAgrupado.values());
	    productosOrdenados.sort(Comparator.comparing(Producto::getIdProducto)); 

	    txtS.setText("========== STOCK ACTUAL ==========\n");
	    txtS.append(String.format("%-10s %-20s %-10s %-10s\n", "ID","NOMBRE","STOCK","PRECIO")); 

	    for (Producto p : productosOrdenados) {
	        txtS.append(String.format("%-10s %-30s %-10d $%-10.2f\n", 
	            p.getIdProducto(), p.getNombre(), p.getStock(), p.getPrecio())); 
	    }
	}
	protected void do_btnBuscarProducto_actionPerformed(ActionEvent e) {
		String idProducto = (String) cboPeluche.getSelectedItem();
        Producto p = buscarProductoPorId(idProducto);
        if (p != null) {
            txtS.setText("La producto se encuentra :\n" + p.toString());
        } else {
            txtS.setText("La producto no se encuentra.");
        }
	}
	private Producto buscarProductoPorId(String id) {
        for (Producto p : almacen.getTodosLosProductos()) {
            if (p.getIdProducto().equals(id)) {
                return p;
            }
        }
        return null;
        
    }
	
	protected void do_btnRegistrarVenta_actionPerformed(ActionEvent e) {
    // Validación de campos obligatorios
    if (txtId_Venta.getText().isEmpty() || txtCantidad.getText().isEmpty() ||
        txtNombreCliente.getText().isEmpty() || txtApellido.getText().isEmpty() ||
        txtDireccion.getText().isEmpty() || txtTelefono.getText().isEmpty()) {
        
        JOptionPane.showMessageDialog(this, " No ha llenado todos los campos obligatorios.");
        return;
    }

    // Validación de producto seleccionado
    if (cboPeluche.getSelectedItem() == null) {
        JOptionPane.showMessageDialog(this, " No ha seleccionado ningún producto.");
        return;
    }

    // Obtener el producto seleccionado
    String idProducto = (String) cboPeluche.getSelectedItem();
    Producto productoSeleccionado = null;
    for (Producto p : almacen.getTodosLosProductos()) {
        if (p.getIdProducto().equalsIgnoreCase(idProducto)) {
            productoSeleccionado = p;
            break;
        }
    }

    if (productoSeleccionado == null) {
        JOptionPane.showMessageDialog(this, " El producto no se encuentra disponible .");
        return;
    }

    // Obtener la cantidad ingresada
    int cantidad;
    try {
        cantidad = Integer.parseInt(txtCantidad.getText());
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, " La cantidad debe ser un número válido.");
        return;
    }

    // Validar stock
    if (productoSeleccionado.getStock() < cantidad) {
        JOptionPane.showMessageDialog(this, " No hay stock suficiente para este producto.");
        return;
    }

    // Reducir stock antes de registrar la venta
    productoSeleccionado.setStock(productoSeleccionado.getStock() - cantidad);

    // Crear el cliente
    String idVenta = txtId_Venta.getText();
    String nombre = txtNombreCliente.getText();
    String apellido = txtApellido.getText();
    String direccion = txtDireccion.getText();
    String telefono = txtTelefono.getText();

    Cliente cliente = new Cliente(idVenta, nombre, apellido, direccion, telefono);
    clientes.add(cliente);

    // Registrar venta
    Venta venta = new Venta(idVenta, cliente, new Date());
    // Registrar detalle de venta para que se guarde el producto y cantidad
    venta.registrarDetalleVenta(productoSeleccionado, cantidad);
    ventas.add(venta);

    // Limpiar el área de texto antes de mostrar nueva información
    txtS.setText("");

    // Mostrar mensaje en la GUI con el stock actualizado
    txtS.append(" Venta registrada:\n");
    txtS.append("ID Venta: " + idVenta + "\n");
    txtS.append("Cliente: " + nombre + " " + apellido + "\n");
    txtS.append("Producto: " + productoSeleccionado.getNombre() + "\n");
    txtS.append("Cantidad: " + cantidad + "\n");
    txtS.append("Precio unitario: S/. " + productoSeleccionado.getPrecio() + "\n");
    txtS.append("Subtotal: S/. " + (productoSeleccionado.getPrecio() * cantidad) + "\n");
    txtS.append("Stock restante: " + productoSeleccionado.getStock() + "\n\n");

    // Limpiar campos
    txtCantidad.setText("");
    cboPeluche.setSelectedIndex(-1);
}

	protected void do_comboBox_actionPerformed(ActionEvent e) {
		int posi = cbActividad.getSelectedIndex();
		
		switch (posi) {
		case 0:
			
			txtApellido.setEditable(true);
			txtNombreCliente.setEditable(true);
			txtCantidad.setEditable(true);
			txtId_Venta.setEditable(true);
			txtDireccion.setEditable(true);
			txtTelefono.setEditable(true);
			txtIdDetalleVenta.setEditable(true);
			break;
           
			
				case 1:
					txtCantidad.setEditable(true);
					
					
				break;


			default:
				
		}
		
		
	}
	protected void do_btnMostrarVenta_actionPerformed(ActionEvent e) {
		txtS.setText("");
	    txtS.setText("==== LISTADO DE VENTAS ====\n");

	    if (ventas.isEmpty()) {
	        txtS.append("No hay ventas registradas.\n");
	        return;
	    }

	    for (Venta v : ventas) {
	        txtS.append("ID Venta: " + v.getIdVenta() + "\n");
	        Cliente c = v.getCliente();
	        txtS.append("Cliente: " + c.getNombre() + " " + c.getApellido() + "\n");
	        txtS.append("Dirección: " + c.getDireccion() + "\n");
	        txtS.append("Teléfono: " + c.getTelefono() + "\n");
	        txtS.append("Fecha: " + v.getFecha() + "\n");

	        ArrayList<DetalleVenta> detalles = v.getDetalles();
	        

	       
	    }
	}
 }
