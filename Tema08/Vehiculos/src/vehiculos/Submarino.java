package vehiculos;

public class Submarino extends Acuatico {
	
	private int profundidadMaxima;

	public Submarino(String marca, int velocidadMaxima, double eslora, int profundidadMaxima) {
		super(marca, velocidadMaxima, eslora);
		this.profundidadMaxima = profundidadMaxima;
	}

	public double calcularTiempoSubmarino(int distancia, double velocidadBajoAgua) {
		return (distancia/velocidadBajoAgua);
	}
	
	public double calcularPresionAgua(){
		return (profundidadMaxima / 10.0);
	}
	
	public int getProfundidadMaxima() {
		return profundidadMaxima;
	}

	public void setProfundidadMaxima(int profundidadMaxima) {
		this.profundidadMaxima = profundidadMaxima;
	}

	@Override
	public String toString() {
		return super.toString() + "\nSubmarino:\n" + "Profundidad Máxima=" + profundidadMaxima + " metros";
	}
	
	
	

}
