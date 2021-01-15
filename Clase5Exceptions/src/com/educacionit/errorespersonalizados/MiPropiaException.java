package com.educacionit.errorespersonalizados;

//para crear una exception personalizada 
//es necesario extender de Exception
public class MiPropiaException extends Exception {

	@Override
	public String getMessage() {
		return "Soy mi propio mensaje de Error";
	}

}
