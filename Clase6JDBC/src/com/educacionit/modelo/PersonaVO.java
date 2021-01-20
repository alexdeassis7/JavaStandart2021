package com.educacionit.modelo;

/*Al utilizar este tipo de clases , aplicamos el patron VAlue Object
 * o DTO (Data Transfer Object) en el que representamos las entidades (tablas)
 * de la base de datos , 
 * 
 *  Este patron nos facilita enormenete el transporte de la informacion,
 *  evitando que se envien gran cantidad de parametros cuando queremos 
 *  realizar un registro o actualizacion de datos ,tambien en caso qeu se modifique  la 
 *  tabla de la DB , nuestra clase debera ser modificada */

public class PersonaVO {
	private int idPersona;
	private String nombrePersona;
	private int edadPersona;
	private String profesionPersona;
	private int telefonoPersona;

	public PersonaVO() {
	}

	public PersonaVO(int idPersona, String nombrePersona, int edadPersona, String profesionPersona,
			int telefonoPersona) {
		this.idPersona = idPersona;
		this.nombrePersona = nombrePersona;
		this.edadPersona = edadPersona;
		this.profesionPersona = profesionPersona;
		this.telefonoPersona = telefonoPersona;
	}

	public PersonaVO(String nombrePersona, int edadPersona, String profesionPersona, int telefonoPersona) {
		this.nombrePersona = nombrePersona;
		this.edadPersona = edadPersona;
		this.profesionPersona = profesionPersona;
		this.telefonoPersona = telefonoPersona;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombrePersona() {
		return nombrePersona;
	}

	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}

	public int getEdadPersona() {
		return edadPersona;
	}

	public void setEdadPersona(int edadPersona) {
		this.edadPersona = edadPersona;
	}

	public String getProfesionPersona() {
		return profesionPersona;
	}

	public void setProfesionPersona(String profesionPersona) {
		this.profesionPersona = profesionPersona;
	}

	public int getTelefonoPersona() {
		return telefonoPersona;
	}

	public void setTelefonoPersona(int telefonoPersona) {
		this.telefonoPersona = telefonoPersona;
	}

	public String toString() {
		return "PersonaVO [idPersona=" + idPersona + ", nombrePersona=" + nombrePersona + ", edadPersona=" + edadPersona
				+ ", profesionPersona=" + profesionPersona + ", telefonoPersona=" + telefonoPersona + "]";
	}

}
