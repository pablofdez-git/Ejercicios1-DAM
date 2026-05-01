package actividadResuelta1_13;

import java.util.Scanner;

public class ActividadResuelta1_13 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce la nota del primer trimestre: ");
		int notaPrimerTrimestre = sc.nextInt();
		System.out.println("Introduce la nota del segundo trimestre: ");
		int notaSegundoTrimestre = sc.nextInt();
		System.out.println("Introduce la nota del tercer trimestre: ");
		int notaTercerTrimestre = sc.nextInt();
		
		int mediaBoletin = (int) (notaPrimerTrimestre + notaSegundoTrimestre + notaTercerTrimestre) / 3;
		double notaExpediente = (notaPrimerTrimestre + notaSegundoTrimestre + notaTercerTrimestre) / 3.0;
		
		System.out.println("La media del boletin es: " +mediaBoletin);
		System.out.println("La media del expediente es: "+notaExpediente);
		
	}

}
