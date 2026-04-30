package validadorContraseña;

import java.util.Scanner;

public class _Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el tamaño para el array: ");
		int tamanioArray = sc.nextInt();
		
		System.out.print("Introduce la longitud deseada para las constraseñas: ");
		int longitud = sc.nextInt();
		
		Password arrayConstrasenia[] = new Password[tamanioArray];
		boolean esFuerte[] = new boolean[tamanioArray]; 
		
		for(int i = 0; i<tamanioArray;i++) {
			arrayConstrasenia[i] = new Password(longitud);
			esFuerte[i] = arrayConstrasenia[i].esFuerte();
			System.out.println("Contraseña " + (i + 1) + ": " + arrayConstrasenia[i].getContrasenia() + " ¿Es fuerte? " + esFuerte[i]);
		}

	}

}
