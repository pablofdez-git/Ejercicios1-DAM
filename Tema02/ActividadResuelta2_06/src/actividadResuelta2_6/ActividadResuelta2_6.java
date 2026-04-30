package actividadResuelta2_6;

import java.util.Scanner;

public class ActividadResuelta2_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el numero 1: ");
		int numUser1 = sc.nextInt();
		System.out.println("Introduce el numero 2: ");
		int numUser2 = sc.nextInt();
		
		if(numUser1 > numUser2) {
			System.out.println(numUser1+ " es mayor que " +numUser2);
		}else if (numUser1 < numUser2) {
			System.out.println(numUser2+ " es mayor que " +numUser1);
		}else /*if (numUser1 == numUser2)*/ {
			System.out.println("Ambos numeros son iguales");
		}

	}

}
