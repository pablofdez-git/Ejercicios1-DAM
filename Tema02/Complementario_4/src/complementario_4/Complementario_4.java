package complementario_4;

import java.util.Scanner;

public class Complementario_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el numero de alumnos: ");
		int numAlumnos = sc.nextInt();
		
		int costeAlumnos=0;
		int costeAutobus=0;
		
		if(numAlumnos >= 100) {
			costeAlumnos = 65;
		}else if(numAlumnos >= 50 && numAlumnos <=99) {
			costeAlumnos = 70;
		}else if(numAlumnos >=30 && numAlumnos <=49) {
			costeAlumnos = 95;
		}else if(numAlumnos < 30) {
			costeAutobus = 4000;
		}else {
			System.out.println("El numero de alumnos"
					+ " no puede ser negativo");
		}
		
		if(numAlumnos >= 30) {
		System.out.println("El coste de los alumnos es de: " +costeAlumnos);
		costeAutobus = costeAlumnos * numAlumnos;
		System.out.println("El coste del autobus es de: " +costeAutobus);
		}else {
			System.out.println("El coste del autobus es de: " +costeAutobus);
			costeAlumnos = costeAutobus/numAlumnos;
			System.out.println("El coste de los alumnos es de: " +costeAlumnos);
		}
		
	}

}
