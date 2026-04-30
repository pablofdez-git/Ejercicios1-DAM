package actividadResuelta2_1;

import java.util.Scanner;

public class ActividadResuelta2_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int numUser = sc.nextInt();
		
		if(numUser%2==0) {
			System.out.println("El número es Par");
		}else {
			System.out.println("El número es Impar");
		}

	}

}
