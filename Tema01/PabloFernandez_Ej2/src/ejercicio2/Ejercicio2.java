package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("introduce un numero de 3 cifras: ");
		int numUser = sc.nextInt();
		
		//Descomposicion en unidades, decenas y centenas
		int c = numUser / 100;
		int d = (numUser % 100)/10;
		int u = numUser % 10;
		
		//Comprobaciones
		
		if((c == 0 || c == 1) && (d == 0 || d == 1) && (u == 0 || u == 1)) {			//si los numeros son 1 o 0
			int contadorUnos=0;
			System.out.println("El numero "+numUser+ " puede ser:");
			System.out.println("Binario");
			System.out.println("Octal");
			System.out.println("Decimal");
			
			//Contador para contar el numero de unos
			if(c==1) {
				contadorUnos++;
			}
			if (d==1) {
				contadorUnos++;
			}
			if(u==1) {
				contadorUnos++;
			}
			System.out.println("Tiene "+contadorUnos+ " unos");
			
		}else if ((c >= 0 && c <= 7) && (d >= 0 && d <= 7) && (u >= 0 && u <= 7)){		//Si los numeros estan entre 0 y 7 
			System.out.println("El numero "+numUser+ " puede ser:");
			System.out.println("Octal");
			System.out.println("Decimal");
			
		}else if ((c >= 0 && c <= 9) && (d >= 0 && d <= 9) && (u >= 0 && u <= 9)) {		//Si los numeros estan entre 0 y 9
			System.out.println("El numero "+numUser+ " puede ser:");
			System.out.println("Decimal");
			
			int sumaCifras = c + d + u;
			
			//Comprobacion para saber si es multiplo de 7
			if(sumaCifras % 7 == 0) {
				System.out.println("La suma de las cifras es multiplo de 7");
			}else {
				System.out.println("La suma de las cifras no es multiplo de 7");
			}
		}

	}

}
