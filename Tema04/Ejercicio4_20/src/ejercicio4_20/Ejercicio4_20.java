package ejercicio4_20;

import java.util.Scanner;

public class Ejercicio4_20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int numUser = sc.nextInt();
		
		System.out.println(sumaDigitos(numUser));

	}
	
	public static int sumaDigitos(int numUser) {
		int resultado = 0;
		
		if(numUser == 0) {
			resultado = 1;
		}else {
			resultado =  + (sumaDigitos());
		}
		
		
		return 0;
	}

}
