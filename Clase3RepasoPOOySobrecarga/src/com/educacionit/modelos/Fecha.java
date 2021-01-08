package com.educacionit.modelos;

import java.util.Calendar;

public class Fecha {

	// defino los atributos de la clase fecha
	private int dia, mes, anio;

	public Fecha(int dia, int mes, int anio) {
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;

		if (!fechaCorrecta()) {
			// si la fecha no es correcta toammos la fecha del sistema
			Calendar fechaDelSistema = Calendar.getInstance();
			this.dia = fechaDelSistema.get(Calendar.DAY_OF_MONTH);
			this.mes = fechaDelSistema.get(Calendar.MONTH);
			this.anio = fechaDelSistema.get(Calendar.YEAR);
			this.mes++; // sumo uno al mes por que comienzan en 0(enero) y finaliza en 11 (diciembre)
		}
	}

	public boolean fechaCorrecta() {
		boolean diaCorrecto, mesCorrecto, anioCorrecto;
		anioCorrecto = (anio > 0);
		mesCorrecto = ((mes >= 1) && (mes <= 12));

		switch (mes) {
		case 2: // FEBRERO
			if (esBisiesto()) {
				diaCorrecto = (dia >= 1 && dia <= 29);
			} else {
				diaCorrecto = (dia >= 1 && dia <= 28);
			}
			break;

		case 4:// abril
		case 6: // junio
		case 9: // Septiembre
		case 11: // Noviembre
			diaCorrecto = (dia >= 1 && dia <= 30);
			break;
		default:
			diaCorrecto = (dia >= 1 && dia <= 31);
			break;
		}

		return diaCorrecto && mesCorrecto && anioCorrecto;
	}

	public boolean esBisiesto() {
		return ((anio % 4 == 0) && (anio % 100 != 0) || (anio % 400 == 0));
	}

	// SOBRECARGA DE METODOS
	// primer metodo
	public void asignarFecha() {
		// este metodo directamente setea la fehca del SO
		Calendar fechaDelSistema = Calendar.getInstance();
		setDia(fechaDelSistema.get(Calendar.DAY_OF_MONTH));
		setMes(fechaDelSistema.get(Calendar.MONTH));
		setAnio(fechaDelSistema.get(Calendar.YEAR));
		this.mes++;
	}
	// segundo metodo sobrecargado
	public void asignarFecha(int d) {
		Calendar fechaDelSistema = Calendar.getInstance();
		setDia(d);
		setMes(fechaDelSistema.get(Calendar.MONTH));
		setAnio(fechaDelSistema.get(Calendar.YEAR));
		this.mes++;
	}
	// tercer metodo sobrecargado
	public void asignarFecha(int d, int m) {
		Calendar fechaDelSistema = Calendar.getInstance();
		setDia(d);
		setMes(m);
		setAnio(fechaDelSistema.get(Calendar.YEAR));
	}
	// cuarto metodo sobrecargado
	public void asignarFecha(int d, int m, int a) {
		setDia(d);
		setMes(m);
		setAnio(a);
	}

	// metodo getter (funciones) para obtener el estado del atributo dia
	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	// procedimientos Setter
	public void setDia(int dia) {
		if (dia >= 1 && dia <= 31) {
			setDia(dia);
		} else {
			System.out.println("no se puede setear dia " + dia);
			setDia(0);
		}
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getDia() {
		return dia;
	}

	@Override
	public String toString() {
		return "Fecha [dia=" + dia + ", mes=" + mes + ", anio=" + anio + "]";
	}

}
