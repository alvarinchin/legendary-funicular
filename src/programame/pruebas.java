package programame;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class pruebas {
	public static void main(String[] args) {
		Comparator<String> comparador = compadorNuevo();

		String[] palabras = { "1/3", "1/5", "1/1", "1/2", "2/6", "2/4" };
		Set<String> lista = new TreeSet<String>(comparador);
		for (String numero : palabras) {

			lista.add(numero);
		}
		System.out.println(palabras[2].compareTo(palabras[3]));// el compare
																// cuanto mayor
																// sea mas
																// negativo sale
		System.out.println(lista);
	}

	private static Comparator<String> compadorNuevo() {
		Comparator<String> nuevo = new Comparator<String>() {

			@Override

			public int compare(String enlace1, String enlace2) {
				String[] link1 = enlace1.split("/");
				String[] link2 = enlace2.split("/");
				if (link1[0].compareTo(link2[0]) == 0 && link1[1].compareTo(link2[1]) == 0) {
					return 0;
				} else if (link1[0].compareTo(link2[0]) == 0) {
					if (link1[1].compareTo(link2[1]) < 0) {
						return 1;
					} else {
						return -1;
					}

				} else {
					return link1[0].compareTo(link2[0]);
				}
			}
		};
		return nuevo;
	}

}
