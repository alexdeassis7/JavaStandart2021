package com.educacionit.programa;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.educacionit.modelos.OrdenarPorId;
import com.educacionit.modelos.Persona;

public class AppPrincipal {

	public static void main(String[] args) {
		Set<Persona> personas = new TreeSet<>();

		personas.add(new Persona(1, "Mario"));
		personas.add(new Persona(2, "Fernando"));
		personas.add(new Persona(3, "Omar"));
		personas.add(new Persona(4, "Juana"));

		System.out.println("conjunto ordenado de Personas: " + personas);

		List<Persona> otrasPersonas = Arrays.asList(new Persona(4, "Juana"), new Persona(2, "Fernando") ,
				new Persona(1, "Mario") ,new Persona(3, "Omar"));

		Collections.sort(otrasPersonas, new OrdenarPorId());

		System.out.println("conjunto ordenado de Personas por ID: " + otrasPersonas);
	}

}
