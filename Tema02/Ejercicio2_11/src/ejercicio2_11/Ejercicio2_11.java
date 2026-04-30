package ejercicio2_11;

import java.util.Scanner;

public class Ejercicio2_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número entre 0 y 9999: ");
		int numUser = sc.nextInt();
		
		int millar = numUser / 1000;
		int centena = (numUser / 100)%10;
		int decena = (numUser / 10)%10;
		int unidad = (numUser/1)%10;
		
		if(numUser >0 && numUser < 9999) {
			if(numUser > 999) {
				if(millar == unidad && centena == decena) {
					System.out.println("Es capicua");
				}else {
					System.out.println("No es capicua");
				}
			}else if(numUser>99 && numUser<=999) {
				if(centena == unidad) {
					System.out.println("Es capicua");
				}else {
					System.out.println("No es capicua");
				}
			}else if(numUser >9 && numUser <= 99) {
				if(decena == unidad) {
					System.out.println("Es capicua");
				}else {
					System.out.println("No es capicua");
				}
			}else if(numUser >0 && numUser <= 9) {
				System.out.println("Es capicua");
			}
		}else {
			System.out.println("Numero fuera de rango");
		}
		

	}

}
