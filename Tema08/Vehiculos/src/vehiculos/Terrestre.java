package vehiculos;

public class Terrestre extends Vehiculo {
	
	private int ruedas;

	public Terrestre(String marca, int velocidadMaxima, int ruedas) {
		super(marca, velocidadMaxima);
		this.ruedas = ruedas;
	}
	
	public double calcularConsumo(int distancia, double consumoPorKm) {
		return (distancia*consumoPorKm);
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	@Override
	public String toString() {
		return super.toString()+ "\nTerrestre:\n "+ "Ruedas: " + ruedas;
	}

}
