package actividadResuelta3_12;

import java.util.*;

public class ActividadResuelta3_12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		int contadorSuspensos=0;
		
		for(int i=0;i<5;i++) {
			System.out.println("Introduce una nota: ");
			double nota = sc.nextDouble();
		
			if(nota < 5.0) {
				contadorSuspensos++;
			}
			
		}
		System.out.println("Hay "+contadorSuspensos+ " suspensos");

	}

}
