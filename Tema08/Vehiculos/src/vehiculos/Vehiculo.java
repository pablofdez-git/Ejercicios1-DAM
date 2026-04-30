package vehiculos;

import java.util.Objects;

public class Vehiculo {
	
	private String marca;
	private int velocidadMaxima;
	
	public Vehiculo(String marca, int velocidadMaxima) {
		this.marca = marca;
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public double calcularTiempo(int distancia) {
		return (double) (distancia/this.velocidadMaxima);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	@Override
	public String toString() {
		return "Vehiculo:\n"
				+ "Marca: " + marca + "\n"
				+ " velocidadMaxima: " + velocidadMaxima;
	}
	
	public boolean equals(Object obj) {
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(marca, other.marca) && velocidadMaxima == other.velocidadMaxima;
	}
}
