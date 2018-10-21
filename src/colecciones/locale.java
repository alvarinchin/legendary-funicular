package colecciones;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

public class locale {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] availableIDs = TimeZone.getAvailableIDs();
		Locale[] availablesLocales = Locale.getAvailableLocales();
		for (Locale locale : availablesLocales) {
			for (String tzId : availableIDs) {
				TimeZone tz = TimeZone.getTimeZone(tzId);
				DateFormat df = new SimpleDateFormat(
						"EEE, dd 'de MMM 'de' YYY 'a las' HH:mm", locale);
				df.setTimeZone(tz);
				System.out.printf("%s: %s: %s\n", tzId, locale,df.format(new Date()));
			}
		}
	}

}
