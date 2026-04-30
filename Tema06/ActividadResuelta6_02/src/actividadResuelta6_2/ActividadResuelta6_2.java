package actividadResuelta6_2;

import java.util.Scanner;

public class ActividadResuelta6_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce la primera frase: ");
		String frase1 = sc.nextLine();
		System.out.print("Introduce la segunda frase: ");
		String frase2 = sc.nextLine();
		
		int longFrase1 = frase1.length();
		int longFrase2 = frase2.length();
		
		if(longFrase1 < longFrase2) {
			System.out.println("La cadena más corta es: " +frase1+ " con una longitud de " +longFrase1);
		}else {
			System.out.println("La cadena más corta es: " +frase2+ " con una longitud de " +longFrase2);
		}

	}

}
