package com.educacionit.programa;

import com.educacionit.errorespersonalizados.MiPropiaException;
import com.educacionit.modelos.Persona;

public class AppTestMiExceptionPersonalizada {

	public static void main(String[] args) {

		Persona persona1 = new Persona(23, "Candela Francisconi");
		System.out.println(persona1.toString());

		try {

			persona1.metodoQuePuedeGenerarmeUnError(false);

		} catch (MiPropiaException e) {

			System.out.println("GetMessage Sobreescrito : " + e.getMessage());
		}
		
	}

}
