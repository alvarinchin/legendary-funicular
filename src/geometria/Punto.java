package geometria;



public class Punto {
	private double valorx;
	private double valory;

	public Punto() {
		valorx = 0;
		valory = 0;
	}
	public void setPunto(double x, double y){
		this.valorx=x;
		this.valory=y;
	}
	public Punto(double x, double y) {
		valorx=x;
		valory=y;
	}

	public double getX() {
		return valorx;
	}

	public double getY() {
		return valory;
	}

	public double distanciaHasta(Punto p) {

		// los valores del triangulo es la resta de x e Y
		double c = this.valorx - p.valorx;
		double d = this.valory - p.valory;
		// la hipotenusa es la distancia
		return Math.hypot(c, d);

	}

	public Punto suma(Punto p) {
		this.valorx=this.valorx + p.valorx;
		this.valory=this.valory + p.valory;

		return this;
	}

	@Override
	public String toString() {
		
		String x= Double.toString(this.valorx);
		String y= Double.toString(this.valory);
		
		return  "("+x+","+y+")";

		
	}

	public static void main(String[] args) {
		Punto p1 = new Punto(4,7);
		Punto p2 = new Punto(1,3);
		//p1.suma(p2);
		//System.out.println(p1.toString());
		System.out.println(p1.toString());
	}
}
