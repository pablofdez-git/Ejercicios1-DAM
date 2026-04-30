package actividadResuelta3_3;

import java.util.Scanner;

public class ActividadResuelta3_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numAleatorio = (int) (Math.random() * (100-1+1)+1);
		//System.out.println(numAleatorio);
		
		boolean finJuego = false;
		
		System.out.println("Introduce un número entre 1 y 100");
		int numUser = sc.nextInt();
		
		//Falta la comprobacion del 1y100
		while (finJuego == false) {
			
			if (numUser == -1 || numUser == numAleatorio || numUser > 100 || numUser < 1) {
				finJuego = true;
			}else if (numUser > numAleatorio) {
				System.out.println("Tu numero es mayor");
				finJuego = false;
			}else if(numUser < numAleatorio) {
				System.out.println("Tu numero es menor");
				finJuego = false;
			}
			
			if(finJuego == false) {
				System.out.println("Introduce otro número");
				numUser = sc.nextInt();
			}
			
		}
		System.out.println("Has acertado");
	}
}
