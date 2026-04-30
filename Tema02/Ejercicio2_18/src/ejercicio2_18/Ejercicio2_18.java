package ejercicio2_18;

import java.util.Scanner;

public class Ejercicio2_18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final int MAX_1 = 99;
		final int MIN = 1;
		final int MAX_2 = 3;
		
		int aleatorio1 = (int) (Math.random()*(MAX_1-MIN+1)+MIN);
		int aleatorio2 = (int) (Math.random()*(MAX_1-MIN+1)+MIN);
		int operacion = (int) (Math.random()*(MAX_2-MIN+1)+MIN);
		int respuesta;
		
		switch (operacion){
			case 1:
				System.out.println(aleatorio1+ " + " +aleatorio2+ " = ");
				respuesta = sc.nextInt();
				if(respuesta == aleatorio1 + aleatorio2) {
					System.out.println("Resultado correcto");
				}else {
					System.out.println("Resultado incorrecto");
				}
				break;
			case 2:
				System.out.println(aleatorio1+ " - " +aleatorio2+ " = ");
				respuesta = sc.nextInt();
				if(respuesta == aleatorio1 - aleatorio2) {
					System.out.println("Resultado correcto");
				}else {
					System.out.println("Resultado incorrecto");
				}
				break;
			case 3:
				System.out.println(aleatorio1+ " x " +aleatorio2+ " = ");
				respuesta = sc.nextInt();
				if(respuesta == aleatorio1 * aleatorio2) {
					System.out.println("Resultado correcto");
				}else {
					System.out.println("Resultado incorrecto");
				}
				break;
		}

	}

}
