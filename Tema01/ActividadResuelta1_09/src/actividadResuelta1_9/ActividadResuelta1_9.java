package actividadResuelta1_9;

import java.util.Scanner;

public class ActividadResuelta1_9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int num = sc.nextInt();
		
		boolean esPar = (num%2)==0;
		System.out.println("Es par: "+esPar);

	}

}
