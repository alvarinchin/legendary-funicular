package ventanas;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConversorEuroPeseta extends JFrame {

	public ConversorEuroPeseta() {
		initComponents();

	}

	private void initComponents() {
		setVisible(true);
		setTitle("Conversor: €<-------->pta");

		final JTextField pesetas = new JTextField("0");
		JLabel flecha = new JLabel("<--------------------------------------->");
		JLabel info = new JLabel("");

		final JTextField euros = new JTextField("0");

		setLayout(new BorderLayout());
		JPanel entrada = new JPanel();
		entrada.setLayout((new GridLayout(1, 2)));

		entrada.add(pesetas);
		entrada.add(flecha);
		entrada.add(euros);

		add(entrada, BorderLayout.NORTH);

		setSize(200, 100);

		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				String pta = pesetas.getText();
				String eur = euros.getText();
				double eu = 0;
				double p = 0;
				double resul = 0;
				try {
					eu = Integer.parseInt(eur);
					p = Integer.parseInt(pta);
				} catch (NumberFormatException j) {

					System.out.println("no es un numero valido");
				}
				euros.setText(String.valueOf(eu / 166));
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub

			}
		});

		pack();
	}

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		new ConversorEuroPeseta();
	}
}
