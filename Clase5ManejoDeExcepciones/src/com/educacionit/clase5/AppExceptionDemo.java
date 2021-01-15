package com.educacionit.clase5;

public class AppExceptionDemo {

	public static void main(String[] args) {
		// Aqui nums es mas "grande" que denom
		int nums[] = { 4, 8, 16, 32, 64, 128, 256, 510 };
		int denom[] = { 2, 0, 4, 4, 0, 8 };

		// Los bloques TRY pueden ser anidados

		try {// try externo

			for (int i = 0; i < nums.length; i++) {

				try {// try anidado

					System.out.println(nums[i] + " /" + denom[i] + " = " + nums[i] / denom[i]);

				} catch (ArithmeticException exc) {

					System.out.println("No se puede dividir por cero en los numeros Reales!");
				}
			}
		} catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("Alguna Excepcion Ocurrio");
			System.out.println("ERROR : Programa Finalizado ");
		}

		// CAPTURANDO EXCEEPCIONES DE LA SUBCLASE
//		for (int i = 0; i < nums.length; i++) {
//			try {
//
//				System.out.println(nums[i] + " /" + denom[i] + " = " + nums[i] / denom[i]);
//
//			} catch (ArrayIndexOutOfBoundsException e) {
//				// Capturamos la exceptio (sub clase)
//				System.out.println("no se encontro ningun elemento en el denominador ");
//			} catch (Throwable e) {
//				// capturando la exceptio de la superclase
//				//Throwable detecta todas las exceptions EXCEPTO ArrayIndexOutOfBoundsExceptio				
//				System.out.println("Alguna Exception Ocurrio.");
//			}
//
//		}

	}

}
