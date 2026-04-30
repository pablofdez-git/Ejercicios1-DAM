package resuelta12_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection; 

public class _Principal {

	public static void main(String[] args) {
		
		Collection<Integer> coleccionNum = new ArrayList<>();
		
		int aleatorio;
		int max = 100;
		int min = 1;
		
		for (int i = 0; i < 20; i++) {
			aleatorio = (int)(Math.random() * (max - min + 1)) + min;
			coleccionNum.add(aleatorio);
		}
		
		System.out.println("Coleccion Normal:");
		System.out.println(coleccionNum);
		
		Object[] arrayColeccion = coleccionNum.toArray();
		
		System.out.println("Ordenado de menor a mayor:");
		Arrays.sort(arrayColeccion);
		
		coleccionNum.clear();
		
		for(int i=0;i<arrayColeccion.length;i++) {
			coleccionNum.add((Integer) arrayColeccion[i]);
		}
		System.out.println(coleccionNum);
		
		
	}

}
