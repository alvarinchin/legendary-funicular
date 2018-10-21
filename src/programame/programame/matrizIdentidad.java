package programame;

import java.util.Scanner;

public class matrizIdentidad {

	public static void main(String[] args) {
		
		String respuesta = "";
		Scanner in = new Scanner(System.in);
		boolean c=true;
		while ( c==true) {
			boolean identidad = true;
			int rango = in.nextInt();
			if (rango == 0) {
				c=false;
				break;

			}
			int matriz[][] = new int[rango][rango];
			for (int fila = 0; fila < matriz.length; fila++) {
				for (int columna = 0; columna < matriz.length; columna++) {
					if(in.nextInt()!=0||in.nextInt()!=1){
						identidad=false;
						break;
					}
					matriz[fila][columna] = in.nextInt();
				}
			}
			
			for (int i = 0; i < rango; i++) {
				if (matriz[i][i] != 1) {
					identidad = false;
					;
					break;
				}

			}
			if (identidad == true) {
				respuesta += "SI\n";
			} else {
				respuesta += "NO\n";
			}
		}
		System.out.println(respuesta);
	}

}
