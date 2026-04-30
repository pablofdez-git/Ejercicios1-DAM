package ejercicio12_23;

import java.util.Scanner;
import java.util.TreeSet;

public class _Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		TreeSet<String> nombres = new TreeSet<>();
		
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
