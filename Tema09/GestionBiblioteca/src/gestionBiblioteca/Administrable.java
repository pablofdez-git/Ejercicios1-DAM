package gestionBiblioteca;

public interface Administrable {
	
	void catalogar(String categoria);
	void darDeBaja(String motivo);
	boolean estaActivo();

}
