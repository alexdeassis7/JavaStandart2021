package com.educacionit.clase8;

import java.util.ArrayList;
import java.util.Iterator;

public class Bolsa implements Iterable {

	// Creamos una lista (Implementa la inteface List)
	private ArrayList lista = new ArrayList();

	private int tope;

	public Bolsa(int tope) {
		this.tope = tope;
	}

	public void add(Object objeto) {
		if (lista.size() <= tope) {
			lista.add(objeto);
		} else {
			throw new RuntimeException("No caben mas !");
		}
	}

	// Implementamos el metodo de la Interface
	@Override
	public Iterator iterator() {

		return lista.iterator();
	}

}
