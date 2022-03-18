package ventanas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VSecundaria extends JDialog implements ActionListener{
	private JButton btnVolver;

	/**
	 * Create the dialog.
	 */
	public VSecundaria(VPrincipal padre, boolean modal) {
		super(padre);
		this.setModal(modal);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		btnVolver = new JButton("Volver");
		btnVolver.addActionListener(this);
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnVolver.setBounds(44, 98, 317, 78);
		getContentPane().add(btnVolver);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btnVolver)) {
			this.dispose();
		}
		
	}
}
