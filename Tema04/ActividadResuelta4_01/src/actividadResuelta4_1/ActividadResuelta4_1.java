package actividadResuelta4_1;

import java.util.Scanner;

public class ActividadResuelta4_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero: ");
		int numUser = sc.nextInt();
		
		eco(numUser);
	}

	public static void eco(int numero) {
		for(int i=0; i<numero; i++) {
			System.out.println("Eco...");
		}	
	}
}
