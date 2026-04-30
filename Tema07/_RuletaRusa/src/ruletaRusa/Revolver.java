package ruletaRusa;

public class Revolver {
	
	private int posicionActual;
	private int posicionBala;
	private int tamanioTambor = 6;
	
	public Revolver() {
		posicionActual = generarAleatorio(1, tamanioTambor);
		posicionBala = generarAleatorio(1, tamanioTambor);
	}
	
	public boolean disparar() {
		boolean exito = false;
		if(posicionActual == posicionBala) {
			exito = true;
		}
		siguientePosicion();
		return exito;
	}
	
	private void siguientePosicion() {
		if(posicionActual==tamanioTambor) {
			posicionActual=1;
		} else {
			posicionActual++;
		}
	}
	
	public void mostrarInforRevolver() {
		System.out.println("Posicion actual: " +posicionActual);
		System.out.println("Poscion bala: " +posicionBala);
	}
	
	private static int generarAleatorio(int min, int max) {
		return ((int)(Math.random()*(max-min+1)+min));
	}

}
