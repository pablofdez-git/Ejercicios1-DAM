package ejercicio1_11;

import java.util.Scanner;

public class Ejercicio1_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Introduce la base imponible: ");
		double base = sc.nextDouble();
		
		System.out.print("Introduce el IVA a aplicar: ");
		double iva = sc.nextDouble();
		
		
		double importeIva = base * iva / 100;
		double total = base + importeIva;

		System.out.println("Importe del IVA: "+importeIva);
		System.out.println("Total a pagar: "+total);
	}
}
