package ejercicio9_19;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Socio implements Comparable{
	
	private int id;
	private String nombre;
	private LocalDate fechaNacimiento;
	
	public Socio(int id, String nombre, String fechaNacimiento) {
		this.id = id;
		this.nombre = nombre;
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		this.fechaNacimiento = LocalDate.parse(fechaNacimiento, f);
	}
	
	public int edad() {
		return (int) fechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
	}

	@Override
	public int compareTo(Object o) {
		Socio otroSocio = (Socio) o;
		return this.edad() - otroSocio.edad();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "SocioBiblioteca\n" + "id:" + id + "\n" + "nombre:" + nombre + "\n" + "fechaNacimiento:" + fechaNacimiento + "\n";
	}
}