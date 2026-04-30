package actividadResuelta4_6;

import java.util.Scanner;

public class ActividadResuelta4_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int numUser = sc.nextInt();
		
		boolean primo = esPrimo(numUser);
		System.out.println("¿Es primo?: " +primo);

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
}

