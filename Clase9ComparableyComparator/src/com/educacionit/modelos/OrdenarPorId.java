package com.educacionit.modelos;

import java.util.Comparator;

public class OrdenarPorId implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		return o1.getIdPersona() - o2.getIdPersona();
	}

}
