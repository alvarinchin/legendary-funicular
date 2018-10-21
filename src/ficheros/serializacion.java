package ficheros;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import colecciones.set;

public class serializacion {

	/**
	 * @param args
	 */
	public static void escribeMapaAFichero(Set<String> s, String fichero)
			throws IOException {
		FileOutputStream out = null;
		ObjectOutputStream oout = null;
		try {
			out = new FileOutputStream(fichero);
			oout = new ObjectOutputStream(out);
			oout.writeObject(s);
		} finally {

			if (out != null) {
				out.close();
			}
			if (oout != null) {
				oout.close();
			}
		}

	}

	public static void main(String[] args) throws IOException {
		Set<String> s = new HashSet<String>();
		Scanner in = new Scanner(System.in);
		System.out.println("introduce lineas");
		String cadena = "";
		boolean casos = true;
		while (casos) {
			cadena = in.nextLine();
			if (cadena.equals("salvar")) {
				casos = false;
				break;
			}
			s.add(cadena);
			 escribeMapaAFichero(s, "conjunto-cadenas.txt");
		
		}

		
	}
}
