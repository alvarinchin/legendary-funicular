package banco;

import java.util.Arrays;

public class Lista {
	private Object[] inventario = new Object[1000];
	private Object vacio = ' ';

	/**
	 * Se crea inicialmente vacia
	 */
	public Lista() {
		Arrays.fill(inventario, 0, inventario.length, vacio);

	}

	/**
	 * Numero de objetos actualmente almacenados
	 */
	public int getNumero() {
		for (int i = 0; i < inventario.length; i++) {
			if (inventario[i] == vacio) {
				return i;

			}

		}
		return 1000;
	}

	/**
	 * Devuelve el objeto almacenado en la posicion indicada. Si la posicion no
	 * es valida (entre 0 y numero()-1), lanza un IndexOutOfBoundsException
	 */
	public Object getObjeto(int indice) throws IndexOutOfBoundsException {
		Object p = new Object();
		if (indice == 0 & inventario[0].equals(vacio)) {
			throw new IndexOutOfBoundsException("la lista esta vacia");

		}
		if (indice < 0 || indice > getNumero()) {
			throw new IndexOutOfBoundsException();
		}
		try {

			p = inventario[indice];
		} catch (NullPointerException e) {
			return null;
		}
		return p;
	}

	/**
	 * Agrega un objeto al final de la lista. Si ya hay 1000 objetos
	 * almacenados, lanza una IndexOutOfBoundsException
	 */
	public void agrega(Object o) throws IndexOutOfBoundsException {

		try {
			inventario[getNumero()] = o;

		} catch (ArrayIndexOutOfBoundsException e) {
			throw new IndexOutOfBoundsException();
		}

	}

	/**
	 * 
	 * Busca con equals el objeto en la lista
	 * 
	 * @return El indice del objeto en la lista, o -1 si no esta contenido.
	 */
	public int indiceDe(Object o) {
		for (int i = 0; i < inventario.length; i++) {
			if (inventario[i].equals(o)) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Borra un objeto de la lista. El hueco se rellena moviendo una unidad a la
	 * izquierda los objetos de indice mayor
	 */
	public void borra(int indice) throws IndexOutOfBoundsException {
		int fin = getNumero();
		inventario[indice] = vacio;
		while (getNumero() < fin - 1) {
			int hueco = getNumero();
			inventario[hueco] = inventario[hueco + 1];
			inventario[hueco + 1] = vacio;
		}

	}

	/**
	 * Devuelve la conversion a cadena de objetos contenidos, separados por coma
	 */
	@Override
	public String toString() {

		String primerOb = "";
		String cadena = "";
		for (int j = 0; j < inventario.length; j++) {

			if (inventario[j] == vacio) {
				break;
			}
			if (j == 0) {
				primerOb = String.valueOf(inventario[j]);
			}
			if (j > 0) {
				cadena += String.valueOf(inventario[j]+"\n");
			}

		}

		return primerOb + cadena;
	}@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}


}
