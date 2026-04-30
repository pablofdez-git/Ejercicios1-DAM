package ejercicio3_20;

import java.util.*;

public class Ejercicio3_20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		System.out.print("Introduce una cantidad de dinero: ");
		double dinero = sc.nextDouble();
		
		double suma=0;
		
		while (dinero != 0) {
			
			suma += dinero;
			System.out.print("Introduce una cantidad de dinero: ");
			dinero = sc.nextDouble();
	
		}

		System.out.println("La cantidad total de dinero es: " +suma);
		
	}

}
