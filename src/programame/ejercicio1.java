package programame;

import java.util.Scanner;

public class ejercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] cadena = in.nextLine().toCharArray();
		int intervalos = Integer.parseInt(in.nextLine());
		int[] posiciones = new int[intervalos * 2];
		for (int i = 0; i < intervalos * 2; i++) {
			posiciones[i] = in.nextInt();
		}
		for (int i = 0; i < intervalos; i++) {
			
		}

	}

}
