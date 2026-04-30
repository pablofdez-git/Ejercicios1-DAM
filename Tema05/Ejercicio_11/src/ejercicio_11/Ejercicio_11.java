package ejercicio_11;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int clave = 5;
		int array[]= {1,5,8,7,5,3,6,5,9,8,5,4,5,1};
		
		int respuesta[] = buscaTodos(array, clave);
		
		System.out.println(Arrays.toString(respuesta));
		
	}

	public static int[] buscaTodos(int t[], int clave) {
		
		int indices [] = new int[0];
		int indiceBusqueda = 0;
		boolean continua = true;
		
		while (indiceBusqueda < t.length && t[indiceBusqueda] != clave) {
	        indiceBusqueda++;
        }
		
		if(indiceBusqueda < t.length) {
			indices = Arrays.copyOf(indices, indices.length +1);
			indices[indices.length - 1] = indiceBusqueda;
		}else {
			indices = Arrays.copyOf(indices, indices.length +1);
			indices[indices.length - 1] = 0;
		}
		
		return indices;
	}
	/*
	 * int encontrados[] = new int[0];
	 * for(int i = 0, i<original.length;i++){
	 * 	if(original[i] == clave){
	 * 		encontrados = arrays.copyOf(encontrados, encontrados.length +1)
	 * 		encontrados[encontrados.length -1] = i;
	 * 	}
	 * }
	 */
}
