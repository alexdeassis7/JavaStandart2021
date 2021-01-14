package com.educacionit.modelos;

import com.educacionit.interfaces.ISeries;

public class DeDos implements ISeries {
	int iniciar;
	int valor;
	int anterior;

	public DeDos() {
		iniciar = 0;
		valor = 0;
	}

	@Override
	public int getSiguiente() {
		anterior = valor;
		valor += 2;
		return valor;
	}

	@Override
	public void reiniciar() {
		valor = iniciar;
		anterior = valor - 2;

	}

	@Override
	public void setComenzar(int x) {
		iniciar = x;
		valor = x;
		anterior = x - 2;
	}

	// agregamos un metodo que no esta definido en Series
	public int getAnterior() {
		return anterior;
	}

}
