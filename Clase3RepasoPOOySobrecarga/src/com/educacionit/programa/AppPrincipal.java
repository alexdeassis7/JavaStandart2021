package com.educacionit.programa;

import com.educacionit.modelos.Fecha;

public class AppPrincipal {

	public static void main(String[] args) {
		
		Fecha obj1 =  new Fecha(1,4,1992);
		System.out.println(obj1.toString());

		obj1.asignarFecha();
		System.out.println(obj1.toString());
		
		obj1.asignarFecha(17);
		System.out.println(obj1.toString());
		
		obj1.asignarFecha(16,10);
		System.out.println(obj1.toString());
		
		obj1.asignarFecha(12,5,1999);
		System.out.println(obj1.toString());
		
		
		
		System.out.println(obj1.toString());
		
		//como veo un atributo private ?
		//mediante su metodo public Getter!
		System.out.println("GetDia():"+obj1.getDia());
		System.out.println("GetMes():"+obj1.getMes());
		System.out.println("GetAnio():"+obj1.getAnio());
		
		System.out.println("modificamos el dia con el setter");
		obj1.setDia(7);
		System.out.println("GetDia():"+obj1.getDia());
	
	}

}
