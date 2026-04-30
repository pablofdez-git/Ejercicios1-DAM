package tipoChar;

public class TipoChar {

	public static void main(String[] args) {
		
		System.out.println("=== TIPO PRIMITIVO CHAR ===\n");
		        
        // 1. DECLARACIÓN Y ASIGNACIÓN BÁSICA
        ejemplosBasicos();
        
        // 2. UNICODE
        ejemplosUnicode();
        
        // 3. SECUENCIAS DE ESCAPE
        secuenciasEscape();
        
        // 4. CONVERSIÓN CHAR <-> INT
        conversionCharInt();
        
        // 5. ARITMÉTICA DE CARACTERES
        aritmeticaCaracteres();

	}
	
	// ===== EJEMPLOS BÁSICOS =====
	public static void ejemplosBasicos() {
        System.out.println("--- 1. DECLARACIÓN Y ASIGNACIÓN BÁSICA ---");
        
        char letra = 'a';
        char numero = '7';
        char simbolo = '#';
        char enie = 'ñ';
        
        System.out.println("Letra: " + letra);
        System.out.println("Número: " + numero);
        System.out.println("Símbolo: " + simbolo);
        System.out.println("Eñe: " + enie);
        System.out.println();
    }
	
	
	// ===== EJEMPLOS UNICODE =====
    public static void ejemplosUnicode() {
        System.out.println("--- 2. UNICODE ---");
        
        // Tres formas de asignar el mismo carácter 'a'
        char c1 = 'a';              // Mediante teclado
        char c2 = 97;               // Code point decimal
        char c3 = '\u0061';         // Code point hexadecimal
        
        System.out.println("Mediante teclado: " + c1);
        System.out.println("Code point decimal (97): " + c2);
        System.out.println("Code point hexadecimal (\\u0061): " + c3);
        System.out.println("¿Son iguales?: " + (c1 == c2 && c2 == c3 && c1 == c3));
        
        // Caracteres especiales con Unicode
        char corazon = '\u2661';
        char omega = '\u03A9';
        char euro = '\u20AC';
        
        System.out.println("Corazón: " + corazon);
        System.out.println("Omega: " + omega);
        System.out.println("Euro: " + euro);
        
        // Para code points superiores a \uFFFF se usa int
        int emoji = 0x1F600; // Emoji de cara sonriente
        System.out.println("Code point grande (int): " + Character.toString(emoji));
        System.out.println();
    }
	
    
    // ===== SECUENCIAS DE ESCAPE =====
    public static void secuenciasEscape() {
        System.out.println("--- 3. SECUENCIAS DE ESCAPE ---");
        
        char nuevaLinea = '\n';
        char tabulador = '\t';
        char comillaSimple = '\'';
        char comillaDoble = '\"';
        char barrInvertida = '\\';
        
        System.out.println("Nueva línea:");
        System.out.print("Línea 1" + nuevaLinea + "Línea 2");
        System.out.println("\n");
        
        System.out.println("Tabulador:");
        System.out.println("Columna1" + tabulador + "Columna2");
        
        System.out.println("\nComillas y barras:");
        System.out.println("Comilla simple: " + comillaSimple);
        System.out.println("Comilla doble: " + comillaDoble);
        System.out.println("Barra invertida: " + barrInvertida);
        System.out.println();
    }
    
    
    // ===== CONVERSIÓN CHAR <-> INT =====
    public static void conversionCharInt() {
        System.out.println("--- 4. CONVERSIÓN CHAR <-> INT ---");
        
        // char a int (automático) => Conversión de ensanchamiento
        char letra = 'a';
        int codigo = letra;
        System.out.println("Carácter 'a' como int: " + codigo);
        
        // int a char (necesita cast) => Conversión de estrechamiento
        int numero = 98;
        char caracter = (char) numero;
        System.out.println("Número 98 como char: " + caracter);
        System.out.println();
    }
    
    
    // ===== ARITMÉTICA DE CARACTERES =====
    public static void aritmeticaCaracteres() {
        System.out.println("--- 5. ARITMÉTICA DE CARACTERES ---");
        
        // Sumar y restar valores a caracteres
        char letra = 'e';
        char siguiente = (char) (letra + 1); // 'f'
        char anterior = (char) (letra - 1);  // 'd'
        
        System.out.println("Letra actual: " + letra);
        System.out.println("Siguiente: " + siguiente);
        System.out.println("Anterior: " + anterior);
        
        // Avanzar varias posiciones
        char base = 'a';
        char avanzada = (char) (base + 5); // 'f'
        System.out.println("'a' + 5 = " + avanzada);
        System.out.println();
        
        // Diferencia entre mayúsculas y minúsculas
        int diferencia = 'a' - 'A';
        System.out.println("Diferencia entre 'a' y 'A': " + diferencia);
        
        // Convertir minúscula a mayúscula y viceversa
        char minuscula = 'h';
        char mayuscula = (char) (minuscula - ('a' - 'A'));
        System.out.println("Minúscula 'h' a mayúscula: " + mayuscula);
        
        char mayuscula2 = 'H';
        char minuscula2 = (char) (mayuscula2 + ('a' - 'A'));
        System.out.println("Mayúscula 'H' a minúscula: " + minuscula2);
    }

}
