package ejercicio_20;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce una frase: ");
		//Se pasan todas a minusculas porque se ordena en base a ASCII
		String frase = sc.nextLine().toLowerCase();
		
		//Crear un array de palabras
		String palabras [] = frase.split(" ");
		
		//Ordenar el arrays de palabras
		Arrays.sort(palabras);
		
		//Imprimios las palabras
		for(String ordenado : palabras) {
			System.out.print(ordenado+ " ");
		}

	}

}
