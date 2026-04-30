package vehiculos;

public class Barco extends Acuatico {
	
	private boolean motor;

	public Barco(String marca, int velocidadMaxima, double eslora, boolean motor) {
		super(marca, velocidadMaxima, eslora);
		this.motor = motor;
	}

	public boolean isMotor() {
		return motor;
	}

	public void setMotor(boolean motor) {
		this.motor = motor;
	}
	
	public double calcularCargaMaxima(double capacidadPorMetro) {
		return (capacidadPorMetro * eslora);
	}

	@Override
	public String toString() {
		return super.toString() + "\nBarco:\n" + "Motor: " + (motor ? "Tiene motor" : "No tiene motor");
	}
	
	
	
	
	

}
