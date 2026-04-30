package ejercicio_15;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_15_Bidimensional {

	public static void main(String[] args) {
		
		int notas[][]= new int [5][3];
		
		System.out.println("Notas: ");
		notas = rellenoNotas(notas);
		
		System.out.println(Arrays.deepToString(notas));
		
	}

	public static int[][] rellenoNotas(int array[][]) {
		Scanner sc = new Scanner(System.in);
		
		for(int filas = 0;filas<5;filas++) {
			for(int columnas = 0; columnas<3;columnas++) {
				System.out.print("Introduce una nota: ");
				array[filas][columnas] = sc.nextInt();
			}
			
		}
		
		return array;
	}
}
