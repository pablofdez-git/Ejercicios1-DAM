package vehiculos;

import java.util.Objects;

public class Coche extends Terrestre {

	private Combustible tipoCombustible;

	public Coche(String marca, int velocidadMaxima, int ruedas, Combustible tipoCombustible) {
		super(marca, velocidadMaxima, ruedas);
		this.tipoCombustible = tipoCombustible;
	}

	public double calcularCostoCombustible(int distancia, double precioCombustible, double consumoPorKm) {
		double consumo =  distancia*consumoPorKm;
		return consumo*precioCombustible;
	}
	
	@Override
	public boolean equals(Object obj) {
		Coche other = (Coche) obj;
		return super.equals(obj) && this.tipoCombustible == other.tipoCombustible;
	}
	
	@Override
	public String toString() {
		return "TipoCombustible: " + tipoCombustible;
	}
	
	
	
	
	
	
	
}
