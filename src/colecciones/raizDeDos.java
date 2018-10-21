package colecciones;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

public class raizDeDos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MathContext mc = new MathContext(300);
		BigDecimal bi = new BigDecimal("1.5");
		BigDecimal bd = new BigDecimal(0);
		BigDecimal dos = new BigDecimal("2");
		String anterior = bi.toString();
		
		for (int i = 0; i < 6; i++) {
			
		
			bi = bi.add(dos.divide(bi,mc)).divide(dos,mc);

			
			System.out.println(bi);
		int iguales = cuantosIguales(ahora,anterior);
		if (cuantoiguales >=200){
		break;
			
		}
		}

				
				
	}

}
