package actividadResuelta3_8;

import java.util.Scanner;

public class ActividadResuelta3_8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int suma=0;
		for(int i=0; i<10; i++) {
			System.out.println("introduce un numero");
			int num = sc.nextInt();
			suma += num;
		}
		double media=(double) suma/10;
		System.out.println("La media es: "+media);

	}

}
