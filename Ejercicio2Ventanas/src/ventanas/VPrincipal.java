package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class VPrincipal extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton btnIr;
	private JButton btnSalir;
	
	
	/**
	 * Create the frame.
	 */
	public VPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIrOtraVentana = new JLabel("Quieres ir a la otra ventana?");
		lblIrOtraVentana.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIrOtraVentana.setBounds(86, 62, 205, 30);
		contentPane.add(lblIrOtraVentana);
		
		btnIr = new JButton("IR");
		btnIr.addActionListener(this);
		btnIr.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnIr.setBounds(46, 139, 147, 66);
		contentPane.add(btnIr);
		
		btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(this);
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSalir.setBounds(236, 139, 147, 66);
		contentPane.add(btnSalir);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btnIr)) {
			VSecundaria vSec = new VSecundaria(this, true);
			vSec.setVisible(true);
		}
		if(e.getSource().equals(btnSalir)) {
			this.dispose();
		}
	}
}
