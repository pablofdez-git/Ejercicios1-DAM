package ejercicio4_11;

import java.util.Scanner;

public class Ejercicio4_11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el radio: ");
		double radio = sc.nextDouble();
		
		superficieVolumen(radio);
		
	}
	
	/**
	 * Calcula y muestra la superficie y el volumen de una esfera
	 * @param radio es el radio de la esfera
	 */
	public static void superficieVolumen(double radio) {
		
		double superficie = 4*Math.PI * Math.pow(radio,2);
		double volumen = (4*Math.PI)/3 * Math.pow(radio,3);
		
		System.out.println("La superfice es: " +superficie);
		System.out.println("El volumen es: " +volumen);
		
	}
}
