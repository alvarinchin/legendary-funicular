package ficheros;

import java.io.File;
import java.io.IOException;

public class arbol {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		if (args.length != 1) {
			System.err.println("hace falta un parametro que sea un directorio");
			System.exit(1);
		}

		File dir = new File(args[0]);
		if (!dir.exists()) {
			System.err.println("hace falta un parametro que sea un directorio");
			System.exit(1);
		}

		listar(dir, "");

	}

	private static void listar(File dir, String indentacion) throws IOException {
		

		System.out.println(indentacion + dir.getCanonicalPath() + " " + longitud (dir)
				+ "Bytes");

		if (dir.isDirectory()) {

			for (File f : dir.listFiles()) {
				listar(f, indentacion + "  ");
			}
		}
	}

	private static long longitud(File dir) {
		
		if ( dir.isFile()){
			return dir.length();
		}else{ 
			long ret = 0;
			for ( File f: dir.listFiles()){
				ret+=longitud(f);
			}
			return ret;
		}
		
	}
}
