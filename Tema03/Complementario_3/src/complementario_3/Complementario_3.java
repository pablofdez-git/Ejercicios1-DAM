package complementario_3;

import java.util.Scanner;

public class Complementario_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un numero entero no negativo: ");
		int numUser = sc.nextInt();
		
		if (numUser > 0) {
			System.out.println("El numero tiene que ser positivo");
		}else if(numUser == 0) {
			
		}
		
		

	}

}
