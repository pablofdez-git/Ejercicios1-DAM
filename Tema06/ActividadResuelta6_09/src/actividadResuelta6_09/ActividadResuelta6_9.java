package actividadResuelta6_09;

import java.util.Scanner;

public class ActividadResuelta6_9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String fraseFinal = "";
		String fin = "fin";
		boolean continuar = true;
		
		do {
			System.out.print("Introduce una palabra: ");
			String palabra = sc.nextLine();
			
			
			if(palabra.equalsIgnoreCase(fin)) {
				continuar = false;
			}else {
				fraseFinal += palabra + " ";
			}
		}while(continuar);
		
		System.out.println(fraseFinal);

	}

}
