package ejercicio2_17;

import java.util.Scanner;

public class Ejercicio2_17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int aleatorio1 = (int) (Math.random()*(99-1)+1);
		int aleatorio2 = (int) (Math.random()*(99-1)+1);
		
		int suma = aleatorio1 + aleatorio2;
		
		System.out.print(aleatorio1+ " + " +aleatorio2+ " = ");
		int respuesta = sc.nextInt();
		
		if(respuesta == suma) {
			System.out.println("El resultado es correcto");
		}else {
			System.out.println("El resultado es incorrecto");
		}

	}

}
