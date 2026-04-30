package ejercicio4_14;

import java.util.Scanner;

public class Ejercicio4_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce los dias: ");
		int dias = sc.nextInt();
		System.out.print("Introduce las horas: ");
		int horas = sc.nextInt();
		System.out.print("Introduce los minutos: ");
		int minutos  =sc.nextInt();

		
		int segundosTotales = calculoSegundos(dias, horas, minutos);
		
		System.out.println("Los segundos totales son: " +segundosTotales);
	}
	/**
	 * Pasa los dias, horas y minutos a segundos
	 * @param dias
	 * @param horas
	 * @param minutos
	 * @return suma de todos los segundos
	 */
	public static int calculoSegundos(int dias, int horas, int minutos) {
		int totalSegundos = (86400*dias)+(3600*horas)+(60*minutos);
		
		return totalSegundos;
	}

}
