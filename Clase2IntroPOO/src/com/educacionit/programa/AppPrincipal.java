package com.educacionit.programa;

import com.educacionit.modelos.Auto;

public class AppPrincipal {

	public static void main(String[] args) {
		//instanciamos objetos de la clase Auto
		//imvocando al metodo Constructor VACIO!
		Auto a1 = new Auto();
		Auto a2 = new Auto();
		
		a2.color = "verde";
		a2.modelo = "mercedez c250";
		
		Auto a3 = new Auto();
		a3.color = "blanca";
		a3.modelo = "Toyota Hilux";
		//utilizamos el contructor con 
		//3 parametro para crear un nuevo objeto
		Auto a4 = new Auto("negro", "Audi A5", true);
		 //instanciamos un objeto Auto utilizamos el constructor con todos los parametros 
		short cantidadPuertas = 2 ;
		
		Auto a5  = new Auto("amarillo", "peugeot 208",  cantidadPuertas, "manual", "cabriolette", false);
		
		
		
		//accedo a los atributos de la clase auto
		//y los muestro por consola!
		System.out.println("color:" + a1.color);
		System.out.println("modelo : " +  a1.modelo);
		System.out.println("cantidad de puertas " + a1.cantidadDePuertas);
		System.out.println("tipo de transmision " +a1.transmision);
		System.out.println("tipo de Auto " +a1.tipo);
		System.out.println("es usado ?? " + a1.esUsado);
		
		//modificamos el ESTADO de los atributos del objeto
		a1.color = "rojo";
		a1.modelo = "bmw x1";
		a1.cantidadDePuertas = 5;
		a1.transmision = "automatica";
		a1.tipo = "SUV";
		a1.esUsado = false;
		
		System.out.println("color:" + a1.color);
		System.out.println("modelo : " +  a1.modelo);
		System.out.println("cantidad de puertas " + a1.cantidadDePuertas);
		System.out.println("tipo de transmision " +a1.transmision);
		System.out.println("tipo de Auto " +a1.tipo);
		System.out.println("es usado ?? " + a1.esUsado);
		//invocamos a los metodos de la clase Auto 
		a1.acelerar(120);
		a1.frenar();
		
		//imvocamos al metodo toString (Heredado de Object)
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		System.out.println(a4.toString());
		System.out.println(a5.toString());
		
		

	}

}
