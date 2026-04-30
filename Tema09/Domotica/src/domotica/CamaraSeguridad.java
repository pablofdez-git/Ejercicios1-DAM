package domotica;

public class CamaraSeguridad implements Dispositivo, Conectividad {

	private boolean encendida;
	private boolean concectado;
	private String wifiConectada;
	
	public CamaraSeguridad() {
		this.encendida = false;
		this.concectado = false;
	}

	@Override
	public void conectarWifi(String red) {
		if(this.encendida) {
			if(concectado == false) {
				concectado = true;
				this.wifiConectada = red;
				System.out.println("Camara conectada a la red Wifi: "+red+".");
			}else {
				System.out.println("Ya estas conectado.");
			}
		}else {
			System.out.println("No se puede conectar a Wifi si la camara esta apagada.");
		}
		
	}

	@Override
	public void desconectarWifi() {
		if(this.encendida == true) {
			if(this.concectado == true) {
				this.concectado = false;
				this.wifiConectada = null;
				System.out.println("Camara desconectada de la wifi.");
			}else {
				System.out.println("Ya esta desconcetada.");
			}
		}else {
			System.out.println("La camara esta apagada.");
		}
	}

	@Override
	public boolean estaConectado() {
		return this.concectado;
	}

	@Override
	public void encender() {
		if(!this.encendida) {
			this.encendida = true;
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

}