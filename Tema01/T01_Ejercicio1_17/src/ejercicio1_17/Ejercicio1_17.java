package ejercicio1_17;

import java.util.*;

public class Ejercicio1_17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		System.out.println("Primera distancia en milimetros: ");
		double milimetros = sc.nextDouble();
		System.out.println("Segunda distancia en centimetros: ");
		double centimetros = sc.nextDouble();
		System.out.println("Tercera distancia en metros: ");
		double metros = sc.nextDouble();
		
		double total = (milimetros / 100) + (centimetros) + (metros * 100);
		
		System.out.println("El total en cm es: " +total+ " cm");

	}

}
