package resuelta12_1;

import java.util.Arrays;

public class _Principal {

	public static void main(String[] args) {
		String cadenas[] = new String[0];
		cadenas = UtilidadesGenericas.guardar(cadenas, "avion");
		cadenas = UtilidadesGenericas.guardar(cadenas, "coche");
		
		Integer enteros[] = new Integer[0];
		System.out.println(Arrays.toString(enteros));
		enteros = UtilidadesGenericas.guardar(enteros, 12);
		enteros = UtilidadesGenericas.guardar(enteros, 5);
		
		System.out.println(Arrays.toString(cadenas));
		System.out.println(Arrays.toString(enteros));
	}

}
