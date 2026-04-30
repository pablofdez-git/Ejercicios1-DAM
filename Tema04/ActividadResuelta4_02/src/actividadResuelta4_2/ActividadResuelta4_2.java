package actividadResuelta4_2;

import java.util.Scanner;

public class ActividadResuelta4_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero entero: ");
		int num1 = sc.nextInt();
		System.out.println("Introduce otro numero entero: ");
		int num2 = sc.nextInt();
		
		numeros(num1, num2);

	}
	
	public static void numeros(int num1, int num2) {
		int max;
		int min;
		
		if(num1 > num2) {
			max = num1;
			min = num2;
		}else {
			max= num2;
			min = num1;
		}
		
		while(min <= max) {
			System.out.println(min);
			min++;
		}
	}

}
