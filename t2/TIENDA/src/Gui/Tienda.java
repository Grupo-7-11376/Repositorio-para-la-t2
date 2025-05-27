package Gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
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

public class Tienda extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_10;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 849, 658);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(243, 225, 188));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblProducto = new JLabel("Producto");
		lblProducto.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		lblProducto.setBounds(17, 45, 151, 26);
		contentPane.add(lblProducto);
		
		JLabel lblIdproducto = new JLabel("idProducto");
		lblIdproducto.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		lblIdproducto.setBounds(17, 71, 151, 26);
		contentPane.add(lblIdproducto);
		
		JComboBox cboPeluche = new JComboBox();
		cboPeluche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		cboPeluche.setModel(new DefaultComboBoxModel(new String[] {"100", "200", "300", "400", "500", "600", "700", "800", "900", "931"}));
		cboPeluche.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		cboPeluche.setBounds(10, 107, 158, 32);
		contentPane.add(cboPeluche);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		lblNombre.setBounds(217, 71, 151, 26);
		contentPane.add(lblNombre);
		
		textField = new JTextField();
		textField.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(217, 108, 158, 31);
		contentPane.add(textField);
		
		JLabel lblCantidad_1 = new JLabel("Cantidad");
		lblCantidad_1.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		lblCantidad_1.setBounds(397, 71, 151, 26);
		contentPane.add(lblCantidad_1);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Javanese Text", Font.PLAIN, 10));
		textField_1.setColumns(10);
		textField_1.setBounds(407, 109, 158, 31);
		contentPane.add(textField_1);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		lblPrecio.setBounds(558, 71, 120, 26);
		contentPane.add(lblPrecio);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Javanese Text", Font.PLAIN, 10));
		textField_2.setColumns(10);
		textField_2.setBounds(575, 109, 118, 31);
		contentPane.add(textField_2);
		
		JLabel lblIdcliente = new JLabel("idDetalleVenta");
		lblIdcliente.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		lblIdcliente.setBounds(17, 313, 151, 26);
		contentPane.add(lblIdcliente);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Javanese Text", Font.PLAIN, 10));
		textField_3.setColumns(10);
		textField_3.setBounds(17, 349, 158, 31);
		contentPane.add(textField_3);
		
		JLabel lblNombre_3 = new JLabel("Nombre");
		lblNombre_3.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		lblNombre_3.setBounds(178, 177, 151, 26);
		contentPane.add(lblNombre_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Javanese Text", Font.PLAIN, 10));
		textField_4.setColumns(10);
		textField_4.setBounds(204, 349, 158, 31);
		contentPane.add(textField_4);
		
		JLabel lblNombre_4 = new JLabel("Apellido");
		lblNombre_4.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		lblNombre_4.setBounds(360, 177, 151, 26);
		contentPane.add(lblNombre_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Javanese Text", Font.PLAIN, 10));
		textField_5.setColumns(10);
		textField_5.setBounds(353, 213, 158, 31);
		contentPane.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Javanese Text", Font.PLAIN, 10));
		textField_6.setColumns(10);
		textField_6.setBounds(521, 213, 158, 31);
		contentPane.add(textField_6);
		
		JLabel lblNombre_1 = new JLabel("Direccion");
		lblNombre_1.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		lblNombre_1.setBounds(521, 177, 151, 26);
		contentPane.add(lblNombre_1);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Javanese Text", Font.PLAIN, 10));
		textField_7.setColumns(10);
		textField_7.setBounds(699, 213, 158, 31);
		contentPane.add(textField_7);
		
		JLabel lblNombre_2 = new JLabel("Telefono");
		lblNombre_2.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		lblNombre_2.setBounds(694, 177, 151, 26);
		contentPane.add(lblNombre_2);
		
		JButton btnAñadir = new JButton("Añadir");
		btnAñadir.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		btnAñadir.setBounds(397, 288, 109, 39);
		contentPane.add(btnAñadir);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(22, 438, 754, 160);
		contentPane.add(textArea);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		lblCliente.setBounds(10, 154, 151, 26);
		contentPane.add(lblCliente);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Javanese Text", Font.PLAIN, 10));
		textField_8.setColumns(10);
		textField_8.setBounds(10, 218, 158, 31);
		contentPane.add(textField_8);
		
		JLabel lblIdventa = new JLabel("idventa");
		lblIdventa.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		lblIdventa.setBounds(10, 177, 151, 26);
		contentPane.add(lblIdventa);
		
		JLabel lblCliente_1_1 = new JLabel("Fecha");
		lblCliente_1_1.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		lblCliente_1_1.setBounds(204, 313, 151, 26);
		contentPane.add(lblCliente_1_1);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Javanese Text", Font.PLAIN, 10));
		textField_10.setColumns(10);
		textField_10.setBounds(185, 218, 158, 31);
		contentPane.add(textField_10);
		
		JLabel lblCliente_2 = new JLabel("Cliente");
		lblCliente_2.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		lblCliente_2.setBounds(17, 277, 151, 26);
		contentPane.add(lblCliente_2);
		
		JLabel lblTienda = new JLabel("TiendaPeluches");
		lblTienda.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		lblTienda.setBounds(323, 10, 151, 26);
		contentPane.add(lblTienda);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Tienda.class.getResource("/imagenes/eeve.jpg")));
		lblNewLabel_1.setBounds(712, 16, 113, 132);
		contentPane.add(lblNewLabel_1);
		
		JButton btnStock = new JButton("Stock");
		btnStock.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		btnStock.setBounds(531, 288, 109, 39);
		contentPane.add(btnStock);
		
		JButton btnBuscarCliente = new JButton("Buscar Cliente");
		btnBuscarCliente.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		btnBuscarCliente.setBounds(397, 344, 151, 62);
		contentPane.add(btnBuscarCliente);
		
		JButton btnBuscarProducto = new JButton("Buscar Producto");
		btnBuscarProducto.setFont(new Font("Javanese Text", Font.PLAIN, 16));
		btnBuscarProducto.setBounds(561, 344, 151, 62);
		contentPane.add(btnBuscarProducto);
		
		
	}
}
