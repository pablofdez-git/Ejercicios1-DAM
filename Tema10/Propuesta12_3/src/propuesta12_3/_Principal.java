package propuesta12_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

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
		
		for(Iterator<Integer> it = coleccionNum.iterator();it.hasNext();) {
			Integer p = it.next();
			if(p == 5) {
				it.remove();;
			}
		}
		System.out.println("Elementos en la coleccion "+coleccionNum);

	}

}
