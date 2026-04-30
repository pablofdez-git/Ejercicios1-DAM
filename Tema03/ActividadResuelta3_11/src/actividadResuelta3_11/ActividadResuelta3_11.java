package actividadResuelta3_11;

import java.util.Scanner;

public class ActividadResuelta3_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un numero: ");
		int numUser = sc.nextInt();
		
		int resultado=1;
		
		for(int i = numUser;i>0;i--) {
			resultado *=i;
		}
		System.out.println(resultado);
		
	}

}
