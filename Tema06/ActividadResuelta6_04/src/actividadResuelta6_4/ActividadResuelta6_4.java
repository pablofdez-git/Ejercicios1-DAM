package actividadResuelta6_4;

import java.util.Scanner;

public class ActividadResuelta6_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce una frase: ");
		String fraseUser = sc.nextLine();
		
		int contadorEspacios = 0;
		
		for(int i = 0; i<fraseUser.length();i++) {
			if(Character.isWhitespace(fraseUser.charAt(i))) {
				contadorEspacios++;
			}
			
		}
		
		System.out.println("La frase: " +fraseUser+" tiene "+contadorEspacios+ " espacios");

	}

}
