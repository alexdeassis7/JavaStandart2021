package com.educacionit.clase10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.educacionit.clase10.modelos.JugadorSeleccion;

import java.util.TreeMap;

public class AppPrincipal {

	public static void main(String[] args) {
		// Declaracion de un Map (Un Hash map ) con clave "Integer" y Valor "String".
		/*
		 * Las claves pueden ser de cualquier tipo de objetos , aunque lo mas utilizados
		 * como clave son los objetos predefinidos de Java como String , Integer ,
		 * Double ..... CUIDADO no Estan permitidos datos ATOMICOS *
		 */

		Map<Integer, String> nombreMap = new HashMap<Integer, String>();
		// retorna el numero de elementos del Map
		nombreMap.size();
		// retorna true si no hay elementos y false si los hay
		nombreMap.isEmpty();
		// agrega un elemento al map
		// nombreMap.put(K clave, K valor);
		// retorna el valor de la clave que se le pasa por parametro o null si la clave
		// no existe
//		nombreMap.get(k clave);
		// borra todos los elementos del map
		nombreMap.clear();
		// borar el par clave /vaor de la clave que se le pasa como parametro
//		nombreMap.remove(clave);
		// devuelve true si en el map hay una clave que coincidad con el valor enviado
//		nombreMap.containsKey(clave);
		// devuelve true si en el map hay un valor que coincide co el parametro enviado
//		nombreMap.containsValue(valor); 
		// devuelve una Collection con los valores del Map
		nombreMap.values();

		System.out.println("********************** HASH MAP  **********************************");
		System.out.println("****** Los elementos que se insertan no tienen un orden especifico ****");
		System.out.println("************  no Aceptan Claves duplicadas , ni valores nulos ***********");
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Casillas");
		map.put(3, "Pique");
		map.put(11, "Capdevila");
		map.put(16, "Busquets");
		map.put(18, "Pedrito");
		map.put(7, "Villa");
		map.put(15, "Ramos");
		map.put(5, "Puyol");
		map.put(14, "Xabi Alonso");
		map.put(8, "Xavi Hernandez");
		map.put(6, "Iniesta");

		Iterator it = map.keySet().iterator();

		while (it.hasNext()) {
			Integer key = (Integer) it.next();
			System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
		}

		System.out.println("********************** Tree MAP  **********************************");
		System.out.println("****** Los elementos que se insertan se ordenan de forma natural ****");
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(1, "Casillas");
		treeMap.put(3, "Pique");
		treeMap.put(11, "Capdevila");
		treeMap.put(16, "Busquets");
		treeMap.put(18, "Pedrito");
		treeMap.put(7, "Villa");
		treeMap.put(15, "Ramos");
		treeMap.put(5, "Puyol");
		treeMap.put(14, "Xabi Alonso");
		treeMap.put(8, "Xavi Hernandez");
		treeMap.put(6, "Iniesta");

		Iterator it2 = treeMap.keySet().iterator();

		while (it2.hasNext()) {
			Integer key = (Integer) it2.next();
			System.out.println("Clave: " + key + " -> Valor: " + treeMap.get(key));
		}

		System.out.println("********************** Linked Hash MAP  **********************************");
		System.out.println("****** Los elementos conservan el orden de insercion  ****");
		System.out.println("las busquedas de los elementos son mas lentas que las demas clases");
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		linkedHashMap.put(1, "Casillas");
		linkedHashMap.put(3, "Pique");
		linkedHashMap.put(11, "Capdevila");
		linkedHashMap.put(16, "Busquets");
		linkedHashMap.put(18, "Pedrito");
		linkedHashMap.put(7, "Villa");
		linkedHashMap.put(15, "Ramos");
		linkedHashMap.put(5, "Puyol");
		linkedHashMap.put(14, "Xabi Alonso");
		linkedHashMap.put(8, "Xavi Hernandez");
		linkedHashMap.put(6, "Iniesta");

		Iterator it3 = linkedHashMap.keySet().iterator();

		while (it3.hasNext()) {
			Integer key = (Integer) it3.next();
			System.out.println("Clave: " + key + " -> Valor: " + linkedHashMap.get(key));
		}

		System.out.println(" ********* Trabajamos con los metodos del map *********");
		System.out.println("Numero de elementos que tiene el TreeMap: " + treeMap.size());
		System.out.println("vemos si el treeMap esta vacio " + treeMap.isEmpty());
		System.out.println("Obtenemos un elemento del Map pasandole la clave 6 : " + treeMap.get(6));
		System.out.println("Borramos un elemento del map el 18 (porque fue sustituido) :" + treeMap.remove(18));
		System.out.println("Vemos que pasa si queremos obtener la clave 18 que ya no existe : " + treeMap.get(18));
		System.out.println("vemos si existe un elemento con la clave 18 : " + treeMap.containsKey(18));
		System.out.println("vemos si existe un elemento con la clave 1 : " + treeMap.containsKey(1));
		System.out.println("Vemos si existe el valor 'Villa' en el Map :" + treeMap.containsValue("Villa"));
		System.out.println("Vemos si existe el valor 'marcelo' en el Map :" + treeMap.containsValue("marcelo"));
		System.out.println("Borramos todos los elementos del Map :");
		treeMap.clear();
		System.out.println("Comprobamos si hemos eliminado viedo su tamanio " + treeMap.size());
		System.out.println("Comprobamos tambien viendo si esta vacio " + treeMap.isEmpty());

		System.out.println("ForEach: Forma altenativa para recorrer los Map mostrando la Clave y el Valor ");

		for (Entry<Integer, String> jugador : linkedHashMap.entrySet()) {
			Integer clave = jugador.getKey();
			String valor = jugador.getValue();
			System.out.println(clave + " -> " + valor);
		}

		System.out.println("******** TreeMap con objetos como Valor y como clave un String************");
		Map<String, JugadorSeleccion> jugadores = new TreeMap<String, JugadorSeleccion>();
		jugadores.put("Casillas", new JugadorSeleccion(1, "Casillas", "Arquero"));
		jugadores.put("Ramos", new JugadorSeleccion(15, "Ramos", "Lateral Derecho"));
		jugadores.put("Pique", new JugadorSeleccion(13, "Pique", "Central"));
		jugadores.put("Puyol", new JugadorSeleccion(5, "Puyol", "Central"));
		jugadores.put("Capdevila", new JugadorSeleccion(11, "CApdevila", "Lateral Izquierdo"));
		jugadores.put("Xavi", new JugadorSeleccion(14, "Xavi Alonzo", "medio centro "));

		jugadores.put("Villa", new JugadorSeleccion(7, "Villa", "Delantero"));

		for (Entry<String, JugadorSeleccion> jugador : jugadores.entrySet()) {
			String clave = jugador.getKey();
			JugadorSeleccion valor = jugador.getValue();
			System.out.println(clave + " -> " + valor);
		}

		JugadorSeleccion villa = new JugadorSeleccion(7, "Villa", "Delantero");

		System.out.println("Esta este objeto 'villa' en el Map ?? " + jugadores.containsValue(villa));

		JugadorSeleccion navas = new JugadorSeleccion(22, "Navas", "Extremo Derecho");
		jugadores.put("Nava", navas);
		System.out.println("Esta este objeto 'navas' en el Map ?? " + jugadores.containsValue(navas));

	}

}
