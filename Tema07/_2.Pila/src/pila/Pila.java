package pila;

import java.util.Arrays;

public class Pila {

	Integer[] pila;
	
	//Constructor (inicializa el array con 0 posiciones)
	public Pila() {
		pila = new Integer[0];
	}
	
	//Permite insetar un nuevo valor entero al final del array (cima)
	void apilar(Integer nuevo) {
		pila = Arrays.copyOf(pila, pila.length +1);
		pila[pila.length -1] = nuevo;
	}
	
	//Permite acceder y eliminar el ultimo elemento de la pila (cima)
	Integer desapilar(){
		Integer salida;
		if(pila.length == 0) {
			salida  = null;
		}else {
			salida = pila[pila.length -1];
			pila = Arrays.copyOf(pila, pila.length -1);
		}
		return salida;
	}
	
	//Devuelve el valor del ultimo elemento del array (cima)
	Integer cima() {
		Integer primero;
		if(pila.length == 0) {
			primero = null;
		}else {
			primero = pila[pila.length -1];
		}
		return primero;
	}
	
	//Deja toda la pila vacia (longitud 0)
		void vaciar() {
			pila = new Integer[0];
		}
		
		//Muestra el contendido de la pila
		void mostrar() {
			System.out.println("Pila: " +Arrays.toString(pila));
		}
	
	
}
