package resuelta7_09;

public class Bombilla {
	
	private boolean encendida = false;
	private static boolean interruptorGeneral = false;
	
	public Bombilla() {
		this.encendida = false;
	}

	void encender() {
		this.encendida = true;
	}
	
	void apagar() {
		this.encendida = false;
	}
	
	static void interruptorGeneral(boolean estado) {
		if(estado == true) {
			interruptorGeneral = true;
		}else {
			interruptorGeneral = false;
		}
	}
	
	public boolean estadoBombilla() {
		return encendida && interruptorGeneral;
	}
	
	void mostrarEstado() {
		if(estadoBombilla()) {
			System.out.println("Encendida");
			System.out.println("----------");
		}else {
			System.out.println("Apagada");
			System.out.println("----------");
		}
	}

	
	
	
	
	
	

}
