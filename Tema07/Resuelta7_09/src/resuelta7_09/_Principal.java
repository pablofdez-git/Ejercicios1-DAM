package resuelta7_09;

public class _Principal {

	public static void main(String[] args) {
		
		Bombilla b1 = new Bombilla();
		Bombilla b2 = new Bombilla();
		Bombilla b3 = new Bombilla();
		Bombilla b4 = new Bombilla();
		
		b1.encender();
		b3.encender();
		
		Bombilla.interruptorGeneral(true);
		
		b1.mostrarEstado();
		b2.mostrarEstado();
		b3.mostrarEstado();
		b4.mostrarEstado();
		
		Bombilla.interruptorGeneral(false);
		
		b1.mostrarEstado();
		b2.mostrarEstado();
		b3.mostrarEstado();
		b4.mostrarEstado();
		
		
		
		

	}

}
