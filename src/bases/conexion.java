package bases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import proyectoFinal.Plato;

public class conexion {
	public static void main(String[] args)
			throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		crearConexion();

	}

	private static void crearConexion()
			throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		String url = "jdbc:mysql://192.168.1.42:3306/proyecto_final";
		String user = "root";
		String password = "root";
		Connection conexion = DriverManager.getConnection(url, user, password);
		System.out.println("conexion establecida");

		Statement instruccion = conexion.createStatement();

		String query = "SELECT * FROM platos";
		ResultSet resultados = instruccion.executeQuery(query);

		System.out.println("platos");
		try {
			platos(resultados);
		} catch (Exception e) {
			e.printStackTrace();
		}
		while (resultados.next()) {
			String nombre = resultados.getString("cod_plato");
			String ciudad = resultados.getString("nombre");
			String conferencia = resultados.getString("precio");
			String division = resultados.getString("detalles");

			System.out.printf("Nombre de equipo: %s, Ciudad %s, Conferencia %s, División: %s \n", nombre, ciudad,
					conferencia, division);
		}
	}

	private static void platos(ResultSet resultados) throws SQLException {

		while (resultados.next()) {
			try {
				String cod_platos = resultados.getString("cod_plato");
				String nombre = resultados.getString("nombre");
				int precio = resultados.getInt("precio");
				String detalles = resultados.getString("detalles");
				new Plato(cod_platos, nombre, precio, detalles);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
