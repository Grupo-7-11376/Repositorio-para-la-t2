package MenuPri;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class VentanaMenu extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JButton BtnInventario;
	private JButton BtnVenta;
	private JButton BtnVentaOnline;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMenu frame = new VentanaMenu();
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
	public VentanaMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 259);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 222, 179));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Tienda de peluches ");
			lblNewLabel.setFont(new Font("Javanese Text", Font.PLAIN, 22));
			lblNewLabel.setBounds(155, 10, 215, 44);
			contentPane.add(lblNewLabel);
		}
		{
			BtnInventario = new JButton("Inventario");
			BtnInventario.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			BtnInventario.addActionListener(this);
			BtnInventario.setBounds(179, 147, 134, 35);
			contentPane.add(BtnInventario);
		}
		{
			BtnVenta = new JButton("Venta");
			BtnVenta.addActionListener(this);
			BtnVenta.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			BtnVenta.setBounds(85, 89, 134, 35);
			contentPane.add(BtnVenta);
		}
		{
			BtnVentaOnline = new JButton("Venta online");
			BtnVentaOnline.addActionListener(this);
			BtnVentaOnline.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			BtnVentaOnline.setBounds(290, 89, 134, 35);
			contentPane.add(BtnVentaOnline);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == BtnVentaOnline) {
			do_btnVentaOnline_actionPerformed(e);
		}
		if (e.getSource() == BtnVenta) {
			do_btnVenta_actionPerformed(e);
		}
		if (e.getSource() == BtnInventario) {
			do_btnInventario_actionPerformed(e);
		}
	}
	protected void do_btnInventario_actionPerformed(ActionEvent e) {
	
		Inventario newframe = new Inventario();
		newframe.setVisible(true);
		this.dispose();
	}
	protected void do_btnVenta_actionPerformed(ActionEvent e) {
	
		VentanaVenta newframe = new VentanaVenta();
		newframe.setVisible(true);
		this.dispose();
	}
	protected void do_btnVentaOnline_actionPerformed(ActionEvent e) {
	
		VentanaVentaOnline newframe = new VentanaVentaOnline();
		newframe.setVisible(true);
		this.dispose();
	}
}
