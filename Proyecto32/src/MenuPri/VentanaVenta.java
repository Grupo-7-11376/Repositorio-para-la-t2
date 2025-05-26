package MenuPri;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import InventarioPeluches.ArregloPeluches;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import java.awt.Color;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.ImageIcon;

public class VentanaVenta extends JFrame implements ActionListener, ItemListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton BtnRegresar;
	private JLabel lblCodigoDelPeluche;
	private JLabel lblCantidad;
	private JTextField txtCantidad;
	private JComboBox cboPeluche;
	private JScrollPane scrollPane;
	private JLabel lblMetodoDePago;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnFactura;
	private JRadioButton rdbtnEfectivo;
	private JRadioButton rdbtnTarjeta;
	private JLabel lblTipo;
	private JLabel lblPrecio;
	private JTextField txtPrecio;
	private JButton BtnAñadir;
	private JButton BtnCalcular;
	private JButton BtnComprado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaVenta frame = new VentanaVenta();
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
	public VentanaVenta() {
		setTitle("Venta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 492);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 222, 179));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			BtnRegresar = new JButton("Regresar");
			BtnRegresar.addActionListener(this);
			BtnRegresar.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			BtnRegresar.setBounds(10, 403, 109, 39);
			contentPane.add(BtnRegresar);
		}
		{
			lblCodigoDelPeluche = new JLabel("Codigo del peluche");
			lblCodigoDelPeluche.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			lblCodigoDelPeluche.setBounds(10, 56, 151, 26);
			contentPane.add(lblCodigoDelPeluche);
		}
		{
			lblCantidad = new JLabel("Cantidad");
			lblCantidad.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			lblCantidad.setBounds(10, 150, 151, 26);
			contentPane.add(lblCantidad);
		}
		{
			txtCantidad = new JTextField();
			txtCantidad.setFont(new Font("Javanese Text", Font.PLAIN, 10));
			txtCantidad.setColumns(10);
			txtCantidad.setBounds(194, 149, 158, 31);
			contentPane.add(txtCantidad);
		}
		{
			cboPeluche = new JComboBox();
			cboPeluche.addItemListener(this);
			cboPeluche.setModel(new DefaultComboBoxModel(new String[] {"100", "110", "120", "130", "140", "150", "160", "170", "180", ""}));
			cboPeluche.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			cboPeluche.setBounds(194, 53, 158, 32);
			contentPane.add(cboPeluche);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(485, 56, 189, 327);
			contentPane.add(scrollPane);
			{
				txtA_venta = new JTextArea();
				scrollPane.setViewportView(txtA_venta);
			}
		}
		{
			lblMetodoDePago = new JLabel("Metodo De Pago");
			lblMetodoDePago.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			lblMetodoDePago.setBounds(10, 250, 151, 26);
			contentPane.add(lblMetodoDePago);
		}
		{
			rdbtnNewRadioButton = new JRadioButton("Boleta");
			rdbtnNewRadioButton.setBackground(new Color(250, 240, 230));
			rdbtnNewRadioButton.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			rdbtnNewRadioButton.setBounds(194, 301, 109, 23);
			contentPane.add(rdbtnNewRadioButton);
		}
		{
			rdbtnFactura = new JRadioButton("Factura");
			rdbtnFactura.setBackground(new Color(250, 240, 230));
			rdbtnFactura.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			rdbtnFactura.setBounds(305, 301, 109, 23);
			contentPane.add(rdbtnFactura);
		}
		{
			rdbtnEfectivo = new JRadioButton("Efectivo");
			rdbtnEfectivo.setBackground(new Color(250, 240, 230));
			rdbtnEfectivo.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			rdbtnEfectivo.setBounds(194, 252, 109, 23);
			contentPane.add(rdbtnEfectivo);
		}
		{
			rdbtnTarjeta = new JRadioButton("Tarjeta");
			rdbtnTarjeta.setBackground(new Color(250, 240, 230));
			rdbtnTarjeta.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			rdbtnTarjeta.setBounds(305, 252, 109, 23);
			contentPane.add(rdbtnTarjeta);
		}
		{
			lblTipo = new JLabel("Comprobante De Pago");
			lblTipo.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			lblTipo.setBounds(10, 299, 178, 26);
			contentPane.add(lblTipo);
		}
		{
			lblPrecio = new JLabel("Precio");
			lblPrecio.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			lblPrecio.setBounds(10, 192, 151, 26);
			contentPane.add(lblPrecio);
		}
		{
			txtPrecio = new JTextField();
			txtPrecio.setFont(new Font("Javanese Text", Font.PLAIN, 10));
			txtPrecio.setColumns(10);
			txtPrecio.setBounds(194, 191, 158, 31);
			contentPane.add(txtPrecio);
		}
		{
			BtnAñadir = new JButton("Añadir");
			BtnAñadir.addActionListener(this);
			BtnAñadir.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			BtnAñadir.setBounds(10, 353, 109, 39);
			contentPane.add(BtnAñadir);
		}
		{
			BtnCalcular = new JButton("Calcular");
			BtnCalcular.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			BtnCalcular.setBounds(153, 353, 109, 39);
			contentPane.add(BtnCalcular);
		}
		{
			BtnComprado = new JButton("Comprado");
			BtnComprado.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			BtnComprado.setBounds(290, 353, 109, 39);
			contentPane.add(BtnComprado);
		}
		{
			lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon(VentanaVenta.class.getResource("/imagenes/eeve.jpg")));
			lblNewLabel.setBounds(362, 56, 113, 132);
			contentPane.add(lblNewLabel);
		}
		{
			txtMensajito = new JTextField();
			txtMensajito.setEditable(false);
			txtMensajito.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			txtMensajito.setColumns(10);
			txtMensajito.setBounds(194, 96, 158, 31);
			contentPane.add(txtMensajito);
		}
		{
			PELUCHE = new JLabel("PELUCHE");
			PELUCHE.setFont(new Font("Tahoma", Font.BOLD, 16));
			PELUCHE.setBounds(305, 18, 109, 14);
			contentPane.add(PELUCHE);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == BtnAñadir) {
			do_btnAñadir_actionPerformed(e);
		}
		if (e.getSource() == BtnRegresar) {
			do_btnRegresar_actionPerformed(e);
		}
	}
	protected void do_btnRegresar_actionPerformed(ActionEvent e) {
	
		VentanaMenu newframe = new VentanaMenu();
		newframe.setVisible(true);
		this.dispose();
	}
	
	ArregloPeluches arr = new ArregloPeluches();
	private JLabel lblNewLabel;
	private JTextField txtMensajito;
	private JLabel PELUCHE;
	private JTextArea txtA_venta;

	protected void do_btnAñadir_actionPerformed(ActionEvent e) {
		Imprimir();
	}
	
	void Imprimir(String s)
	{
		txtA_venta.append("\n"+s);
	}
	void Imprimir()
	{
	   Imprimir("La cantidad de Productos: "+txtCantidad.getText());
	}
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == cboPeluche) {
			do_cboPeluche_itemStateChanged(e);
		}
	}
	protected void do_cboPeluche_itemStateChanged(ItemEvent e) {
		int posi = cboPeluche.getSelectedIndex();
		switch (posi) {
		case 0:
			lblNewLabel.setIcon(new ImageIcon(VentanaVenta.class.getResource("/imagenes/eeve.jpg")));
			txtMensajito.setText("Eeve");
			break;
		case 1:
			lblNewLabel.setIcon(new ImageIcon(VentanaVenta.class.getResource("/imagenes/espeon.jpg")));
			txtMensajito.setText("Espeon");
			break;
		case 2:
			lblNewLabel.setIcon(new ImageIcon(VentanaVenta.class.getResource("/imagenes/glaceon.jpg")));
			txtMensajito.setText("Glaceon");
			break;
		case 3:
			lblNewLabel.setIcon(new ImageIcon(VentanaVenta.class.getResource("/imagenes/sylveon.jpg")));
			txtMensajito.setText("Sylveon");
			break;
		case 4:
			lblNewLabel.setIcon(new ImageIcon(VentanaVenta.class.getResource("/imagenes/jolteon.jpg")));
			txtMensajito.setText("Jolteon");
			break;
		case 5:
			lblNewLabel.setIcon(new ImageIcon(VentanaVenta.class.getResource("/imagenes/vaporeon.jpg")));
			txtMensajito.setText("Vaporeon");
			break;
		case 6:
			lblNewLabel.setIcon(new ImageIcon(VentanaVenta.class.getResource("/imagenes/leafeon.jpg")));
			txtMensajito.setText("Leafeon");
			break;
		case 7:
			lblNewLabel.setIcon(new ImageIcon(VentanaVenta.class.getResource("/imagenes/flareon.jpg")));
			txtMensajito.setText("Flareon");
			break;
		case 8:
			lblNewLabel.setIcon(new ImageIcon(VentanaVenta.class.getResource("/imagenes/umbreon.jpg")));
			txtMensajito.setText("Umbreon");
			break;
		default:
			lblNewLabel.setIcon(new ImageIcon(VentanaVenta.class.getResource("/imagenes/eeve.jpg")));
			txtMensajito.setText("");
			break;
		}
	}
}
