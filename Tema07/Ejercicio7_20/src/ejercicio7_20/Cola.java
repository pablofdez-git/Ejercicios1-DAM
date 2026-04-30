package ejercicio7_20;

public class Cola {
	
	private Lista lista;
	
	public Cola() {
		lista =  new Lista();
	}
	
	void encolar(Integer elemento) {
		lista.insertarFinal(elemento);
	}
	
	Integer desencolar() {
		return lista.eliminar(0);
	}
	
	void mostrar() {
		lista.mostrar();
	}
	
	

}
