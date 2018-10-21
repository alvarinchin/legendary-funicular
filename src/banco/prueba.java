package banco;






public class prueba {

	public static void main(String[] args) {
	
		
		TerminalBancario t= new TerminalBancario();
		t.creaCuenta("Alvaro");
		t.creaTarjeta("Alvaro");
		t.creaDeposito("juan", 2000);
		t.creaCuenta("Jose");
		System.out.println(t.getProductos().toString());
		
		
	}

}
