package puntuacion;

import java.util.Scanner;

public class Puntuacion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1 = aleatorios(1,100);
		int n2 = aleatorios(1,100);
		int n3 = aleatorios(50,100);
		int n4 = aleatorios(1,50);
		int intentos = 2;
		int respuesta1;
		int puntuacion;
		int puntuacionTotal[] = new int[2];
		boolean correcto = true;
		
		//----------------------------Suma----------------------------
		System.out.println(n1+ " + "+n2);
		respuesta1 = sc.nextInt();
		
		if(respuesta1 == n1+n2) {
			correcto = true;
		}else {
		
			while(correcto = false) {
			
				if(!(respuesta1 == n1+n2)) {
					intentos--;
					System.out.println("Vuelve a introducir la respuesta: ");
					respuesta1 = sc.nextInt();
				}
			}
		}
		
		puntuacionTotal[0] = puntuacion(intentos);
		
		//----------------------------Resta----------------------------
		System.out.println(n3+ " - "+n4);
		respuesta1 = sc.nextInt();
		
		if(respuesta1 == n1-n2) {
			correcto = true;
		}else {
		
			while(correcto = false) {
			
				if(!(respuesta1 == n1-n2)) {
					intentos--;
					System.out.println("Vuelve a introducir la respuesta: ");
					respuesta1 = sc.nextInt();
				}
			}
		}
		
		puntuacionTotal[1] = puntuacion(intentos);
		
		//----------------------------Multiplicacion----------------------------
		System.out.println(n1+ " x "+n2);
		respuesta1 = sc.nextInt();
		
		if(respuesta1 == n1*n2) {
			correcto = true;
		}else {
		
			while(correcto = false) {
			
				if(!(respuesta1 == n1*n2)) {
					intentos--;
					System.out.println("Vuelve a introducir la respuesta: ");
					respuesta1 = sc.nextInt();
				}
			}
		}
		
		puntuacionTotal[2] = puntuacion(intentos);
		
		//-----Calculo puntuacion------
		
		int sumaPuntuacion = 0;
		for(int numero : puntuacionTotal) {
			sumaPuntuacion +=numero;
		}
		
		System.out.println("La puntuacion total es: "+sumaPuntuacion);
	}
	
	public static int puntuacion(int intentos) {
		int puntos=0;
		
		if(intentos == 0) {
			puntos=0;
		}else if(intentos == 1) {
			puntos=50;
		}else if(intentos == 2) {
			puntos=100;
		}
		
		return puntos;
	}
	
	public static int aleatorios(int min, int max) {
		return (int)(Math.random() * (max - min + 1)) + min;
	}

}
