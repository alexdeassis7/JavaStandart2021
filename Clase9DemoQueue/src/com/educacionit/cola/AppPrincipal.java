package com.educacionit.cola;

import java.util.LinkedList;
import java.util.Queue;

public class AppPrincipal {

	public static void main(String[] args) {
		// creamos la cola indicando el tipo de dato (OBJETO)
		Queue<Integer> cola = new LinkedList();
		// insertamos datos
		cola.offer(3);
		cola.add(14);
		cola.offer(12);
		cola.add(7);
		cola.offer(3);

		// imprimo una cola con datos
		System.out.println("Cola : " + cola);
		System.out.println("Desencole:" + cola.peek());
		while (cola.poll() != null) {

			System.out.println("Desencole:" + cola.peek());

		}
		
		//metodo de manejo de Queue
		//Para insertar : add() , offer()
		/*Para extraer : remove()  , poll();
		 * Para consultar el frente de la cola : element() ,peek()
		 * 
		 * */
		
		
	}

}
