package actividadResuelta4_4;

import java.util.Scanner;

public class ActividadResuelta4_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero: ");
		int num1 = sc.nextInt();
		System.out.println("Introduce otro numero entero: ");
		int num2 = sc.nextInt();
		
		int maximo = valorMaximo(num1, num2);
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

}
