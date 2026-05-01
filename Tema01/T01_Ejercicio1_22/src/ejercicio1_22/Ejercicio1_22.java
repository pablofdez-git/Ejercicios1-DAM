package ejercicio1_22;

import java.util.*;

public class Ejercicio1_22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		System.out.println("Introduce la longitud en metros: ");
		double longitudMetros = sc.nextDouble();
		
		double longitudCm = longitudMetros * 100;
		
		int longitudFinal = (int) longitudCm;
		
		System.out.println("La longitud final es de: " +longitudFinal+ " cm");
		

	}

}
