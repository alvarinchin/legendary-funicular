package futbol;

import java.util.ArrayList;
import java.util.List;

public class prueba {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Estadistica e = new Estadistica();
		List<String> clasificacionEquipos = e.clasificacionEquipos();
		List<String> pichici = e.clasificacionPichichi();
		
		heredaPartido p = new heredaPartido();
		heredaGol g = new heredaGol();
		heredaGol2 g2 = new heredaGol2();
		heredaGol3 g3 = new heredaGol3();
		ArrayList<Gol> goles = new ArrayList<Gol>();
		CopyOfheredaPartido p2= new CopyOfheredaPartido();
		CopyOfCopyOfheredaPartido p3= new CopyOfCopyOfheredaPartido();
		goles.add(g);
		goles.add(g2);
		goles.add(g3);
		
		e.agregaPartido(p3, goles);
		e.agregaPartido(p, goles);
		for (Gol gol : goles) {
			System.out.println("gol"+gol.jugador());
		}
		System.out.println("equipo ganador" + e.equipoGanador(p, goles));
		System.out.println("partidos ganados por equipos" + e.numeroDePartidosGanadosPorEquipo());

		
		System.out.println("clasificacion de pichichi"+pichici);
		e.agregaPartido(p2, goles);

	}
}
