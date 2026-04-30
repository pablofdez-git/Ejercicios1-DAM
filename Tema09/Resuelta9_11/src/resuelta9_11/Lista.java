package resuelta9_11;

import java.util.Arrays;

public class Lista {

	Object[] contenedor;

	public Lista() {
		contenedor = new Object[0];
	}

	void insertarPrincipio(Object nuevo) {
		contenedor = Arrays.copyOf(contenedor, contenedor.length + 1);
		System.arraycopy(contenedor, 0, contenedor, 1, contenedor.length - 1);
		contenedor[0] = nuevo;
	}

	void insertarFinal(Object nuevo) {
		contenedor = Arrays.copyOf(contenedor, contenedor.length + 1);
		contenedor[contenedor.length - 1] = nuevo;
	}

	void insertarFinal(Lista otraLista) {
		int tamInicial = contenedor.length;
		contenedor = Arrays.copyOf(contenedor, contenedor.length + otraLista.contenedor.length);
		System.arraycopy(otraLista.contenedor, 0, contenedor, tamInicial, otraLista.contenedor.length);
	}

	void insertar(int posicion, Object nuevo) {
		contenedor = Arrays.copyOf(contenedor, contenedor.length + 1);
		System.arraycopy(contenedor, posicion, contenedor, posicion + 1, contenedor.length - posicion - 1);
		contenedor[posicion] = nuevo;
	}

	Object eliminar(int indice) {
		Object eliminado = null;
		if (indice >= 0 && indice < contenedor.length) {
			eliminado = contenedor[indice];
			for (int i = indice + 1; i < contenedor.length; i++) {
				contenedor[i - 1] = contenedor[i];
			}
			contenedor = Arrays.copyOf(contenedor, contenedor.length - 1);
		}
		return eliminado;
	}

	Object getElemento(int indice) {
		Object resultado = null;
		if (indice >= 0 && indice < contenedor.length) {
			resultado = contenedor[indice];
		}
		return resultado;
	}

	int buscar(Object claveBusqueda) {
		int indice = -1;
		for (int i = 0; i < contenedor.length && indice == -1; i++) {
			if (contenedor[i] != null && contenedor[i].equals(claveBusqueda)) {
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

	/**
	 * El criterio de igualdad es que la longitud y los elementos
	 * del array sean iguales
	 */
	@Override
	public boolean equals(Object otro) {
		Lista otraLista = (Lista) otro;
		return Arrays.equals(this.contenedor, otraLista.contenedor);
	}
}