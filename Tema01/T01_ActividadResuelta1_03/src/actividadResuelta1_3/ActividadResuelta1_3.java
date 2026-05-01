package actividadResuelta1_3;

import java.util.Scanner;

public class ActividadResuelta1_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.print("Introduce tu edad: ");
		int edad = sc.nextInt();
		
		int edadProx = ++edad;
		
		System.out.println("Tu edad el próximo año es: "+edadProx);
	}

}
