package claseCharacter;

public class ClaseCharacter {

	public static void main(String[] args) {
		
		System.out.println("=== CLASE CHARACTER ===\n");
	    
	    // 1. CLASIFICACIÓN DE CARACTERES
	    clasificacionCaracteres();
	    
	    // 2. CONVERSIÓN DE CARACTERES
	    conversionCaracteres();
	
	}
	
	
	// ===== CLASIFICACIÓN DE CARACTERES =====
    public static void clasificacionCaracteres() {
        System.out.println("--- 1. CLASIFICACIÓN DE CARACTERES ---");
        
        // isDigit() - Verifica si es un dígito
        char c1 = '7';
        char c2 = 'a';
        System.out.println("isDigit('7'): " + Character.isDigit(c1));
        System.out.println("isDigit('a'): " + Character.isDigit(c2));
        
        // isLetter() - Verifica si es una letra
        char c3 = 'Z';
        char c4 = '5';
        System.out.println("\nisLetter('Z'): " + Character.isLetter(c3));
        System.out.println("isLetter('5'): " + Character.isLetter(c4));
        
        // isLetterOrDigit() - Verifica si es letra o dígito
        char c5 = 'B';
        char c6 = '9';
        char c7 = '#';
        System.out.println("\nisLetterOrDigit('B'): " + Character.isLetterOrDigit(c5));
        System.out.println("isLetterOrDigit('9'): " + Character.isLetterOrDigit(c6));
        System.out.println("isLetterOrDigit('#'): " + Character.isLetterOrDigit(c7));
        
        // isLowerCase() - Verifica si es minúscula
        char c8 = 'm';
        char c9 = 'M';
        System.out.println("\nisLowerCase('m'): " + Character.isLowerCase(c8));
        System.out.println("isLowerCase('M'): " + Character.isLowerCase(c9));
        
        // isUpperCase() - Verifica si es mayúscula
        System.out.println("\nisUpperCase('M'): " + Character.isUpperCase(c9));
        System.out.println("isUpperCase('m'): " + Character.isUpperCase(c8));
        
        // isSpaceChar() - Verifica si es espacio
        char espacio = ' ';
        char tab = '\t';
        System.out.println("\nisSpaceChar(' '): " + Character.isSpaceChar(espacio));
        System.out.println("isSpaceChar('\\t'): " + Character.isSpaceChar(tab));
        
        // isWhitespace() - Verifica si es carácter blanco
        char nuevaLinea = '\n';
        char retornoCarro = '\r';
        System.out.println("\nisWhitespace(' '): " + Character.isWhitespace(espacio));
        System.out.println("isWhitespace('\\t'): " + Character.isWhitespace(tab));
        System.out.println("isWhitespace('\\n'): " + Character.isWhitespace(nuevaLinea));
        System.out.println("isWhitespace('\\r'): " + Character.isWhitespace(retornoCarro));
        System.out.println();
    }
    
    
    // ===== CONVERSIÓN DE CARACTERES =====
    public static void conversionCaracteres() {
        System.out.println("--- 2. CONVERSIÓN DE CARACTERES ---");
        
        // toLowerCase() - Convierte a minúscula
        char mayuscula1 = 'A';
        char mayuscula2 = 'Z';
        char numero = '5';
        
        System.out.println("toLowerCase('A'): " + Character.toLowerCase(mayuscula1));
        System.out.println("toLowerCase('Z'): " + Character.toLowerCase(mayuscula2));
        System.out.println("toLowerCase('5'): " + Character.toLowerCase(numero));
        
        // toUpperCase() - Convierte a mayúscula
        char minuscula1 = 'a';
        char minuscula2 = 'z';
        
        System.out.println("\ntoUpperCase('a'): " + Character.toUpperCase(minuscula1));
        System.out.println("toUpperCase('z'): " + Character.toUpperCase(minuscula2));
        System.out.println("toUpperCase('5'): " + Character.toUpperCase(numero));
        System.out.println();
    }

}
