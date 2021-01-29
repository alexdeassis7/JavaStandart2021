package com.educacionit.cola;

import java.util.*;

public class AppPrincipal2 {

	public static void main(String[] args) {

		// creamos una cola
		Queue queue = new LinkedList<>();
		// eliminar el primer elemnto de la cola
		// si la cola esta vacia lazan una Exeption
		// del tipo java.util.NoSuchElementException
		// System.out.println("remove: " + queue.remove());
		try {
			queue.remove();
		} catch (NoSuchElementException e) {
			System.out.println("no podes extraer elementos de una cola VACIA!");

		}
		// Como agregamos elemento ? Add
		// si algo sale mal se botara una exception
		queue.add("Item1");
		queue.add("Item2");
		// Usamos el metodo OFFER para agregar , si algo sale mal retornara un true /
		// false
		if (queue.offer("Item3"))
			System.out.println("se agrego item 3");
		queue.offer("Item4");

		System.out.println(queue);
		// validamos si un determinado elemto existe dentro de la cola
		System.out.println(queue.contains("Item2"));

		// eliminamos el primer elemento de la cola
		// si la cola esta vacia lanza java.util.NoSuchElementException
		System.out.println("removemos el: " + queue.remove());
		System.out.println(queue);

		// Observamos que elemnto esta en el primer puesto de la cola (sin eliminarlo)
		// si la cola esta vacia lanza java.util.NoSuchElementException
		System.out.println("Primer elemento es : " + queue.element());

		// eliminamos el primer elemento de la cola
		// si la cola esta vacia retorna NULL
		System.out.println("removemos con Pool: " + queue.poll());
		System.out.println(queue);

		// Observamos que elemento esta en el primer puesto de la cola (sin eliminarlo)
		// ,RETORNA NULL si esta vacia
		System.out.println("peek : " + queue.peek());
		System.out.println("removemos con Pool: " + queue.poll());
		System.out.println("removemos con Pool: " + queue.poll());
		System.out.println(queue);
		System.out.println("removemos con Pool: " + queue.poll());
		System.out.println("peek : " + queue.peek());
	}
}