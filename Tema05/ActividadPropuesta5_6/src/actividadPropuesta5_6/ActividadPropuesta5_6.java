package actividadPropuesta5_6;

import java.util.Arrays;


public class ActividadPropuesta5_6 {

	public static void main(String[] args) {
		
		int ordenado [] = {1,2,3,4,5,6,7,8,9};
		int elementoAEliminar = 7;
		
		int respuesta[] = eliminarEnOrdenado(ordenado, elementoAEliminar);
		
		if(respuesta.length == ordenado.length){
			System.out.println("No se ha encontrado el valor");
		}else {
			System.out.println(Arrays.toString(respuesta));
		}
		
		

	}
	
	public static int [] eliminarEnOrdenado(int t[], int valor) {
		int indiceBorrado = Arrays.binarySearch(t, valor);
		
		if(indiceBorrado>=0) {
			System.arraycopy(t, indiceBorrado + 1, t, indiceBorrado, t.length - indiceBorrado -1);
			t = Arrays.copyOf(t, t.length -1);
		}
		
		return t;
	}

}
