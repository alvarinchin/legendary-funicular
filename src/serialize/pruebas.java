
package serialize;

import java.io.IOException;

public class pruebas {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		CarpetaDatos c = FabricaDeDatos.creaCarpetaDatos("root");
		CarpetaDatos c1 = FabricaDeDatos.creaCarpetaDatos("root");
		c.addDatoTexto("documentos", "hola que tal");
		c1.addDatoTexto("documentos", "hola que tal");
		c.addCarpetaDatos("imagenes");
		c1.addCarpetaDatos("imagenes");
		System.out.println(c.getDatos());
		FabricaDeDatos.escribeDatoEnFichero("prueba", c);
		FabricaDeDatos.escribeDatoEnFichero("pruebagzip", c, true);
		Dato leido= FabricaDeDatos.leeDatoDeFichero("prueba");
		System.out.println(leido.getNombre());
		implementaCarpeta leido2 = (implementaCarpeta) FabricaDeDatos.leeDatoDeFichero("pruebagzip", true);
	
		System.out.println(leido2.getNombre()+leido2.getDatos().toString());
	}

}
