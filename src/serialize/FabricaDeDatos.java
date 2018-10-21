package serialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

import com.sun.corba.se.spi.ior.Writeable;

public class FabricaDeDatos {

	/**
	 * Crea una nueva carpeta con el nombre elegido.
	 * 
	 * @param Alvaro
	 *            Gonzalez
	 * @return {@code CarpetaDatos}
	 */

	public static CarpetaDatos creaCarpetaDatos(String nombre) {

		CarpetaDatos carpeta = new implementaCarpeta(nombre);

		return carpeta;
	}

	/**
	 * Graba en fichero lo almacenado en memoria
	 * 
	 * @param fichero
	 *            , nombre de fichero de salida
	 * @param dato
	 *            , archivos a grabar
	 * @throws IOException
	 */

	public static void escribeDatoEnFichero(String fichero, Dato dato)
			throws IOException {
		FileOutputStream out = null; // escribe en el ficehro determinado
		ObjectOutputStream oout = null;// escribe de la manera que se le diga,
										// en un archivo
		try {
			out = new FileOutputStream(fichero);
			oout = new ObjectOutputStream(out);

			oout.writeObject(dato);
		} finally {

			if (oout != null) {
				oout.close();
			}

		}
	}

	public static void escribeDatoEnFichero(String fichero, Dato dato,
			boolean gzip) throws IOException {
		if (gzip == true) {
			ObjectOutputStream oout = null;
			FileOutputStream fout = null; // escribe en el ficehro determinado
			GZIPOutputStream zout = null;
			// escribe de la manera que se le
			// diga,
			// en un archivo
			try {

				fout = new FileOutputStream(fichero);
				zout = new GZIPOutputStream(fout);
				oout = new ObjectOutputStream(zout);
				oout.writeObject(dato);
			} finally {

				if (oout != null) {
					oout.close();
				}

			}
		} else {
			escribeDatoEnFichero(fichero, dato);
		}
	}

	/**
	 * Devuelve un {@code Dato} leido de un fichero.
	 * 
	 * @param fichero
	 * @return un {@code Dato}
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static Dato leeDatoDeFichero(String fichero) throws IOException {
		FileInputStream fin = null;
		ObjectInputStream oin = null;
		Dato o;
		try {
			fin = new FileInputStream(fichero);
			oin = new ObjectInputStream(fin);
			o = (Dato) oin.readObject();

		} catch (ClassNotFoundException e) {
			return null;

		} finally {
			if (oin != null) {
				oin.close();

			}

		}
		return o;
	}

	/**
	 * Lee un archivo comprimido en gzip.
	 * 
	 * @param fichero
	 * @param gzip
	 * @return
	 * @throws IOException
	 */
	public static Dato leeDatoDeFichero(String fichero, boolean gzip)
			throws IOException {
		if (gzip == true) {
			FileInputStream fin = null;
			GZIPInputStream zin = null;

			ObjectInputStream oin = null;
			Dato o;
			try {
				fin = new FileInputStream(fichero);
				zin = new GZIPInputStream(fin);

				oin = new ObjectInputStream(zin);

				o = (Dato) oin.readObject();

			} catch (ClassNotFoundException e) {
				return null;
			} finally {
				if (oin != null) {
					oin.close();
				}

			}
			return o;

		} else {
			return FabricaDeDatos.leeDatoDeFichero(fichero);
		}
	}
}
