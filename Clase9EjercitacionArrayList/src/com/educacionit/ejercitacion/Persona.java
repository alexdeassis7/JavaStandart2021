package com.educacionit.ejercitacion;


public class Persona {

	private String nombre;
	private String apellido;
	private String dni;

	public Persona(String dni, String apellido, String nombre) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
	}

	@Override
	public boolean equals(Object obj) {
		Persona p = (Persona) obj ;		
		return p.getDni().equals(this.dni);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	

	
}
