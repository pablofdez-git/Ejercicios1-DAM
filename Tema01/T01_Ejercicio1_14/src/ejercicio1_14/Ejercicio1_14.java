package ejercicio1_14;

import java.util.Scanner;

public class Ejercicio1_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la base de un triángulo: ");
		double base = sc.nextDouble();
		System.out.println("Introduce la altura de un triángulo: ");
		double altura = sc.nextDouble();
		
		double area = (base*altura)/2;
		System.out.println("El área del triángulo es: "+area);

	}

}
