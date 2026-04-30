package ejercicio4_13;

import java.util.Scanner;

public class Ejercicio4_13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("introduce el valor de n: ");
		int numUser = sc.nextInt();
		
		muestraPares(numUser);
		
	}
	/**
	 * Muestra la cantidad de numeros pares pedidos por el user
	 * @param n cantidad de numeros pares 
	 */
	public static void muestraPares(int n) {
		for(int i=1; i<=n;i++) {
			System.out.println("Numero "+i+": " +i * 2);
		}
	}

}
