package com.educacionit.daos;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import com.educacionit.database.Conexion;
import com.educacionit.errores.customizados.PersonaInexistenteException;
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
			// con el id no debe ser PK
//			estatuto.executeUpdate("INSERT INTO persona VALUES ('" + miPersona.getIdPersona() + "','"
//					+ miPersona.getNombrePersona() + "','" + miPersona.getEdadPersona() + "','"
//					+ miPersona.getProfesionPersona() + "','" + miPersona.getTelefonoPersona() + "' )");

			estatuto.executeUpdate("INSERT INTO persona ( `nombre`, `edad`, `profesion`, `telefono`)  VALUES ('"
					+ miPersona.getNombrePersona() + "','" + miPersona.getEdadPersona() + "','"
					+ miPersona.getProfesionPersona() + "','" + miPersona.getTelefonoPersona() + "' )");

			JOptionPane.showMessageDialog(null, "Se ha registrado Existosamente a" + miPersona.getNombrePersona(),
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

	public PersonaVO buscarPersona(int codigo) {
		Conexion conex = new Conexion();
		PersonaVO persona = new PersonaVO();
		boolean existe = false;
		try {

			PreparedStatement consulta = conex.getConnection().prepareStatement("SELECT * FROM persona where id = ? ");
			// reemplazo el signo de pregunta de la query por el valor d ela variable codigo
			consulta.setInt(1, codigo);

			ResultSet res = consulta.executeQuery();

			while (res.next()) {
				existe = true;
				// si el resulset me trajo un registro lo cargo en el VO
				persona.setIdPersona(Integer.parseInt(res.getString("id")));
				persona.setNombrePersona(res.getString("nombre"));
				persona.setEdadPersona(Integer.parseInt(res.getString("edad")));
				persona.setProfesionPersona(res.getString("profesion"));
				persona.setTelefonoPersona(Integer.parseInt(res.getString("telefono")));
			}
			res.close();
			conex.desconectar();
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error, no se logro obtener el dato con id =" + codigo);
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		if (existe) {
			return persona;
		} else {
			return null;
		}

	}

	// metodo encargado de modificar los datos de un registro en la base
	public void modificarPersona(PersonaVO miPersona) {

		Conexion conex = new Conexion();
		
		try {
			String consulta = "UPDATE persona SET id= ? ,nombre = ? , edad=? , profesion=? , telefono= ? WHERE id= ?";
			PreparedStatement estatuto = conex.getConnection().prepareStatement(consulta);

			estatuto.setInt(1, miPersona.getIdPersona());
			estatuto.setString(2, miPersona.getNombrePersona());
			estatuto.setInt(3, miPersona.getEdadPersona());
			estatuto.setString(4, miPersona.getProfesionPersona());
			estatuto.setInt(5, miPersona.getTelefonoPersona());
			estatuto.setInt(6, miPersona.getIdPersona());
			//ejecuto la query 
			estatuto.executeUpdate();
			JOptionPane.showMessageDialog(null, "Se ha Actualizado Correctamente el registro de " + miPersona.getNombrePersona(), "Informacion",
					JOptionPane.INFORMATION_MESSAGE);
			
			estatuto.close();
			conex.desconectar();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "No se Logro Editar el Registro", "Error", JOptionPane.ERROR_MESSAGE);
		}

	}

	// metodo encargado de eliminar un registro de la tabla persona mediante su id
	public void eliminarPersona(String codigo) {
		Conexion conex = new Conexion();

		try {
			PersonaVO pvo = buscarPersona(Integer.parseInt(codigo));
			if (pvo != null) {
				Statement estatuto = conex.getConnection().createStatement();

				estatuto.executeUpdate("DELETE FROM persona WHERE id = '" + codigo + "'");
				JOptionPane.showMessageDialog(null, "Se ha eliminado Correctamente el registro", "Informacion",
						JOptionPane.INFORMATION_MESSAGE);
				estatuto.close();
				conex.desconectar();
			} else {
				throw new PersonaInexistenteException();
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "No se Logro Eliminar el Registro", "Error", JOptionPane.ERROR_MESSAGE);
		} catch (PersonaInexistenteException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}

	}

}
