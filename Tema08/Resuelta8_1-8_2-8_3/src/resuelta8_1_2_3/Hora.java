package resuelta8_1_2_3;

public class Hora {

	protected int hora;
	protected int min;
	
	public Hora(int hora, int min) {
		setHora(hora);
		setMinutos(min);
	}
	
	void inc() {
		this.min++;
		if(setMinutos(min)== false) {
			this.min = 0;
			this.hora++;
			if(setHora(hora)== false) {
				this.hora = 0;
			}
		}
		
	}
	
	boolean setMinutos( int valor) {
		boolean asignado = false;
		if(valor >= 0 && valor < 60) {
			this.min=valor;
			asignado = true;
		}
		return asignado;
	}
	
	boolean setHora(int valor) {
		boolean asignado = false;
		if(valor >= 0 && valor < 24) {
			asignado = true;
			this.hora = valor;
		}
		return asignado;
	}

	@Override
	public String toString() {
		return hora + ":" + min;
	}
	
	
	
}
