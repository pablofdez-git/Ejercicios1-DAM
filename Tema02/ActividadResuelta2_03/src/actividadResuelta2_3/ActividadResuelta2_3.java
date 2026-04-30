package actividadResuelta2_3;

import java.util.Scanner;

public class ActividadResuelta2_3 {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el numero A: ");
		int numA= sc.nextInt();
		System.out.print("Introduce el numero B (distinto al A): ");
		int numB = sc.nextInt();
		
		if(numA > numB) {
			System.out.println("El numero mayor es " +numA);
		}else {
			System.out.println("El numero mayor es " +numB);
		}
		
	}
}
