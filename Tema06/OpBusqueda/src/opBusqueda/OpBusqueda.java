package opBusqueda;

public class OpBusqueda {

public static void main(String[] args) {
		
		System.out.println("=== CLASE STRING - BÚSQUEDA ===\n");
        
        // 1. BÚSQUEDA BÁSICA CON INDEXOF
        busquedaBasica();
        
        // 2. BÚSQUEDA DESDE UNA POSICIÓN
        busquedaDesdePosicion();
        
        // 3. BÚSQUEDA INVERSA CON LASTINDEXOF
        busquedaInversa();
        
        // 4. COMPROBACIONES CON CONTAINS
        comprobacionContains();

	}
	
	
	// ===== BÚSQUEDA BÁSICA =====
    public static void busquedaBasica() {
        System.out.println("--- 1. BÚSQUEDA BÁSICA CON indexOf() ---");
        
        String texto = "Programación en Java con Java";
        
        // indexOf(char c) - busca un carácter
        int posA = texto.indexOf('a');
        int posJ = texto.indexOf('J');
        int posZ = texto.indexOf('z');
        
        System.out.println("Texto: \"" + texto + "\"");
        System.out.println("\nBúsqueda de caracteres:");
        System.out.println("indexOf('a'): " + posA);
        System.out.println("indexOf('J'): " + posJ);
        System.out.println("indexOf('z'): " + posZ + " (no encontrado)");
        
        // indexOf(String cadena) - busca una subcadena
        int posJava = texto.indexOf("Java");
        int posPython = texto.indexOf("Python");
        int posen = texto.indexOf("en");
        
        System.out.println("\nBúsqueda de subcadenas:");
        System.out.println("indexOf(\"Java\"): " + posJava);
        System.out.println("indexOf(\"Python\"): " + posPython + " (no encontrado)");
        System.out.println("indexOf(\"en\"): " + posen);
        
        // Verificar si se encontró (si no se encuentra devuelve -1)
        System.out.println("\nVerificación:");
        if (posJava != -1) {
            System.out.println("✓ \"Java\" encontrado en posición " + posJava);
        } else {
            System.out.println("✗ \"Java\" no encontrado");
        }
        System.out.println();
    }
    
    
    // ===== BÚSQUEDA DESDE UNA POSICIÓN =====
    public static void busquedaDesdePosicion() {
        System.out.println("--- 2. BÚSQUEDA DESDE UNA POSICIÓN ---");
        
        String texto = "Java es Java y Java es genial";
        
        // indexOf(char c, int inicio) - busca carácter desde inicio
        int pos1 = texto.indexOf('J', 0);
        int pos2 = texto.indexOf('J', pos1 + 1);
        int pos3 = texto.indexOf('J', pos2 + 1);
        
        System.out.println("Texto: \"" + texto + "\"");
        System.out.println("\nBúsqueda de 'J' múltiple:");
        System.out.println("1ª ocurrencia (desde 0): " + pos1);
        System.out.println("2ª ocurrencia (desde " + (pos1 + 1) + "): " + pos2);
        System.out.println("3ª ocurrencia (desde " + (pos2 + 1) + "): " + pos3);
        
        // indexOf(String cadena, int inicio) - busca subcadena desde inicio
        int primera = texto.indexOf("Java", 0);
        int segunda = texto.indexOf("Java", primera + 1);
        int tercera = texto.indexOf("Java", segunda + 1);
        
        System.out.println("\nBúsqueda de \"Java\" múltiple:");
        System.out.println("1ª ocurrencia: " + primera);
        System.out.println("2ª ocurrencia: " + segunda);
        System.out.println("3ª ocurrencia: " + tercera);
        
        System.out.println();
    }
    
    
    // ===== BÚSQUEDA INVERSA =====
    public static void busquedaInversa() {
        System.out.println("--- 3. BÚSQUEDA INVERSA CON lastIndexOf() ---");
        
        String ruta = "C:\\Users\\Usuario\\Documentos\\archivo.txt";
        
        // lastIndexOf(char c) - última ocurrencia de un carácter
        int ultimaBarra = ruta.lastIndexOf('\\');
        int ultimoPunto = ruta.lastIndexOf('.');
        
        System.out.println("Ruta: \"" + ruta + "\"");
        System.out.println("\nlastIndexOf('\\\\'):" + ultimaBarra);
        System.out.println("lastIndexOf('.'): " + ultimoPunto);
        
        // Extraer nombre de archivo y extensión
        String nombreArchivo = ruta.substring(ultimaBarra + 1, ultimoPunto);
        String extension = ruta.substring(ultimoPunto + 1);
        
        System.out.println("\nExtraído:");
        System.out.println("Nombre: " + nombreArchivo);
        System.out.println("Extensión: " + extension);
        
        // lastIndexOf(String cadena) - última ocurrencia de subcadena
        String frase = "Java Java Java";
        int primeraJava = frase.indexOf("Java");
        int ultimaJava = frase.lastIndexOf("Java");
        
        System.out.println("\nFrase: \"" + frase + "\"");
        System.out.println("Primera \"Java\": " + primeraJava);
        System.out.println("Última \"Java\": " + ultimaJava);
        
        // lastIndexOf(char c, int inicio) - búsqueda inversa desde posición
        String texto = "abcdefghijklmn";
        int desde10 = texto.lastIndexOf('e', 10);
        int desde3 = texto.lastIndexOf('e', 3);
        
        System.out.println("\nTexto: \"" + texto + "\"");
        System.out.println("lastIndexOf('e', 10): " + desde10);
        System.out.println("lastIndexOf('e', 3): " + desde3 + " (no encontrado hacia atrás)");
        System.out.println();
    }
    
    
    // ===== COMPROBACIÓN CON CONTAINS =====
    public static void comprobacionContains() {
        System.out.println("--- 4. COMPROBACIÓN CON contains() ---");
        
        String email = "usuario@gmail.com";
        
        // contains(CharSequence s) - verifica si contiene una subcadena
        boolean tieneArroba = email.contains("@");
        boolean esGmail = email.contains("gmail");
        boolean esYahoo = email.contains("yahoo");
        
        System.out.println("Email: \"" + email + "\"");
        System.out.println("\nContiene \"@\": " + tieneArroba);
        System.out.println("Contiene \"gmail\": " + esGmail);
        System.out.println("Contiene \"yahoo\": " + esYahoo);
        
        // Ejemplo práctico: validación simple
        System.out.println("\nValidación de email:");
        if (email.contains("@") && email.contains(".")) {
            System.out.println("✓ Email parece válido");
        } else {
            System.out.println("✗ Email inválido");
        }
        
        // Diferencia entre contains() e indexOf()
        String texto = "Programación";
        boolean contieneGra = texto.contains("gra");
        int posGra = texto.indexOf("gra");
        
        System.out.println("\nDiferencia contains vs indexOf:");
        System.out.println("Texto: \"" + texto + "\"");
        System.out.println("contains(\"gra\"): " + contieneGra + " (solo booleano)");
        System.out.println("indexOf(\"gra\"): " + posGra + " (posición exacta)");
        System.out.println();
    }

}
