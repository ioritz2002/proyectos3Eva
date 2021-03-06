package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

public class VFormulario extends JDialog implements ActionListener{
	private JButton btnLimpiarDatos;
	private JButton btnEnviarDatos;
	private JTextField txtNombre;
	private JCheckBox chckbxErasmus;
	private JRadioButton rdbtnHombre;
	private JRadioButton rdbtnMujer;
	private JComboBox comboTitulacion;
	private JTextArea txtArea;
	private ButtonGroup grupoSexo;

	/**
	 * Create the dialog.
	 * @param b 
	 * @param vPrincipal 
	 */
	public VFormulario(VPrincipal vPrincipal, boolean modal) {
		super(vPrincipal);
		this.setModal(modal);
		setBounds(100, 100, 564, 800);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(25, 35, 100, 24);
		getContentPane().add(lblNewLabel);

		txtNombre = new JTextField();
		txtNombre.setBounds(194, 39, 214, 31);
		getContentPane().add(txtNombre);
		txtNombre.setColumns(10);

		JSeparator separator = new JSeparator();
		separator.setBounds(25, 81, 515, 2);
		getContentPane().add(separator);

		chckbxErasmus = new JCheckBox("Erasmus");
		chckbxErasmus.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chckbxErasmus.setBounds(41, 135, 200, 24);
		getContentPane().add(chckbxErasmus);

		JLabel lblNewLabel_1 = new JLabel("Sexo:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(41, 187, 100, 24);
		getContentPane().add(lblNewLabel_1);
		
		
		
		rdbtnHombre = new JRadioButton("Hombre");
		rdbtnHombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnHombre.setBounds(105, 219, 109, 23);
		getContentPane().add(rdbtnHombre);

		rdbtnMujer = new JRadioButton("Mujer");
		rdbtnMujer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnMujer.setBounds(105, 256, 109, 23);
		getContentPane().add(rdbtnMujer);
		
		grupoSexo = new ButtonGroup();
		grupoSexo.add(rdbtnHombre);
		grupoSexo.add(rdbtnMujer);

		JLabel lblNewLabel_2 = new JLabel("Titulacion:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(41, 321, 100, 24);
		getContentPane().add(lblNewLabel_2);

		comboTitulacion = new JComboBox();
		comboTitulacion.setModel(new DefaultComboBoxModel(new String[] {"", "Informatica", "Quimica", "Biologia"}));
		comboTitulacion.setToolTipText("");
		comboTitulacion.setBounds(151, 323, 200, 24);
		getContentPane().add(comboTitulacion);

		btnLimpiarDatos = new JButton("Limpiar Datos");
		btnLimpiarDatos.addActionListener(this);
		btnLimpiarDatos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLimpiarDatos.setBounds(52, 382, 178, 45);
		getContentPane().add(btnLimpiarDatos);

		btnEnviarDatos = new JButton("Enviar Datos");
		btnEnviarDatos.addActionListener(this);
		btnEnviarDatos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEnviarDatos.setBounds(275, 382, 178, 45);
		getContentPane().add(btnEnviarDatos);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 463, 530, 2);
		getContentPane().add(separator_1);

		txtArea = new JTextArea();
		txtArea.setBounds(25, 476, 472, 274);
		getContentPane().add(txtArea);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btnLimpiarDatos)) {
			limpiar();
		}
		if (e.getSource().equals(btnEnviarDatos)) {
			enviar();
		}
		
	}

	private void enviar() {
		txtArea.setText("");
		txtArea.insert("Nombre: " + txtNombre.getText(), 0);
		if (chckbxErasmus.isSelected()) {
			txtArea.append("\nErasmus: Si");
		}
		txtArea.append("\nSexo: ");
		
		if (rdbtnHombre.isSelected()) {
			txtArea.append("Hombre");
		}
		if (rdbtnMujer.isSelected()) {
			txtArea.append("Mujer");
		}
		
		if (comboTitulacion.getSelectedIndex() > 0) {
			txtArea.append("\nTitulacion: " + comboTitulacion.getSelectedItem().toString());
		}
		
	}

	private void limpiar() {
		txtNombre.setText("");
		chckbxErasmus.setSelected(false);
		rdbtnHombre.setSelected(false);
		rdbtnMujer.setSelected(false);
		comboTitulacion.setSelectedIndex(-1);
		txtArea.setText("");
	}
}
