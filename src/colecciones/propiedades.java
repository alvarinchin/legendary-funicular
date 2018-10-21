package colecciones;

import javax.management.RuntimeErrorException;

import com.sun.xml.internal.fastinfoset.sax.Properties;

public class propiedades {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.getProperties();
		java.util.Properties p = System.getProperties();
		Runtime r = 

		System.out.println(p.toString());
		System.out.println("la version de java es : "+System.getProperty("java.vm.specification.version"));
		System.out.println("el sistema operativo es : "+System.getProperty("os.name"));
		System.out.println("la franja horaria es : "+ System.getProperty("user.timezone"));
		System.out.println("El pais es : "+System.getProperty("user.country"));
	
		Runtime.getRuntime();
		
	}

}
