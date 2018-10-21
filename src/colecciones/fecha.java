package colecciones;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class fecha {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		Calendar c =  Calendar.getInstance();
		DateFormat df = new SimpleDateFormat("EEEE dd ' de ' MMMM ' de' yyyy ' a las' HH:mm");
		java.util.Date fecha = c.getTime();
		System.out.println(df.format(fecha));
		c.add(Calendar.DATE, 120);
		java.util.Date fecha2 = c.getTime();
		System.out.println(df.format(fecha2));
	}

}
