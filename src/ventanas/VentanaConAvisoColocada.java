package ventanas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaConAvisoColocada extends JFrame {

	public VentanaConAvisoColocada() {
		init();
	}

	private void init() {
		setTitle("mensaje");
		setLayout(null);// no coloques tu las cosas, ya lo hago yo
		JLabel label = new JLabel("aviso Importante para decidir si o no");
		JButton aceptarButton = new JButton("Aceptar");
		JButton cancelarButton = new JButton("Cancelar");

		label.setLocation(100, 100);
		label.setSize(100, 100);

		aceptarButton.setLocation(100, 100);
		aceptarButton.setSize(100, 1000);

		cancelarButton.setLocation(100, 100);
		cancelarButton.setSize(100, 1000);

		add(label);
		add(aceptarButton);
		add(cancelarButton);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new VentanaConAvisoColocada();
	}

}
