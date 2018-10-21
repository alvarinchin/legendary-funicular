package documentacion;
//package java.util;


 
/**
 * Se usa una instancia de esta clase para generar un stream de numeros pseudoaleatorios.
 *  La clase usa una semilla de 48-bit, que es modificada usando una formula de 
 *  congruencia lineal.( ver Donald Knuth, <i> The Art of Computer Programing, Volumen 2, </i> Seccion 3.2.1.)
 *  <p>
 *  Si se crean dos instancias de {@code Random} con la misma semilla, y se llama a l amisma secuencia de metodos para cada uno,
 *  generaran y devolveran una secuencia identica de numeros. Para garantizar esta propiedad, para la clase  {@Code random} se especifican algoritmos particulares.
 *  Las implementaciones de Java deben usar todos los algoritmos mostados aqui para la clase {@code random} por motivo de probabilidad absoluta del codigo de Java. 
 *  Aunque las subclases de la clase {@code random} pueden usar otros algoritmos, mientras que esten adheridos al
 *  contrato general de todos los metodos.
 *  <p>
 *  a veces es mas sencillo usar{@link java.lang.Math#random()} en luagr de algun metodo de esta clase
 *  
 * 
 * @author Alvaro
 * @since 1.7
 * @see java.lang.Math#random()
 */
@SuppressWarnings("serial")
public class MiRandom implements java.io.Serializable {
	

	

	/**
	 * genera el siguiente numero pseudoaleatorio. Las subclases deben sobreescribir
	 * este, como este es usado por todos los demás metodos.
	 * <p>
	 * <pre> {@code (seed * 0x5DEECE66DL + 0XBL) & ((1L << 48) -1)}</pre>
	 * y devuelve 
	 * <pre> {@code (int)(seed >>>( 48 - bits)).}</pre>
	 * 
	 * @param bits - random bits
	 * @return El siguiente valor pseudoaleatorio de esta secuencia 
	 * aleatoria de numeros del generedador.
	 * @since 1.1
	 */ 
	public int next(int bits) {
       return 0;
	}
}
