package com.educacionit.daos;

import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.educacionit.database.Conexion;
import com.educacionit.modelo.PersonaVO;

/*Cuanto utilizamos estas clases estamos aplicando un patron Data Acces Object
 * basicamente este patron consiste en centralizar los procesos de acceso a la base de 
 * datos evitando inconsistencias y posibles problematicas cuando esto se 
 * realiza a lo largo de la app
 * Con este patron independizamos la logica de negocio de la logica de acceso a datos
 * obteniendo mayor organizacion y flexibilidad en nuestro sistema*/
public class PersonaDAO {

	public void registrarPersona(PersonaVO miPersona) {
		Conexion conex = new Conexion();

		try {
			Statement estatuto = conex.getConnection().createStatement();
			// ejecutamos la QUERY conta la base de datos
			//con el id no debe ser PK
//			estatuto.executeUpdate("INSERT INTO persona VALUES ('" + miPersona.getIdPersona() + "','"
//					+ miPersona.getNombrePersona() + "','" + miPersona.getEdadPersona() + "','"
//					+ miPersona.getProfesionPersona() + "','" + miPersona.getTelefonoPersona() + "' )");
			
			estatuto.executeUpdate("INSERT INTO persona ( `nombre`, `edad`, `profesion`, `telefono`)  VALUES ('" + miPersona.getNombrePersona() + "','" + miPersona.getEdadPersona() + "','"
					+ miPersona.getProfesionPersona() + "','" + miPersona.getTelefonoPersona() + "' )");
			
			
			JOptionPane.showMessageDialog(null, "Se ha registrado Existosamente a " + miPersona.getNombrePersona(),
					"Informacion", JOptionPane.INFORMATION_MESSAGE);
			// libero los recursos
			estatuto.close();
			conex.desconectar();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "No se registro a " + miPersona.getNombrePersona());
		}
	}

}
