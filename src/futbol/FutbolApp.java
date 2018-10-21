package futbol;

import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.NumberOfDocuments;

public class FutbolApp {

	public static void main(String[] args) {
		
		Partido p1 = new PartidoI("Berenjena", "Choped", 3);
		Partido p2 = new PartidoI("Frueslers", "Terruño", 3);
		Partido p3 = new PartidoI("Frueslers", "Choped", 4);
		Partido p4 = new PartidoI("Berenjena", "Terruño", 4);
		Partido p5 = new PartidoI("Berenjena", "Choped", 3);

		Gol g1 = new GolI("Choped", "Perrez", 30, p1);
		Gol g2 = new GolI("Choped", "Perrez", 80, p1);
		Gol g8 = new GolI("Berenjena", "Mochez", 81, p1);
		Gol g3 = new GolI("Terruño", "Barriguez", 55, p2);
		Gol g4 = new GolI("Frueslers", "Andobez-Vazquez", 77, p2);
		Gol g5 = new GolI("Choped", "Amebez", 55, p3);
		Gol g6 = new GolI("Frueslers", "Andobez-Vazquez", 58, p3);
		Gol g7 = new GolI("Berenjena", "Moliner", 22, p4);
		Gol g9 = new GolI("Choped", "Perrez", 30, p5);
		Gol g10 = new GolI("Choped", "Perrez", 80, p5);

		Estadistica e = new Estadistica();

		List<Gol> g = new ArrayList<Gol>();

		g.add(g1);
		g.add(g2);
		g.add(g3);
		g.add(g4);
		g.add(g5);
		g.add(g6);
//		g.add(g7);
		g.add(g8);
		g.add(g9);
		g.add(g10);

//		e.agregaPartido(p1, g);
//		e.agregaPartido(p2, g);
//		e.agregaPartido(p3, g);
//		e.agregaPartido(p4, g);
//		e.agregaPartido(p5, g);

		System.out.println(e.numeroDePartidosGanadosPorEquipo());

//		System.out.println(e.equipoGanador(p2, g) + e.numeroDePartidosGanadosPorEquipo());
//		System.out.println(e.equipoGanador(p3, g) + e.numeroDePartidosGanadosPorEquipo());
//		System.out.println(e.equipoGanador(p5, g) + e.numeroDePartidosGanadosPorEquipo());

	}


}

