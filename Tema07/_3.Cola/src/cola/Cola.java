package cola;

import java.util.Arrays;

public class Cola {
	
	Integer[] cola;
	
	//Constructor (inicializa el array con 0 posiciones)
	public Cola() {
		cola = new Integer[0];
	}
	
	//Permite insertar al principio de la cola un nuevo valor entero
	void encolar(Integer nuevo) {
		cola = Arrays.copyOf(cola, cola.length +1);
		cola[cola.length -1] = nuevo;
	}
	
	//Permite desencolar el ultimo elemento del array (el primero de la cola)
	Integer desencolar() {
		Integer salida;
		if(cola.length == 0) {
			salida  = null;
		}else {
			salida = cola[cola.length -1];
			cola = Arrays.copyOf(cola, cola.length -1);
		}
		return salida;
	}
	
	//Permite acceder al ultimo elemento del array (el primero de la cola)
	Integer primero() {
		Integer primero;
		if(cola.length == 0) {
			primero = null;
		}else {
			primero = cola[cola.length -1];
		}
		return primero;
	}
	
	//Devuelve la longitud del Array
	int longitud() {
		return cola.length;
	}
	
	//Deja toda la cola vacia (longitud 0)
	void vaciar() {
		cola = new Integer[0];
	}
	
	//Muestra el contendido de la cola
	void mostrar() {
		System.out.println("Cola: " +Arrays.toString(cola));
	}
}
