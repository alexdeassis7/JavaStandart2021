package com.educacionit.clase8;
//https://www.codejava.net/java-core/collections/java-set-collection-tutorial-and-examples
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class AppPrincipalDemoSet {

	public static void main(String[] args) {
		// Ninguna de las implementaciones del Set con Sincronizadas , es decir ,
		// no se garantiza el estado del SET si dos o mas hilos
		// acceden de forma concurrente al mismo , esto lo podemos solucionar
		// con los metodos que actuan de Wrapper para dotar de sincronizacion a las
		// colleciones , Ejemplo:

//		Set set = Collections.synchronizedSet(new HashSet());
//		SortedSet sortedSet = Collections.synchronizedSortedSet(new TreeSet());
//		Set linkedHashSet = Collections.synchronizedSet(new LinkedHashSet());

		/* Medimos el tiempo de insercion en un HahSet */
		final Set hashSet = new HashSet(1_000_000);
		final Long startHashSetTime = System.currentTimeMillis();
		// agrego un millon de elemento en el hashSet
		for (int i = 0; i < 1_000_000; i++) {
			hashSet.add(i);
		}
		final Long endHashSetTime = System.currentTimeMillis();
		System.out.println("Tiempo de Insercion del HashSet : " + (endHashSetTime - startHashSetTime));

		/* Medimos el tiempo de insercion en un TreeSet */
		final Set treeSet = new TreeSet();
		final Long startTreeSetTime = System.currentTimeMillis();
		// agrego un millon de elemento en el TreeSet
		for (int i = 0; i < 1_000_000; i++) {
			treeSet.add(i);
		}
		final Long endTreeSetTime = System.currentTimeMillis();
		System.out.println("Tiempo de Insercion del TreeSet : " + (endTreeSetTime - startTreeSetTime));

		/* Medimos el tiempo de insercion en un LinkedHashSet */
		final Set linkedhashSet = new LinkedHashSet();
		final Long startlinkedhashSetTime = System.currentTimeMillis();
		// agrego un millon de elemento en el TreeSet
		for (int i = 0; i < 1_000_000; i++) {
			linkedhashSet.add(i);
		}
		final Long endlinkedhashSetTime = System.currentTimeMillis();
		System.out
				.println("Tiempo de Insercion del linkedhashSet : " + (endlinkedhashSetTime - startlinkedhashSetTime));

		// Creacion de un nuevo conjunto
		// Utilice siempre genericos para declara un conjunto especifico , por ejemplo
		// un conjunto de numeros enteros
		Set<Integer> numbers = new HashSet<>();
		// Set<String> names = new LinkedHashSet<>();

		/*
		 * Podemos crear un conjunto a partir de una coleccion existente .Estees un
		 * truco para eliminar elementos duplicados en una colecion que no es de Set *
		 */
		List<Integer> listNumbers = Arrays.asList(3, 9, 1, 4, 7, 2, 5, 3, 8, 9, 1, 3, 8, 6);
		System.out.println("Lista de numeros :" + listNumbers);
		Set<Integer> uniqueNumbers = new HashSet<>(listNumbers);
		System.out.println("Lista de numeros Unicos:" + uniqueNumbers);

		// con Java 8 : podemos usar una secuencia de funciones de filtro y coleccion
		// para
		// retornar un conjunto de una coleccion
		// por ejemplo podemos obtener solo los numeros impares de nuestra lista de
		// numeros
		Set<Integer> uniqueOddNumbers = listNumbers.stream().filter(number -> number % 2 != 0)
				.collect(Collectors.toSet());
		System.out.println("Los impares :" + uniqueOddNumbers);

		// Realizamos operaciones basicas
		// 1) agregamos elementos a un conjunto :
		// el metodo add() devuelve true si el conjunto no contiene el elemento
		// especificado y false si el conjunto
		// ya contiene el elemento especificado
		Set<String> names = new HashSet<>();
		names.add("Tom");
		names.add("Mary");
		names.add("fede");
		names.add("Tomas");
		names.add("Santiago");
		System.out.println("names :" + names);
		names.add(null);
		if (names.add("Marcelo")) {
			System.out.println("Marcelo fue agregado al SET ");
		}

		if (!names.add("Tom")) {
			System.out.println("Tom Ya exisitia dentro del SET ");
		}
		System.out.println("names :" + names);

		// Eliminar un elemento del conjunto
		// El metodo Remove() elimina el elemento especificado del conjunto si
		// esta presente (el metodo devuelve true o false si no existe )

		if (names.remove("Tom")) {
			System.out.println("se borro a Tom de la Collections");
		}

		System.out.println("names :" + names);

		
		// Eliminamos todos los elementos de un conjunto
		// el metod clear() elimina todos los elementos del conjunto
		//names.clear();

		// Comprobamos si un conjunto esta vacio
		// El metodo isEmpty() retorna true si el conjunto no tiene elementos de lo
		// contrario retorna False
		if (names.isEmpty()) {
			System.out.println("El Set esta vacio");
		} else {
			System.out.println("El Set aun contiene elementos");
		}
		
		//obtendo el numero total de elementos de mi conjunto 
		//metodo size()
		System.out.printf("El Set contiene %d Elementos en su interior " , names.size());
		
		//itero el conjunto mediante un for each
		for(String name: names ) {
			System.out.println(name);			
		}
		
		//Busqueda de un elemento en un conjunto 
		//utilizamos el metodo contains que retorna true o false dependiendo si el elemnto existe o no en ele conjunto
		if(names.contains("fede")) {
			System.out.println("la coleccion tiene a fede en su interior ");
		}
		
		//Tarea 
		//imvestigar metodos de
//		1) operacion de subconjunto -> set1.containsAll(set2) 
//		2) Operacion sindical    -> set1.addAll(set2)
//		3) Operacion de interccion  ->   set1.retailAll(set2) 
	}

}
