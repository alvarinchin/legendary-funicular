package programame;


import java.util.Scanner;

public class matrizIdentidad {

	public static void main(String[] args) {

		String respuesta = "";// se van sumando las respuestas para que salgan
								// todas juntas el final
		Scanner in = new Scanner(System.in);
		boolean programa = true;// para que se mantenga ejecutado y antren todos
								// los valores
		while (programa == true) {
			boolean identidad = true;// si es matriz identidad o no
			int rango = in.nextInt();
			if (rango == 0) {
				programa = false;
				break;

			}
			int matriz[][] = new int[rango][rango];
			{
				for (int fila = 0; fila < matriz.length; fila++) {
					for (int columna = 0; columna < matriz.length; columna++)
						matriz[fila][columna] = in.nextInt();
				}
			}

			for (int fila = 0; fila < matriz.length; fila++) {
				for (int columna = 0; columna < matriz.length; columna++)
					if (fila == columna) {
						if (matriz[fila][columna] != 1) {
							identidad = false;
							;
							break;
						}
					} else {
						if (matriz[fila][columna] != 0) {
							identidad = false;
							break;
						}

					}

			}
			if (identidad == true) {// para que salgan todas las respuestas
									// juntas cuando metemos 0 se suman
				respuesta += "SI\n";
			} else {
				respuesta += "NO\n";
			}
		}
		System.out.printf(respuesta);
	}

}
