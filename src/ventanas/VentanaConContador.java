package ventanas;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class VentanaConContador extends JFrame {

	public VentanaConContador() {
		initComponents();
	}

	private void initComponents() {
		setVisible(true);
		setLayout(new BorderLayout());
		final JTextField texto = new JTextField("0");
		JButton boton = new JButton("&pulsa para ncrementar");

		add(texto, BorderLayout.CENTER);
		add(boton, BorderLayout.SOUTH);

		boton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String s = texto.getText();
				try {
					int i = Integer.parseInt(s);
					texto.setText("" + (i + 1));
				} catch (ParseException e) {
					texto.setText("no es un numero");
				}
			}
		});
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				new VentanaConContador();

			}
		});
	}

}
