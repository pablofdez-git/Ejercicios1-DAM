package ejercicio7_16;

public class _Principal {

	public static void main(String[] args) {
		
		Punto p1 = new Punto(1.0, 2.0);
		Punto p2 = new Punto(4.0, 6.0);
		
		System.out.println("--- Estado Inicial ---");
		p1.mostrar();
		p2.mostrar();
		
		double distancia = p1.distanciaEuclidea(p2);
		System.out.println("Distancia ecuclidea: " +distancia);
		
		System.out.println("--- Desplazamiento p1 ---");
		p1.desplazaX(2.0);
		p1.mostrar();
		
		System.out.println("--- Desplazamiento p2 ---");
		p1.desplaza(1.0,1.0);
		p1.mostrar();

	}

}
