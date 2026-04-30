package actividadResuelta3_2;

import java.util.Scanner;

public class ActividadResuelta3_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la edad de un alumno (introduce -1 para terminar): ");
		int edad = sc.nextInt();
		
		int suma=0;
		int contadorAlumnos=0;
		int contadorMayorEdad=0;
		
		while (edad > 0) {
			suma += edad;
			contadorAlumnos++;
			
			if (edad >=18) {
				contadorMayorEdad++;
			}
			
			System.out.println("Introduce la edad de un alumno (introduce -1 para terminar): ");
			edad = sc.nextInt();
		}
		
		if (contadorAlumnos > 0) {
			
			double media = suma / contadorAlumnos;
			
			System.out.println("La suma de todas las edades es: "+suma);
			System.out.println("La media de las edades es "+media);
			System.out.println("El numero de alumnos es de "+contadorAlumnos);
			System.out.println("El número de alumnos mayores de edad es de: "+contadorMayorEdad);
		}else {
			System.out.println("No se ha introducido ninguna edad");
		}

	}

}
