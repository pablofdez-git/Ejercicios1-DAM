package ejercicio1_19;

import java.util.Scanner;

public class Ejercicio1_19 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final int PRECIO_ADULTOS = 20;
		final double PRECIO_INFANTIL = 15.50;
		final int DESCUENTO = 5;
		
		System.out.println("Introduce el numero de entradas infantiles: ");
		int numInfantil = sc.nextInt();
		System.out.println("Introduce el numero de entradas de adultos: ");
		int numAdultos = sc.nextInt();
		
		int totalAdultos = numAdultos * PRECIO_ADULTOS;
		double totalInfantil = numInfantil * PRECIO_INFANTIL;
		
		double total = totalAdultos + totalInfantil;
		
		double resultado = total >= 100 ? total - (total * DESCUENTO / 100.0) : total;
		
		System.out.println("El precio total es: " +resultado);
		
	}

}
