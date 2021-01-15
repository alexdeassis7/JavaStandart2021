package com.educacionit.modelos;

import com.educacionit.errorespersonalizados.MiPropiaException;

public class Persona {

	private int id;
	private String nombre;

	public void metodoQuePuedeGenerarmeUnError(boolean lanzarError) throws MiPropiaException {
		if (lanzarError) {
			// lanzar un error
			throw new MiPropiaException();
		} else {
			System.out.println("No se lanzo tu error personalizado ");
		}
	}

	public Persona(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + "]";
	}

}
