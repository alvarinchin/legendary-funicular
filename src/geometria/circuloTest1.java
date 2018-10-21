package geometria;

import static org.junit.Assert.*;

import org.junit.Test;

public class circuloTest1 {
	Punto pcorrecto = new Punto(2, 3);
	double radiocorrecto = 4;
	double radioerr = -2;
	Circulo c ;

	@SuppressWarnings("deprecation")
	@Test
	public void testSetCentro() {
		c = new Circulo(pcorrecto, radiocorrecto);
		c.setCentro(new Punto(3,3));
		Punto resultado = c.getCentro();
		Punto resesperado = new Punto(3,3);

		assertEquals(resesperado.getX(), resultado.getX(),2);
		assertEquals(resesperado.getY(), resultado.getY(),2);
	
	}

	@Test
	public void testSetRadio() {
		try{
			c = new Circulo(pcorrecto, radiocorrecto);
		c.setRadio(radioerr);
		
		} catch (IllegalArgumentException e){
			fail("no deberia lanzar una Illegal");
			
			
		}
		
	}

	@Test
	public void testToString() {
		
	}

}
