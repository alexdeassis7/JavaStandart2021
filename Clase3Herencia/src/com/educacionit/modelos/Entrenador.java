package com.educacionit.modelos;

//clase hija de seleccion de futbol
public class Entrenador extends SeleccionFutbol {

	private String idFederacion;

	public Entrenador() {
		super();		
	}

	public Entrenador(int id, String nombre, String apellido, int edad ,String idFederacion) {
		super(id, nombre, apellido, edad);
		this.idFederacion = idFederacion;
	}

	public void dirigirPartido() {
		System.out.println("dirigirPartido() -> clase Entrenador");
	}

	public void dirigirEntrenamiento() {
		System.out.println("dirigirEntrenamiento() -> clase Entrenador");
	}

	public String getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}
	
}
