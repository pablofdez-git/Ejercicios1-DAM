package actividadResuelta6_11;

import java.util.Scanner;

public class ActividadResuelta6_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce una palabra: ");
		String palabraUser = sc.nextLine();
		
		char conjunto1[] = {'e','i','k','m','p','q','r','s','t','u','v'};
		char conjunto2[] = {'p','v','i','u','m','t','e','r','k','q','s'};
		String codificada ="";
		
		for(int i = 0;i<palabraUser.length();i++) {
			char letra = palabraUser.charAt(i);
			char caracterCod = codifica(conjunto1, conjunto2, letra);
			codificada += caracterCod;
		}
		System.out.println("La palabra " +palabraUser+" codificada es: " +codificada+".");
		
	}
	
	public static char codifica(char conjunto1[], char conjunto2[], char c) {
		
		
		return c;
	}

}
