package futbol;

public class heredaGol3 implements Gol {
	heredaPartido p = new heredaPartido();
	@Override
	public String equipoMarcador() {
		// TODO Auto-generated method stub
		return "betis";
	}

	@Override
	public String jugador() {
		// TODO Auto-generated method stub
		return "mendozaaaa";
	}

	@Override
	public int minuto() {
		// TODO Auto-generated method stub
		return 12;
	}

	@Override
	public Partido partido() {
		// TODO Auto-generated method stub
		return p;
	}

}
