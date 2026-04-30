package ruletaRusa;

public class Juego {
	
	private int numJugadores;
	private Jugador[] jugadores;
	private Revolver revolver;
	
	Juego(int numJugadores){
		setNumJugadores(numJugadores);
		jugadores = new Jugador[numJugadores];
		crearJugadores();
		revolver = new Revolver();
	}
	
	private boolean finJuego() {
		for(int i=0; i<jugadores.length; i++) {
			if(!jugadores[i].isVivo()) {
				return true;
			}
		}
		return false;
	}
	
	public void ronda() {
		int i = 0;
		while(!finJuego()) {
			jugadores[i].disparar(revolver);
			if(!jugadores[i].isVivo()) {
				break;
			}
			i++;
			if(i>=jugadores.length) {
				i=0;
			}
		}	
	}
	
	private void crearJugadores() {
		for(int i=0; i<jugadores.length; i++) {
			jugadores[i] = new Jugador(i+1);
		}
	}
	
	private void setNumJugadores(int numJugadores) {
		if(numJugadores < 2 || numJugadores > 6) {
			this.numJugadores = 6;
		} else {
			this.numJugadores = numJugadores;
		}
	}

}
