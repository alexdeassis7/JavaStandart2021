package com.educacionit.clase2;

/*1)	Calcular el promedio de 50 valores almacenados en un Vector. 
Determinar además cuantos son mayores que el promedio, 
imprimir el promedio, y una lista de valores mayores que el promedio .*/
public class AppPrincipalDos {

	public static void main(String[] args) {
		float[] arrayValores = new float[50];
		float[] arrayDeValoresMayoresAlPromedio;
		float sumatoria = 0, promedio = 0;
		int cantidadDeDatosMayoresAlPromedio = 0;

		// cargamos el array con datos de manera aleatoria
		for (int i = 0; i < arrayValores.length; i++) {
			arrayValores[i] = (float) Math.random() * 100 + 1;
			// System.out.println(arrayValores[i]);
			sumatoria += arrayValores[i]; // sumo todos los valores del array en la variable sumatoria
		}
		// calculo el promedio
		promedio = sumatoria / arrayValores.length;
		System.out.println("el promedio es : " + promedio);

		// recorremos el vector buscando los datos mayores al promedio
		for (int i = 0; i < arrayValores.length; i++) {
			if (arrayValores[i] > promedio) {
				cantidadDeDatosMayoresAlPromedio++;
			}
		}
		// le damos un tamanio al vector de datos mayores al promedio
		arrayDeValoresMayoresAlPromedio = new float[cantidadDeDatosMayoresAlPromedio];

		int j = 0;
		for (int i = 0; i < arrayValores.length; i++) {
			if (arrayValores[i] > promedio) {
				arrayDeValoresMayoresAlPromedio[j] = arrayValores[i];
				j++;
			}
		}

		System.out.println("La cantidad de datos mayores que el promedio es : " + cantidadDeDatosMayoresAlPromedio);
		System.out.println("Vector con lo datos iniciales :");
		for (int i = 0; i < arrayValores.length; i++) {
			System.out.println("arrayValores[" + i + "] = " + arrayValores[i]);
		}

		System.out.println("Estos son lo datos superiores al promedio :");
		for (int i = 0; i < arrayDeValoresMayoresAlPromedio.length; i++) {
			System.out.println("arrayDeValoresMayoresAlPromedio[" + i + "] = " + arrayDeValoresMayoresAlPromedio[i]);
		}

	}

}
