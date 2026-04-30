package complementario_5;

import java.util.Scanner;

public class Complementario_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el numero del dado: ");
		int numDado = sc.nextInt();
		
		switch (numDado) {
			case 1: 
				System.out.println("Seis");
				break;
			case 2: 
				System.out.println("Cinco");
				break;
			case 3: 
				System.out.println("Cuatro");
				break;
			case 4: 
				System.out.println("Tres");
				break;
			case 5: 
				System.out.println("Dos");
				break;
			case 6: 
				System.out.println("Uno");
				break;
			default:
				System.out.println("ERROR: número incorrecto");
				break;
				
		}
	}

}
