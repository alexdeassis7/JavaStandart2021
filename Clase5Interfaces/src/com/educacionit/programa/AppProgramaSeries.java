package com.educacionit.programa;

import com.educacionit.interfaces.ISeries;
import com.educacionit.modelos.DeDos;
import com.educacionit.modelos.DeTres;

public class AppProgramaSeries {

	public static void main(String[] args) {

		DeDos ob = new DeDos();

		for (int i = 0; i < 5; i++)
			System.out.println("Siguiente valor es:" + ob.getSiguiente());

		System.out.println("\nReiniciando ");
		ob.reiniciar();

		for (int i = 0; i < 5; i++)
			System.out.println("Siguiente valor es:" + ob.getSiguiente());

		System.out.println("\n Iniciando en 100");

		ob.setComenzar(100);
		System.out.println("anterior() :" + ob.getAnterior());
		for (int i = 0; i < 5; i++)
			System.out.println("Siguiente valor es:" + ob.getSiguiente());

		System.out.println("anterior() :" + ob.getAnterior());

		System.out.println("Uso de Referencias a interface");
		
		DeDos dosObject = new DeDos();
		DeTres tresObject = new DeTres();
		//obs se declara como una referencia a una interface ISeries 
		//esto significa que se puede usar para almacenar referencias 
		//a cualquier objeto que implemente ISeries 
		ISeries obs ;
		
		for(int i = 0 ; i < 5 ; i++) {
			obs = dosObject;
			System.out.println("Siguiente valor de DeDos es : " + obs.getSiguiente());
			obs = tresObject;
			System.out.println("Siguiente valor de DeTres es : " + obs.getSiguiente());
		}	
		
		
		
		
	}

}
