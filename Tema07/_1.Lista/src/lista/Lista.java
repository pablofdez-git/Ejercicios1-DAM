package lista;

import java.util.Arrays;

/*
 * Implementamos las listas con arrays de tipo Integer que se iran redimensionando
 * El indice de un elemento en la lista coincide con el índice del lugar que ocupa en el array
 */

public class Lista {
	Integer[] lista;
	
	//Constructor (inicializa el array con 0 posiciones)
	public Lista() {
		lista = new Integer[0];
	}
	
	//Permite insertar al inicio de contenedor un nuevo valor entero
	void insertarPrincipio(Integer nuevo) {
		lista = Arrays.copyOf(lista, lista.length + 1);
		System.arraycopy(lista, 0, lista, 1, lista.length -1);
		lista[0] = nuevo;
	}
	
	//Permite insertar al final de contenedor un nuevo valor entero
	void insertarFinal(Integer nuevo) {
		lista = Arrays.copyOf(lista, lista.length+1);
		lista[lista.length - 1] = nuevo;
	}
	
	//Permite insertar al final de contenedor otro array (de tipo Lista) que contendra uno o mas valores
	void insertarFinal(Lista otroArray) {
		int tamInicial = lista.length;	//tamaño inicial del array
		lista = Arrays.copyOf(lista, lista.length + otroArray.lista.length);
		System.arraycopy(otroArray.lista, 0, lista, tamInicial, otroArray.lista.length);
	}
	
	//Permite insertar el segundo parametro (nuevo) en el indice indicado por el primer parametro (posicion)
	void insertar(int posicion, Integer nuevo) {
		lista = Arrays.copyOf(lista, lista.length+1);
		System.arraycopy(lista, posicion, lista, posicion + 1, lista.length-posicion-1);
		lista[posicion] = nuevo;
	}
	
	//Permite elimiar el elemento situado en el indice indicado 
	Integer eliminar (int indice) {
		Integer eliminado = null;
		if (indice >= 0 && indice < lista.length) {
			eliminado = lista[indice];
			for(int i = indice+1; i<lista.length; i++) {
				lista[i-1]=lista[i];
			}
			lista = Arrays.copyOf(lista, lista.length -1);
		}
		return eliminado;
	}
	
	//Devuelve el elemento situado en la posicion indicada por el indice pasado
	//En el caso de que el indice no sea valido devolverá null evitando que el programa aborte
	Integer getElemento(int indice) {
		Integer resultado = null;
		if (indice >= 0 && indice < lista.length) {		//indice valido
			resultado = lista[indice];	
		}
		return resultado;
	}
	
	//Busca si existe un valor en el array y, en caso de que asi sea, devuelve el indice donde se encuentra
	int buscar(Integer claveBusqueda) {
		int indice = -1;
		for (int i=0; i<lista.length && indice == -1; i++) {
			if(lista[i].equals(claveBusqueda)) {
				indice = i;
			}
		}
		return indice;
	}
	
	//Devuelve el numero de elementos de la lista es el numero de elementos del array
	public int getNumeroElementos() {
		return lista.length;
	}
	
	static Lista concatena(Lista l1, Lista l2) {
		
		Lista nueva = new Lista();
		
		nueva.insertarFinal(l1);
		
		nueva.insertarFinal(l2);
		
		return nueva;
		
	}
	
	//Muestra por consola el contenido de la lista
	public void mostrar() {
		System.out.println("Lista: " +Arrays.toString(lista));
	}

}