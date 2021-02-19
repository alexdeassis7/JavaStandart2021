package com.educacionit.programa;

import java.util.stream.Stream;
import java.util.*;
import java.util.function.Predicate;

public class AppPrincipal {

	public static void main(String[] args) {
//		######################################## MAP #########################

		String[] myVector = new String[] { "bob", "alice", "paul", "ellie" };

		for (int i = 0; i < myVector.length; i++) {
			System.out.println(myVector[i]);
		}

		// comieza conviertiendo el array en un Stream
		Stream<String> myStream = Arrays.stream(myVector);

		// Luego llama al metodo map , pasando una expresion lambda , una que uede
		// comvertir una cadena a mayusculas ,
		Stream<String> myNewStream = myStream.map(s -> s.toUpperCase());

		// El stram retornado en el paso anterior (myNewStream) contiene las cadenas
		// modificadas.
		// ahora lo comvierno de nuevo a un Array de String
		String[] myNewArray = myNewStream.toArray(String[]::new);

		// String[]::new estos es como hacer lo siguiente
//		public String[] create (int size) {
//			return new String[size];
//		}

		for (int i = 0; i < myNewArray.length; i++) {
			System.out.println(myNewArray[i]);
		}
		/**
		 * ################################### DEMO FILTER METODO
		 * ###################################
		 */
		// Filter nos permite obtener de una lista los datos que cumplan con cierto
		// criterio , dicho criterio es una
		// funcion que retorna un boolean , por ejemplo :

		List<Integer> listaNumeros = new ArrayList<Integer>();
		listaNumeros.add(44);
		listaNumeros.add(66);
		listaNumeros.add(55);
		listaNumeros.add(5);
		listaNumeros.add(55);
		listaNumeros.add(67);
		listaNumeros.add(89);
		listaNumeros.add(59);
		listaNumeros.add(59);
		listaNumeros.add(5);

		Stream st = listaNumeros.stream();
		// Contamos cuantas veces aparece el numero 5 en la lista de numeros
		System.out.println("Ocurrencias del numero buscado :");
		System.out.println(st.filter(Predicate.isEqual(5)).count());

		/**
		 * ####################################### REDUCE
		 * #############################################
		 */
		// Reduce consiste en reducir una coleccion de datos a un solo valor ,
		// por ejemplo si queremos tomar una lista de numeros y calcular la sumatoria de
		// todos ellos
		// o el promeio e incluso funciones mas complejas
		int myArray[] = { 11, 5, 8 };
		int sum = Arrays.stream(myArray).sum();

		System.out.println("La suma de todos los valores del array es : " + sum);

		String[] myArray2 = { "Soy", "Una", "De", "Las", "Ultimas", "Lineas", "De", "Codigo", "Del", "Profe" };

		for (String string : myArray2) {
			System.out.println(string);
		}
		
		String result = Arrays.stream(myArray2).reduce("", (a,b) -> a + b );
		
		System.out.println("Resultado del Reduce : " + result);

	}

}
