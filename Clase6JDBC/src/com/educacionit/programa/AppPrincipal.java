package com.educacionit.programa;

import javax.swing.JOptionPane;

import com.educacionit.daos.PersonaDAO;
import com.educacionit.modelo.PersonaVO;

public class AppPrincipal {

	public static void main(String[] args) {
		PersonaDAO dao = new PersonaDAO();
/*   Registramos una persona en la base
//		int idIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de la persona a registrar"));
		String nombreIngresado = JOptionPane.showInputDialog("Ingrese el nombre de la persona ");
		int edadIngresada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona"));
		String profesionIngresada = JOptionPane.showInputDialog("Ingrese la profesion de la persona ");
		int telefonoIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el telefono de la persona"));

//		PersonaVO miVO =  new PersonaVO(idIngresado, nombreIngresado, edadIngresada, profesionIngresada, telefonoIngresado);
		PersonaVO miVO =  new PersonaVO( nombreIngresado, edadIngresada, profesionIngresada, telefonoIngresado);
		System.out.println("los datos de la persona son :");
		System.out.println(miVO.toString());	
		
		dao.registrarPersona(miVO);*/	
	
		//Obtenemos un registro de la base personas 		
		/*int idIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del registro que desea conocer"));
		PersonaVO personaBuscada = dao.buscarPersona(idIngresado);
		
		if(personaBuscada != null ) {
			
		JOptionPane.showMessageDialog(null, "el registro obtenido de la base es el siguiente :\nID: " 
		+ personaBuscada.getIdPersona() +" \nNOMBRE: "
		+ personaBuscada.getNombrePersona() +" \nEDAD: "
		+ personaBuscada.getEdadPersona() +" \nPROFESION: "
		+ personaBuscada.getProfesionPersona() +" \nTELEFONO: "
		+ personaBuscada.getTelefonoPersona() +" \n"
		);
		
		}else {
			JOptionPane.showMessageDialog(null, "No se logro obtener el Registro con ID = " + idIngresado );
		}*/
		
		//ELIMINAMOS UN REGISTRO DE LA TABLA PERSONA
		//String idIngresado = JOptionPane.showInputDialog("Ingrese el id del registro que desea borrar");
		
		//dao.eliminarPersona(idIngresado);
		
		int idIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de la persona que quiere Actualizar"));
		
		String nombreIngresado = JOptionPane.showInputDialog("Ingrese el nombre de la persona  que quiere Actualizar");
		int edadIngresada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona que quiere Actualizar"));
		String profesionIngresada = JOptionPane.showInputDialog("Ingrese la profesion de la persona que quiere Actualizar");
		int telefonoIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el telefono de la persona que quiere Actualizar"));
		
		PersonaVO p1 = new PersonaVO(idIngresado, nombreIngresado, edadIngresada, profesionIngresada, telefonoIngresado);
		
		dao.modificarPersona(p1);
		
		
	}

}
