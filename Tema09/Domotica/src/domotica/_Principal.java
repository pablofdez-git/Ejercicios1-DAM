package domotica;

public class _Principal {

	public static void main(String[] args) {
		
        // Creación de dispositivos
        Dispositivo bombilla = new BombillaInteligente();
        Dispositivo camara = new CamaraSeguridad();
        Dispositivo termostato = new Termostato();

        // Operaciones con la BombillaInteligente
        System.out.println("\n--- Bombilla Inteligente ---");
        bombilla.encender();
        ((Regulable) bombilla).ajustarNivel(75);  // Ajustamos el brillo
        bombilla.apagar();

        // Operaciones con la CamaraSeguridad
        System.out.println("\n--- Cámara de Seguridad ---");
        camara.encender();
        ((Conectividad) camara).conectarWifi("RedCasa");  // Conectamos a WiFi
        System.out.println("Está conectada a WiFi: " + ((Conectividad) camara).estaConectado());
        ((CamaraSeguridad)camara).desconectarWifi();  // Desconectamos la cámara
        camara.apagar();

        // Operaciones con el Termostato
        System.out.println("\n--- Termostato ---");
        termostato.encender();
        ((Regulable) termostato).ajustarNivel(22);  // Ajustamos la temperatura
        ((Conectividad) termostato).conectarWifi("RedOficina");  // Conectamos a WiFi
        System.out.println("Está conectado a WiFi: " + ((Conectividad) termostato).estaConectado());
        termostato.apagar();

        // Operaciones adicionales para asegurar el uso de todas las interfaces
        System.out.println("\n--- Operaciones adicionales ---");
        
        // Verificamos si los dispositivos están encendidos o apagados
        System.out.println("¿La bombilla está encendida? " + bombilla.estaEncendido());
        System.out.println("¿La cámara está encendida? " + camara.estaEncendido());
        System.out.println("¿El termostato está encendido? " + termostato.estaEncendido());

        // Intentamos ajustar los niveles de brillo y temperatura con dispositivos apagados
        System.out.println("\nIntentando ajustar niveles en dispositivos apagados:");
        ((Regulable) bombilla).ajustarNivel(50);  // Bombilla apagada
        ((Regulable) termostato).ajustarNivel(18);  // Termostato apagado
        ((Conectividad) camara).conectarWifi("RedCasa");  // Cámara apagada

	}

}