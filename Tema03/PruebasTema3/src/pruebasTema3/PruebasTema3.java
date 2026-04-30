package pruebasTema3;

import java.util.Scanner;

public class PruebasTema3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el valor de A: ");
		int valorA = sc.nextInt();
		System.out.println("Introduce el valor de B: ");
		int valorB = sc.nextInt();
		
		int mayor;
		int menor;
		
		if(valorA > valorB) {
			mayor = valorA;
			menor = valorB;
		}else {
			mayor = valorB;
			menor = valorA;
		}
		boolean salir =false;
		int division=0;
		

		for(int i = menor; i>=1 && !salir; i--) {
			int modulo1 = mayor%i;
			division = mayor/i;
			if(modulo1 == 0) {
				int modulo2 = menor%division;
				if(modulo2==0) {
					System.out.println(division);
				}
				
			}
		}
		

	}

}
