package actividadResuelta4_12;

import java.util.Scanner;

public class ActividadResuelta4_12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
		int numUser = sc.nextInt();
		
		int solucionFibonacci = fibonacci(numUser);
		System.out.println("Resultado: "+solucionFibonacci);
		

	}
	/**
	 * Calcula el enésimo termino de la serie de Fibonacci
	 * @param n
	 * @return el valor de fibonacci 
	 */
	public static int fibonacci(int n) {
		int solucion;
		
		if(n == 0 || n == 1) {
			solucion = 1;
		}else {
			solucion = fibonacci(n-1) + fibonacci(n-2);
		}
		
		return solucion;
	}

}
