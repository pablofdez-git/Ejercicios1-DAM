package tareaTema2;

import java.util.Scanner;

public class TareaTema2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Variables fijas para saber la hora de la media noche, faltando un minuto
		final int HORA_MEDIANOCHE = 23;
		final int MINUTOS_MEDIANOCHE = 59;
		
		//Introduccion de datos
		System.out.print("Introduce la hora: ");
		int hora = sc.nextInt();
		System.out.print("Introduce los minutos: ");
		int minutos = sc.nextInt();
		
		//Validacion para comprobar que se meta una hora y minutos reales
		if (hora < 0 || hora > 23 || minutos < 0 || minutos > 60) {
			System.out.println("Error datos incorrectos");
		}else {
			
			//Calculo de la hora y paso a minutos
			int calculoHora = (HORA_MEDIANOCHE - hora)*60;
			
			//Calculo de los minutos más el minuto faltante
			int calculoMinutos = (MINUTOS_MEDIANOCHE - minutos)+1;
			
			//Calculo final
			int minutosRestantes = calculoHora + calculoMinutos;
			
			System.out.println("Los minutos que faltan para la media noche "
					+ "son: " +minutosRestantes);
			
		}

	}

}










