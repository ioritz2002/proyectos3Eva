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

public class VContraseniaIncorrecta extends JDialog implements ActionListener{
	private JButton btnVolver;

	/**
	 * Create the dialog.
	 * @param b 
	 * @param vPrincipal 
	 */
	public VContraseniaIncorrecta(VPrincipal vPrincipal, boolean b) {
		super(vPrincipal);
		this.setModal(b);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Contrase\u00F1a incorrecta");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(34, 42, 243, 41);
		getContentPane().add(lblNewLabel);

		btnVolver = new JButton("volver");
		btnVolver.addActionListener(this);
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnVolver.setBounds(115, 131, 144, 41);
		getContentPane().add(btnVolver);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btnVolver)) {
			this.dispose();
		}
	}

}
