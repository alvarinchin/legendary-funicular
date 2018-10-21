package serialize;

import java.io.Serializable;

public class implementaDato implements Dato, Serializable {
	private String _nombre;


	 public implementaDato(String nombre) {
		_nombre = nombre;

	}

	@Override
	public final String getNombre() {
		return _nombre;
	}

}
