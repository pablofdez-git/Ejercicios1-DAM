package ejercicio1_15;

import java.util.Scanner;

public class Ejercicio1_15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el valor de A: ");
		int numA = sc.nextInt();
		System.out.println("Introduce el valor de B: ");
		int numB = sc.nextInt();
		System.out.println("Introduce el valor de C: ");
		int numC = sc.nextInt();
		System.out.println("Introduce el valor de X: ");
		int numX = sc.nextInt();
		
		double numY = (numA * Math.pow(numX,2)) + (numB * numX) + (numC);
		
		System.out.println("El valor de y es: " +numY);
		

	}

}
