package gestionEmpleados;

public class Repartidor extends Empleado{

	private Zona Zona;

	public Repartidor(String nombre, int edad, double salario, Zona zona) {
		super(nombre, edad, salario);
		this.Zona = zona;
	}

	@Override
	public void plus() {
		if(edad < 25 && this.Zona == Zona.ZONA_3) {
			this.salario += getPLUS();
		}
	}

	public Zona getZona() {
		return Zona;
	}

	public void setZona(Zona zona) {
		Zona = zona;
	}

	@Override
	public String toString() {
		return super.toString() +"Zona: " + Zona + "\n";
	}

}
