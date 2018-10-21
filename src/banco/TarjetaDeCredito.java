/**
 * 
 */
package banco;

/**
 * @author alvaro
 *
 */
public class TarjetaDeCredito extends ProductoBancario {

	/**
	 * @param titular
	 * @param codigo
	 */
	public TarjetaDeCredito(String titular, int codigo) {
		super(titular, codigo);
		
	}
	@Override
	public void movimientoSaldo(double movimiento) {
		if (movimiento >=0) {
			throw new IllegalArgumentException("El movimiento en tarjeta no puede ser positivo");
		}
		super.movimientoSaldo(movimiento);
	}
	@Override
	public String toString() {
		String res = "Tarjeta--titular: "+super.getTitular()+" saldo: "+super.getSaldo();
		return res;
	}

}
