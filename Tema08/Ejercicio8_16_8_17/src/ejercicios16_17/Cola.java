package ejercicios16_17;

public class Cola extends Lista {

	void encolar(Integer nuevo) {
		super.insertarFinal(nuevo);
	}

	void desencolar() {
		eliminar(0);
	}
}
