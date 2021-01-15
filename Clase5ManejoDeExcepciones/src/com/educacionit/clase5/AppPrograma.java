package com.educacionit.clase5;

public class AppPrograma {

	public static int numerador = 10;
	//public static int denominador = 0;
	public static Integer denominador = null;
	public static float division;

	public static void main(String[] args) {
		// 1
		System.out.println("ANTES DE LA DIVISION");
		try {
			// 2
			division = numerador / denominador;
		} catch (ArithmeticException ex) {
			// si sucede una exception doy el valor '0' al atributo 'division'
			division = 0;
			System.out.println("getMessage() : " + ex.getMessage());
			//ex.getCause();
			//ex.printStackTrace();
		}catch (NullPointerException e) {
			//si la exception es de un null doy valor 1 al atributo 'division'
			division = 1 ;
			System.out.println("getMessage() : " + e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		finally {
			System.out.println("Resultado Division = " + division);
			// 3
			System.out.println("DESPUES DE LA DIVISION");
		}

//		try {
//			// Instruccion propensas a lanzar una Exception
//
//		} catch (ArithmeticException e) {
//			// Instrucciones a ejecutar cuando se produce una exception
//		} catch (NullPointerException e) {
//			// Instrucciones a ejecutar cuando se produce una exception
//		} catch (Exception e) {
//			// Instrucciones a ejecutar cuando se produce una exception
//		} finally {
//			// Instrucciones que se ejecutan , tanto si sucede
//			// una exception como sino sucede
//		}

	}

}
