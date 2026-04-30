package gestionEmpleados;

public abstract class Empleado {
	
	private String nombre;
	protected int edad;
	protected double salario;
	protected static final int PLUS = 300;
	
	public Empleado(String nombre, int edad, double salario) {
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if(edad >= 18) {
			this.edad = edad;
		}
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if(salario >= 0) {
			this.salario = salario;
		}
	}

	public static int getPLUS() {
		return PLUS;
	}

	@Override
	public String toString() {
		return "Empleado:\n" +
				"Nombre: " + nombre + "\n" +
				"Edad: " + edad + "\n" +
				"Salario: " + salario + "\n";
	}
	
	public abstract void plus();

}
