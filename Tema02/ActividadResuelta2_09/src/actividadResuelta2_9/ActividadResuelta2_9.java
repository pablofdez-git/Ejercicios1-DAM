package actividadResuelta2_9;

import java.util.Scanner;

public class ActividadResuelta2_9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número entre 0 y 99.999: ");
		int numUser = sc.nextInt();
		/*
		if (numUser < 10) {
			System.out.println("El numero tiene una cifra");
		}else if (numUser <100) {
			System.out.println("El numero tiene dos cifras");
		}else if (numUser < 1000) {
			System.out.println("El numero tiene tres cifras");
		}else if (numUser < 10000) {
			System.out.println("El numero tiene cuatro cifras");
		} else if(numUser < 100000) {
			System.out.println("El numero tiene cinco cifras");	
		}
		*/
		/*
		//2.9.1--------------------------------------------
		if (numUser < 10) {
			System.out.println("El numero tiene una cifra");
		}else if (numUser <100) {
			System.out.println("El numero tiene dos cifras");
		}else if (numUser < 1000) {
			System.out.println("El numero tiene tres cifras");
		}else if (numUser < 10000) {
			System.out.println("El numero tiene cuatro cifras");
		} else if(numUser < 100000) {
			System.out.println("El numero tiene cinco cifras");
		}else {
			System.out.println("El numero no esta dentro del rango");
		}
		*/
		//2.9.2--------------------------------------------
		if(numUser > -10 && numUser < 10) {
			System.out.println("El numero tiene una cifra");
		}else if (numUser > -100 && numUser < 100) {
			System.out.println("El numero tiene dos cifras");
		}else if (numUser > -1000 && numUser < 1000) {
			System.out.println("El numero tiene tres cifras");
		}else if (numUser > -10000 && numUser < 10000) {
			System.out.println("El numero tiene cuatro cifras");
		}else if (numUser > -100000 && numUser < 100000) {
			System.out.println("El numero tiene cinco cifras");
		}
		
	}
}
