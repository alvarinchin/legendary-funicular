package futbol;

public class GolI implements Gol {

	/*
	 * Clase para pruebas de Estadística. Implementa la interfaz Gol.
	 */

	private String equipoMarcador;

	private String jugador;

	private int minuto;

	private Partido p;

	public GolI() {

		equipoMarcador = "";

		jugador = "";

		minuto = 0;

		p = null;

	}

	public GolI(String equipoMarcador, String jugador, int minuto, Partido p) {

		this.equipoMarcador = equipoMarcador;
		this.jugador = jugador;
		this.minuto = minuto;
		this.p = p;

	}

	@Override
	public String equipoMarcador() {

		return equipoMarcador;
	}

	@Override
	public String jugador() {

		return jugador;
	}

	@Override
	public int minuto() {

		return minuto;
	}

	@Override
	public Partido partido() {

		return p;
	}

}
