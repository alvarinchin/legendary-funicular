package banco;

/**
 * 
 */
public class TerminalBancario {
	private Lista l = new Lista();

	private int id;

	{

	}

	/**
	 * Lista de todos los productos del banco
	 */
	public Lista getProductos() {

		return l;

	}

	/**
	 * Lista de los productos de un titular
	 */
	public Lista productosDeTitular(String titular) {

		Lista pro = new Lista();

		for (int i = 0; i < l.getNumero(); i++) {
			ProductoBancario p = (ProductoBancario) l.getObjeto(i);
			if (p.getTitular().equals(titular)) {
				pro.agrega(p);
			}

		}
		return pro;
	}

	/**
	 * Saldo total del titular (la suma de los saldos de sus productos)
	 */
	public double saldoDeTitular(String titular) {
		double saldo = 0;
		Lista p = this.productosDeTitular(titular);

		for (int i = 0; i < p.getNumero(); i++)
			saldo += ((ProductoBancario) p.getObjeto(i)).getSaldo();

		return saldo;
	}

	/*
	 * Quita un producto de la lista de productos del banco (mirando que
	 * producto es equals al pasado)
	 * 
	 * @returns Si el producto no existia, devuelve false.
	 */
	public boolean cancelaProducto(ProductoBancario pb) {

		int indice = l.indiceDe(pb);
		if (indice == -1) {
			return false;
		}
		l.borra(indice);
		return true;

	}

	/**
	 * Crea una nueva cuenta para un titular y la agrega a la lista de productos
	 * del banco. La cuenta comienza con saldo 0. El codigo debera calcularlo el
	 * propio metodo, para que no coincida con otro del titular
	 */
	public Cuenta creaCuenta(String titular) {
		int codigo = CreacCodigo();
		Cuenta c = new Cuenta(titular, codigo);
		l.agrega(c);
		return c;

	}

	/**
	 * Crea una nueva tarjeta para un titular y la agrega a la lista de
	 * productos del banco. La tarjeta comienza con saldo 0. El codigo debera
	 * calcularlo el propio metodo, para que no coincida con otro del titular
	 */
	public TarjetaDeCredito creaTarjeta(String titular) {
		int codigo = CreacCodigo();
		TarjetaDeCredito t = new TarjetaDeCredito(titular, codigo);
		l.agrega(t);
		return t;
	}

	/**
	 * Crea un deposito para un titular y lo agrega a la lista de productos del
	 * banco. El deposito tiene el saldo indicado. El codigo debera calcularlo
	 * el propio metodo, para que no coincida con otro del titular
	 */
	public Deposito creaDeposito(String titular, double saldo) {
		int codigo = CreacCodigo();
		Deposito d = new Deposito(titular, codigo, saldo);
		l.agrega(d);
		return d;
	}

	private int CreacCodigo() {
		
		id+=1;
		return id-1;
	}
	
	@Override
	public String toString() {
		
		return super.toString();
	}
}
