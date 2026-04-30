package ejercicio1_16;

import java.util.Scanner;

public class Ejercicio1_16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce los segundos: ");
		int segundos = sc.nextInt();
		
		int horas = segundos / 3600;
		int minutos = (segundos % 3600) / 60;
		int segundosRestantes = segundos % 60; 

		System.out.println("Hay " +horas+"h " + minutos+ "min " +segundosRestantes+ "s");
		
		
		
		
		

	}

}
