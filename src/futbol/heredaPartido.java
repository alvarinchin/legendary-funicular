package futbol;

public class heredaPartido implements Partido {


	@Override
	public String equipoLocal() {
		return "betis";
	}

	@Override
	public String equipoVisitante() {
		// TODO Auto-generated method stub
		return "real madrid";
	}

	@Override
	public int jornada() {
		return 1;
	}

}
