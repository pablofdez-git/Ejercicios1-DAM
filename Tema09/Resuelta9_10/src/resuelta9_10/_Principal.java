package resuelta9_10;

import java.util.Arrays;
import java.util.Comparator;

public class _Principal {

	public static void main(String[] args) {
		
		int min = 1;
		int max = 100;
		Integer numeros[] = new Integer[20];
		
		for(int i = 0; i<20; i++) {
			numeros[i] = (int)(Math.random()*(max - min +1) -min);
		}
		
		System.out.println(Arrays.toString(numeros));
		
		Comparator compDecreciente = new ComparaEnteros();
		
		
		Arrays.sort(numeros, compDecreciente);
		System.out.println(Arrays.toString(numeros));
		
		

	}

}
