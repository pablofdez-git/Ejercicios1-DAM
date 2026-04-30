package ruletaRusa;

public class Jugador {
	
	private int idJugador;
	private String nombre;
	private boolean vivo;
	
	Jugador(int id){
		this.idJugador = id;
		this.nombre = "Jugador "+idJugador;
		this.vivo = true;
	}
	
	public void disparar(Revolver r) {
		System.out.print("El jugador " +nombre+" ...");
		if(r.disparar()) {
			this.vivo = false;
			System.out.println("\tHa muerto");
		} else {
			System.out.println("\tSigue vivo");
		}
	}

	public boolean isVivo() {
		return vivo;
	}

}
