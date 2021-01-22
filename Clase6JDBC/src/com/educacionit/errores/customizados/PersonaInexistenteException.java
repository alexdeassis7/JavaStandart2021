package com.educacionit.errores.customizados;

public class PersonaInexistenteException extends Exception {
  
	@Override
	public String getMessage() {
		return "No existe la Persona entre los registros de la DB";
	}
}
