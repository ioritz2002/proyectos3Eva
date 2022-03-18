package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class SeleccionarPropietario extends JDialog {

	private JButton btnConsulta;


	/**
	 * Create the dialog.
	 */
	public SeleccionarPropietario() {
		setBounds(100, 100, 863, 446);
		getContentPane().setLayout(null);
		
		JLabel lblSeleccioneCoche = new JLabel("Seleccione un propietario");
		lblSeleccioneCoche.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSeleccioneCoche.setBounds(56, 54, 248, 90);
		getContentPane().add(lblSeleccioneCoche);
		
		JComboBox cmbxSelPropietario = new JComboBox();
		cmbxSelPropietario.setBounds(267, 75, 340, 52);
		getContentPane().add(cmbxSelPropietario);
		
		btnConsulta = new JButton("CONSULTAR");
		btnConsulta.setBounds(251, 247, 296, 52);
		getContentPane().add(btnConsulta);
	}

}
