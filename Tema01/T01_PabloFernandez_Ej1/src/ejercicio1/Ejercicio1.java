package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el precio original del producto: ");
		double precioOriginal = sc.nextDouble();
		System.out.println("Introduce el descuento a aplicar: ");
		int descuento = sc.nextInt();
		System.out.println("Introduce 'true' si eres VIP, 'false' si no lo eres: ");
		boolean esVip = sc.nextBoolean();

		double precioFinal=0;
		double calculoDescuento;
		descuento = descuento / 100;
		
		//Valiacion de datos
		if(precioOriginal < 0) {
			System.out.println("Error el precio no puede ser negativo");
			
		}else if (descuento <0 || descuento > 100) {
			System.out.println("El descuento tiene que estar entre 0 y 100");
		
		//Comprobaciones
		}else if(esVip == true && descuento < 20) {
			descuento = 20;
			calculoDescuento = (precioOriginal * descuento) / 100;								//Calculo del descuento a aplicar
			precioFinal = precioOriginal - calculoDescuento;									//Aplicacion del descuento
			System.out.println("El descuento final aprlicado es de "+descuento+ "%");	
			System.out.println("El precioFinal de la compra es: "+precioFinal);
			
		}else if (esVip == true && descuento >= 20) {
			descuento += 5;
			calculoDescuento = (precioOriginal * descuento) / 100;								//Calculo del descuento a aplicar
			precioFinal = precioOriginal - calculoDescuento;									//Aplicacion del descuento
			System.out.println("El descuento final aprlicado es de "+descuento+ "%");
			System.out.println("El precioFinal de la compra es: "+precioFinal);
			
		}else if (esVip == false) {
			calculoDescuento = (precioOriginal * descuento) / 100;								//Calculo del descuento a aplicar
			precioFinal = calculoDescuento;														//Aplicacion del descuento
			System.out.println("El descuento final aprlicado es de "+descuento+ "%");
			System.out.println("El precioFinal de la compra es: "+precioFinal);
		}
		


	}

}
