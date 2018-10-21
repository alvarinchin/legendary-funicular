package programame;

import java.util.Scanner;

public class carreras {

	public static void main(String[] args) {

		String respuesta = "";// se van sumando las respuestas para que salgan
								// todas juntas el final
		Scanner in = new Scanner(System.in);
		int programa = 0;// cuenta los casos para saber cuando parar

		int casos = in.nextInt();// los valores
		while (programa < casos) {
			int coches = 0;// numero de coches que resultan
			int nPilas = in.nextInt();// cuantas pilas vamos a meter en el
										// programa
			int voltaje = in.nextInt();// voltaje minimo para que funcione el
										// coche
			int[] pilas = new int[nPilas];
			for (int i = 0; i < pilas.length; i++) {// metemos al array tantas
													// pilas como hayamos dicho
													// en nPilas
				pilas[i] = in.nextInt();
			}
			for (int i = 0; i < nPilas; i++) {
				for (int j = i; j < nPilas; j++) {// almcceno todos los voltajes
													// de las pilas en un array
					if (i == j) {
						break;
					}
					if (pilas[i] + pilas[j] >= voltaje) { 
						/*cuando encurentra una combinacion los quita del array poniendolos a 0*/
						coches += 1;
						
					}
				}
			}

			respuesta += String.valueOf(coches) + "\n";
			programa++;
		}
		System.out.printf(respuesta);
	}

}
