package com.educacionit.modelos;

//Clase Padre
public class SeleccionFutbol {
	/*
	 * protected : sirve para indicar visibilidad de los atributos y metodos ,
	 * significa que cuando un atributo es protegido , solo es visible ese atributo
	 * o metodo desde las clase hijas y no desde otra clase
	 */
	protected int id;
	protected String nombre;
	protected String apellido;
	protected int edad;

	public SeleccionFutbol() {

	}

	public SeleccionFutbol(int id, String nombre, String apellido, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	public void concentrarse() {
		System.out.println("concentrarse() clase padre");
	}

	public void viajar() {
		System.out.println("viajar() clase padre");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	
}
