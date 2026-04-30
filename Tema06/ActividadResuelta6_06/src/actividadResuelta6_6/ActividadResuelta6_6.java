package actividadResuelta6_6;

import java.util.Scanner;

public class ActividadResuelta6_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el nombre completo: ");
		String nombre = sc.nextLine();
		
		nombre = nombre.toLowerCase();
		
		String sinVocales = "";
		int pos;
		
		for(int i = 0; i<nombre.length();i++) {
			char letra = nombre.charAt(i);
			
			if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'á' ||letra == 'é' ||letra == 'í' ||letra == 'ó' ||letra == 'ú') {
				sinVocales += "";
			}else {
				sinVocales += letra;
			}
			
		}
		System.out.println(sinVocales);

	}

}
