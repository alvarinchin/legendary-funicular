package ventanas;
import javax.swing.*;

public class InterfazUsuario extends JFrame{
	
	public InterfazUsuario(){
		init();
	}
	
	private void init(){
		setTitle("mi primera ventana");
		setSize(640,480);
		setVisible(true);
		
	}

	/**
	 * se puede hacer una nueva jframe o hacer que la clase extienda de ella.
	 * @param args
	 */
	public static void main(String[] args) {

		new InterfazUsuario();
	}

}
