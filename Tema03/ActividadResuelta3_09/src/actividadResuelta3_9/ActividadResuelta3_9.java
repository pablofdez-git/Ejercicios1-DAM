package actividadResuelta3_9;

import java.util.Scanner;

public class ActividadResuelta3_9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un número entre 1 y 10: ");
		int numUser = sc.nextInt();
		System.out.println("Tabla del "+numUser);
		for(int i=1; i<=10 ;i++) {
			
			System.out.println(i+ " x " +numUser  + " = " +numUser * i);
		}

	}

}
