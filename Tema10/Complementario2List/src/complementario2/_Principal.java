package complementario2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<String> colaClientes = new ArrayList<>();
		
		String nombre = "";
		
		do {
			System.out.print("Introduce un nombre: ");
			nombre = sc.next();
			if(!nombre.equalsIgnoreCase("fin")) {
				colaClientes.add(nombre);
			}
		}while(colaClientes.size() < 5 || !nombre.equalsIgnoreCase("fin"));
		
		int contador = 1;
		for(String nom : colaClientes) {
			System.out.println("Cliente "+contador+": "+nom);
			contador++;
		}
		
		String nombre1 = colaClientes.get(0);
		System.out.println("Cliente atendido: "+nombre1);
		colaClientes.remove(nombre1);
		
		System.out.println("Siguiente cliente atendido: "+nombre1);
		
		int cont = 0;
		do {
			System.out.print("Introduce el nombre del nuevo cliente: ");
			String nuevo = sc.next();
			colaClientes.add(nuevo);
			cont++;
		}while(cont < 2);
		
		System.out.println(colaClientes);
		

	}

}
