package funcionRecursivaFactorial;

import java.util.Scanner;

public class Recursiva {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
		int numUser = sc.nextInt();
		
		long solucion = factorial(numUser);
		
		System.out.println("Resultado: " +solucion);
		
	}
	
	public static long factorial(int n) {
		long resultado;
		
		if(n == 0) {
			resultado = 1;
		}else {
			resultado = n* factorial(n-1);
		}
		
		return resultado;
	}

}
