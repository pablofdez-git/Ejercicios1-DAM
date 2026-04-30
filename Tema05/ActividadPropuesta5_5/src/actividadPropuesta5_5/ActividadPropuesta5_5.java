package actividadPropuesta5_5;

import java.util.*;

public class ActividadPropuesta5_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t[] = {2,4,5,6,8};
        int nuevo = 7;
        
        int nuevoArray[] = inserccionOrdenada(t, nuevo);
        
        System.out.println(Arrays.toString(nuevoArray));

	}
	/**
	 * 
	 * @param array
	 * @param valorNuevo
	 * @return
	 */
	public static int[] inserccionOrdenada(int array[], int valorNuevo) {
		int indiceInsercion = Arrays.binarySearch(array, valorNuevo); 
        if(indiceInsercion < 0){                                
            indiceInsercion = -indiceInsercion -1;              
        }
        int [] copia = new int[array.length + 1];                   
        System.arraycopy(array, 0, copia, 0, indiceInsercion);     
        System.arraycopy(array, indiceInsercion, copia, indiceInsercion + 1, array.length - indiceInsercion); 
        copia[indiceInsercion] = valorNuevo;                         
        array = copia;                                            
        
        return array;
	}

}
