package gestionEmpleados;

public class Comercial extends Empleado{
	
	private double comision;

	public Comercial(String nombre, int edad, double salario, double comision) {
		super(nombre, edad, salario);
		this.comision = comision;
	}

	@Override
	public void plus() {
		if(edad > 30 && comision > 200) {
			this.salario += getPLUS();
		}
	}

	@Override
	public String toString() {
		 return super.toString() +"Comisión: " + comision + "\n";
	}
	
	
	
	

}
