package ejercicio_17;

import java.util.Arrays;

public class Ejercicio_17 {

	public static void main(String[] args) {
		
		int t[] = {2,8,6,7,5,4};
		
		int resultado[] = suma(t,3);
		System.out.println(Arrays.toString(resultado));
	}
	
	public static int[] suma(int t[], int numElementos) {
		
		int contador = 0;
		int suma = 0;
		for(int i = 0;i<t.length && contador==numElementos;i++) {
			t[i] +=suma;
			contador++;
		}
	}

}
