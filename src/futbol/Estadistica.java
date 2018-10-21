package futbol;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.swing.event.TreeExpansionEvent;

public class Estadistica {

	private Map<String, Integer> equipos2ganados = new HashMap<String, Integer>();
	private Map<String, Integer> jugador2goles = new HashMap<String, Integer>();
	private Map<String, Set<String>> equipos2goleadores = new HashMap<String, Set<String>>();
	private Comparator<String> comparadorPorGanados = comparador();
	private List<String> lista = new ArrayList<String>();
	private Set<String> listaordenada = new TreeSet<String>(
			comparadorPorGanados);
	private Comparator<String> comparadorPorGoles = comparador2();
	private List<String> listaJugadores = new ArrayList<String>();
	private Set<String> listaordenadaJugadores = new TreeSet<String>(
			comparadorPorGoles);
	Iterator itJ2Goles = jugador2goles.entrySet().iterator();

	/**
	 * Añade más datos a la estadística
	 * 
	 * @param partido
	 * @param goles
	 */
	public void agregaPartido(Partido partido, List<Gol> goles) {

		String ganador = equipoGanador(partido, goles);
		String eqL = partido.equipoLocal();
		String eqV = partido.equipoVisitante();
		Integer ganadosL = equipos2ganados.get(eqL);

		// __________________________________________________

		if (equipos2ganados.get(eqL) == null) {
			equipos2ganados.put(eqL, 0);
			ganadosL = 0;
		}
		Integer ganadosV = equipos2ganados.get(eqV);
		if (equipos2ganados.get(eqV) == null) {
			equipos2ganados.put(eqV, 0);
			ganadosV = 0;
		}
		if (eqL.equals(ganador)) {
			ganadosL += 1;
		}
		if (eqV.equals(ganador)) {
			ganadosV += 1;

		}
		actualizaEquipos2Ganados(eqL, ganadosL);
		actualizaEquipos2Ganados(eqV, ganadosV);

		// numero de goles por jugadores
		for (Gol gol : goles) {
			if (jugador2goles.get(gol.jugador()) == null) {// si no esta
				// registrado ese
				// jugador
				// metemos
				// con su
				// primer gol
				jugador2goles.put(gol.jugador(), 1);// NO almacenamos jugadores
				// sin goles
			}

			else {// si esraba,le a�adimos un gol mas
				jugador2goles.put(gol.jugador(),
						(jugador2goles.get(gol.jugador()) + 1));
			}

			// goleadores por equipos
			Set<String> jugadoresMarca = equipos2goleadores.get(gol
					.equipoMarcador());// cogemos el set del map para ir
										// actualizando valores

			if (equipos2goleadores.get(gol.equipoMarcador()) == null) {
				Set<String> map = new HashSet<String>();
				equipos2goleadores.put(gol.equipoMarcador(), map);
				jugadoresMarca = map;
			}

			jugadoresMarca.add(gol.jugador());

			equipos2goleadores.put(gol.equipoMarcador(), jugadoresMarca);// actualizo
			// el map

		}// si despues de pasar los goles no se han a�adido los equipos al map
			// lo hacemos
		compruebaGoleadores(partido);

		actualizaLista(lista, listaordenada);
		actualizaLista(listaJugadores, listaordenadaJugadores);

	}

	private void compruebaGoleadores(Partido partido) {
		if (equipos2goleadores.get(partido.equipoLocal()) == null) {
			equipos2goleadores
					.put(partido.equipoLocal(), new HashSet<String>());

		}
		if (equipos2goleadores.get(partido.equipoVisitante()) == null) {
			equipos2goleadores.put(partido.equipoVisitante(),
					new HashSet<String>());

		}
	}
		/**
		 * actualiza la lista de equipo2ganados, es decir el map que tiene el numero de partidos 
		 * ganados por equipo
		 * @param lista
		 * @param listaordenada
		 */
	private void actualizaLista(List lista, Set listaordenada) {
		lista.clear();
		listaordenada.clear();
		listaordenada.addAll(equipos2ganados.keySet());

		lista.addAll(listaordenada);
	}

	private void actualizaEquipos2Ganados(String equipo, Integer ganados) {
		equipos2ganados.put(equipo, ganados);

	}

