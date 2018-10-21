package geometria;

public class Circulo {
	private double radio;
	private Punto centro;//no sabemos lo que vale

	public Circulo(Punto centro, double radio) {
		this.centro = new Punto();// punto nuevo, sin parametros
		this.centro = centro;//mi centro es igual al que me dan
		this.radio = radio;
	}

	public Punto getCentro() {
		return centro;
	}

	public void setCentro(Punto p) {
		this.centro = p;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		if (radio<0) {
			throw new IllegalArgumentException();
		}
		this.radio = radio;
	}

	public double getArea() {

		return (Math.PI) * (Math.pow(radio, 2));
	}
	public boolean equals(Circulo obj) {
		if ( this.getCentro().getX()==obj.getCentro().getX() && this.getCentro().getY()==obj.getCentro().getY() ){
			return true;
		}else {
			return false;
		}
		
	};

	@Override
	public String toString() {
		return "Centro: " + centro.toString() + "Radio: " + this.radio;
	}

	public static void main(String[] args) {
		Punto p1 = new Punto(2, 3);
		Punto p2 = new Punto(4,4);
		Circulo c1 = new Circulo(p1, 2);
		System.out.println(c1.toString());
		c1.setCentro(p2);
		System.out.println(c1.toString());
		System.out.println("area"+c1.getArea());
		c1.setRadio(-3);
		System.out.println("area 2 "+c1.getArea());
		
	}
}
