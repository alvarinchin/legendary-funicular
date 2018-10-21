package ventanas;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import sun.security.util.PendingException;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

public class CalculadoraBasica extends JFrame {

	public CalculadoraBasica() {
		initComponents();
	}

	private void initComponents() {
		setVisible(true);
		setTitle("calculadora básica");
		
		setLayout(new BorderLayout());
		final JTextField texto1 = new JTextField("0");
		final JTextField texto2 = new JTextField("0");
		JButton sumar = new JButton("SUMAR");
		JButton restar = new JButton("RESTAR");
		JButton reset = new JButton("RESET");
		final JLabel resul = new JLabel("resultado");
		JLabel botones = new JLabel();
		JLabel entrada = new JLabel ("entradas");
		
		JPanel panelbotones = new JPanel();
		panelbotones.setLayout((new GridLayout(1, 3)));
		panelbotones.add(sumar);
		panelbotones.add(restar);
		panelbotones.add(reset);
	
		botones.add(panelbotones);
		botones.setSize(500,100);
		
		JPanel entradas = new JPanel();
		entradas.setLayout((new GridLayout(1, 2)));
		entradas.add(texto1);
		entradas.add(texto2);
		
		entrada.add(entradas);
	
		
		add(entradas,BorderLayout.NORTH);
		add(panelbotones,BorderLayout.CENTER);
		add(resul,BorderLayout.SOUTH);
		setSize(500, 600);
		panelbotones.setSize(400, 100);
		entradas.setSize(400, 100);
		
		sumar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String s = texto1.getText();
				String s2 = texto2.getText();
				try {
					int i2 = Integer.parseInt(s2);
					int i = Integer.parseInt(s);
					resul.setText("" + (i + i2));
				} catch (ParseException e) {
					resul.setText("no es un numero");
				}
			}
		});
		restar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String s = texto1.getText();
				String s2 = texto2.getText();
				try {
					int i2 = Integer.parseInt(s2);
					int i = Integer.parseInt(s);
					resul.setText("" + (i - i2));
				} catch (ParseException e) {
					resul.setText("no es un numero");
				}
			}
		});
		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				resul.setText("0");
				texto1.setText("0");
				texto2.setText("0");
			}
		});

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new CalculadoraBasica();
	}

}