	/**
	 * 
	 * @param partido
	 * @param goles
	 * @return El nombre del equipo ganador, o la cadena vacía si se produjo
	 *         empate
	 */
	public String equipoGanador(Partido partido, List<Gol> goles) {

		int local = 0;// puntos equipo local
		int visitante = 0; // punts equipo vsitante
		for (Gol gol : goles) { // recorremos todos los gole sy los sumamos a
								// los puntos de cada equipo

			if (gol.equipoMarcador().equals(partido.equipoLocal())) {
				local += 1;

			}
			if (gol.equipoMarcador().equals(partido.equipoVisitante())) {
				visitante += 1;

			}
		}
		// el equipo que mas goles meta es el que gana
		if (local > visitante) {
			return partido.equipoLocal();
		}
		if (visitante > local) {
			return partido.equipoVisitante();
		} else {
			return "";// o ninguno si no hay goles o hay empate
		}
	}

	/**
	 * 
	 * @return Un mapa que tiene como clave un nombre de equipo y como valor el
	 *         número de partidos que ha ganado
	 */
	public Map<String, Integer> numeroDePartidosGanadosPorEquipo() {

		Map<String, Integer> lectura = Collections
				.unmodifiableMap(equipos2ganados);
		return lectura;
	}

	/**
	 * 
	 * @return Un mapa que tiene como clave un nombre de jugador y como valor el
	 *         número de goles que ha marcado
	 */
	public Map<String, Integer> numeroDeGolesMarcadosPorJugador() {
		Map<String, Integer> lectura = Collections
				.unmodifiableMap(jugador2goles);
		return lectura;

	}

	/**
	 * 
	 * @return Un mapa que tiene como clave un nombre de equipo y como valor una
	 *         conjunto de sus jugadores que hayan marcado un gol. Si no ha
	 *         marcado ningún gol, será un conjunto vacía.
	 */
	public Map<String, Set<String>> goleadoresPorEquipo() {
		Map<String, Set<String>> lectura = Collections
				.unmodifiableMap(equipos2goleadores);
		return lectura;

	}

	/**
	 * Lista ordenada con la clasificación de los equipos. Entre dos equipos,
	 * va primero el que: - Haya ganado más partidos - Orden alfabético del
	 * nombre del equipo
	 */
	public List<String> clasificacionEquipos() {

		List<String> lectura = Collections.unmodifiableList(lista);

		return lectura;

	}
	/**
	 * Crea el comparador que ordena los equipos por jugadores ganados, si hay empate
	 * se ordena alfabeticamente
	 * @return
	 */
	private Comparator<String> comparador() {
		Comparator<String> comparadorPorGanados = new Comparator<String>() {

			@Override
			public int compare(String equipo1, String equipo2) {
				if (equipos2ganados.get(equipo1) < equipos2ganados.get(equipo2)) {
					return 1;
				} else if (equipos2ganados.get(equipo1) > equipos2ganados
						.get(equipo2)) {
					return -1;
				} else {
					return equipo1.compareTo(equipo2);
				}
			}
		};
		return comparadorPorGanados;
	}

	/**
	 * Lista ordenada con la clasificación del pichichi. Entre dos jugadores,
	 * va primero el que: - Haya metido más goles - Orden alfabético del
	 * nombre del jugador
	 */
	public List<String> clasificacionPichichi() {
		List<String> lecturaJugadores = Collections
				.unmodifiableList(listaJugadores);

		return lecturaJugadores;
	}

	private Comparator<String> comparador2() {
		Comparator<String> comparadorPorGoles = new Comparator<String>() {

			@Override
			public int compare(String jugador1, String jugador2) {
				if (jugador2goles.get(jugador1) < jugador2goles.get(jugador2)) {
					return 1;
				} else if (jugador2goles.get(jugador1) > jugador2goles
						.get(jugador2)) {
					return -1;
				} else {
					return jugador1.compareTo(jugador2);
				}
			}
		};
		return comparadorPorGoles;
	}

	/**
	 * 
	 * @return Un mapa con clave el minuto de partido (0 a ???), y con valores
	 *         la lista de goles metidos en ese minutos
	 */
	public Map<Integer, List<Gol>> golesPorMinutoDePartido() {
		return null;
		// TODO
	}

}
