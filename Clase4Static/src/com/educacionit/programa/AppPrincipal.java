package com.educacionit.programa;

import com.educacionit.modelos.Estudiante;

public class AppPrincipal {
	static int variable1;
	static int variable2;
	
	static {
		variable1 = 100 ;
		variable2 = 500 ;
	}

	public static void main(String[] args) {
		System.out.println("Valor de variable1 " + variable1);
		System.out.println("Valor de variable2 " + variable2);
		
		Estudiante e1 = new Estudiante();
		e1.mostratInfo();
		Estudiante e2 = new Estudiante();
		e2.mostratInfo();

		Estudiante.b++;

		e2.mostratInfo();
		e2.mostratInfo();
		//un metodo static se ejecuta directamene desde la clase
		AppPrincipal.metodoDeClase();
	
	}

	
	public static void metodoDeClase () {
		System.out.println("hola soy statico no necesita una instancia para hacer uso de mi ");
	}
}
