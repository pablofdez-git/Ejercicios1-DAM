package actividadResuelta6_7;

import java.util.Scanner;

public class ActividadResuelta6_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce una frase: ");
		String frase = sc.nextLine();
		
		System.out.print("Introduce una palabra: ");
		String palabra = sc.next();
		
		int contador = 0;
		int pos = 0;
		
		while((pos = frase.indexOf(palabra, pos)) != -1) {
			contador++;
			pos =  pos + palabra.length();
		}
		System.out.println(contador);
		
	}

}
