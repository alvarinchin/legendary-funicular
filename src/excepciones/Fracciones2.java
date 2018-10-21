package excepciones;

import java.text.ParseException;

public class Fracciones {

	public static long[] entenderFraccion(String s) throws ParseException {
		long[] fracciones = new long[2];

		String[] letras = s.split("/");
		if (letras.length != 2) {
			throw new ParseException("Formato erróneo", 0);
		}
		try {

			fracciones[0] = Long.parseLong(letras[0]);
			fracciones[1] = Long.parseLong(letras[1]);

		} catch (NumberFormatException e) {
			throw new ParseException("Formato erróneo", 0);
		}

		return fracciones;

	}

	public static double valorDeFraccion(String s)
			throws IllegalArgumentException, ArithmeticException {
		long division = 0;
		long num = 0;
		long den = 0;
		try {
			num = entenderFraccion(s)[0];
			den = entenderFraccion(s)[1];

			if (den == 0) {
				throw new ArithmeticException();
				if ( )
			}
			division = num / den;

		} catch (ParseException e) {
			throw new IllegalArgumentException("Fraccion incorrecta" + e);
		}

		return division;
	}

	/*
	 * public static String dividirFraccion(String dividendo, String divisor) {
	 * }
	 */
}
