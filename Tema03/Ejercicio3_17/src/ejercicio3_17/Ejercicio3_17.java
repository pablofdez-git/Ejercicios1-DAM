package ejercicio3_17;

import java.util.Scanner;

public class Ejercicio3_17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el valor de A: ");
		int valorA = sc.nextInt();
		System.out.print("Introduce el valor de B: ");
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
		boolean salir = false;
		/*
		int divisor = menor;
		while (!(mayor%divisor==0 && menor%divisor==0)) {
			divisor--;
		}
		System.out.println(divisor);
		*/
		for(int i= menor; i>=1 && !salir; i--) {
			if((mayor%i==0) && (menor%i==0)) {
				System.out.println("El maximo comun divisor es: "+i);
				salir = true;
			}
		}
		
	}

}
