package domotica;

public interface Conectividad {
	
	void conectarWifi(String red);
	void desconectarWifi();
	boolean estaConectado();

}
