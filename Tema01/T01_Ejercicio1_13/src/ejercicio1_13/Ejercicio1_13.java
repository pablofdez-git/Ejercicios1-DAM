package ejercicio1_13;

import java.util.*;

public class Ejercicio1_13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el número N: ");
		int numN = sc.nextInt();
		
		System.out.println("Introduce el numero M: ");
		int numM = sc.nextInt();
		
		int resto = numN % numM;
		
		int suma = resto == 0 ? 0 : numM-resto ;
		
		System.out.println("Hay que sumar " +suma+ " para"
				+ " que " +numN+ " se ha multiplo de 7");
		
	}

}
