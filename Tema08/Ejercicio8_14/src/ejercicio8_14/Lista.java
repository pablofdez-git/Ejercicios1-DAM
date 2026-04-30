package ejercicio8_14;

import java.util.Arrays;

public class Lista {
	Integer[] contenedor;

	public Lista() {
		contenedor = new Integer[0];
	}

	void insertarPrincipio(Integer nuevo) {
		contenedor = Arrays.copyOf(contenedor, contenedor.length + 1);
		System.arraycopy(contenedor, 0, contenedor, 1, contenedor.length - 1);
		contenedor[0] = nuevo;
	}

	void insertarFinal(Integer nuevo) {
		contenedor = Arrays.copyOf(contenedor, contenedor.length + 1);
		contenedor[contenedor.length - 1] = nuevo;
	}

	void insertarFinal(Lista otroArray) {
		int tamInicial = contenedor.length;
		contenedor = Arrays.copyOf(contenedor, contenedor.length + otroArray.contenedor.length);
		System.arraycopy(otroArray.contenedor, 0, contenedor, tamInicial, otroArray.contenedor.length);
	}

	void insertar(int posicion, Integer nuevo) {
		contenedor = Arrays.copyOf(contenedor, contenedor.length + 1);
		System.arraycopy(contenedor, posicion, contenedor, posicion + 1, contenedor.length - posicion - 1);
		contenedor[posicion] = nuevo;
	}

	Integer eliminar(int indice) {
		Integer eliminado = null;
		if (indice >= 0 && indice < contenedor.length) {
			eliminado = contenedor[indice];
			for (int i = indice + 1; i < contenedor.length; i++) {
				contenedor[i - 1] = contenedor[i];
			}
			contenedor = Arrays.copyOf(contenedor, contenedor.length - 1);
		}
		return eliminado;
	}

	Integer getElemento(int indice) {
		Integer resultado = null;
		if (indice >= 0 && indice < contenedor.length) {
			resultado = contenedor[indice];
		}
		return resultado;
	}

	int buscar(Integer claveBusqueda) {
		int indice = -1;
		for (int i = 0; i < contenedor.length && indice == -1; i++) {
			if (contenedor[i].equals(claveBusqueda)) {
				indice = i;
			}
		}
		return indice;
	}

	public int getNumeroElementos() {
		return contenedor.length;
	}

	@Override
	public String toString() {
		return "Lista: " + Arrays.toString(contenedor);
	}

	

}