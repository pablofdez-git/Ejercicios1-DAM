package ejercicio3_13;

import java.util.Scanner;

public class Ejercicio3_13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce la hora: ");
		int horas = sc.nextInt();
		System.out.print("Introduce los minutos: ");
		int minutos = sc.nextInt();
		System.out.print("Introduce los segundos: ");
		int segundos = sc.nextInt();
		System.out.print("¿Cuántos segundos deseas incrementar?: ");
		int incremento = sc.nextInt();
		
		
		if(horas < 0 || horas > 23 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59) {
			System.out.println("Datos incorrectos");
		}else {
			segundos += incremento;
			
			while(segundos >= 60) {
				segundos = segundos - 60;
				minutos ++;
			}
			while(minutos >= 60) {
				minutos -= 60;
				horas ++;
			}
			if(horas == 24) {
				horas = 0;
			}
		}
		System.out.println("La hora es: " +horas+ " : " +minutos+ " : " +segundos);

	}

}
