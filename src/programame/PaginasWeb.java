package programame;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeSet;

import com.sun.jmx.remote.util.OrderClassLoaders;

public class PaginasWeb {
	static Map<String, Integer> direccion2tiempo = new HashMap<String, Integer>();

	public PaginasWeb() {
	}

	/**
	 * Entran n paginas encontradas y n es la pagina de destino. la segunda
	 * linea es el tiempo de carga en ms que tarda cada pagina en abrirse m es
	 * el numero de enlaces que se han encontrado, sin prepeticiones y luego m
	 * casos de prueba que estan fromados por origen, destino y tiemo hasta el
	 * siguiente enlace.
	 * 
	 * Salida:
	 * 
	 * tiempo menos desde la pagina 1 a n. Si no se puede llegar sale IMPOSIBLE
	 * 
	 */

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		while (in.hasNext() == true) {
			int n = in.nextInt();// destino
			int[] tiempos = new int[n];

			for (int i = 1; i <= n; i++) {// metemos los tiempos en uyn array
											// ordenado
				tiempos[i] = in.nextInt();
			}
			int m = in.nextInt();// casos de prueba

			for (int i = 1; i < m; i++) {
				String[] ruta = in.nextLine().split(" ");
				String enlace = ruta[0] + "/" + ruta[1];
				Integer tiempo = Integer.parseInt(ruta[2]);
				direccion2tiempo.put(enlace, tiempo);
			}
			Set<String> listaDir = new TreeSet<String>();

		}
	}
	private static Comparator<String> compadorNuevo() {
		Comparator<String> nuevo = new Comparator<String>() {

			@Override

			public int compare(String enlace1, String enlace2) {
				String[] link1 = enlace1.split("/");
				String[] link2 = enlace2.split("/");
				if (link1[0].compareTo(link2[0]) == 0 && link1[1].compareTo(link2[1]) == 0) {
					return 0;
				} else if (link1[0].compareTo(link2[0]) == 0) {
					if (link1[1].compareTo(link2[1]) < 0) {
						return 1;
					} else {
						return -1;
					}

				} else {
					return link1[0].compareTo(link2[0]);
				}
			}
		};
		return nuevo;
	}

}