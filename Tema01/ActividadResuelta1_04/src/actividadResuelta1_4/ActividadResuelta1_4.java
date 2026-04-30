package actividadResuelta1_4;

import java.util.Scanner;

public class ActividadResuelta1_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el año actual: ");
		int anioActual = sc.nextInt();
		System.out.print("Introduce tu año de nacimiento: ");
		int anioNacimiento = sc.nextInt();
		
		int edad = anioActual - anioNacimiento;
		
		System.out.println("Tienes "+edad+ " años");

	}

}
