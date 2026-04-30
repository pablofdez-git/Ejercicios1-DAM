package actividadResuelta2_4;

import java.util.*;

public class ActividadResuelta2_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		System.out.print("Introduce un numero: ");
		double numUser = sc.nextDouble();
		
		if(numUser >=1 || numUser <= -1 || numUser==0) {
			System.out.println("El numero no es un casi-cero");
		}else {
			System.out.println("El numero es un casi-cero");
		}

	}

}
