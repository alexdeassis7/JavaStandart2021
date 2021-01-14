package com.educacionit.programa;

import com.educacionit.interfaces.IConstante;

public class AppContantesDEMO implements IConstante {

	public static void main(String[] args) {
		int numeros[] = new int[MAX];
		for (int i = MIN; i < 11; i++) {
			if (i >= MAX)
				System.out.println(MSJERROR);
			else {
				numeros[i] = i;
				System.out.println(numeros[i] + "");
			}
		}
	}

}
