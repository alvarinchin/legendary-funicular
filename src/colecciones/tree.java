package colecciones;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class tree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Set<String> s = new TreeSet<String>();
		boolean pro = true;
		Scanner in = new Scanner(System.in);

		while (pro) {
			String cadena = in.nextLine();
			if (cadena.equals("fin")) {
				pro = false;
				break;
			}
			s.add(cadena);
		}
		for (String i : s) {
			System.out.println(i);
		}
	}

}
