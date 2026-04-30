package ejercicio7_15;

public class Calendario {
	
	private int dia, mes, anio;

	public Calendario(int dia, int mes, int anio) {
		if(dia >= 1 && dia <= 31) {
			this.dia = dia;
		}else {
			System.out.println("Día inválido");
			System.out.println("Día = 1");
			this.dia = 1;
		}
		
		if(mes >= 1 && mes <= 12) {
			this.mes = mes;
		}else {
			System.out.println("Mes inválido");
			System.out.println("Mes = 1");
			this.mes = 1;
		}
		if(anio >= 1) {
			this.anio = anio;
		}else {
			System.out.println("Año inválido");
			System.out.println("Año = 1");
			this.anio = 1;
		}
	}
	
	void incrementarDia() {
		dia++;
		
		switch(mes) {
			case 1,3,5,7,8,10,12:
				if(dia > 31) {
					incrementarMes();
					dia = 1;
				}
			break;
			case 4,6,9,11:
				if(dia > 30) {
					incrementarMes();
					dia = 1;
				}
			break;
			case 2:
				if(dia > 28) {
					incrementarMes();
					dia = 1;
				}
		}
		
	}
	
	void incrementarMes() {
		mes++;
		if(mes > 12) {
			incrementarAnio(1);
			mes = 1;
		}
	}
	
	void incrementarAnio(int cantidad) {
		anio += cantidad;
	}
	
	void mostrar() {
		System.out.println(dia+"/"+mes+"/"+anio);
	}
	
	boolean iguales (Calendario otraFecha) {
		boolean iguales = false;
		
		if(this.dia == otraFecha.dia && this.mes == otraFecha.mes && this.anio == otraFecha.anio ) {
			iguales = true;
		}
		
		return iguales;
	}
	
	

}
