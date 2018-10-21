package banco;

public class Cuenta extends ProductoBancario {

	public Cuenta(String titular, int codigo) {

		super(titular, codigo);
	}



	@Override
	public void movimientoSaldo(double movimiento) {
		if (this.saldo + movimiento<0) {
			throw new IllegalArgumentException(
					"El movimiento no puede ser negativo");
		}else{
			super.movimientoSaldo(movimiento);
		}
		
	}
	@Override
	public String toString(){
		String res = "Cuenta--titular: "+super.getTitular()+" saldo: "+super.getSaldo();
		return res;
		
	}

}
