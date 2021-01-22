package com.educacionit.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.Period;

/*En esta clase tendremos la cadena de conexion con la que trabajara nuestra app,
 * en esta se definira la base de datos , el user , la password y el 
 * driver a utilizar para establecer la conexion , por defecto en MySql
 * el usuario es root y la password =  vacio  */
public class Conexion {

	static String db = "personas"; // nombre de la base
	static String login = "root"; // nombre de user de la DB
	static String password = ""; // clave de la base de datos
	static String url = "jdbc:mysql://localhost/" + db;

	// creamos un objeto de tipo conection
	Connection conn = null;

	// constructor de la clase Conexion
	public Conexion() {
		try {
			// Obtener el drive para MySql
			Class.forName("com.mysql.jdbc.Driver");

			// obtenemos nuestra conexion
			conn = DriverManager.getConnection(url, login, password);

			if (conn != null) {
				System.out.println("La conexion a la base de datos " + db + " fue exitosa!");
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

	// metodo que nos retorna la conexion
	public Connection getConnection() {
		return conn;
	}

	// metodo para desconectar a la DB
	public void desconectar() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			conn = null;
			System.out.println("Se logro cerrar correctamente la conexion a la DB " + db);
		}
	}

}
