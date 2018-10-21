package programame;

import java.util.Scanner;

public class CarreterasYLinces {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int contador = Integer.parseInt(in.nextLine());
		String resultado = "";

		int casos = 0;
		while (casos != contador) {
			String linea = in.nextLine();
			char[] cadena = linea.toCharArray();
			int contadoPuntos = 0;

			for (int i = 0; i < cadena.length; i++) {
				if (cadena[i] == '.') {
					contadoPuntos += 1;
					i += 2;
				}
			}

			resultado += contadoPuntos + "\n";

			casos += 1;
		}
		System.out.printf(resultado);

	}
}
