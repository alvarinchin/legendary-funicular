package ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class VentanaConAviso extends JFrame {

	public VentanaConAviso() {
		init();
	}

	private void init() {
		setTitle("mensaje");
		setSize(400, 400);
		setLayout(null);// no coloques tu las cosas, ya lo hago yo
		setVisible(true);
		final JLabel label = new JLabel("aviso Importante para decidir si o no");
	
		label.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println(e);
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e);

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e);

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e);

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e);

			}
		});
		
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e);

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				System.out.println(e);

			}
		});
		
		

		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBackground(Color.pink);
		label.setOpaque(true);
		JButton aceptarButton = new JButton("Aceptar");
		JButton cancelarButton = new JButton("Cancelar");
		cancelarButton.setFont(Font.decode("Arial-bold.16"));
		cancelarButton.setBorderPainted(false);

		cancelarButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("han dado a cancelar.Tú mismo");
				label.setOpaque(false);
				label.repaint();
			}
		});
		JPanel panelbotones = new JPanel();
		panelbotones.setLayout((new GridLayout(1, 2)));
		panelbotones.add(aceptarButton);
		panelbotones.add(cancelarButton);

		setLayout(new BorderLayout());
		add(label, BorderLayout.CENTER);
		add(label);
		add(panelbotones, BorderLayout.SOUTH);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new VentanaConAviso();
	}

}
