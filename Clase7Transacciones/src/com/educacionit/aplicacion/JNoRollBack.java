package com.educacionit.aplicacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JNoRollBack {

	public static void main(String[] args) {
		Connection connection = DataBase.getConnection();

		PreparedStatement stmt1 = null;
		PreparedStatement stmt2 = null;

		try {
			stmt1 = connection.prepareStatement("INSERT INTO mitabla VALUES (?, ?)");
			stmt2 = connection.prepareStatement("INSERT INTO miotratabla VALUES (?, ? ,? )");

			System.out.println("Primer insert en MITABLA");
			stmt1.setInt(1, 36789444);
			stmt1.setString(2, "adeassis@mail.com");
			stmt1.executeUpdate();

			System.out.println("Segundo insert en MITABLA");
			stmt1.setInt(1, 37589555);
			stmt1.setString(2, "pepe@mail.com");
			stmt1.executeUpdate();

			System.out.println("Tercero insert en MITABLA");
			stmt1.setInt(1, 12312666);
			stmt1.setString(2, "argento@mail.com");
			stmt1.executeUpdate();

			System.out.println("Primer insert en MIOTRATABLA");
			stmt2.setString(1, "Alex");
			stmt2.setString(2, "de assis");
			// Forzamos un error
			stmt2.setString(3, "ERROOOOoooOOOooooooOOOR");

			stmt2.executeUpdate();

		} catch (SQLException e) {
			System.out.println("FAllo alguna de las querys ");
		}
	}

}
