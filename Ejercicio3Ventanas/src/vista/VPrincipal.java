package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class VPrincipal extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtContrasenia;
	private JButton btnComprobar;
	private JButton btnCancelar;
	private final String USUARIO = "ioritz";
	private final String CONTRASENIA = "abcd*1234";


	/**
	 * Create the frame.
	 */
	public VPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 552, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUsuario.setBounds(39, 30, 190, 88);
		contentPane.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(222, 59, 182, 37);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblContraseņa = new JLabel("Contrase\u00F1a:");
		lblContraseņa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContraseņa.setBounds(39, 139, 190, 88);
		contentPane.add(lblContraseņa);
		
		txtContrasenia = new JTextField();
		txtContrasenia.setColumns(10);
		txtContrasenia.setBounds(222, 176, 182, 37);
		contentPane.add(txtContrasenia);
		
		
		btnComprobar = new JButton("Comprobar");
		btnComprobar.addActionListener(this);
		btnComprobar.setBounds(62, 266, 182, 37);
		contentPane.add(btnComprobar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(281, 266, 182, 37);
		contentPane.add(btnCancelar);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btnCancelar)) {
			this.dispose();
		}
		if (e.getSource().equals(btnComprobar)) {
			comprobar();
		}
	}


	private void comprobar() {
		if (txtUsuario.getText().equalsIgnoreCase(USUARIO) && txtContrasenia.getText().equalsIgnoreCase(CONTRASENIA)) {
			VFormulario formulario = new VFormulario(this, true);
			formulario.setVisible(true);
		}
		else {
			VContraseniaIncorrecta error = new VContraseniaIncorrecta(this, true);
			error.setVisible(true);
		}
	}
}
