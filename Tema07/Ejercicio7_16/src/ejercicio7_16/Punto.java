package ejercicio7_16;

public class Punto {

	private double x, y;

	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void desplazaX(double dx) {
		this.x = this.x + dx;
	}
	
	public void desplazaY(double dy) {
		this.y = this.y + dy;
	}
	
	public void desplaza(double dx, double dy) {
		this.x = this.x + dx;
		this.y = this.x + dy;
	}
	
	public double distanciaEuclidea(Punto otro) {
		double diferenciaX = otro.x - this.x;
		double diferenciaY = otro.y - this.y;
		
		double distancia = Math.sqrt(Math.pow(diferenciaX,2) + Math.pow(diferenciaY, 2));
		
		return distancia;
	}
	
	public void mostrar() {
		System.out.println("Coordenadas del punto: " +this.x+", "+this.y);
	}
}
