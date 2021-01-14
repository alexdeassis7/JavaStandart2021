package com.educacionit.modelos;

import com.educacionit.interfaces.ISeries;

 public class DeTres implements ISeries {

	int iniciar;
	int valor;

	public DeTres() {
		iniciar = 0;
		valor = 0;
	}

	@Override
	public int getSiguiente() {
		valor += 3;
		return valor;
	}

	@Override
	public void reiniciar() {
		valor = iniciar;
	}

	@Override
	public void setComenzar(int x) {
		iniciar =x ;
		valor =x;

	}

}
