package domotica;

public class BombillaInteligente implements Dispositivo, Regulable {
	
	private boolean encendida;
	private int nivelBrillo;
	
	public BombillaInteligente() {
		this.encendida = false;
		this.nivelBrillo = 0;
	}

	@Override
	public void encender() {
		if(!this.encendida) {
			encendida = true;
			System.out.println("Bombilla encendida.");
		}
	}

	@Override
	public void apagar() {
		if(this.encendida) {
			this.encendida = false;
			System.out.println("Bombilla apagada.");
		}
		
	}

	@Override
	public boolean estaEncendido() {
		return this.encendida;
	}
	
	@Override
	public void ajustarNivel(int nivel) {
		if(this.encendida) {
			if(nivel >= 0 && nivel <= 100) {
				this.nivelBrillo = nivel;
				System.out.println("Brillo ajustado a " +nivel+ "%.");
			}else {
				System.out.println("El nivel debe estar entre 0 y 100.");
			}
			
		}else {
			System.out.println("No se puede ajustar el brillo si la bombilla esta apagada.");
		}
		
	}
}