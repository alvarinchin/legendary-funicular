package banco;

public class Deposito extends ProductoBancario {

	public Deposito(String titular, int codigo, double saldo) {
		super(titular, codigo, saldo);
		if (saldo < 0) {
			throw new IllegalArgumentException(
					"No se puede crear un deposito con saldo negtivo");
		}

	}

	@Override
	public void movimientoSaldo(double movimiento) {

		throw new IllegalArgumentException(
				"No se pueden realizar movimientos en un depósito");
	}
	@Override
	public String toString() {
		
		String res = "Depósito--titular: "+super.getTitular()+" saldo: "+super.getSaldo();
		return res;
	}
}
