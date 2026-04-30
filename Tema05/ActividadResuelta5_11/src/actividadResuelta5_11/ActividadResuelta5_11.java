package actividadResuelta5_11;

import java.util.*;
import java.util.Scanner;

public class ActividadResuelta5_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce la longitud de la combinación: ");
		int longitud = sc.nextInt();
		
		int combinacion [] = new int[longitud];
		int max = 5;
		int min = 1;
		
		//Se rellena el array de longitud dada con numeros aleatorios entre 1 y 5
		for(int i = 0; i<combinacion.length;i++) {
			combinacion[i] = (int)(Math.random()*(max-min+1))+min;
		}
		//System.out.println(Arrays.toString(combinacion));		respuesta
		
		int respuesta [] = new int [combinacion.length];
		
		//Bucle que hace que se repita hasta que sean iguales los dos arrays
		do {
			
			//Pedimos al usuario que introduzca su combinacion y los metemos en el array
			System.out.println("Introduce tu combinacion: ");
			for(int i = 0; i<respuesta.length; i++) {
				System.out.print("Elemento "+i+": ");
				respuesta[i]=sc.nextInt();
			}
			
			//Con el for comparamos cada digito del array con el correspondiente del otro
			for(int i = 0; i<longitud; i++) {
				if(respuesta[i]<combinacion[i]) {
					System.out.println("-");
				}else if(respuesta[i]>combinacion[i]) {
					System.out.println("+");
				}else if(respuesta[i]==combinacion[i]) {
					System.out.println("=");
				}
			}
			
		
		}while(!(Arrays.equals(respuesta, combinacion)));
			
		System.out.println("Has acertado");
		System.out.println("La combinacion era: " +Arrays.toString(combinacion));

		
	}

}
