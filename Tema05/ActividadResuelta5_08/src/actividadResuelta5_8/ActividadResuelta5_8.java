package actividadResuelta5_8;

import java.util.Arrays;
import java.util.Scanner;

public class ActividadResuelta5_8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el numero de elementos del array");
		int longitud  =sc.nextInt();
		
		int array [] = new int[longitud];
		
		for(int i =0;i<array.length;i++) {
			System.out.print("Introduce un valor "+i+": ");
			array[i] = sc.nextInt();
		}
		int pares[] = new int[0];
		int impares[] = new int[0];
		
		for(int numero : array) {
			if(numero%2==0) {
				pares = Arrays.copyOf(pares,pares.length+1);
				pares[pares.length-1] = numero;
			}else {
				impares = Arrays.copyOf(impares,impares.length+1);
				impares[impares.length-1] = numero;
			}
		}
		
		Arrays.sort(pares);
		Arrays.sort(impares);
		
		System.out.println("Array normal "+Arrays.toString(array));
		System.out.println("Array con pares "+Arrays.toString(pares));
		System.out.println("Array con impares "+Arrays.toString(impares));

	}

}
