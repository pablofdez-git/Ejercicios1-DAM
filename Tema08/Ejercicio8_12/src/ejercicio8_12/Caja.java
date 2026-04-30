package ejercicio8_12;

public class Caja {

	private double ancho;
	private double alto;
	private double fondo;
	private Unidad unidad;
	
	public Caja(int ancho, int alto, int fondo, Unidad unidad) {
		double factor = (unidad == Unidad.CM) ? 0.01 : 1.0;
		this.ancho = ancho * factor;
		this.alto = alto * factor;
		this.fondo = fondo * factor;
	}
	
	double getVolumen() {
		return ancho * alto * fondo;
	}
	
	void setEtiqueta(String etiqueta) {
		
	}
	
	
	
}
