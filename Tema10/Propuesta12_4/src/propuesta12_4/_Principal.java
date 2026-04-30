package propuesta12_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class _Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Collection<Integer> positivos = new ArrayList<>();
		Collection<Integer> negativos = new ArrayList<>();
		
		Integer respuesta;
		
		do {
			System.out.print("Introduce un número positivo o negativo (0 para terminar): ");
			respuesta = sc.nextInt();
			if(respuesta>0) {
				positivos.add(respuesta);
			}else{
				negativos.add(respuesta);
			}
		}while(respuesta != 0);
		
		System.out.println("Positivos: "+positivos);
		System.out.println("Negativos: "+negativos);
		
		Iterator<Integer> it = positivos.iterator();
		while(it.hasNext()) {
			Integer p = it.next();
			if(p>10) {
				it.remove();
			}
		}
		
		Iterator<Integer> it2 = negativos.iterator();
		while(it.hasNext()) {
			Integer n = it.next();
			if(n<-10) {
				it2.remove();
			}
		}
		
		System.out.println("Sin mayores de 10 " +positivos);
		System.out.println("Sin mayores de -10 " +negativos);

	}

}
