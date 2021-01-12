package com.educacionit.programa;
import com.educacionit.modelos.Passenger;
import com.educacionit.modelos.Vuelo;
import com.educacionit.modelos.VueloCarga;

public class AppPrincipal {

	public static void main(String[] args) {
		Passenger marcelo = new Passenger("marce");
		Passenger pepe = new Passenger("pepe");
		Passenger abigail = new Passenger("abigail");
		Passenger Dayanna = new Passenger("Dayanna");

		VueloCarga vc = new VueloCarga();
		// agrego paquetes
		vc.agregarPaquete(10, 10, 2);
		vc.agregarPaquete(1, 1, 2);
		vc.agregarPaquete(10, 10, 25);

		// agrego pasajeros
		vc.agregarPasajero(Dayanna);
		vc.agregarPasajero(pepe);
		vc.agregarPasajero(abigail);
		for (int i = 0; i < 15; i++)
			vc.agregarPasajero(marcelo);
		
		
		Vuelo f2 = new Vuelo(956);
		for (int i = 1; i <= 151; i++)
			f2.agregarPasajero(marcelo);
		
		
		System.out.println("vuelo carga asientos " + vc.getAsientos());
		System.out.println("vuelo asientos " + f2.getAsientos());
		
		Object[] o1 = new Object[3];
		o1[0] = new Vuelo();
		o1[1] = new Passenger("alex");
		o1[2] = new VueloCarga();
		

		Vuelo[] flota = new Vuelo[4];
		flota[0] = new Vuelo();
		flota[1] = new VueloCarga();
		flota[2] = new Vuelo();
		flota[3] = new VueloCarga();
		
		
		Object o = new Vuelo();
		
		Vuelo v5 = new VueloCarga();
		
		//ESTO NO SE PUEDE ERROR!!!
		//VueloCarga v6 = new Vuelo();
		
		
		
	}

}
