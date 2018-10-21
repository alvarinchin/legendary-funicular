package proyectoFinal;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ListModel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.AbstractListModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.GridLayout;

public class PedidosPlatos extends JPanel {
	
	conexion
	private JTextField textFieldtotal;
	private JTextField textFieldprecio;

	/**
	 * Create the panel.
	 */
	public PedidosPlatos() {
		
		JPanel panel = new JPanel();
		
		JPanel panel_1 = new JPanel();
		
		JLabel lblTotal = new JLabel("Total: ");
		
		textFieldtotal = new JTextField();
		textFieldtotal.setEditable(false);
		textFieldtotal.setColumns(10);
		
		JLabel preciolbl = new JLabel("Precio");
		
		textFieldprecio = new JTextField();
		textFieldprecio.setEditable(false);
		textFieldprecio.setColumns(10);
		
		JButton añadirbtn = new JButton("Agregar");
		
		JPanel panel_2 = new JPanel();
		
		JButton btnBorrar = new JButton("Borrar");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addGap(20)
					.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED, 235, Short.MAX_VALUE)
							.addComponent(lblTotal)
							.addGap(18)
							.addComponent(textFieldtotal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(27))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(37)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(panel, GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(preciolbl)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(textFieldprecio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(añadirbtn)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnBorrar))
								.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(33))))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(33, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textFieldprecio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(preciolbl))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_2, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
							.addGap(13)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(añadirbtn)
								.addComponent(btnBorrar))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(textFieldtotal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblTotal))
							.addGap(2))
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 402, GroupLayout.PREFERRED_SIZE))
					.addGap(36))
		);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel detalleslbl = new JLabel("");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(144, Short.MAX_VALUE)
					.addComponent(detalleslbl)
					.addGap(137))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap(43, Short.MAX_VALUE)
					.addComponent(detalleslbl)
					.addGap(42))
		);
		panel.setLayout(gl_panel);
		
		JList listplatos = new JList();
		listplatos.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		listplatos.setToolTipText("");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addComponent(listplatos, GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addComponent(listplatos, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
		);
		panel_1.setLayout(gl_panel_1);
		setLayout(groupLayout);
setVisible(true);
ListModel model= add(comp);
listplatos.setModel(model);
	}
	public static void main(String[] args) {
		JFrame j= new JFrame();
		j.setContentPane(new PedidosPlatos());
		j.setVisible(true);
		j.pack();
		j.setDefaultCloseOperation(0);
	}
}
