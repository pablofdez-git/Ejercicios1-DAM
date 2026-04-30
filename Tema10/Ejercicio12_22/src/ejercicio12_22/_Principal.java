package ejercicio12_22;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class _Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		LinkedHashSet<String> nombres = new LinkedHashSet<>();
		
		String respuesta = "";
		
		do {
			System.out.print("Introduce un palabra (fin para terminar): ");
			respuesta = sc.next();
			if(!respuesta.equalsIgnoreCase("fin")) {
				nombres.add(respuesta);
			}
			
			
		}while(!respuesta.equalsIgnoreCase("fin"));
		
		for (String nombre : nombres) {
			System.out.println(nombre);
		}
		

	}

}
