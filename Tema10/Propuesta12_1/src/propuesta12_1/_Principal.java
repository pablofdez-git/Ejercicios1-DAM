package propuesta12_1;

import java.util.Arrays;

public class _Principal {

	public static void main(String[] args) {
		
		String vehiculos1[] = {"coche", "moto"};
		String vehiculos2[] = {"barco", "avion"};
		System.out.println("Vehiculos 1: "+Arrays.toString(vehiculos1));
		System.out.println("Vehiculos 2: "+Arrays.toString(vehiculos2));
		
		String concatenado1[] = Generico.concatenar(vehiculos1, vehiculos2);
		System.out.println("Vehiculos concatenados: "+Arrays.toString(concatenado1));
		
		System.out.println("-----------------------------------------------------");
		 
		Integer num1[] = {1,2,3,4,5};
		Integer num2[] = {6,7,8,9,10};
		System.out.println("Numeros 1: "+Arrays.toString(num1));
		System.out.println("Numeros 2: "+Arrays.toString(num2));
		
		Integer concatenado2[] = Generico.concatenar(num1, num2);
		System.out.println("Numeros concatenados: "+Arrays.toString(concatenado2));
	}

}
