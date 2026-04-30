package resuelta12_1;

import java.util.Arrays;

public class UtilidadesGenericas {
	
	static <T> T[] guardar(T[] contenedor, T nuevo) {
		T[] nuevoContenedor = Arrays.copyOf(contenedor, contenedor.length + 1);
		nuevoContenedor[nuevoContenedor.length - 1] = nuevo;
		return nuevoContenedor;
	}
	
}