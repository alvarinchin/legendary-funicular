package ficheros;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class ComprimirEnGzip {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		InputStream in = System.in;
		OutputStream out = System.out;
		GZIPOutputStream zout = null;

		try {
		/*int b=0; //leyendo byte a byte
			zout = new GZIPOutputStream(out);
			while (b != -1){
				 b = in.read();
				zout.write(b);*/
			zout = new GZIPOutputStream(out);
			byte buffer [] = new byte [1<<9];
			
			int leidos = in.read(buffer);
			while ( leidos != in.read(buffer)){
				zout.write(buffer,0,leidos);
				leidos = in.read(buffer);
			}
			
		} finally {
			if (zout != null)
				zout.close();
		}
	}
}
