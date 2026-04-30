package resuelta12_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class _Principal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Collection<Integer> coleccionNum = new ArrayList<>();
		
		Integer respuesta = 0;
		
		do {
			System.out.print("Introduce un número: ");
			respuesta = sc.nextInt();
			if(respuesta != -1) {
				coleccionNum.add(respuesta);
			}
		}while(respuesta >0);
		
		System.out.println("Elementos en la coleccion "+coleccionNum);
		
		System.out.println("Numeros pares:");
		Iterator<Integer> it = coleccionNum.iterator();
		while(it.hasNext()) {
			Integer p = it.next();
			if(p%2==0) {
				System.out.print(p + ", ");
			}
		}
		it = coleccionNum.iterator();
		
		while(it.hasNext()) {
			Integer p = it.next();
			if(p%3==0) {
				it.remove();
			}
		}
		System.out.println();
		System.out.println("Eliminados multiplos de 3");
		System.out.println("Elementos en la coleccion "+coleccionNum);
		
	}

}
