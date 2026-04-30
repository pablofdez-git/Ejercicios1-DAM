package actividadResuelta3_1;

import java.util.Scanner;

public class ActividadResuelta3_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero (0 para terminar): ");
		int numero = sc.nextInt();
		
		while (numero !=0) {
			
			String esPar = numero%2==0 ? "es par" : "es impar";
			System.out.println("El numero " +esPar);
			
			if(numero > 0) {
				System.out.println("Es positivo");
			}else {
				System.out.println("Es negativo");
			}
			
			double cuadrado = Math.pow(numero,2);
			System.out.println("El cuadrado es: " +cuadrado);
			
			System.out.println("Introduce un numero (0 para terminar): ");
			numero = sc.nextInt();
		}

	}

}
