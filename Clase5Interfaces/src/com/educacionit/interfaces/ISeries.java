package com.educacionit.interfaces;

public interface ISeries {
	//las variables dentro de una interface son IMPLICITAMENTE 
	//public ,final y static y deben INICIALIZARSE!
	//POr lo tanto son esencialmente constantes y deberian
	//nombrarlas con MAYUSCULAS 
	//EJEMPLO
	//int NUMERO = 10 ;
	
	int getSiguiente();//retorna el siguiente numero de la serie 
	void reiniciar();//reinicia 
	void setComenzar(int x);//establece el valor inicial
	
}
