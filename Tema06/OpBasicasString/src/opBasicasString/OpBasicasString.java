package opBasicasString;

public class OpBasicasString {

	public static void main(String[] args) {
		
		System.out.println("=== CLASE STRING - BÁSICO ===\n");
        
        // 1. INICIALIZACIÓN DE CADENAS
        inicializacion();
        
        // 2. CONCATENACIÓN
        concatenacion();
        
        // 3. LONGITUD DE CADENAS
        longitudCadenas();
        
        // 4. OBTENCIÓN DE CARACTERES
        obtencionCaracteres();
        
        // 5. SUBCADENAS
        subcadenas();
        
        // 6. ELIMINACIÓN DE ESPACIOS
        eliminacionEspacios();

	}
	
	
	// ===== INICIALIZACIÓN =====
    public static void inicializacion() {
        System.out.println("--- 1. INICIALIZACIÓN DE CADENAS ---");
        
        // Forma tradicional (menos usada)
        String cad1 = new String("Hola Mundo");
        
        // Forma abreviada (más común)
        String cad2 = "Hola Mundo";
        
        System.out.println("cad1: " + cad1);
        System.out.println("cad2: " + cad2);
        
        // Literal con caracteres especiales
        String cad3 = "Línea 1\nLínea 2\tcon tabulador";
        System.out.println("\nCadena con escape:\n" + cad3);
        
        // Literal con comillas dentro
        String cad4 = "Mi perro \"Tobby\" es blanco";
        System.out.println("\nCon comillas: " + cad4);
        
        // Literal con Unicode
        String cad5 = "Símbolo: \u2661";
        System.out.println("Con Unicode: " + cad5);
        
        // Conversión de otros tipos a String
        String numStr = String.valueOf(123);		// int a String
        String doubleStr = String.valueOf(45.67);	// double a String
        String boolStr = String.valueOf(true);		// boolean a String
        String charStr = String.valueOf('X');		// char a String
        
        System.out.println("\nConversiones con valueOf:");
        System.out.println("int 123: " + numStr);
        System.out.println("double 45.67: " + doubleStr);
        System.out.println("boolean true: " + boolStr);
        System.out.println("char 'X': " + charStr);
        System.out.println();
    }
    
    
    // ===== CONCATENACIÓN =====
    public static void concatenacion() {
        System.out.println("--- 2. CONCATENACIÓN ---");
        
        // Operador +
        String nombre = "Juan";
        String apellido = "García";
        String nombreCompleto = nombre + " " + apellido;
        System.out.println("Nombre completo: " + nombreCompleto);
        
        // Concatenación con números (conversión automática)
        String resultado = "La suma es: " + (5 + 3);
        System.out.println(resultado);
        
        // Cuidado con el orden de operaciones
        System.out.println("5 + 3 = " + 5 + 3);  // "5 + 3 = 53"
        System.out.println("5 + 3 = " + (5 + 3)); // "5 + 3 = 8"
        
        // Operador +=
        String frase = "Hola";
        frase += " mundo";
        frase += "!";
        System.out.println("Con +=: " + frase);
        
        // Método concat() (menos usado)
        String s1 = "Java";
        String s2 = s1.concat(" ").concat("Programming");
        System.out.println("Con concat(): " + s2);
        System.out.println();
    }
    
    
    // ===== LONGITUD DE CADENAS =====
    public static void longitudCadenas() {
        System.out.println("--- 3. LONGITUD DE CADENAS ---");
        
        String texto1 = "Hola";
        String texto2 = "Programación en Java";
        String vacia = "";
        String espacios = "   ";
        
        System.out.println("\"" + texto1 + "\" tiene " + texto1.length() + " caracteres");
        System.out.println("\"" + texto2 + "\" tiene " + texto2.length() + " caracteres");
        System.out.println("Cadena vacía tiene " + vacia.length() + " caracteres");
        System.out.println("\"" + espacios + "\" tiene " + espacios.length() + " caracteres");
        
        // Uso práctico: iterar sobre una cadena
        String palabra = "Java";
        System.out.println("\nCaracteres de \"" + palabra + "\":");
        for (int i = 0; i < palabra.length(); i++) {
            System.out.println("Posición " + i + ": " + palabra.charAt(i));
        }
        System.out.println();
    }
    
    
    // ===== OBTENCIÓN DE CARACTERES =====
    public static void obtencionCaracteres() {
        System.out.println("--- 4. OBTENCIÓN DE CARACTERES ---");
        
        String texto = "Programación";
        
        // charAt(int index) - obtiene el carácter en la posición indicada
        char primero = texto.charAt(0);
        char ultimo = texto.charAt(texto.length() - 1);
        char medio = texto.charAt(5);
        
        System.out.println("Texto: " + texto);
        System.out.println("Primer carácter (índice 0): " + primero);
        System.out.println("Último carácter: " + ultimo);
        System.out.println("Carácter en posición 5: " + medio);
        
        // Ejemplo: mostrar cada carácter en línea separada
        System.out.println("\nCaracteres uno por línea:");
        for (int i = 0; i < texto.length(); i++) {
            System.out.println(i + ": " + texto.charAt(i));
        }
        System.out.println();
    }
    
    
    // ===== SUBCADENAS =====
    public static void subcadenas() {
        System.out.println("--- 5. SUBCADENAS ---");
        
        String texto = "Programación en Java";
        
        // substring(int inicio) - desde inicio hasta el final
        String sub1 = texto.substring(0);  // Toda la cadena
        String sub2 = texto.substring(16); // "Java"
        
        System.out.println("Texto original: \"" + texto + "\"");
        System.out.println("substring(0): \"" + sub1 + "\"");
        System.out.println("substring(16): \"" + sub2 + "\"");
        
        // substring(int inicio, int fin) - desde inicio hasta fin-1
        String sub3 = texto.substring(0, 12);  // "Programación"
        String sub4 = texto.substring(16, 20); // "Java"
        String sub5 = texto.substring(13, 15); // "en"
        
        System.out.println("\nsubstring(0, 12): \"" + sub3 + "\"");
        System.out.println("substring(16, 20): \"" + sub4 + "\"");
        System.out.println("substring(13, 15): \"" + sub5 + "\"");
        
        // Ejemplo práctico: extraer extensión de archivo
        String archivo = "documento.pdf";
        int puntoPos = archivo.lastIndexOf('.');
        String extension = archivo.substring(puntoPos + 1);
        System.out.println("\nExtensión de \"" + archivo + "\": " + extension);
        System.out.println();
    }
    
    
    // ===== ELIMINACIÓN DE ESPACIOS =====
    public static void eliminacionEspacios() {
        System.out.println("--- 6. ELIMINACIÓN DE ESPACIOS ---");
        
        String conEspacios = "   Hola Mundo   ";
        
        // strip() - elimina espacios al inicio y al final
        String limpia = conEspacios.strip();
        System.out.println("Original: \"" + conEspacios + "\" (longitud: " + conEspacios.length() + ")");
        System.out.println("strip(): \"" + limpia + "\" (longitud: " + limpia.length() + ")");
        
        // stripLeading() - solo al inicio
        String sinInicio = conEspacios.stripLeading();
        System.out.println("stripLeading(): \"" + sinInicio + "\"");
        
        // stripTrailing() - solo al final
        String sinFinal = conEspacios.stripTrailing();
        System.out.println("stripTrailing(): \"" + sinFinal + "\"");
        
        // trim() - método tradicional
        String conTrim = conEspacios.trim();
        System.out.println("trim(): \"" + conTrim + "\"");
        
        // Diferencia entre strip() y trim() - strip() esta mas actulizado y elimina mayor cantidad de caracteres blancos
        String especiales = "\t Texto \n";
        System.out.println("\nCon caracteres especiales:");
        System.out.println("Original: \"" + especiales + "\"");
        System.out.println("strip(): \"" + especiales.strip() + "\"");
        System.out.println("trim(): \"" + especiales.trim() + "\"");
    }

}
