package ejercicio3_11;

import java.util.Scanner;

public class Ejercicio3_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un número decimal: ");
		int numUser= sc.nextInt();
		int resto = 0;
		
		do {
			resto = numUser % 2;
			System.out.println(resto);
			numUser = numUser / 2;
		
		}while(numUser > 0);
		
		

	}

}
