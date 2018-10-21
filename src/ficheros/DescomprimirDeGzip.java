package ficheros;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class DescomprimirDeGzip {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
		InputStream zin = null;
		zin = null;
		OutputStream out = System.out;
		try {
		/*	zin = new GZIPInputStream(in);
		 * int b= zin.read(); // leer byte a byte
			while (b != -1){
				out.write(b);
				zin.read();
				out.write(b);
			}*/
			zin = new GZIPInputStream(in);
			byte buffer []= new byte [1<<9];
			int leidos = zin.read(buffer);
			while( leidos != -1){
				out.write(buffer,0,leidos);
				leidos = zin.read(buffer);
			}
		} finally{
			if(out != null){
				out.close();
			}
			
		}
	}

}
