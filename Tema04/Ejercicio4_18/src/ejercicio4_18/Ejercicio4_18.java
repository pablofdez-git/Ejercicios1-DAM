package ejercicio4_18;

import java.util.Scanner;

public class Ejercicio4_18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce la cantidad de numeros que se mostraran: ");
		int cantidad = sc.nextInt();
		System.out.print("Introduce el valor minimo: ");
		int minimo = sc.nextInt();
		System.out.print("Introduce el valor maximo: ");
		int maximo = sc.nextInt();
		
		aleatorio(cantidad, minimo, maximo);
		
		
	}
	
	public static void aleatorio(int cantidad, int min, int max) {
		
		int aleatorio=0;
		
		for(int i = 1; i<=cantidad;i++) {
			aleatorio = (int)(Math.random()*(max-min+1)+min);
			System.out.println("Numero aleatorio " +i+ " : " +aleatorio);
		}
		
		
		
	}
}
