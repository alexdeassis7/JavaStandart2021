package com.educacionit.modelos;

//Calse hijo que hereda de vuelo 
public class VueloCarga extends Vuelo {

	public int asientos = 12;
	// pies cubicos en nuestra bodega
	public float espacioMaximoDeCarga = 1000;
	// usamos esta variable para ver la cantidad de espacio que hemos usado de la
	// bodega
	public float espacioCargaUsado;

	// metodo para agregar un paquete al avion
	public void agregarPaquete(float altura, float ancho, float profundidad) {
		double size = altura * ancho * profundidad;
		if(espacioDeCargaDisponible(size)	) {
			System.out.println("se logro agregar le paquete");
			espacioCargaUsado += size;
		}else {
			faltaEspacio();
		}

	}
	
	private boolean espacioDeCargaDisponible(double tamanio){
		return espacioCargaUsado + tamanio <= espacioMaximoDeCarga;
	}
	
	private void faltaEspacio() {
		System.out.println("No tenemos mas espacio en la bodega!");
	}
	
	@Override
	public int getAsiento() {
		return 12;
	}
	
	

}
