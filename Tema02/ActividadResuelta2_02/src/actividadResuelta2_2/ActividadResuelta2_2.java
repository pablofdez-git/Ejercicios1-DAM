package actividadResuelta2_2;

import java.util.Scanner;

public class ActividadResuelta2_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el numero A: ");
		int numA = sc.nextInt();
		System.out.print("Introduce el número B: ");
		int numB = sc.nextInt();
		
		if(numA == numB) {
			System.out.println("Los numeros son iguales");
		}else {
			System.out.println("Los numeros no son iguales");
		}
	}

}
