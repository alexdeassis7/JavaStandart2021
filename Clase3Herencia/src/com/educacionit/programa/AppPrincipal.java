package com.educacionit.programa;

import java.util.ArrayList;
import java.util.Iterator;

import com.educacionit.modelos.*;

public class AppPrincipal {
//array de objetos seleccion de futbol , independientemente de la clase hija a la que pertenezca el objeto 
	public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();
	
	public static void main(String[] args) {
		Entrenador delBosque = new Entrenador(1, "Vicente", "Del Bosque", 59, "4585EW12");
		Futbolista iniesta = new Futbolista(2, "Andres", "iniesta", 29, 6, "Interior Izquierdo");
		Masajista raulMartinez = new Masajista(3, "Raul", "Martinez", 40, 17, "Lisenciado en casi todo y Fisioterapia");
		
		//agrego los objetos al array 
		integrantes.add(delBosque);
		integrantes.add(iniesta);
		integrantes.add(raulMartinez);
		
		//EJECUTAMOS LOS METODOS DE LA CLASE PADRE
		//CONCENTRACION 
		System.out.println("todos los integrantes comienzan un aconcentracion (todos ejecutan el mismo metodo)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.println(integrante.getNombre() + " " +integrante.getApellido() + " -> ");
			integrante.concentrarse();
		}
		
		//Viaje 
		System.out.println("todos los integrantes viajan a jugar un partido (todos ejecutan el mismo metodo)");
		for (SeleccionFutbol integrante : integrantes) {
			System.out.println(integrante.getNombre() + " " +integrante.getApellido() + " -> ");
			integrante.viajar();
		}
		
		//ejecuto los metodos particulares de cada clase hija 
		
		System.out.println("Entrenamiento solo el entrenador y el futbolista tienen metodos para entrenar ");
		System.out.println(delBosque.getNombre() + " " +delBosque.getApellido() + " -> ");
		delBosque.dirigirEntrenamiento();
		System.out.println(iniesta.getNombre() + " " +iniesta.getApellido() + " -> ");
		iniesta.entrenar();
		
		System.out.println("Masaje solo el masajista puede darlos ");
		System.out.println(raulMartinez.getNombre() + " " +raulMartinez.getApellido() + " -> ");
		raulMartinez.darMasaje();
		
		System.out.println("partido de futbol , solo entrenador y futbolista tienen metodos para el partido ");
		System.out.println(delBosque.getNombre() + " " +delBosque.getApellido() + " -> ");
		delBosque.dirigirPartido();
		System.out.println(iniesta.getNombre() + " " +iniesta.getApellido() + " -> ");
		iniesta.jugarPartido();
		

	}

}
