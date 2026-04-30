package actividadResuelta5_7;

import java.util.Arrays;

public class ActividadResuelta5_7 {

	public static void main(String[] args) {
		
		int arrayConRepetidos [] = {1,1,2,8,3,4,6,4,5,6,6,1,7,8,8,9,10};
		int resultado[] = sinRepetidos(arrayConRepetidos);
		
		System.out.println(Arrays.toString(resultado));

	}
	/**
	 * Funcion que devuelve un array sin numeros repetidos
	 * @param t
	 * @return
	 */
	public static int[] sinRepetidos(int[] t) {
		
		int contador = 0;
		
		for(int i = 0; i<t.length;i++) {
			boolean repetido = false;
			for(int j = 0;j<i;j++) {
				if(t[i] == t[j]) {
					repetido = true;
				}
			}
			if(!repetido) {
				contador++;
			}
		}
		
		int arraySinRepetidos[] = new int[contador];
		int indice = 0;
		for(int i = 0; i<t.length;i++) {
			boolean repetido = false;
			for(int j = 0;j<i;j++) {
				if(t[i] == t[j]) {
					repetido = true;;
				}
			}
			if(!repetido) {
				arraySinRepetidos[indice] = t[i];
				indice++;
			}
		}
		
		return arraySinRepetidos;
		
		
	}

	
}
