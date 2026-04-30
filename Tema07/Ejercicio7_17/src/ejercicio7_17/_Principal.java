package ejercicio7_17;

import java.util.Scanner;

public class _Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce la palabra a cifrar: ");
		String palabra = sc.nextLine();
		System.out.print("Introduce el numero de desplazamiento: ");
		int desplazamiento = sc.nextInt();
		
		String resultado = Cifrador.cifrado(palabra, desplazamiento);
		
		System.out.println("La palabra "+palabra+" cifrada es: "+resultado);

	}

}
