package actividadResuelta6_10;

import java.util.Scanner;

public class ActividadResuelta6_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce una frase: ");
		String frase = sc.nextLine();
		
		
		frase = frase.replace(" ","");
		
		String copia= "";
		
		for(int i = frase.length()-1 ; i>=0;i--) {
			char letra = frase.charAt(i);
			copia += letra;
		}
		
		boolean iguales = frase.equalsIgnoreCase(copia);
		
		if(iguales) {
			System.out.println("Son palíndromas");
		}else {
			System.out.println("No son palíndromas");
		}
		

	}

}
