package colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class colec {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		comparator <String> comparator();
		Set<String> set = new TreeSet<String>();

		String[] cosas = new String[] { "hola", "que", "tal", "hola" };
		for (String cosa : cosas) {
			set.add(cosa);
		}

		/* 
		 * 
		 * 
		 */
		String suma = "";
		for (String i : set) {

			suma += i;

		}
		System.out.print(suma);
	}

}
