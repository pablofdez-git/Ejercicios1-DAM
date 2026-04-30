package actividadResuelta5_3;

import java.util.*;

public class ActividadResuelta5_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Cuantos numeros quieres introducir: ");
		int cantidadNumeros = sc.nextInt();
		
		int numeros[] = new int[cantidadNumeros];
		
		for(int i = 0; i<numeros.length;i++) {
			System.out.print("Introduce un número: ");
			numeros[i] = sc.nextInt();
		}
		
		for(int i=numeros.length-1;i>=0;i--) {
			System.out.println(numeros[i]);
		}

	}

}
