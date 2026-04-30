package actividadResuelta3_5;

import java.util.Scanner;

public class ActividadResuelta3_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int aciertos = 0;
		boolean continuar = false;
		final int MAX = 100;
		final int MIN = 1;
		
		do {

			int num1 = (int) (Math.random()*(MAX-MIN+1)+MIN);
			int num2 = (int) (Math.random()*(MAX-MIN+1)+MIN);
			
			System.out.print(num1 + " + " + num2 + " =");
			int respuesta = sc.nextInt();
			
			int solucion = num1 + num2;
			
			if(respuesta == solucion) {
				System.out.println("Has acertado");
				continuar = true;
				aciertos ++;
			}else {
				continuar = false;
				System.out.println("Has fallado");
			}
			
		}while(continuar);
		
		System.out.println("Numero de aciertos: "+aciertos);
	}

}
