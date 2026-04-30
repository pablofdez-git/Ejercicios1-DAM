package actividadPropuesta5_3;

import java.util.Scanner;

public class ActividadPropuesta5_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Numero: ");
		int numUser = sc.nextInt();

		int numeros[] = new int[numUser];
		double positivos = 0;
		int contadorPositivos=0;
		double negativos = 0;
		int contadorNegativos = 0;
		int contadorCeros = 0;
		
		
		for(int i = 0; i<numeros.length;i++) {
			System.out.println("Introduce un valor: ");
			numeros[i] = sc.nextInt();
		}
		
		
		for(int numero : numeros) {
			if(numero>0) {
				positivos += numero;
				contadorPositivos++;
			}else {
				negativos += numero;
				contadorNegativos++;
			}
			if(numero == 0) {
				contadorCeros++;
			}
		}
		
		if(contadorPositivos < 0) {
			System.out.println("No hay positivos");
		}else {
			System.out.println("La media de los numeros positivos es: "+(positivos/contadorPositivos));
		}
		
		if(contadorNegativos < 0) {
			System.out.println("No hay negativos");
		}else {
			System.out.println("La media de los numeros negativos es: "+(negativos/contadorNegativos));
		}
		
		if(contadorCeros < 0) {
			System.out.println("No hay ceros");
		}else {
			System.out.println("El numero de ceros es: "+contadorCeros);
		}	
	}
}
