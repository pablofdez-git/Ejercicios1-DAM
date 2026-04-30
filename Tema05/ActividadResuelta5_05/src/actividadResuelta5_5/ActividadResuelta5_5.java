package actividadResuelta5_5;

import java.util.Arrays;
import java.util.Scanner;

public class ActividadResuelta5_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la longitud: ");
		int longitud = sc.nextInt();
		System.out.println("Introduce el valor de fin: ");
		int fin = sc.nextInt();
		
		int pares[] = rellenaPares(longitud, fin);
		
		System.out.println(Arrays.toString(pares));
		
	}
	
	/**
	 * Funcion que crea un array de la longitud especificada, relleno con numeros pares
	 * entre 2 y el fin indicado
	 * @param longitud determina la longitud del array
	 * @param fin determina el valor maximo del math.random
	 * @return el array de numeros pares ordenado
	 */
	public static int[] rellenaPares(int longitud, int fin) {
		
		int resultado [] = new int[longitud]; 
		
		for(int i = 0; i<longitud;i++) {
			int num;
			do {
				num = (int)(Math.random()*(fin-2+1)+2);
			}while(!(num % 2 == 0));
			
			resultado[i]=num;
		}
		
		Arrays.sort(resultado);
		
		return resultado;
		
	}

}
