package vehiculos;

public class Acuatico extends Vehiculo{
	
	protected double eslora;

	public Acuatico(String marca, int velocidadMaxima, double eslora) {
		super(marca, velocidadMaxima);
		this.eslora = eslora;
	}
	
	public double calcularTiempoNavegacion(int distancia, double velocidadPromedio) {
		return (distancia / velocidadPromedio);
	}
	
	public double getEslora() {
		return eslora;
	}

	public void setEslora(double eslora) {
		this.eslora = eslora;
	}

	@Override
	public String toString() {
		return super.toString()+ "\nAcuatico:\n"+ "Eslora=" + eslora;
	}
	
	
	

}
