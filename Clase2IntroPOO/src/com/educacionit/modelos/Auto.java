package com.educacionit.modelos;

public class Auto {
	// atributos de la clase : definene las caracteriticas de la clase
	public String color;
	public String modelo;
	public short cantidadDePuertas;
	public String transmision;
	public String tipo;
	public boolean esUsado;

	// Sobrecarga de metodos constructores
	// Constructor 1 Vacio
	public Auto() {
		// si definimos un constructor con parametros
		// automaticamente perdemos el constructor VACIO!!!
	}

	// Constructor 2 con 3 parametros
	public Auto(String color, String modelo, boolean esUsado) {
		this.color = color;
		this.modelo = modelo;
		this.esUsado = esUsado;
	}

	// contructor 3 con todos los parametros
	public Auto(String color, String modelo, short cantidadDePuertas, String transmision, String tipo,
			boolean esUsado) {
		this.color = color;
		this.modelo = modelo;
		this.cantidadDePuertas = cantidadDePuertas;
		this.transmision = transmision;
		this.tipo = tipo;
		this.esUsado = esUsado;
	}

	// metodos de la clase : definene el comportamiento de la clase
	public void acelerar(int Kilometros) {
		System.out.println("estoy acelerando mi " + modelo + " a " + Kilometros + " x Hs.");
	}

	public void frenar() {
		System.out.println("estoy frenando mi " + modelo);
	}

	public String toString() {
		return "Auto [color=" + color + ", modelo=" + modelo + ", cantidadDePuertas=" + cantidadDePuertas
				+ ", transmision=" + transmision + ", tipo=" + tipo + ", esUsado=" + esUsado + "]";
	}

}
