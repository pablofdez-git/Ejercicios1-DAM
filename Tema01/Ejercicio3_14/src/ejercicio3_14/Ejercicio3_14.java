package ejercicio3_14;

import java.util.Scanner;

public class Ejercicio3_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce  un número: ");
		int numUser = sc.nextInt();
		
		int contadorPrimos  = 0;
		
		for(int i=2;i<=numUser;i++) {
			boolean esPrimo = true;
			
			for(int j = 2; j< i;j++) {
				if(i%j==0) {
					esPrimo = false;
				}
			}
			if(esPrimo) {
				contadorPrimos++;
			}
		}
		System.out.println("Hay "+contadorPrimos+ " números entre 1 y " +numUser);
		
		
	}

}
