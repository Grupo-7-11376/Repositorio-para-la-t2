package Menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import MenuPri.VentanaVenta;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V2 extends JFrame implements ItemListener, ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblCodigoDelPeluche;
	private JComboBox cboPeluche2;
	private JTextField txtMensajito2;
	private JTextField txtCantidad;
	private JLabel lblCantidad;
	private JLabel lblEmpresa;
	private JComboBox cboEmpresa;
	private JButton btnAgregar;
	private JButton btnEliminar;
	private JButton btnListar;
	private JLabel lblCodigoDelPeluche_1;
	private JComboBox cboPeluche;
	private JTextField txtMensajito;
	private JLabel lblCantidad_1;
	private JTextField txtPrecio;
	private JLabel lblPrecio;
	private JTextField txtCanti;
	private JLabel lblMetodoDePago;
	private JRadioButton rdbtnEfectivo;
	private JRadioButton rdbtnTarjeta;
	private JLabel lblTipo;
	private JRadioButton rdbtnBoleta;
	private JRadioButton rdbtnFactura;
	private JButton btnAñadir;
	private JButton btnComprado;
	private JLabel lblNewLabel_3;
	private JComboBox cboProceso;
	private JLabel lblNewLabel_4;
	private JScrollPane scrollPane;
	private JLabel lblNewLabel_5;
	private JLabel lblFecha;
	private JTextField txtNombres;
	private JLabel lblCantidad_3;
	private JTextField txtApellidos;
	private JLabel lblCantidad_4;
	private JTextField txtTelefonos;
	private JLabel lblCantidad_5;
	private JTextField txtDireccion;
	private JLabel lblCodigoDelPeluche_2;
	private JComboBox cboTipoVenta;
	private JTextArea txtS;
	private JButton btnAñadirVenta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V2 frame = new V2();
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
	public V2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 886, 764);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 224, 190));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Tienda de peluches ");
			lblNewLabel.setFont(new Font("Javanese Text", Font.BOLD, 23));
			lblNewLabel.setBounds(330, 11, 215, 44);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("VENTA:");
			lblNewLabel_1.setFont(new Font("Javanese Text", Font.BOLD, 13));
			lblNewLabel_1.setBounds(10, 87, 59, 14);
			contentPane.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("INVENTARIO:");
			lblNewLabel_2.setFont(new Font("Javanese Text", Font.BOLD, 13));
			lblNewLabel_2.setBounds(10, 385, 123, 14);
			contentPane.add(lblNewLabel_2);
		}
		{
			lblCodigoDelPeluche = new JLabel("ID del peluche:");
			lblCodigoDelPeluche.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			lblCodigoDelPeluche.setBounds(10, 410, 151, 26);
			contentPane.add(lblCodigoDelPeluche);
		}
		{
			cboPeluche2 = new JComboBox();
			cboPeluche2.addItemListener(this);
			cboPeluche2.setModel(new DefaultComboBoxModel(new String[] {"100", "110", "120", "130", "140", "150", "160", "170", "180"}));
			cboPeluche2.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			cboPeluche2.setBounds(183, 407, 158, 32);
			contentPane.add(cboPeluche2);
		}
		{
			txtMensajito2 = new JTextField();
			txtMensajito2.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			txtMensajito2.setEditable(false);
			txtMensajito2.setColumns(10);
			txtMensajito2.setBounds(183, 453, 158, 31);
			contentPane.add(txtMensajito2);
		}
		{
			txtCantidad = new JTextField();
			txtCantidad.setFont(new Font("Javanese Text", Font.PLAIN, 10));
			txtCantidad.setColumns(10);
			txtCantidad.setBounds(447, 409, 158, 31);
			contentPane.add(txtCantidad);
		}
		{
			lblCantidad = new JLabel("Cantidad");
			lblCantidad.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			lblCantidad.setBounds(362, 411, 151, 26);
			contentPane.add(lblCantidad);
		}
		{
			lblEmpresa = new JLabel("Empresa");
			lblEmpresa.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			lblEmpresa.setBounds(615, 410, 151, 26);
			contentPane.add(lblEmpresa);
		}
		{
			cboEmpresa = new JComboBox();
			cboEmpresa.setModel(new DefaultComboBoxModel(new String[] {"BuildABear", "PokemonCenter", "Disney", "Nintendo", "MiPeluche", "Sanrio", "Peluche Creation", "DePeluche", "Huellitas y Apapachos"}));
			cboEmpresa.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			cboEmpresa.setBounds(694, 407, 158, 32);
			contentPane.add(cboEmpresa);
		}
		{
			btnAgregar = new JButton("Agregar");
			btnAgregar.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			btnAgregar.setBounds(10, 495, 109, 39);
			contentPane.add(btnAgregar);
		}
		{
			btnEliminar = new JButton("Eliminar");
			btnEliminar.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			btnEliminar.setBounds(149, 495, 109, 39);
			contentPane.add(btnEliminar);
		}
		{
			btnListar = new JButton("Listar");
			btnListar.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			btnListar.setBounds(295, 495, 109, 39);
			contentPane.add(btnListar);
		}
		{
			lblCodigoDelPeluche_1 = new JLabel("ID del peluche:");
			lblCodigoDelPeluche_1.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			lblCodigoDelPeluche_1.setBounds(10, 149, 151, 26);
			contentPane.add(lblCodigoDelPeluche_1);
		}
		{
			cboPeluche = new JComboBox();
			cboPeluche.addItemListener(this);
			cboPeluche.setModel(new DefaultComboBoxModel(new String[] {"100", "110", "120", "130", "140", "150", "160", "170", "180"}));
			cboPeluche.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			cboPeluche.setBounds(149, 149, 158, 32);
			contentPane.add(cboPeluche);
		}
		{
			txtMensajito = new JTextField();
			txtMensajito.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			txtMensajito.setEditable(false);
			txtMensajito.setColumns(10);
			txtMensajito.setBounds(149, 192, 158, 31);
			contentPane.add(txtMensajito);
		}
		{
			lblCantidad_1 = new JLabel("Cantidad");
			lblCantidad_1.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			lblCantidad_1.setBounds(330, 150, 151, 26);
			contentPane.add(lblCantidad_1);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setFont(new Font("Javanese Text", Font.PLAIN, 10));
			txtPrecio.setColumns(10);
			txtPrecio.setBounds(583, 149, 109, 31);
			contentPane.add(txtPrecio);
		}
		{
			lblPrecio = new JLabel("Precio");
			lblPrecio.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			lblPrecio.setBounds(524, 150, 151, 26);
			contentPane.add(lblPrecio);
		}
		{
			txtCanti = new JTextField();
			txtCanti.setFont(new Font("Javanese Text", Font.PLAIN, 10));
			txtCanti.setColumns(10);
			txtCanti.setBounds(415, 149, 99, 31);
			contentPane.add(txtCanti);
		}
		{
			lblMetodoDePago = new JLabel("Metodo De Pago");
			lblMetodoDePago.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			lblMetodoDePago.setBounds(10, 260, 151, 26);
			contentPane.add(lblMetodoDePago);
		}
		{
			rdbtnEfectivo = new JRadioButton("Efectivo");
			rdbtnEfectivo.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			rdbtnEfectivo.setBackground(new Color(252, 233, 207));
			rdbtnEfectivo.setBounds(194, 262, 109, 23);
			contentPane.add(rdbtnEfectivo);
		}
		{
			rdbtnTarjeta = new JRadioButton("Tarjeta");
			rdbtnTarjeta.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			rdbtnTarjeta.setBackground(new Color(250, 240, 230));
			rdbtnTarjeta.setBounds(305, 262, 99, 23);
			contentPane.add(rdbtnTarjeta);
		}
		{
			lblTipo = new JLabel("Comprobante De Pago");
			lblTipo.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			lblTipo.setBounds(447, 260, 178, 26);
			contentPane.add(lblTipo);
		}
		{
			rdbtnBoleta = new JRadioButton("Boleta");
			rdbtnBoleta.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			rdbtnBoleta.setBackground(new Color(250, 240, 230));
			rdbtnBoleta.setBounds(631, 262, 109, 23);
			contentPane.add(rdbtnBoleta);
		}
		{
			rdbtnFactura = new JRadioButton("Factura");
			rdbtnFactura.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			rdbtnFactura.setBackground(new Color(250, 240, 230));
			rdbtnFactura.setBounds(742, 262, 99, 23);
			contentPane.add(rdbtnFactura);
		}
		
			btnAñadir.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			btnAñadir.setBounds(330, 188, 183, 39);
			contentPane.add(btnAñadir);
			{
				btnAñadirVenta = new JButton("Añadir");
				btnAñadirVenta.setFont(new Font("Javanese Text", Font.PLAIN, 16));
				btnAñadirVenta.addActionListener(this);
				btnAñadirVenta.setBounds(10, 318, 85, 32);
				contentPane.add(btnAñadirVenta);
			}
		}
		{
			btnComprado = new JButton("Comprar");
			btnComprado.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			btnComprado.setBounds(10, 335, 109, 39);
			contentPane.add(btnComprado);
		}
		{
			lblNewLabel_3 = new JLabel("New label");
			lblNewLabel_3.setIcon(new ImageIcon(V2.class.getResource("/imagenes/flareon.jpg")));
			lblNewLabel_3.setBounds(739, 50, 113, 132);
			contentPane.add(lblNewLabel_3);
		}
		{
			cboProceso = new JComboBox();
			cboProceso.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			cboProceso.addActionListener(this);
			cboProceso.setModel(new DefaultComboBoxModel(new String[] {"Venta", "Inventario"}));
			cboProceso.setBounds(194, 50, 158, 29);
			contentPane.add(cboProceso);
		}
		{
			lblNewLabel_4 = new JLabel("SELECCIONE EL PROCESO:");
			lblNewLabel_4.setFont(new Font("Javanese Text", Font.BOLD, 13));
			lblNewLabel_4.setBounds(10, 60, 215, 14);
			contentPane.add(lblNewLabel_4);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 545, 850, 169);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
		{
			lblNewLabel_5 = new JLabel("CLIENTE:");
			lblNewLabel_5.setFont(new Font("Javanese Text", Font.BOLD, 13));
			lblNewLabel_5.setBounds(10, 235, 75, 14);
			contentPane.add(lblNewLabel_5);
		}
		{
			lblFecha = new JLabel("Nombres:");
			lblFecha.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			lblFecha.setBounds(10, 298, 151, 26);
			contentPane.add(lblFecha);
		}
		{
			txtNombres = new JTextField();
			txtNombres.setFont(new Font("Javanese Text", Font.PLAIN, 10));
			txtNombres.setColumns(10);
			txtNombres.setBounds(80, 297, 109, 31);
			contentPane.add(txtNombres);
		}
		{
			lblCantidad_3 = new JLabel("Apellidos:");
			lblCantidad_3.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			lblCantidad_3.setBounds(199, 298, 99, 26);
			contentPane.add(lblCantidad_3);
		}
		{
			txtApellidos = new JTextField();
			txtApellidos.setFont(new Font("Javanese Text", Font.PLAIN, 10));
			txtApellidos.setColumns(10);
			txtApellidos.setBounds(280, 297, 109, 31);
			contentPane.add(txtApellidos);
		}
		{
			lblCantidad_4 = new JLabel("Telefono:");
			lblCantidad_4.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			lblCantidad_4.setBounds(399, 298, 99, 26);
			contentPane.add(lblCantidad_4);
		}
		{
			txtTelefonos = new JTextField();
			txtTelefonos.setFont(new Font("Javanese Text", Font.PLAIN, 10));
			txtTelefonos.setColumns(10);
			txtTelefonos.setBounds(481, 297, 109, 31);
			contentPane.add(txtTelefonos);
		}
		{
			lblCantidad_5 = new JLabel("Direccion:");
			lblCantidad_5.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			lblCantidad_5.setBounds(600, 298, 99, 26);
			contentPane.add(lblCantidad_5);
		}
		{
			txtDireccion = new JTextField();
			txtDireccion.setFont(new Font("Javanese Text", Font.PLAIN, 10));
			txtDireccion.setColumns(10);
			txtDireccion.setBounds(690, 297, 151, 31);
			contentPane.add(txtDireccion);
		}
		{
			lblCodigoDelPeluche_2 = new JLabel("Tipo de venta:");
			lblCodigoDelPeluche_2.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			lblCodigoDelPeluche_2.setBounds(10, 112, 151, 26);
			contentPane.add(lblCodigoDelPeluche_2);
		}
		{
			cboTipoVenta = new JComboBox();
			cboTipoVenta.addActionListener(this);
			cboTipoVenta.setModel(new DefaultComboBoxModel(new String[] {"Delivery", "Recojo en tienda"}));
			cboTipoVenta.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			cboTipoVenta.setBounds(149, 109, 158, 29);
			contentPane.add(cboTipoVenta);
		}
	}
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == cboPeluche2) {
			do_cboPeluche2_itemStateChanged(e);
		}
		if (e.getSource() == cboPeluche) {
			do_cboPeluche_1_itemStateChanged(e);
		}
	}
	protected void do_cboPeluche_1_itemStateChanged(ItemEvent e) {
		int posi = cboPeluche.getSelectedIndex();
		switch (posi) {
		case 0:
			lblNewLabel_3.setIcon(new ImageIcon(V2.class.getResource("/imagenes/eeve.jpg")));
			txtMensajito.setText("Eeve");
			break;
		case 1:
			lblNewLabel_3.setIcon(new ImageIcon(V2.class.getResource("/imagenes/espeon.jpg")));
			txtMensajito.setText("Espeon");
			break;
		case 2:
			lblNewLabel_3.setIcon(new ImageIcon(V2.class.getResource("/imagenes/glaceon.jpg")));
			txtMensajito.setText("Glaceon");
			break;
		case 3:
			lblNewLabel_3.setIcon(new ImageIcon(V2.class.getResource("/imagenes/sylveon.jpg")));
			txtMensajito.setText("Sylveon");
			break;
		case 4:
			lblNewLabel_3.setIcon(new ImageIcon(V2.class.getResource("/imagenes/jolteon.jpg")));
			txtMensajito.setText("Jolteon");
			break;
		case 5:
			lblNewLabel_3.setIcon(new ImageIcon(V2.class.getResource("/imagenes/vaporeon.jpg")));
			txtMensajito.setText("Vaporeon");
			break;
		case 6:
			lblNewLabel_3.setIcon(new ImageIcon(V2.class.getResource("/imagenes/leafeon.jpg")));
			txtMensajito.setText("Leafeon");
			break;
		case 7:
			lblNewLabel_3.setIcon(new ImageIcon(V2.class.getResource("/imagenes/flareon.jpg")));
			txtMensajito.setText("Flareon");
			break;
		case 8:
			lblNewLabel_3.setIcon(new ImageIcon(V2.class.getResource("/imagenes/umbreon.jpg")));
			txtMensajito.setText("Umbreon");
			break;
		default:
			lblNewLabel_3.setIcon(new ImageIcon(V2.class.getResource("/imagenes/eeve.jpg")));
			txtMensajito.setText("");
			break;
		}
	}
	protected void do_cboPeluche2_itemStateChanged(ItemEvent e) {
		int posi = cboPeluche2.getSelectedIndex();
		switch (posi) {
		case 0:
			lblNewLabel_3.setIcon(new ImageIcon(V2.class.getResource("/imagenes/eeve.jpg")));
			txtMensajito2.setText("Eeve");
			break;
		case 1:
			lblNewLabel_3.setIcon(new ImageIcon(V2.class.getResource("/imagenes/espeon.jpg")));
			txtMensajito2.setText("Espeon");
			break;
		case 2:
			lblNewLabel_3.setIcon(new ImageIcon(V2.class.getResource("/imagenes/glaceon.jpg")));
			txtMensajito2.setText("Glaceon");
			break;
		case 3:
			lblNewLabel_3.setIcon(new ImageIcon(V2.class.getResource("/imagenes/sylveon.jpg")));
			txtMensajito2.setText("Sylveon");
			break;
		case 4:
			lblNewLabel_3.setIcon(new ImageIcon(V2.class.getResource("/imagenes/jolteon.jpg")));
			txtMensajito2.setText("Jolteon");
			break;
		case 5:
			lblNewLabel_3.setIcon(new ImageIcon(V2.class.getResource("/imagenes/vaporeon.jpg")));
			txtMensajito2.setText("Vaporeon");
			break;
		case 6:
			lblNewLabel_3.setIcon(new ImageIcon(V2.class.getResource("/imagenes/leafeon.jpg")));
			txtMensajito2.setText("Leafeon");
			break;
		case 7:
			lblNewLabel_3.setIcon(new ImageIcon(V2.class.getResource("/imagenes/flareon.jpg")));
			txtMensajito2.setText("Flareon");
			break;
		case 8:
			lblNewLabel_3.setIcon(new ImageIcon(V2.class.getResource("/imagenes/umbreon.jpg")));
			txtMensajito2.setText("Umbreon");
			break;
		default:
			lblNewLabel_3.setIcon(new ImageIcon(V2.class.getResource("/imagenes/eeve.jpg")));
			txtMensajito2.setText("");
			break;
		}
	}
	
	protected void do_comboBox_1_actionPerformed(ActionEvent e) {
		int posi = cboProceso.getSelectedIndex();
		switch (posi) {
		case 0:
			cboTipoVenta.setEnabled(true);
			txtNombres.setEditable(true);
			txtApellidos.setEditable(true);
			txtTelefonos.setEditable(true);
			txtDireccion.setEditable(true);
			btnAñadir.setEnabled(true);
			btnComprado.setEnabled(true);
			txtCanti.setEditable(true);
			txtPrecio.setEditable(true);
			cboPeluche.setEnabled(true);
			rdbtnEfectivo.setEnabled(true);
			rdbtnTarjeta.setEnabled(true);
			rdbtnBoleta.setEnabled(true);
			rdbtnFactura.setEnabled(true);
			txtCantidad.setEditable(false);
			cboPeluche2.setEnabled(false);
			cboEmpresa.setEnabled(false);
			btnAgregar.setEnabled(false);
			btnEliminar.setEnabled(false);
			btnListar.setEnabled(false);
			break;
		case 1:
			txtCantidad.setEditable(true);
			cboPeluche2.setEnabled(true);
			cboEmpresa.setEnabled(true);
			btnAgregar.setEnabled(true);
			btnEliminar.setEnabled(true);
			btnListar.setEnabled(true);
			txtCanti.setEditable(false);
			txtPrecio.setEditable(false);
			cboPeluche.setEnabled(false);
			rdbtnEfectivo.setEnabled(false);
			rdbtnTarjeta.setEnabled(false);
			rdbtnBoleta.setEnabled(false);
			rdbtnFactura.setEnabled(false);
			btnAñadir.setEnabled(false);
			btnComprado.setEnabled(false);
			txtNombres.setEditable(false);
			txtApellidos.setEditable(false);
			txtTelefonos.setEditable(false);
			txtDireccion.setEditable(false);
			cboTipoVenta.setEnabled(false);
			
			break;
		default:
			break;
		}
	}
	protected void do_cboProceso_1_actionPerformed(ActionEvent e) {
		int posi = cboTipoVenta.getSelectedIndex();
		switch (posi) {
		case 0:
			txtDireccion.setEditable(false);
			break;

		default:
			txtDireccion.setEditable(true);
			//DarkLenin
		    txtS.append("HOLA");
			break;
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAñadirVenta) {
			do_btnAñadirVenta_actionPerformed(e);
		}
	}
	protected void do_btnAñadirVenta_actionPerformed(ActionEvent e) {
		
	}
}
