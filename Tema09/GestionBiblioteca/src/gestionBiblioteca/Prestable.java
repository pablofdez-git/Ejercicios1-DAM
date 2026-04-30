package gestionBiblioteca;

public interface Prestable {
	
	void prestar();
	void devolver();
	boolean estaPrestado();
	int getDiasPrestamo();
	String getInformacion();

}
