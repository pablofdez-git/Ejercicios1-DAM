package resuelta12_16;

public class Academico implements Comparable<Academico>{

	private String nombre;
	private int anioIngreso;
	
	public Academico(String nombre, int anioIngreso) {
		this.nombre = nombre;
		this.anioIngreso = anioIngreso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnioIngreso() {
		return anioIngreso;
	}

	public void setAnioIngreso(int anioIngreso) {
		this.anioIngreso = anioIngreso;
	}

	@Override
	public String toString() {
		return "Academico [anioIngreso=" + anioIngreso + "]";
	}

	@Override
	public int compareTo(Academico otro) {
		return this.nombre.compareToIgnoreCase(otro.nombre);
	}
	
	
	
}
