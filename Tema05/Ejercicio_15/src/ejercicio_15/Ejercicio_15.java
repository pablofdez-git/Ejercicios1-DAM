package ejercicio_15;

import java.util.Scanner;

public class Ejercicio_15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int primerTrimestre [] = new int[5];
		int segundoTrimestre [] = new int[5];
		int tercerTrimestre [] = new int[5];
		
		System.out.println("Notas primer Trimestre: ");
		primerTrimestre = rellenoNotas(primerTrimestre);
		
		System.out.println("Notas Segundo Trimestre: ");
		segundoTrimestre = rellenoNotas(segundoTrimestre);
		
		System.out.println("Notas tercer Trimestre: ");
		tercerTrimestre = rellenoNotas(tercerTrimestre);
		
		double mediaTrimestre1 = media(primerTrimestre);
		double mediaTrimestre2 = media(segundoTrimestre);
		double mediaTrimestre3 = media(tercerTrimestre);
		
		System.out.println("Media primer trimestre: "+mediaTrimestre1);
		System.out.println("Media segundo trimestre: "+mediaTrimestre2);
		System.out.println("Media tercer trimestre: "+mediaTrimestre3);
		
		System.out.println("Introduce una posicion de un alumno: ");
		int posicion = sc.nextInt();
		
		while(posicion < 0 || posicion > 5) {
			System.out.println("Posición no válida.");
			System.out.print("Vuelve a introducir la posicion: ");
			posicion = sc.nextInt();
		}
		
		double mediaAlumno = (primerTrimestre[posicion] + segundoTrimestre[posicion] + tercerTrimestre[posicion]) / 3.0;
		System.out.println("La media del alumno en la posición "+ posicion + " es: " + mediaAlumno);
		
		
	}
	
	public static int[] rellenoNotas(int array[]) {
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0;i<array.length;i++) {
			System.out.print("Introduce un nota: ");
			array[i] = sc.nextInt();
		}
		
		return array;
	}
	
	public static double media(int array[]) {
		int suma = 0;
		
		for(int numero : array ){
			suma += numero;
		}
		double media = suma/array.length;
		return media;
	}

}