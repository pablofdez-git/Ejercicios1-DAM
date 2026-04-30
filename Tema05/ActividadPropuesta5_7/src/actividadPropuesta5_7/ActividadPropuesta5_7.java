package actividadPropuesta5_7;

import java.util.Arrays;
import java.util.Scanner;

public class ActividadPropuesta5_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cuantos numeros deseas introducir");
		int longitud = sc.nextInt();
		int array [] = new int[longitud];
		
		for(int i = 0; i<array.length;i++) {
			System.out.print("Introduce un numero: ");
			array[i] = sc.nextInt();
		}
		
		do {
			
			int indice1 = indiceAleatorio(array);
			int indice2 = indiceAleatorio(array);
			
			while(indice1 == indice2) {
				indice2 = indiceAleatorio(array);
			}
			
			int valor1 = array[indice1];
			int valor2 = array[indice2];
			
			//eliminar valores
			array[indice1] = array[array.length - 1];
			array = Arrays.copyOf(array, array.length -1);
			
			array[indice2] = array[array.length - 1];
			array = Arrays.copyOf(array, array.length -1);
			
			int media = (valor1 + valor2) / 2;
			
			//introducir la media
			array = Arrays.copyOf(array, array.length +1);
			array[array.length-1]=media;
			
	        
		}while(array.length > 1);
		
		
		System.out.println(Arrays.toString(array));
	}

	public static int indiceAleatorio(int array[]) {
		int max = array.length-1;
		int min = 0;
		int aleatorio = (int)(Math.random()*(max - min + 1))+min;
		
		return aleatorio;
	}
}
