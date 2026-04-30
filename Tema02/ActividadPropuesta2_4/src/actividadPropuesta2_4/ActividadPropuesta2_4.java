package actividadPropuesta2_4;

import java.util.Scanner;

public class ActividadPropuesta2_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número A: ");
		int numA = sc.nextInt();
		
		System.out.println("Introduce un número B: ");
		int numB = sc.nextInt();
		
		boolean multiplo = numA%numB==0;
		
		System.out.println(multiplo);

	}

}
