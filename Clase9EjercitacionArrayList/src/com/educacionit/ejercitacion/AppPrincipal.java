package com.educacionit.ejercitacion;

import java.util.ArrayList;
import java.util.Iterator;

public class AppPrincipal {

	public static void main(String[] args) {
		Persona p = new Persona("999999999", "Candela", "Torres");
		Persona p1 = new Persona("22222222", "Dayanna", "Zavarce");
		Persona p2 = new Persona("33333333", "Diego", "Zubaray");
		Persona p3 = new Persona("999999999", "Federico", "Bernardi");
		Persona p4 = new Persona("55555555", "Juan", "Varela");
		Persona p5 = new Persona("55555555", "Juan", "Varela");

		Banco b1 = new Banco();

		b1.agregarPersona(p);
		b1.agregarPersona(p1);
		b1.agregarPersona(p2);
		b1.agregarPersona(p3);
		b1.agregarPersona(p4);
		b1.agregarPersona(p5);

		b1.mostrarLaFila();
		b1.eliminarPersonaDeFila(p1);
		b1.eliminarPersonaDeFila(p1);

		ArrayList<String> nombreArrayList = new ArrayList<>();
		nombreArrayList.add("Elemento");
		nombreArrayList.add("Elemento2");
		nombreArrayList.add("Elemento3");

//		nombreArrayList.add( ,"Elemento en posisicion 2");

		System.out.println(nombreArrayList.size());

		nombreArrayList.get(2);

		System.out.println("Contiene a elemento ??" + nombreArrayList.contains("Elemento"));

		System.out.println("Posiscion del elemento :" + nombreArrayList.indexOf("Elemento2"));

		// borro todos los elementos del arrayList
		// nombreArrayList.clear();

		System.out.println("Esta vacio el ArrayList ? " + nombreArrayList.isEmpty());

		// comvertimos un array List a un array
		Object[] array = nombreArrayList.toArray();

		ArrayList<String> miArray = new ArrayList<>();

		for (int i = 0; i <= 10; i++) {
			miArray.add("Elemento " + i);
		}

		miArray.add(2, "Elemento 3");// agrego elemento en la posicion 2

		// declaramos un Iterador e imprimimos los elementos del ArrayList
		Iterator<String> nombreIterator = miArray.iterator();
		System.out.println(miArray);
		while (nombreIterator.hasNext()) {
			String elemento = nombreIterator.next();
			
			if (elemento.equals("Elemento 3")) {

				nombreIterator.remove();

			}
			
//			System.out.println(elemento);
		}
	
		System.out.println(miArray);

//		int numElementos = miArray.size();
//		System.out.println("cantidad de elementos : " + numElementos);
//
//		System.out.println("elemento posicion cero :" + miArray.get(0));
//		miArray.remove(0);

		// Iterator<String> ni = miArray.iterator();

		
	}

}
