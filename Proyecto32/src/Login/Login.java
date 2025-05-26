package Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Menu.V2;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Login extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblContrasea;
	private JTextField TxtUsuario;
	private JButton BtnIngresar;
	private JPasswordField TxtContraseña;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 557);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(253, 234, 198));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Usuario");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel.setBounds(45, 222, 79, 29);
			contentPane.add(lblNewLabel);
		}
		{
			lblContrasea = new JLabel("Contraseña");
			lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblContrasea.setBounds(45, 306, 107, 29);
			contentPane.add(lblContrasea);
		}
		{
			TxtUsuario = new JTextField();
			TxtUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
			TxtUsuario.setBounds(182, 222, 172, 29);
			contentPane.add(TxtUsuario);
			TxtUsuario.setColumns(10);
		}
		{
			BtnIngresar = new JButton("Ingresar");
			BtnIngresar.addActionListener(this);
			BtnIngresar.setFont(new Font("Tahoma", Font.PLAIN, 16));
			BtnIngresar.setBounds(116, 420, 172, 34);
			contentPane.add(BtnIngresar);
		}
		{
			TxtContraseña = new JPasswordField();
			TxtContraseña.setBounds(182, 308, 172, 29);
			contentPane.add(TxtContraseña);
		}
		{
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\jefry\\git\\t2\\Proyecto32\\src\\LoginImagen\\Sin título.jpg"));
			lblNewLabel_1.setBounds(99, 10, 225, 173);
			contentPane.add(lblNewLabel_1);
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == BtnIngresar) {
			do_btnIngresar_actionPerformed(e);
		}
	}
	protected void do_btnIngresar_actionPerformed(ActionEvent e) {
	
		String user= TxtUsuario.getText();
		String pass=new String(TxtContraseña.getPassword());
		if(user.equals("admin")&& pass.equals("1234")) {
			JOptionPane.showMessageDialog(this,"¡BIENVENIDO!");
			V2 mp=new V2();
			mp.setVisible(true);
			this.dispose();
		}else {
			JOptionPane.showMessageDialog(this,"Usuario o contraseña incorrectos");
		}
	}
}
