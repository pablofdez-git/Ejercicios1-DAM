package complementario_1;

import java.util.*;

public class Complementario_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		final int IVA = 16;
		double precio = 0;
		double total=0;
		int contador=0;
		
		do {
			System.out.print("Introduce el precio de un articulo: ");
			precio = sc.nextDouble();
			
			if(precio < 0) {
				System.out.print("El precio no puede ser negativo");
				precio = sc.nextDouble();
			}else {
				contador++;
				total += precio;
				System.out.println("Total: "+total);
			}
		}while(precio != 0);
		
		System.out.println("El numero total de articulos es: "+contador);
		double importeIva = (total * IVA) / 100;
		double importeTotal = total + importeIva;
		System.out.println("El importe del IVA es: "+importeIva);
		System.out.println("El importe total es: "+importeTotal);
		

	}

}
