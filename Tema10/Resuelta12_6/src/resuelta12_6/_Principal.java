package resuelta12_6;

import java.util.ArrayList;
import java.util.Collection;

public class _Principal {

	public static void main(String[] args) {
		
		Collection<Integer> coleccionNum = new ArrayList<>();
		
		int aleatorio;
		int max = 10;
		int min = 1;
		
		for (int i = 0; i < 100; i++) {
			aleatorio = (int)(Math.random() * (max - min + 1)) + min;
			coleccionNum.add(aleatorio);
		}
		System.out.println("Elementos en la coleccion "+coleccionNum);
		
		while(coleccionNum.remove(5));
		
		//Collection<Integer> c = new ArrayList<>();
		//c.add(5);
		//coleccionNum.removeAll(c);
		
		System.out.println("Elementos en la coleccion "+coleccionNum);
		
	}

}
