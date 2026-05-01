package ejercicio1_21;

import java.util.Scanner;

public class Ejrcicio1_21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A introduce un número: ");
		int numA = sc.nextInt();
		System.out.println("B introduce un número: ");
		int numB = sc.nextInt();
		
		boolean iguales = numA == numB ? true : false;
		
		System.out.println("¿Son iguales? " +iguales);

	}

}
