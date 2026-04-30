package resuelta8_1_2_3;


public class HoraExacta extends Hora{

	private int seg;
	
	public HoraExacta(int hora, int min, int seg) {
		super(hora, min);
		setSegundo(seg);
	}
	
	boolean setSegundo(int valor) {
		boolean asignado = false;
		if(valor >= 0 && valor < 60) {
			this.seg=valor;
			asignado = true;
		}
		return asignado;
	}
	
	@Override
	void inc() {
		this.seg++;
		if(this.seg >= 60) {
			this.seg = 0;
			super.inc();
		}
		
	}
	
	public String toString() {
		return super.toString() +":" +seg;
	}

	@Override
	public boolean equals(Object otro) {
		HoraExacta otraHora = (HoraExacta) otro;
		boolean iguales = false;
		if(this.hora == otraHora.hora && this.min == otraHora.min && this.seg == otraHora.seg) {
			iguales = true;
		}
		return iguales;
	}

	
}
