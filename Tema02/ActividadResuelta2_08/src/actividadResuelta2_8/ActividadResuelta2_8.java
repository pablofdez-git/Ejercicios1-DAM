package actividadResuelta2_8;

import java.util.Scanner;

public class ActividadResuelta2_8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el valor de a: ");
		int valorA = sc.nextInt();
		System.out.println("Introduce el valor de b: ");
		int valorB = sc.nextInt();
		System.out.println("Introduce el valor de c: ");
		int valorC = sc.nextInt();
		
		double discriminante = Math.pow(valorB,2)-4*valorA*valorC;
		
		
		if (valorA == 0) {
			System.out.println("No es una ecuacion de segundo grado");
		}else if (discriminante < 0){
			System.out.println("No tiene solucion Real");
		}else {
			if (discriminante == 0) {
				double x = (-valorB)/(2.0*valorA);
				System.out.println("Tiene una solucion doble que es: "+x);
			}else /*if (discriminante > 0) */{
				double raiz = Math.sqrt(discriminante);
				double x1= (-valorB + raiz)/(valorA*2.0);
				double x2 = (-valorB - raiz)/(valorA*2.0);
				System.out.println("Tiene dos soluciones: ");
				System.out.println(x1+ " y "+x2);
			}
		}
		
		/*
		if (valorA == 0) {	//a = 0
			System.out.println("No es una ecuacion de segundo grado");
		}else if (discriminante <0) {	//resultado raiz negativo
			System.out.println("La ecuacion no tiene soluciones reales");
		}else {
			if(discriminante == 0) {
				double x = (-valorB)/(valorA*2);
				System.out.println("Solucion " +x+ " Tiene una solucion doble");
			}else if (discriminante != 0) {
				double raiz = Math.sqrt(discriminante);
				double x1 = (-valorB+raiz)/(valorA*2);
				double x2 = (-valorB-raiz)/(valorA*2);
				System.out.println("Solucion 1 "+x1);
				System.out.println("Solucion 2 "+x2);
			}
		
		}
		*/

	}

}
