package com.educacionit.aplicacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
	private final static String db = "demotransaccion"; // nombre de la base
	private final static String login = "root"; // nombre de user de la DB
	private final static String password = ""; // clave de la base de datos
	private final static String url = "jdbc:mysql://localhost/" + db;

	public static Connection getConnection() {
		try {
			// Obtener el drive para MySql
			Class.forName("com.mysql.jdbc.Driver");
			// obtenemos nuestra conexion
			Connection conn = DriverManager.getConnection(url, login, password);

			if (conn != null) {
				System.out.println("La conexion a la base de datos " + db + " fue exitosa!");
			}

			return conn;

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

		return null;
	}

	public static void main(String[] args) {
		DataBase.getConnection();
	}
}
