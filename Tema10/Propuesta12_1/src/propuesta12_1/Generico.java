package propuesta12_1;

import java.util.Arrays;

public class Generico {
	
	static <T> T[] concatenar(T[] array1, T[] array2){
		T[] resultado = Arrays.copyOf(array1, array1.length + array2.length);
        System.arraycopy(array2, 0, resultado, array1.length, array2.length);
        return resultado;
	}

}
