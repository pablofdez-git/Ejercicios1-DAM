package ejercicio9_13;

import java.util.Objects;

public class Futbolista implements Comparable{
	
	private String dni;
	private String nombre;
	private int edad;
	private int numGoles;
	
	public Futbolista(String dni, String nombre, int edad, int numGoles) {
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.numGoles = numGoles;
	}
	
	@Override
	public boolean equals(Object obj) {
		Futbolista other = (Futbolista) obj;
		return Objects.equals(dni, other.dni);
	}



	@Override
	 public int compareTo(Object obj) {
		Futbolista otro = (Futbolista) obj;
		return this.dni.compareTo(otro.dni);
	 }
	
	 public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
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
		this.edad = edad;
	}

	public int getNumGoles() {
		return numGoles;
	}

	public void setNumGoles(int numGoles) {
		this.numGoles = numGoles;
	}

	 @Override
	 public String toString() {
		 return "Futbolista: dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", numGoles=" + numGoles;
	 }

	 
	
	

}
