package actividadResuelta4_9;

import java.util.Scanner;

public class ActividadResuelta4_9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero: ");
		int num1 = sc.nextInt();
		System.out.println("Introduce otro numero entero: ");
		int num2 = sc.nextInt();
		System.out.println("Introduce otro numero entero: ");
		int num3 = sc.nextInt();
		
		int maximo;
		
		maximo = valorMaximo(num1, num2);
		System.out.println("El valor maximo es: " +maximo);
		
		maximo = valorMaximo(num1, num2, num3);
		System.out.println("El valor maximo es: " +maximo);

	}
	
	public static int valorMaximo(int numero1, int numero2) {
		int max;
		
		if(numero1 > numero2) {
			max = numero1;
		}else {
			max= numero2;
		}
		
		return max;
	}

	public static int valorMaximo(int numero1, int numero2, int numero3) {
		int max=0;
		
		if(numero1 > numero2 && numero1>numero3) {
			max = numero1;
		}else if(numero2 > numero1 && numero2 > numero3) {
			max= numero2;
		}else if(numero3 > numero1 && numero3 > numero2) {
			max = numero3;
		}
		
		return max;
	}

}
