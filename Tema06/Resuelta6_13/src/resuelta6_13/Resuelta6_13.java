package resuelta6_13;

import java.util.Scanner;

public class Resuelta6_13 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String frase;
        
        System.out.println("Introduce una frase:");
        frase = sc.nextLine();

        String fraseMinus = frase.toLowerCase();

        int[] contadores = new int[26]; 


        for (int i = 0; i < fraseMinus.length(); i++) {
        	char caracter = fraseMinus.charAt(i);
    
        	if (caracter >= 'a' && caracter <= 'z') {						// Si el carácter es 'a', (int)'a' - (int)'a' = 0 (índice 0)
        		int indice = caracter - 'a';								//Si el carácter es 'b', (int)'b' - (int)'a' = 1 (índice 1)
        		contadores[indice]++;
																			// Esto coloca la letra a su posición en el array (0 a 25).
        	}
        }


        System.out.println("--- Frecuencia de letras ---");
        for (int i = 0; i < contadores.length; i++) {
        	if (contadores[i] > 0) {
        		char letra = (char) ('a' + i);

        		System.out.println("La letra '" + letra + "' aparece " + contadores[i] + " veces.");
        		
        	}
        }
        

    }
}