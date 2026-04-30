package ejercicio1_18;

import java.util.*;

public class Ejercicio1_18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final int PATAS_HORMIGAS = 6;
		final int PATAS_ARANIAS = 8;
		final int PATAS_COCHINILLAS = 14;
		
		System.out.println("Introduce el número de hormigas: ");
		int hormigas = sc.nextInt();
		System.out.println("Introduce el número de aranias: ");
		int aranias = sc.nextInt();
		System.out.println("Introduce el número de cochinillas: ");
		int cochinillas = sc.nextInt();

		int totalPatas = (hormigas * PATAS_HORMIGAS) + (aranias * PATAS_ARANIAS) + (cochinillas * PATAS_COCHINILLAS);
		
		System.out.println("El total de patas es de "+totalPatas+ " patas");
	}

}
