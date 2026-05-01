package ejercicio1_20;

import java.util.Scanner;

public class Ejercicio1_20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número entero: ");
		int numEntero = sc.nextInt();
		
		double raiz = Math.sqrt(numEntero);
		
		System.out.println("La raiz cuadrada es: " +numEntero);

	}

}
