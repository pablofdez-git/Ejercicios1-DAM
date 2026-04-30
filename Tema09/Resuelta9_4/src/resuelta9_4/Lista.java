package resuelta9_4;

import java.util.Arrays;


public class Lista implements Pila, Cola{

	// Privado para ocultarlo fuera de la lista y solo acceder a traves de métodos públicos de la clase
	private Integer[] contenedor;
	
	//Constructor (inicializa el array con 0 posiciones)
	public Lista() {
		contenedor = new Integer[0];
	}
	
	//Permite insertar al inicio de contenedor un nuevo valor entero
	void insertarPrincipio(Integer nuevo) {
		contenedor = Arrays.copyOf(contenedor, contenedor.length + 1);
		System.arraycopy(contenedor, 0, contenedor, 1, contenedor.length -1);
		contenedor[0] = nuevo;
	}
	
	//Permite insertar al final de contenedor un nuevo valor entero
	void insertarFinal(Integer nuevo) {
		contenedor = Arrays.copyOf(contenedor, contenedor.length+1);
		contenedor[contenedor.length - 1] = nuevo;
	}
	
	//Permite insertar al final de contenedor otro array (de tipo Lista) que contendra uno o mas valores
	void insertarFinal(Lista otroArray) {
		int tamInicial = contenedor.length;	//tamaño inicial del array
		contenedor = Arrays.copyOf(contenedor, contenedor.length + otroArray.contenedor.length);
		System.arraycopy(otroArray.contenedor, 0, contenedor, tamInicial, otroArray.contenedor.length);
	}
	
	//Permite insertar el segundo parametro (nuevo) en el indice indicado por el primer parametro (posicion)
	void insertar(int posicion, Integer nuevo) {
		contenedor = Arrays.copyOf(contenedor, contenedor.length+1);
		System.arraycopy(contenedor, posicion, contenedor, posicion + 1, contenedor.length-posicion-1);
		contenedor[posicion] = nuevo;
	}
	
	//Permite elimiar el elemento situado en el indice indicado 
	Integer eliminar (int indice) {
		Integer eliminado = null;
		if (indice >= 0 && indice < contenedor.length) {
			eliminado = contenedor[indice];
			for(int i = indice+1; i<contenedor.length; i++) {
				contenedor[i-1]=contenedor[i];
			}
			contenedor = Arrays.copyOf(contenedor, contenedor.length -1);
		}
		return eliminado;
	}
	
	//Devuelve el elemento situado en la posicion indicada por el indice pasado
	//En el caso de que el indice no sea valido devolverá null evitando que el programa aborte
	Integer getElemento(int indice) {
		Integer resultado = null;
		if (indice >= 0 && indice < contenedor.length) {		//indice valido
			resultado = contenedor[indice];	
		}
		return resultado;
	}
	
	//Busca si existe un valor en el array y, en caso de que asi sea, devuelve el indice donde se encuentra
	int buscar(Integer claveBusqueda) {
		int indice = -1;
		for (int i=0; i<contenedor.length && indice == -1; i++) {
			if(contenedor[i].equals(claveBusqueda)) {
				indice = i;
			}
		}
		return indice;
	}
	
	//Devuelve el numero de elementos de la lista es el numero de elementos del array
	public int getNumeroElementos() {
		return contenedor.length;
	}
	
	//Muestra por consola el contenido de la lista
	public void mostrar() {
		System.out.println("Lista: " +Arrays.toString(contenedor));
	}

	//toString()
	@Override
	public String toString() {
		String resultado = "";
		for(int i=0; i<contenedor.length; i++) {
			resultado += contenedor[i] + " ";
		}
		return resultado;
	}
	
	//equals() - Dos listas son iguales si tienen los mismos elementos en el mismo orden
	@Override
	public boolean equals(Object otraLista) {
		boolean iguales = true;
		int numElementosLista = contenedor.length;
		int numElementosOtraLista = ((Lista) otraLista).getNumeroElementos();
		if (numElementosLista != numElementosOtraLista) {
			iguales = false;
		} else {
			for (int i=0; i<numElementosLista && iguales; i++) {
				if(!contenedor[i].equals(((Lista)otraLista).contenedor[i])) {
					iguales = false;
				}
			}
		}
		return iguales;
	}

	@Override
	public void encolar(Integer Elemento) {
		insertarFinal(Elemento);
		
	}

	@Override
	public Integer desencolar() {
		return eliminar(0);
	}

	@Override
	public void apilar(Integer Elemento) {
		insertarFinal(Elemento);
	}

	@Override
	public Integer desapilar() {
		return eliminar(getNumeroElementos() -1);
		
	}
	
	
	


}