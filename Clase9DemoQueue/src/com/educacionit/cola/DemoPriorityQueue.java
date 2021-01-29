package com.educacionit.cola;

import java.util.PriorityQueue;

public class DemoPriorityQueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> cola1 = new PriorityQueue<>();

		// cargamos la cola de numeros en forma desordenada
		cola1.add(70);
		cola1.add(120);
		cola1.add(6);
		cola1.add(177);
		cola1.add(788);
		cola1.add(1958);
		cola1.add(1992);

		for (int i = 0; i < 10; i++) {
			cola1.add(i);
		}

		System.out.println("Imprimimos la cola prioritaria");

		while (!cola1.isEmpty()) {
			System.out.print(cola1.poll() + " - ");
		}

	}

}
