package colecciones;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class set {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		boolean programa = true;
		Set<String> set = new HashSet<String>();
		while (programa) {
			String cadena = in.nextLine();
			if (cadena.equals("fin")) {
				programa = false;
				break;
			}
			set.add(cadena);
		}
		for (String i : set) {

			System.out.println(i);
		}
	}

}
