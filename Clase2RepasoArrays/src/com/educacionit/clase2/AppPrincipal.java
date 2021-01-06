package com.educacionit.clase2;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*2)	Llenar dos vectores A y B de 45 elementos cada uno, sumar 
 * el elemento uno del vector A con el elemento uno del vector B 
 * y así sucesivamente hasta 45, almacenar el resultado en un vector C,
 *  e imprimir el vector resultante por pantalla.*/
public class AppPrincipal {
	public static void main(String[] args) {
		int tamanio = 45;
		// defino los vectores
		int[] vectorA = new int[tamanio];
		int[] vectorB = new int[tamanio];
		int[] vectorC = new int[tamanio];
		
//		Scanner teclado = new Scanner(System.in);
//		Otra alternativa para capturar datos por teclado es utilizando  la libreria "javax.swing"
//		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa un numero"));
//		JOptionPane.showMessageDialog(null, "Usted ingreso el numero " + numero );
		
//		for (int i = 0; i < tamanio; i++) {
//			System.out.println("ingrese el elemento "+ i + " del vector A");
//			vectorA[i] = teclado.nextInt();
//			System.out.println("ingrese el elemento "+ i + " del vector B");
//			vectorB[i] = teclado.nextInt();
//			vectorC[i] = vectorA[i] + vectorB[i]; // sumamos a + b =c
//			System.out.println(vectorA[i] + "+" + vectorB[i] + "=" + vectorC[i]);
//		}
		
		
		// Cargamos el vector A y B de manera aleatoria
		for (int i = 0; i < tamanio; i++) {
			// casteamos un dato double a int
			vectorA[i] = (int) (Math.random() * 100);
			vectorB[i] = (int) (Math.random() * 100);
			vectorC[i] = vectorA[i] + vectorB[i]; // sumamos a + b =c
			System.out.println(vectorA[i] + "+" + vectorB[i] + "=" + vectorC[i]);
		}
	}
}
