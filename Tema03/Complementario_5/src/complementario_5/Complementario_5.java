package complementario_5;

import java.util.Scanner;

public class Complementario_5{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int numero = sc.nextInt();
		
		int aux = numero;
		int contador = 0;
		
		while (aux !=0) {
			aux /= 10;
			contador++;
		}

		if (contador == 1) {
			System.out.println("El numero tiene "+contador+" cifra");			
		}else {
			System.out.println("El numero tiene "+contador+" cifras");
		}
		

	}

}
