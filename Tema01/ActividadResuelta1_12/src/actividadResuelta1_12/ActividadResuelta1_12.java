package actividadResuelta1_12;

import java.util.Scanner;

public class ActividadResuelta1_12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int numero = sc.nextInt();
		
		int numAbsoluto = numero>=0 ? numero : -1*numero;
		
		System.out.println("El valor absoluto es: " +numAbsoluto);

	}

}
