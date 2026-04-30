package ejercicio2_19;

import java.util.Scanner;

public class Ejercicio2_19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce los grados de un ángulo: ");
		int grados = sc.nextInt();
		
		if(grados > 0 || grados < 360) {
			grados = grados%360;
		}
		double radianes = grados * Math.PI / 180;
		System.out.println("Los grados en radianes son: " +radianes);
		
		

	}

}
