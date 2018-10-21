package geometria;

public class Rectangulo {

	private Punto centro = new Punto();
	private double alto;
	private double ancho;

	double Xver2;
	double Yver2;

	// al restar sale el punto abajo izquiera
	double Xver3;
	double Yver3;

	

	public Rectangulo(Punto centro, double alto, double ancho) {
		this.centro = centro;
		this.alto = alto;
		this.ancho = ancho;

		
	}
	private void actualizaPunto(){
		Xver2 = centro.getX() + (ancho / 2);
		Yver2 = centro.getY() + (alto / 2);
		// al restar sale el punto abajo izquiera
		Xver3 = centro.getX() - (ancho / 2);
		Yver3 = centro.getY() - (alto / 2);
	}
	private void actualizaVerices() {
		v1.setPunto(Xver3, Yver2);
		// arriba izq
		v2.setPunto(Xver2, Yver2);
		// arriba dch
		v3.setPunto(Xver3, Yver3);
		// abajo izq
		v4.setPunto(Xver2, Yver3);
	}

	public Punto getCentro() {
		return centro;
	}

	public void setCentro(Punto p) {
		this.centro = p;
		
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
		
	}

	public double getAncho() {
		return ancho;

	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
		
	}

	public Punto[] getEsquinas() {
		Punto v1 = new Punto();
		// arriba izq
		Punto v2 = new Punto();
		// arriba dch
		Punto v3 = new Punto();
		// abajo izq
		Punto v4 = new Punto();
		// abajo dch
		Punto[] vertices = { v1, v2, v3, v4 };
		return vertices;

	}

	public double getArea() {
		return alto * ancho;
	}

	@Override
	public String toString() {
		return "arribaizquiera: " + this.getEsquinas()[0]+ "abajoderecha: " + this.getEsquinas()[3];
	}

	public static void main(String[] args) {
		Punto p1 = new Punto(3, 3);
		Punto p2 = new Punto(0, 5);

		Rectangulo r1 = new Rectangulo(p1, 4, 8);
		System.out.println(r1.toString());

		System.out.println(r1.getEsquinas()[0]);
		System.out.println(r1.getEsquinas()[1]);
		System.out.println(r1.getEsquinas()[2]);
		System.out.println(r1.getEsquinas()[3]);
		System.out.println(r1.getCentro());
		System.out.println(r1.getAlto());
		System.out.println(r1.getAncho());
		System.out.println(r1.getArea());
		r1.setAlto(6);
		r1.setAncho(15);
		r1.setCentro(p2);

		System.out.println("N " + r1.getEsquinas()[0]);
		System.out.println(r1.getEsquinas()[1]);
		System.out.println(r1.getEsquinas()[2]);
		System.out.println(r1.getEsquinas()[3]);
		System.out.println(r1.getCentro());
		System.out.println(r1.getAlto());
		System.out.println(r1.getAncho());
		System.out.println(r1.getArea());
		System.out.println(r1.toString());

	}
}
