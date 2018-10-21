package banco;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Terminal extends JFrame {
	private JTextField titulartextf;
	private JTextField saldotext;

	public Terminal() {

		TerminalBancario t = new TerminalBancario();

		JLabel titulolabel = new JLabel("Titular");
		JLabel saldolabel = new JLabel("Saldo");

		JLabel alertatext = new JLabel("");
		alertatext.setForeground(Color.RED);

		JTextPane displaytext = new JTextPane();
		displaytext.setEditable(false);

		titulartextf = new JTextField();
		titulartextf.setColumns(10);

		JButton creaCuentaButton = new JButton("Crear Cuenta");
		creaCuentaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				t.creaCuenta(titulartextf.getText());

			}
		});

		JButton creaDepositoButton = new JButton("Crear dep\u00F3sito");
		creaDepositoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					t.creaDeposito(titulartextf.getText(), Double.parseDouble(saldotext.getText()));
				} catch (NumberFormatException e) {
					t.creaDeposito(titulartextf.getText(), 0);
					alertatext.setText("Saldo por defecto 0 ");
				}
			}
		});

		JButton creaTarjetaButton = new JButton("Nueva Tarjeta");
		creaTarjetaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.creaTarjeta(titulartextf.getText());
			}
		});

		JButton productosTitularButton = new JButton("Productos del Titular");
		productosTitularButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				displaytext.setText(t.productosDeTitular(titulartextf.getText()).toString());

			}
		});

		JButton SaldoTitularButton = new JButton("Saldo del Titular");
		SaldoTitularButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String saldo = String.valueOf(t.saldoDeTitular(titulartextf.getText()));
				saldotext.setText(saldo);
			}
		});

		JButton cancelaProductoButton = new JButton("Cancelar producto");
		cancelaProductoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t.cancelaProducto(null);
			}
		});

		saldotext = new JTextField();
		saldotext.setColumns(10);

		JButton MovimientoButton = new JButton("Movimiento");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
						.createSequentialGroup().addContainerGap().addGroup(groupLayout
								.createParallelGroup(Alignment.LEADING, false).addGroup(groupLayout
										.createParallelGroup(Alignment.LEADING, false).addGroup(
												groupLayout
														.createParallelGroup(Alignment.LEADING, false)
														.addGroup(groupLayout
																.createParallelGroup(Alignment.LEADING, false)
																.addGroup(groupLayout
																		.createParallelGroup(Alignment.LEADING, false)
																		.addGroup(groupLayout
																				.createParallelGroup(Alignment.LEADING,
																						false)
																				.addGroup(groupLayout
																						.createParallelGroup(
																								Alignment.LEADING,
																								false)
																						.addGroup(groupLayout
																								.createSequentialGroup()
																								.addComponent(
																										titulartextf,
																										GroupLayout.PREFERRED_SIZE,
																										227,
																										GroupLayout.PREFERRED_SIZE)
																								.addPreferredGap(
																										ComponentPlacement.RELATED,
																										0,
																										Short.MAX_VALUE))
																						.addGroup(groupLayout
																								.createSequentialGroup()
																								.addComponent(
																										productosTitularButton)
																								.addPreferredGap(
																										ComponentPlacement.RELATED)))
																				.addGroup(groupLayout
																						.createSequentialGroup()
																						.addComponent(titulolabel)
																						.addPreferredGap(
																								ComponentPlacement.RELATED)))
																		.addGroup(groupLayout.createSequentialGroup()
																				.addComponent(creaCuentaButton)
																				.addPreferredGap(
																						ComponentPlacement.RELATED)))
																.addGroup(groupLayout.createSequentialGroup()
																		.addComponent(creaDepositoButton)
																		.addPreferredGap(ComponentPlacement.RELATED)))
														.addGroup(groupLayout.createSequentialGroup()
																.addComponent(creaTarjetaButton)
																.addPreferredGap(ComponentPlacement.RELATED)))
										.addGroup(groupLayout.createSequentialGroup().addComponent(SaldoTitularButton)
												.addPreferredGap(ComponentPlacement.RELATED)))
								.addGroup(groupLayout.createSequentialGroup().addComponent(cancelaProductoButton)
										.addPreferredGap(ComponentPlacement.RELATED))))
						.addGroup(groupLayout.createSequentialGroup().addGap(133).addComponent(alertatext))
						.addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(MovimientoButton,
								GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)))
				.addGap(6).addGroup(
						groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
										.addComponent(saldotext, GroupLayout.PREFERRED_SIZE, 103,
												GroupLayout.PREFERRED_SIZE)
										.addGap(26)
										.addComponent(displaytext, GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
										.addGap(12))
								.addGroup(groupLayout.createSequentialGroup().addComponent(saldolabel)
										.addContainerGap(218, Short.MAX_VALUE)))));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addGap(22)
				.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE).addComponent(saldolabel)
						.addComponent(titulolabel))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
						.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(titulartextf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(saldotext, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE))
						.addGap(18).addComponent(creaCuentaButton).addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(creaDepositoButton).addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(creaTarjetaButton).addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(productosTitularButton).addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(SaldoTitularButton).addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(cancelaProductoButton).addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(MovimientoButton).addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
						.addComponent(alertatext))
						.addComponent(displaytext, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
				.addGap(40)));
		getContentPane().setLayout(groupLayout);
		

		setVisible(true);
		pack();
	}

	

	public static void main(String[] args) {
		new Terminal();
	}
}