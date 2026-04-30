package complementario_2;

import java.util.Scanner;

public class Complementario_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número: ");
		int num = sc.nextInt();
		System.out.println("Introduce el exponente: ");
		int exp = sc.nextInt();
		
		double resultado = Math.pow(num, exp);
		
		if(exp > 0) {
			System.out.println("El resultado es "+resultado);
		}else if(exp == 0) {
			resultado = 1;
			System.out.println("El resultado es: " +resultado);
		}else {
			double exponentePositivo = Math.abs(exp);
			resultado = (1/exponentePositivo);
			System.out.println("El resultado es: " +resultado);
		}

	}

}
