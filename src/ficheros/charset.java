package ficheros;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

public class charset {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map <String, Charset> charsets = Charset.availableCharsets();
		
			Set<String> chars= charsets.keySet();
		for (String claves : chars) {
			System.out.println(claves);
		}
		
	}

}
