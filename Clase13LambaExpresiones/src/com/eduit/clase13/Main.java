package com.eduit.clase13;

public class Main {

	public static void main(String[] args) {
		
		
		//crearmos una referencia a una instancia de miValor
		Mivalor miVal;
		
		//asignamos una expresion lambda a esa referencia de interfaz 
		//usa una lambda en un contexto de asignacion
		miVal = () -> 28.6 ;
		
		//comvinamos los dos pasos anteriores en uno solo 
		Mivalor mival2 = () -> 3.8;
		
		
		System.out.println("Un Valor Constante:" + mival2.getVAlor());
		System.out.println("Otro valor constante:" + miVal.getVAlor());
		
		MiValParam miValor = (n) -> 1.0 / n;
		System.out.println("El Reciproco de 4.0 es : " + miValor.getValor(4.0));
		
		MiValParam miValor2 = (double n) -> 1.0 / n ;
		
		System.out.println("El Reciproco de 4.0 es : " + miValor2.getValor(4.0));
		
		
		//Esta Expresion Lambda determina si un String es parte de otra 
		PruebaString esParte = (a,b) ->a.indexOf(b) != -1 ;
		
		String str = "Esto es una prueba";
		System.out.println("Probando String : "  + str);
		
		if(esParte.prueba(str, "es una"))
			System.out.println("'es una' ENCONTRADO en la cadena");
		else
			System.out.println("'es una ' NO FUE encontrado en la cadena" );
		
		
		if(esParte.prueba(str, "xyz"))
			System.out.println("'xyz' ENCONTRADO en la cadena");
		else
			System.out.println("'xyz' NO FUE ENCONTRADO en la cadena");
	}

}
