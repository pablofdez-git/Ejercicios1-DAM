package ejercicio_13;

import java.util.Arrays;

public class Ejercicio_13 {

	public static void main(String[] args) {
		
		int array[] = new int[0];
        array = arrayDeAleatorios(array, 1,20,10);
        System.out.println(Arrays.toString(array));
        
        int [] desordenado = desordenar(array);
        
        System.out.println(Arrays.toString(desordenado));
	}

	public static int[] desordenar(int t[]) {
		int max = t.length-1;
		int min = 0;
		int desordenado[]= Arrays.copyOf(t, t.length);
		
		
		for(int i = 0;i<desordenado.length;i++) {
			int indiceAleatorio = (int)(Math.random()*(max-min+1))+min;
			
			int aux = desordenado[i];
			desordenado[i] = desordenado[indiceAleatorio];
			desordenado[indiceAleatorio] = aux;
		}
		
		
		return desordenado; 
		
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

