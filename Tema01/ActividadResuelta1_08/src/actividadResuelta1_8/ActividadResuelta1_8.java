package actividadResuelta1_8;

import java.util.Scanner;

public class ActividadResuelta1_8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final int MAYORIA_EDAD = 18;
		
		System.out.print("Introduce tu edad: ");
		int edad = sc.nextInt();
		
		boolean mayorEdad = edad >= MAYORIA_EDAD;
		
		System.out.println("Es mayor de edad: "+mayorEdad);

	}

}
