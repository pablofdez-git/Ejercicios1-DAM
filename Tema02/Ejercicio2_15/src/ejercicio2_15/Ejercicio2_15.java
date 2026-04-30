package ejercicio2_15;

import java.util.Scanner;
/*Escribe una aplicación que solicite por consola dos números reales que corresponden a la
base y la altura de un triángulo. Deberá mostrarse su área, comprobando que los números
introducidos por el usuario no son negativos, algo que no tendría sentido.*/

public class Ejercicio2_15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la base del triangulo: ");
		int base = sc.nextInt();
		System.out.println("Introduce la altura del triangulo: ");
		int altura = sc.nextInt();
		
		if (base <= 0 || altura <= 0) {
			System.out.println("Fuera del rango permitido");
		}else {
			double area = (base * altura)/2;
			System.out.println("El área del triángulo es: " +area);
		}
		

	}

}