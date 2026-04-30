package ejercicio3_12;

import java.util.Scanner;

public class Ejercicio3_12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número binario: ");
		int numUser = sc.nextInt();
		
		int exponente =0;
		int suma = 0;
		while(numUser > 0) {
			int digito = numUser %10;
			digito = (int) (digito*(Math.pow(2, exponente)));
			numUser /= 10;
			suma += digito;
			exponente++;
		}
		System.out.println(suma);
		
	}

}
