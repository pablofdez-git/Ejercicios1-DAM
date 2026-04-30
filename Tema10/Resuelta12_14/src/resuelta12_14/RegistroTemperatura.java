package resuelta12_14;

import java.time.LocalDateTime;


public class RegistroTemperatura implements Comparable{
	
	private double temperatura;
	private LocalDateTime fechaHora;
	
	public RegistroTemperatura(double temperatura) {
		this.temperatura = temperatura;
		this.fechaHora = LocalDateTime.now();
	}

	public double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(double temperatura) {
		this.temperatura = temperatura;
	}

	public LocalDateTime getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}

	@Override
	public String toString() {
		return "RegistroTemperatura: temperatura=" + temperatura + ", fechaHora=" + fechaHora;
	}

	@Override
	public int compareTo(Object o) {
		RegistroTemperatura otraTemperatura = (RegistroTemperatura) o;
		return (int) (temperatura - otraTemperatura.getTemperatura());
	}
	
	
	
	

	
	
	
	
	

}
