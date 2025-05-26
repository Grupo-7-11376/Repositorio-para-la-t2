package MenuPri;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.ImageIcon;

public class Inventario extends JFrame implements ActionListener, ItemListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton BtnRegresar;
	private JLabel LblCodigoDelPeluche;
	private JButton BtnListar;
	private JComboBox cboPeluche;
	private JLabel lblEmpresa;
	private JLabel lblCantidad;
	private JButton BtnAgregar;
	private JButton BtnEliminar;
	private JTextField TxtCantidad;
	private JComboBox comboBox_1;
	private JScrollPane scrollPane;
	private JTextArea TxtS;
	private JLabel lblNewLabel;
	private JTextField txtMensajito;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inventario frame = new Inventario();
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
	public Inventario() {
		setTitle("Inventario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 686, 408);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 222, 179));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			BtnRegresar = new JButton("Regresar");
			BtnRegresar.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			BtnRegresar.addActionListener(this);
			BtnRegresar.setBounds(10, 318, 109, 39);
			contentPane.add(BtnRegresar);
		}
		{
			LblCodigoDelPeluche = new JLabel("Codigo del peluche");
			LblCodigoDelPeluche.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			LblCodigoDelPeluche.setBounds(10, 11, 151, 26);
			contentPane.add(LblCodigoDelPeluche);
		}
		{
			BtnListar = new JButton("Listar");
			BtnListar.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			BtnListar.setBounds(314, 208, 109, 39);
			contentPane.add(BtnListar);
		}
		{
			cboPeluche = new JComboBox();
			cboPeluche.addItemListener(this);
			cboPeluche.setModel(new DefaultComboBoxModel(new String[] {"100", "110", "120", "130", "140", "150", "160", "170", "180"}));
			cboPeluche.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			cboPeluche.setBounds(183, 11, 158, 32);
			contentPane.add(cboPeluche);
		}
		{
			lblEmpresa = new JLabel("Empresa");
			lblEmpresa.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			lblEmpresa.setBounds(10, 140, 151, 26);
			contentPane.add(lblEmpresa);
		}
		{
			lblCantidad = new JLabel("Cantidad");
			lblCantidad.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			lblCantidad.setBounds(10, 96, 151, 26);
			contentPane.add(lblCantidad);
		}
		{
			BtnAgregar = new JButton("Agregar");
			BtnAgregar.addActionListener(this);
			BtnAgregar.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			BtnAgregar.setBounds(29, 208, 109, 39);
			contentPane.add(BtnAgregar);
		}
		{
			BtnEliminar = new JButton("Eliminar");
			BtnEliminar.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			BtnEliminar.setBounds(168, 208, 109, 39);
			contentPane.add(BtnEliminar);
		}
		{
			TxtCantidad = new JTextField();
			TxtCantidad.setFont(new Font("Javanese Text", Font.PLAIN, 10));
			TxtCantidad.setBounds(183, 95, 158, 31);
			contentPane.add(TxtCantidad);
			TxtCantidad.setColumns(10);
		}
		{
			comboBox_1 = new JComboBox();
			comboBox_1.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"BuildABear", "PokemonCenter", "Disney", "Nintendo", "MiPeluche", "Sanrio", "Peluche Creation", "DePeluche", "Huellitas y Apapachos"}));
			comboBox_1.setBounds(183, 137, 158, 32);
			contentPane.add(comboBox_1);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(498, 11, 161, 346);
			contentPane.add(scrollPane);
			{
				TxtS = new JTextArea();
				TxtS.setFont(new Font("Javanese Text", Font.PLAIN, 13));
				scrollPane.setViewportView(TxtS);
			}
		}
		{
			lblNewLabel = new JLabel("New label");
			lblNewLabel.setIcon(new ImageIcon(Inventario.class.getResource("/imagenes/eeve.jpg")));
			lblNewLabel.setBounds(361, 11, 113, 132);
			contentPane.add(lblNewLabel);
		}
		{
			txtMensajito = new JTextField();
			txtMensajito.setEditable(false);
			txtMensajito.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			txtMensajito.setColumns(10);
			txtMensajito.setBounds(183, 54, 158, 31);
			contentPane.add(txtMensajito);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == BtnAgregar) {
			do_btnAgregar_actionPerformed(e);
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
	protected void do_btnAgregar_actionPerformed(ActionEvent e) {
	
		try {
			 int cantidad = Integer.parseInt(TxtCantidad.getText());
			 if (cantidad < 0) {
		            JOptionPane.showMessageDialog(null, "Ingrese un número positivo");
		        } else {
		            
		        }
		}catch(Exception e2) {
			JOptionPane.showMessageDialog(null, "Ingrese numero valido ");
		}
	}
	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == cboPeluche) {
			do_comboBox_itemStateChanged(e);
		}
	}
	protected void do_comboBox_itemStateChanged(ItemEvent e) {
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
