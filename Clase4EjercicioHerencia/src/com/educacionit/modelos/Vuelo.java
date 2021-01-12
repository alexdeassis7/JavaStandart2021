package com.educacionit.modelos;

//clase padre o clase base 
public class Vuelo {

	public int numVuelo;
	public int pasajeros;
	public char claseVuelo;
	public boolean[] asientosDisponibles;
	// inicializador de bloque
	{
		// ponemos todos los asientos disponibles
		asientosDisponibles = new boolean[150];
		for (int i = 0; i < getAsiento(); i++) {
			asientosDisponibles[i] = true;
		}
		System.out.println("Se ejecuto el inicializador y disponibilizo los asientos");
	}

	public Vuelo() {

	}

	public Vuelo(char claseVuelo) {
		this.claseVuelo = claseVuelo;
	}

	public Vuelo(int numVuelo) {
		this.claseVuelo = claseVuelo;
	}

	public int getAsientos() {
		return getAsiento();

	}

	public int getAsiento() {
		return 150;
	}

	public void agregarPasajero(Passenger p1) {
		if (asientoDisponible()) {
			pasajeros += 1;
			System.out.println("se agrego el pasajero " + p1.getNombre() + "al Vuelo");
		} else {
			faltaAsiento();
		}
	}

	private boolean asientoDisponible() {
		// valido que el numero de pasajeros sean menos que los asientos
		return pasajeros < getAsiento();
	}

	private void faltaAsiento() {
		System.out.println("YA NO QUEDAN MAS ASIENTO DISPONIBLES!");
	}

}
