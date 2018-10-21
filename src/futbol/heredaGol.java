package futbol;

public class heredaGol implements Gol {
	heredaPartido p = new heredaPartido();
	@Override
	public String equipoMarcador() {
		// TODO Auto-generated method stub
		return "real madrid";
	}

	@Override
	public String jugador() {
		// TODO Auto-generated method stub
		return "zubizarreta";
	}

	@Override
	public int minuto() {
		// TODO Auto-generated method stub
		return 23;
	}

	@Override
	public Partido partido() {
		// TODO Auto-generated method stub
		return p;
	}

}
