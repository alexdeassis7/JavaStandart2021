package com.educacionit.modelos;

//clase hija de seleccion de futbol
public class Masajista extends SeleccionFutbol {

	private int aniosExperiencia;
	private String titulacion;

	public Masajista() {
		super();// llamo al constructo VACIO DE La clase PADRE
	}

	public Masajista(int id, String nombre, String apellido, int edad, int aniosExperiencia, String titulacion) {
		// llamo al constructor ocn parametros de la clase padre
		super(id, nombre, apellido, edad);
		this.aniosExperiencia = aniosExperiencia;
		this.titulacion = titulacion;
	}

	public void darMasaje() {
		System.out.println("darMasaje() -> Clase Masajista");
	
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}
	
	
	
}
