package com.educacionit.condionales;

import java.util.Scanner;

public class AppPrincipal {

	public static void main(String[] args) {
		// Demo Problemas Secuenciales
		
		/* Suponga que un individuo desea invertir su capital en un banco
		 *  y desea saber cuanto dinero ganra despues de 
		 *  un mes si el banco paga a razon de 2% mesual * */
		
		//defino mis variables de trabajo 
		float capital = 0 , ganacia = 0  , porcentaje = 0.02f;
		Scanner teclado = new Scanner(System.in);
//		que entra ?
		System.out.println("por favor ingrese el capital en USD que desea invertir este mes ");
		capital = teclado.nextFloat();
//		que se procesa ?
		ganacia = capital * porcentaje;		
//		que sale ?
		System.out.println("usted recibira " + ganacia + " USD de ganancia ");
		System.out.println("el total de dinero sera " + (ganacia + capital) + " USD");

	}

}
