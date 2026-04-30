package ejercicio_12;

import java.util.Arrays;

public class Ejercicio_12 {

	public static void main(String[] args) {
		
		int array[] = new int[0];
        array = arrayDeAleatorios(array, 1,20,10);
        System.out.println(Arrays.toString(array));
        
        desordenar(array);
        
        System.out.println(Arrays.toString(array));
        
		
	}

	public static void desordenar(int t[]) {
		int max = t.length-1;
		int min = 0;
		
		
		for(int i = 0;i<t.length;i++) {
			int indiceAleatorio = (int)(Math.random()*(max-min+1))+min;
			int indiceAleatorio2 = (int)(Math.random()*(max-min+1))+min;
			
			int aux = t[indiceAleatorio2];
			t[indiceAleatorio2] = t[indiceAleatorio];
			t[indiceAleatorio] = aux;
			
		}
		
	}
	
	public static int[] arrayDeAleatorios(int array[], int min, int max, int numElementos) {
		int valor;
		
		for(int i=0;i<numElementos;i++){
            valor = (int)(Math.random()*(max-min+1))+min;
            array = Arrays.copyOf(array, array.length + 1);
            array[array.length - 1] = valor;
        }
		
		return array;
		
	}
}

