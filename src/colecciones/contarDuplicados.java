package colecciones;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class contarDuplicados {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, Integer> mapa = new HashMap<String, Integer>();

		Scanner in = new Scanner(System.in);
		String linea = in.nextLine();
		while (!linea.equals("fin")) {

			Integer veces = mapa.get(linea);
			if (veces == null) {
				mapa.put(linea, 1);
			} else {

				mapa.put(linea, veces + 1);

			}
			linea = in.nextLine();
		}
		System.out.println("sin ordnear");
		for (String i : mapa.keySet()) {
			System.out.printf("%s --> %d\n", i, mapa.get(i));
		}
		System.out.println("ordenado");
		for (String i : conjuntoOrdenado(mapa.keySet())) {
			System.out.printf("%s --> %d\n", i, mapa.get(i));
		}
		System.out.println("ordenado");
		for (String i : conjuntoOrdenadoVeces(mapa)) {
			System.out.printf("%s --> %d\n", i, mapa.get(i));
		}
		
	}

	private static SortedSet<String> conjuntoOrdenado(Set<String> keySet) {
		
		SortedSet<String> ret= new TreeSet<String>();
		 ret.addAll(keySet);
		 return ret;
			
		
	}
private static SortedSet<String> conjuntoOrdenadoVeces(Map<String,Integer> mapa) {
		
		
		SortedSet<String> ret=new TreeSet<String>();
		ret.addAll(mapa.keySet());
		
		
			
			
		
		 return ret;
		
	}
}
