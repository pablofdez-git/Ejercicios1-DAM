package ejercicio1_12;

import java.util.Scanner;

public class Ejercicio1_12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int numUser = sc.nextInt();
		
		int resto = numUser % 7;
		
		int suma = resto == 0 ? 0 : 7-resto ;
		
		System.out.println("Hay que sumar " +suma+ " para"
				+ " que " +numUser+ " se ha multiplo de 7");
		
	}

}
