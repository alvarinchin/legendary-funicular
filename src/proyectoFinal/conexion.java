package proyectoFinal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class conexion {
	public static void main(String[] args)
			throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		crearConexion();

	}

	private static void crearConexion()
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		String url = "jdbc:mysql://192.168.1.42:3306/nba";
		String user = "root";
		String password = "root";
		Connection conexion = DriverManager.getConnection(url, user, password);
		System.out.println("conexion establecida");

		Statement instruccion = conexion.createStatement();

		String query = "SELECT * FROM equipos";
		ResultSet resultados = instruccion.executeQuery(query);

		System.out.println("listado equipos");

		while (resultados.next()) {
			String nombre = resultados.getString("Nombre");
			String ciudad = resultados.getString("Ciudad");
			String conferencia = resultados.getString("Conferencia");
			String division = resultados.getString("Division");

			System.out.printf("Nombre de equipo: %s, Ciudad %s, Conferencia %s, División: %s \n", nombre, ciudad,
					conferencia, division);
		}
	}
}
