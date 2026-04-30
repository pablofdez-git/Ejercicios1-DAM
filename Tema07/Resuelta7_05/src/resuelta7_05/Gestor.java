package resuelta7_05;

public class Gestor {

	public String nombre;
	String telefono;
	int importeMax;
	
	public Gestor(String nombre, String telefono, int importeMax) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.importeMax = importeMax;
	}
	
	public Gestor(String nombre, String telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.importeMax = 10000;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public int getImporteMax() {
		return importeMax;
	}

	public void setImporteMax(int importeMax) {
		this.importeMax = importeMax;
	}

	
}
