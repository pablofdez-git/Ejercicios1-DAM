package ejercicios16_17;


public class Pila extends Lista{

	void apilar(Integer nuevo) {
		insertarFinal(nuevo);
	}

	void desapilar() {
		eliminar(super.getNumeroElementos()-1);
	}
	
}
