package com.educacionit.modelos;

//clase hija de seleccion de futbol
//extends: indica cual va a ser el padre de esta clase 
public class Futbolista extends SeleccionFutbol {
	
	
	private int dorsal;
	private String demarcacion;

	public Futbolista() {
		//super me sirve para invocar al constructor de la clase padre!
		super();
	}
	public Futbolista(int id, String nombre, String apellido, int edad ,int dorsal , String demarcacion) {
		super(id, nombre, apellido, edad);
		this.dorsal = dorsal;
		this.demarcacion = demarcacion;
	}

	public void jugarPartido() {
		System.out.println("jugarPartido() -> clase Futbolista");
	}

	public void entrenar() {
		System.out.println("entrenar() -> clase Futbolista");
	}
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public String getDemarcacion() {
		return demarcacion;
	}
	public void setDemarcacion(String demarcacion) {
		this.demarcacion = demarcacion;
	}
	
	

}
