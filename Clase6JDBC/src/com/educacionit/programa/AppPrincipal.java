package com.educacionit.programa;

import javax.swing.JOptionPane;

import com.educacionit.daos.PersonaDAO;
import com.educacionit.modelo.PersonaVO;

public class AppPrincipal {

	public static void main(String[] args) {

//		int idIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de la persona a registrar"));
		String nombreIngresado = JOptionPane.showInputDialog("Ingrese el nombre de la persona ");
		int edadIngresada = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la persona"));
		String profesionIngresada = JOptionPane.showInputDialog("Ingrese la profesion de la persona ");
		int telefonoIngresado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el telefono de la persona"));

//		PersonaVO miVO =  new PersonaVO(idIngresado, nombreIngresado, edadIngresada, profesionIngresada, telefonoIngresado);
		PersonaVO miVO =  new PersonaVO( nombreIngresado, edadIngresada, profesionIngresada, telefonoIngresado);
		System.out.println("los datos de la persona son :");
		System.out.println(miVO.toString());
		
		PersonaDAO dao = new PersonaDAO();
		
		dao.registrarPersona(miVO);
		
	}

}
