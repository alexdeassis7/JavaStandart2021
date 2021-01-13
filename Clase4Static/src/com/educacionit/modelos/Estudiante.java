package com.educacionit.modelos;

public class Estudiante {
	public int a ; 
	//una variable statica pertenece a la clase y no al objeto
	//se inicializan una sola vez al iniciar el programa
	//estas variables se inicializan antes que cualquier otra 
	//variable de instancia 
	
	public static int b;
	
	public Estudiante(){
		//incremento la variable static 
		b++;
	}
	
	public void mostratInfo() {
		System.out.println("Valor de a = " + a);
		System.out.println("Valor de b = " + b);
	}
}
