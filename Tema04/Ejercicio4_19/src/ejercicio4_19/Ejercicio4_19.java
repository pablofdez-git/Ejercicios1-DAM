package ejercicio4_19;

import java.util.Scanner;

public class Ejercicio4_19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce la cantidad de numeros que se mostraran: ");
		int cantidad = sc.nextInt();
		System.out.print("Introduce el valor minimo: ");
		int minimo = sc.nextInt();
		System.out.print("Introduce el valor maximo: ");
		int maximo = sc.nextInt();
		
		System.out.println("Numeros entre "+minimo+" y "+maximo );
		aleatorio(cantidad, minimo, maximo);
		System.out.println("---------------------------");
		System.out.println("Numeros entre 0 y 1");
		aleatorio(cantidad);
		
		
	}
	
	public static void aleatorio(int cantidad, int min, int max) {
		
		int aleatorio=0;
		
		for(int i = 1; i<=cantidad;i++) {
			aleatorio = (int)(Math.random()*(max-min+1)+min);
			System.out.println("Numero aleatorio " +i+ " : " +aleatorio);
		}	
	}
	
	public static void aleatorio(int cantidad) {
		double aleatorio = 0;
		
		
		for(int i = 1; i<=cantidad;i++) {
			aleatorio = Math.random();
			System.out.println("Numero aleatorio " +i+ " : " +aleatorio);
		}
		
	}

}
