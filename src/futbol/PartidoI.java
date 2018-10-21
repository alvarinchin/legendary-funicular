package futbol;

/*Clase creada para pruebas de la estadística.
 * implementa la interfaz Partido en este mismo
 * paquete.
 */

public class PartidoI implements Partido {

	private String equipoLocal;

	private String equipoVisitante;

	private int jornada;

	public PartidoI() {

		equipoLocal = "";

		equipoVisitante = "";

		jornada = 0;

	}

	public PartidoI(String equipoLocal, String equipoVisitante, int jornada) {

		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.jornada = jornada;

	}

	@Override
	public String equipoLocal() {

		return equipoLocal;
	}

	@Override
	public String equipoVisitante() {

		return equipoVisitante;
	}

	@Override
	public int jornada() {

		return jornada;
	}

}
