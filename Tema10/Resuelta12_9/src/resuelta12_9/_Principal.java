package resuelta12_9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class _Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> listaEnteros = new ArrayList<>();
		
		Integer respuesta=0;
		
		do {
			System.out.print("Introduce un número: ");
			respuesta = sc.nextInt();
			if(respuesta != -1) {
				listaEnteros.add(respuesta);
			}
		}while(respuesta >=0);
		
		System.out.println("Lista enteros" +listaEnteros);
		
		for(int i =0; i<listaEnteros.size();i++) {
			if(listaEnteros.get(i)%2==0) {
				listaEnteros.set(i, listaEnteros.get(i)*100);
			}
		}
		
		System.out.println("Lista enteros, pares x 100" +listaEnteros);
		
		

	}

}
