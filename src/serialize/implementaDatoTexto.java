package serialize;

import java.io.Serializable;

public class implementaDatoTexto extends implementaDato implements DatoTexto,
		Serializable {
	public implementaDatoTexto(String nombre, String valor) {
		super(nombre);
		this.valor = valor;
	}

	private String valor;

	@Override
	public String getValor() {
		// TODO Auto-generated method stub
		return valor;
	}

	/**
	 * Dos{@code DatosTexto} son iguales si tienen el mismo nombre y valor.
	 * 
	 * @return true si son iguales.
	 */
	@Override
	public boolean equals(Object obj) {
		implementaDatoTexto p1 = null;
		// Creamos un objeto vacio
		if (super.equals(obj)) {
			return true;
			// si la clase padre dice que es igual. lo es
		}
		if (obj instanceof implementaDatoTexto) {
			p1 = (implementaDatoTexto) obj;
			// si es una instancia le convertimos en el objeto intermedio
		}

		else {
			return false;
		}

		if (this.getNombre().equals(p1.getNombre())
				&& this.getValor().equals(p1.getValor())) {
			return true;
			// por ultimo la clausula, si nombre y valor son igual, son iguales
		}

		return false;
	}

	@Override
	public String toString() {
		return super.getNombre();

	}

}
