package MenuPri;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class VentanaVentaOnline extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton BtnRegresar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaVentaOnline frame = new VentanaVentaOnline();
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
	public VentanaVentaOnline() {
		setTitle("Online");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 222, 179));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			BtnRegresar = new JButton("Regresar");
			BtnRegresar.setBackground(new Color(255, 255, 255));
			BtnRegresar.addActionListener(this);
			BtnRegresar.setFont(new Font("Javanese Text", Font.PLAIN, 16));
			BtnRegresar.setBounds(44, 211, 109, 39);
			contentPane.add(BtnRegresar);
		}
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == BtnRegresar) {
			do_btnRegresar_actionPerformed(e);
		}
	}
	protected void do_btnRegresar_actionPerformed(ActionEvent e) {
	
		VentanaMenu newframe = new VentanaMenu();
		newframe.setVisible(true);
		this.dispose();
	}
}
