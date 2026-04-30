package comprobaciones;

public class Comprobaciones {

public static void main(String[] args) {
		
		System.out.println("=== CLASE STRING - COMPARACIÓN ===\n");
        
        // 1. IGUALDAD
        igualdad();
        
        // 2. COMPARACIÓN ALFABÉTICA
        comparacionAlfabetica();
        
        // 3. COMPARACIÓN DE REGIONES
        comparacionRegiones();
        
        // 4. PREFIJOS Y SUFIJOS
        prefijosSufijos();
    }

	
	// ===== IGUALDAD =====
    public static void igualdad() {
        System.out.println("--- 1. IGUALDAD ---");
        
        String s1 = "Hola";
        String s2 = "Hola";
        String s3 = "hola";
        String s4 = "Adiós";
        
        // equals() - distingue mayúsculas y minúsculas
        System.out.println("equals() - Distingue mayúsculas:");
        System.out.println("\"Hola\".equals(\"Hola\"): " + s1.equals(s2));
        System.out.println("\"Hola\".equals(\"hola\"): " + s1.equals(s3));
        System.out.println("\"Hola\".equals(\"Adiós\"): " + s1.equals(s4));
        
        // equalsIgnoreCase() - ignora mayúsculas y minúsculas
        System.out.println("\nequalsIgnoreCase() - Ignora mayúsculas:");
        System.out.println("\"Hola\".equalsIgnoreCase(\"hola\"): " + s1.equalsIgnoreCase(s3));
        System.out.println("\"Hola\".equalsIgnoreCase(\"HOLA\"): " + s1.equalsIgnoreCase("HOLA"));
        System.out.println("\"Hola\".equalsIgnoreCase(\"HoLa\"): " + s1.equalsIgnoreCase("HoLa"));
        
        // IMPORTANTE: Por qué NO usar ==
        String a = new String("Java");
        String b = new String("Java");
        System.out.println("\n¡CUIDADO con ==!");
        System.out.println("a.equals(b): " + a.equals(b));     // true
        System.out.println("a == b: " + (a == b));              // false (compara referencias)
        
        System.out.println();
    }
    
    
    // ===== COMPARACIÓN ALFABÉTICA =====
    public static void comparacionAlfabetica() {
        System.out.println("--- 2. COMPARACIÓN ALFABÉTICA ---");
        
        String cad1 = "Alondra";
        String cad2 = "Nutria";
        String cad3 = "Zorro";
        String cad4 = "Alondra";
        
        // compareTo() - devuelve int (negativo, 0, positivo)
        System.out.println("compareTo():");
        System.out.println("\"Nutria\".compareTo(\"Alondra\"): " + cad2.compareTo(cad1));
        System.out.println("\"Nutria\".compareTo(\"Zorro\"): " + cad2.compareTo(cad3));
        System.out.println("\"Alondra\".compareTo(\"Alondra\"): " + cad1.compareTo(cad4));
        
        // Interpretación de resultados
        System.out.println("\nInterpretación:");
        int resultado = cad2.compareTo(cad1);
        if (resultado < 0) {
            System.out.println("\"" + cad2 + "\" va ANTES que \"" + cad1 + "\"");
        } else if (resultado > 0) {
            System.out.println("\"" + cad2 + "\" va DESPUÉS que \"" + cad1 + "\"");
        } else {
            System.out.println("Son iguales");
        }
        
        // compareToIgnoreCase() - ignora mayúsculas
        String s1 = "Java";
        String s2 = "JAVA";
        String s3 = "javascript";
        
        System.out.println("\ncompareToIgnoreCase():");
        System.out.println("\"Java\".compareTo(\"JAVA\"): " + s1.compareTo(s2));
        System.out.println("\"Java\".compareToIgnoreCase(\"JAVA\"): " + s1.compareToIgnoreCase(s2));
        System.out.println("\"Java\".compareToIgnoreCase(\"javascript\"): " + s1.compareToIgnoreCase(s3));    
    }
    
    
    // ===== COMPARACIÓN DE REGIONES =====
    public static void comparacionRegiones() {
        System.out.println("--- 3. COMPARACIÓN DE REGIONES ---");
        
        String texto1 = "Programación Java";
        String texto2 = "Aprender Java es divertido";
        
        // regionMatches(inicio, otraCad, inicioOtra, longitud)
        boolean coincide1 = texto1.regionMatches(13, texto2, 9, 4);
        System.out.println("Texto 1: \"" + texto1 + "\"");
        System.out.println("Texto 2: \"" + texto2 + "\"");
        System.out.println("\n¿\"Java\" en texto1 (pos 13) == \"Java\" en texto2 (pos 9)?");
        System.out.println("regionMatches(13, texto2, 9, 4): " + coincide1);
        
        // regionMatches con ignoreCase
        String texto3 = "JAVA es genial";
        boolean coincide2 = texto1.regionMatches(true, 13, texto3, 0, 4);
        System.out.println("\n¿\"Java\" (pos 13) == \"JAVA\" (pos 0) ignorando mayúsculas?");
        System.out.println("regionMatches(true, 13, texto3, 0, 4): " + coincide2);
        
        // Ejemplo práctico: comparar subcadenas
        String email1 = "usuario@gmail.com";
        String email2 = "admin@gmail.com";
        
        boolean mismoDominio = email1.regionMatches(email1.indexOf('@'), email2, email2.indexOf('@'), 10);  // 10 es la longitud de "@gmail.com"
        
        System.out.println("\n¿Mismo dominio?");
        System.out.println("Email 1: " + email1);
        System.out.println("Email 2: " + email2);
        System.out.println("Mismo dominio: " + mismoDominio);
        System.out.println();
    }
    
	
    // ===== PREFIJOS Y SUFIJOS =====
    public static void prefijosSufijos() {
        System.out.println("--- 4. PREFIJOS Y SUFIJOS ---");
        
        String archivo1 = "documento.pdf";
        String archivo2 = "foto.jpg";
        String url = "https://www.ejemplo.com";
        
        // startsWith() - verifica si comienza con un prefijo
        System.out.println("startsWith():");
        System.out.println("\"" + url + "\"");
        System.out.println("¿Comienza con \"https\"?: " + url.startsWith("https"));
        System.out.println("¿Comienza con \"http\"?: " + url.startsWith("http"));
        System.out.println("¿Comienza con \"ftp\"?: " + url.startsWith("ftp"));
        
        // startsWith(prefijo, inicio) - verifica desde una posición
        System.out.println("\nstartsWith(prefijo, inicio):");
        System.out.println("¿En posición 8 comienza \"www\"?: " + url.startsWith("www", 8));
        
        // endsWith() - verifica si termina con un sufijo
        System.out.println("\nendsWith():");
        System.out.println("\"" + archivo1 + "\" termina en \".pdf\": " + archivo1.endsWith(".pdf"));
        System.out.println("\"" + archivo2 + "\" termina en \".pdf\": " + archivo2.endsWith(".pdf"));
        System.out.println("\"" + archivo2 + "\" termina en \".jpg\": " + archivo2.endsWith(".jpg"));
        
        // Ejemplo práctico: clasificar archivos
        String[] archivos = {"documento.pdf", "imagen.png", "video.mp4", "texto.txt", "hoja.xlsx"};
        
        System.out.println("\nClasificación de archivos:");
        for (String archivo : archivos) {
            if (archivo.endsWith(".pdf") || archivo.endsWith(".txt")) {
                System.out.println(archivo + " -> Documento");
            } else if (archivo.endsWith(".png") || archivo.endsWith(".jpg")) {
                System.out.println(archivo + " -> Imagen");
            } else if (archivo.endsWith(".mp4")) {
                System.out.println(archivo + " -> Video");
            } else {
                System.out.println(archivo + " -> Otro tipo");
            }
        }
    }

}
