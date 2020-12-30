package com.educacionit.repetitivos;

public class EjericicoForReloj {

	public static void main(String[] args) {
		/*
		 * simular el comportamiento de un reloj digital , imprimiendo la hs , minutos y
		 * segundos de un dia desde 0:0:0 has las 23:59:59
		 */
		for (int hs = 0; hs < 24; hs++) {
			for (int min = 0; min < 60; min++) {
				for (int seg = 0; seg < 60; seg++) {
					System.out.println(hs + ":" + min + ":" + seg);
				}
			}
		}
	}

}
