package ejercicio4_16;

import java.util.Scanner;

public class Ejercicio4_16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
		int numUser = sc.nextInt();
		
		divisoresPrimos(numUser);
		

	}
	/**
	 * Calcula los divisores de un numero y comprueba que sea primo
	 * @param num
	 */
	public static void divisoresPrimos(int num) {
		for(int i=2; i<=num;i++) {
			if(num%i==0 && esPrimo(i)) {
				System.out.println("Divisor Primo: "+i);
			}
		}
		
	}
	/**
	 * Calcula si un numero es un numero Primo
	 * @param n
	 * @return true/false si es o no primo
	 */
	public static boolean esPrimo(int n) {
		boolean esPrimo = true;
		if(n<2) {
			esPrimo = false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				esPrimo = false;
			}
		}
		return esPrimo;
	}
	/*Otra manera de sacar el primo
	 * int i=2;
	 * while(i<n && n%i!=0){
	 * 	i++
	 * }
	 * return (i==n);
	 */

}
