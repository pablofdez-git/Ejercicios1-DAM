package ejercicio_18;


import java.util.Scanner;

public class Ejercicio_18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce una frase: ");
		String frase = sc.nextLine().toLowerCase();
		
		//Separar la frase por espacios
		String palabras [] = frase.split(" ");
		String camelCase = "";
		
		//Bucle for para recorrer el array de Strings
		for(int i = 0; i<palabras.length;i++) {
			
			//Obtenemos cada palabra
			String palabra = palabras[i];		
			
			//Recorrer los caracteres de la palabra
			for(int j = 0; j<palabra.length();j++) {
				
				char letra = palabra.charAt(j);
				
				//Si es la primera letra la pasamos a mayuscula
				if(j == 0) {								
					letra = Character.toUpperCase(letra);
				}
				
				//Almacenamos las letras en el String
				camelCase += letra;							
			}
		}
		
		System.out.println(camelCase);
		
	}

}
