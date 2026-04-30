package ejercicio_19;

import java.util.Scanner;

public class Ejercicio_19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un texto: ");
		String texto = sc.nextLine();
		System.out.print("Introduce la palabra a sustituir: ");
		String palabraASustituir = sc.nextLine();
		System.out.print("Introduce la palabra sustituta: ");
		String sustituta  =sc.nextLine();
		
		//Transformamos el texto en un array de String
		String[] textoSplit = texto.split(" ");
		
		//Recorrer el array de Strings
		for(int i = 0; i<textoSplit.length;i++) {
			
			//Sacar cada vez una palabra
			String palabra = textoSplit[i];				
			
			//Si la palabra es igual a la que buscamos
			if(palabra.equals(palabraASustituir)) {
				
				//Sustituir es palabra por la sustituta
				texto = texto.replace(palabraASustituir, sustituta);	
			}
			
		}
		System.out.println(texto);

	}

}
