package com.educacionit.ejercitacion;

import java.util.ArrayList;

public class Banco {

	public ArrayList<Persona> fila = new ArrayList();

	public int cuantasPersonasHay() {
		return fila.size();
	}

	public void agregarPersona(Persona persona) {
		if (!fila.contains(persona)) {
			fila.add(persona);// agregamos una persona a la collection
		} else {
			System.out.println(persona.getDni() + " Ya se encuentra en la fila !");
		}
	}

	public void eliminarPersonaDeFila(Persona persona) {
		if (fila.contains(persona)) {
			fila.remove(persona);
			System.out.println("Se borro de la fila a " + persona.getNombre());
		} else {
			System.out.println(persona.getNombre() + " No  encuentra en la fila !");
		}
	}

	public void mostrarLaFila() {
		for (Persona p : fila) {
			System.out.println("Nombre:" + p.getNombre() + ",DNI :" + p.getDni());
		}
	}

}
