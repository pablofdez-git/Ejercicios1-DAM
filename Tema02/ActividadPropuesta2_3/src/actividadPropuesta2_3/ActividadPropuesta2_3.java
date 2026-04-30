package actividadPropuesta2_3;

import java.util.Scanner;

public class ActividadPropuesta2_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número A: ");
		int numA = sc.nextInt();
		
		System.out.println("Introduce un número B: ");
		int numB = sc.nextInt();
		
		boolean resultado = numA != numB || numA == 0 || numB ==0;
		
		System.out.println(resultado);
	}

}
