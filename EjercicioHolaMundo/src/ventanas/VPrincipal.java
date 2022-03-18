package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VPrincipal extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTexto;
	private JTextField txtMostrarTexto;
	private JButton btnIntroducirTexto;
	private JButton btnAbc;
	private JButton btnLimpiar;
	private JButton btnCerrar;

	/**
	 * Create the frame.
	 */
	public VPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 729, 470);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIntroduceTexto = new JLabel("Introduzca un texto");
		lblIntroduceTexto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIntroduceTexto.setBounds(28, 40, 142, 51);
		contentPane.add(lblIntroduceTexto);
		
		txtTexto = new JTextField();
		txtTexto.setBounds(218, 57, 207, 20);
		contentPane.add(txtTexto);
		txtTexto.setColumns(10);
		
		btnIntroducirTexto = new JButton("intro");
		btnIntroducirTexto.addActionListener(this);
		btnIntroducirTexto.setBounds(477, 56, 156, 23);
		contentPane.add(btnIntroducirTexto);
		
		btnAbc = new JButton("ABC");
		btnAbc.addActionListener(this);
		btnAbc.setBounds(256, 113, 89, 23);
		contentPane.add(btnAbc);
		
		txtMostrarTexto = new JTextField();
		txtMostrarTexto.setEditable(false);
		txtMostrarTexto.setBounds(136, 179, 389, 51);
		contentPane.add(txtMostrarTexto);
		txtMostrarTexto.setColumns(10);
		
		JLabel lblSalir = new JLabel("pulsa el boton de cerrar para salir");
		lblSalir.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSalir.setBounds(74, 272, 289, 23);
		contentPane.add(lblSalir);
		
		btnCerrar = new JButton("cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(307, 338, 89, 23);
		contentPane.add(btnCerrar);
		
		btnLimpiar = new JButton("limpiar");
		btnLimpiar.addActionListener(this);
		btnLimpiar.setBounds(65, 338, 89, 23);
		contentPane.add(btnLimpiar);
	}

	private void abc() {
		txtMostrarTexto.setText("ABC");
	}
	
	private void limpiar() {
		txtMostrarTexto.setText("");
		txtTexto.setText("");
	}
	
	private void intro() {
		txtMostrarTexto.setText(txtTexto.getText());
		
	}

	private void cerrar() {
		this.dispose();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btnAbc)) {
			abc();
		}
		else if (e.getSource().equals(btnCerrar)) {
			cerrar();
		}
		else if (e.getSource().equals(btnLimpiar)) {
			limpiar();
		}
		else if (e.getSource().equals(btnIntroducirTexto)) {
			intro();
		}
	}
}
