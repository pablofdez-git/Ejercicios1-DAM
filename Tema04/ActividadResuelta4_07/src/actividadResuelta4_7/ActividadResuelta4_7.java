package actividadResuelta4_7;

import java.util.Scanner;

public class ActividadResuelta4_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número entero: ");
		int numUser = sc.nextInt();
		
		int numeroDivisores = contadorDivisoresPrimo(numUser);
		
		System.out.println("El numero "+numUser+" tiene "+numeroDivisores+ " divisores primos");
		

	}
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
	
	public static int contadorDivisoresPrimo(int numUser) {
		int contador =0;
		
		for(int i=2;i<=numUser;i++) {
			if(numUser % i == 0 && esPrimo(i)) {
				contador++;
			}
		}
		
		return contador;
	}

}
