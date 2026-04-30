package ejercicio4_12;

import java.util.Scanner;

public class Ejercicio4_12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el valor de x1: ");
		double x1 = sc.nextDouble();
		System.out.println("Introduce el valor de x2: ");
		double x2 =sc.nextDouble();
		System.out.println("Introduce el valor de y1: ");
		double y1 = sc.nextDouble();
		System.out.println("Introduce el valor de y2: ");
		double y2 = sc.nextDouble();
		
		double resultado = distancia(x1, x2, y1, y2);
		
		System.out.println("El resultado es: " +resultado);

	}
	/**
	 * Calcula la distancia euclidea que separa los puntos dados
	 * @param x1 coordenada x del primer punto
	 * @param y1 coordenada y del primer punto
	 * @param x2 coordenada x del segundo punto
	 * @param y2 coordenada y del segundo punto
	 * @return distancia 
	 */
	public static double distancia(double x1, double y1, double x2, double y2) {
		double distancia=0;
		
		distancia = Math.sqrt(Math.pow((x1-x2),2)+Math.pow((y1-y2),2));
		
		return distancia;
	}

}
