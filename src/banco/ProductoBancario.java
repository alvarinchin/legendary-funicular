package banco;



/**
 * 
 */
public abstract class ProductoBancario {

	private String titular;
	protected double saldo;
	private int codigo;

	/**
	 * @param
	 * 
	 */
	public ProductoBancario(String titular, int codigo) {
		this.saldo = 0;
		this.titular = titular;
		this.codigo = codigo;
	}

	public ProductoBancario(String titular, int codigo, double saldo) {
		this.saldo = saldo;
		this.titular = titular;
		this.codigo = codigo;
	}

	/**
	 * Saldo actual del producto (positivo, a favor del cliente)
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * El codigo del producto
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * El titular del producto
	 */
	public String getTitular() {
		return titular;

	}

	/**
	 * Movimiento de saldo, a sumar al saldo del producto.
	 */
	public void movimientoSaldo(double movimiento){
		saldo += movimiento;
		
	}

	/**
	 * Dos productos son iguales si tienen el mismo cliente y el mismo codigo
	 */
	@Override
	public boolean equals(Object o) {
		ProductoBancario p1 = null;
		if (super.equals(o)) {
			return true;
		}
		if (o instanceof ProductoBancario ) {
			 p1 = (ProductoBancario) o;
		}

		else{
			return false;
		}
		
		if (this.titular.equals(p1.getTitular())
				&& this.codigo == (p1.getCodigo())) {
			return true;
		}

		return false;
	}
	
	

}
