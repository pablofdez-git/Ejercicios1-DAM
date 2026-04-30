package opConversion;

public class OpConversion {

public static void main(String[] args) {
		
		System.out.println("=== CLASE STRING - CONVERSIÓN Y TRANSFORMACIÓN ===\n");
        
        // 1. CONVERSIÓN MAYÚSCULAS/MINÚSCULAS
        conversionMayusculasMinusculas();
        
        // 2. REEMPLAZO DE CARACTERES Y SUBCADENAS
        reemplazo();
        
        // 3. VERIFICACIÓN DE CADENA VACÍA
        cadenaVacia();
        
        // 4. SEPARACIÓN EN PARTES (SPLIT)
        separacionPartes();
        
        // 5. CONVERSIÓN CON ARRAYS DE CARACTERES
        conversionArrays();

	}
	
	
	// ===== CONVERSIÓN MAYÚSCULAS/MINÚSCULAS =====
    public static void conversionMayusculasMinusculas() {
        System.out.println("--- 1. CONVERSIÓN MAYÚSCULAS/MINÚSCULAS ---");
        
        String texto = "Programación en Java";
        
        // toLowerCase() - convierte a minúsculas
        String minusculas = texto.toLowerCase();
        System.out.println("Original: \"" + texto + "\"");
        System.out.println("toLowerCase(): \"" + minusculas + "\"");
        
        // toUpperCase() - convierte a mayúsculas
        String mayusculas = texto.toUpperCase();
        System.out.println("toUpperCase(): \"" + mayusculas + "\"");
        
        // Solo afecta a letras
        String mixto = "Código123!@#";
        System.out.println("\nCon números y símbolos:");
        System.out.println("Original: \"" + mixto + "\"");
        System.out.println("toLowerCase(): \"" + mixto.toLowerCase() + "\"");
        System.out.println("toUpperCase(): \"" + mixto.toUpperCase() + "\"");
        
        // Ejemplo práctico: comparación sin distinguir mayúsculas
        String user1 = "ADMIN";
        String user2 = "admin";
        
        System.out.println("\nComparación sin distinguir mayúsculas:");
        System.out.println("Usuario 1: " + user1);
        System.out.println("Usuario 2: " + user2);
        System.out.println("¿Iguales?: " + user1.toLowerCase().equals(user2.toLowerCase()));
        System.out.println();
    }
    
    
    // ===== REEMPLAZO =====
    public static void reemplazo() {
        System.out.println("--- 2. REEMPLAZO DE CARACTERES Y SUBCADENAS ---");
        
        String texto = "Hola mundo, mundo hermoso";
        
        // replace(char original, char nuevo) - reemplaza caracteres
        String sinO = texto.replace('o', '0');
        System.out.println("Original: \"" + texto + "\"");
        System.out.println("replace('o', '0'): \"" + sinO + "\"");
        
        String conGuiones = texto.replace(' ', '-');
        System.out.println("replace(' ', '-'): \"" + conGuiones + "\"");
        
        // replace(String original, String nueva) - reemplaza subcadenas
        String reemplazado = texto.replace("mundo", "Java");
        System.out.println("\nreplace(\"mundo\", \"Java\"): \"" + reemplazado + "\"");
        
        // Reemplazar múltiples veces
        String numeros = "uno dos tres uno dos uno";
        String sinUnos = numeros.replace("uno", "1");
        System.out.println("\nOriginal: \"" + numeros + "\"");
        System.out.println("replace(\"uno\", \"1\"): \"" + sinUnos + "\"");
       
        System.out.println();
    }
    
    
    // ===== CADENA VACÍA =====
    public static void cadenaVacia() {
        System.out.println("--- 3. VERIFICACIÓN DE CADENA VACÍA ---");
        
        String vacia = "";
        String conEspacios = "   ";
        String normal = "Hola";
        String nula = null;
        
        // isEmpty() - verifica si la cadena está vacía
        System.out.println("isEmpty():");
        System.out.println("\"\" -> " + vacia.isEmpty());
        System.out.println("\"   \" -> " + conEspacios.isEmpty());
        System.out.println("\"Hola\" -> " + normal.isEmpty());
        
        // isBlank() - verifica si está vacía o solo tiene espacios (Java 11+)
        System.out.println("\nisBlank():");
        System.out.println("\"\" -> " + vacia.isBlank());
        System.out.println("\"   \" -> " + conEspacios.isBlank());
        System.out.println("\"Hola\" -> " + normal.isBlank());
       
        // Verificación segura con null
        System.out.println("\nVerificación segura:");
        System.out.println("Cadena null:");
        if (nula == null || nula.isEmpty()) {
            System.out.println("✓ Cadena nula o vacía");
        }
        
        // Ejemplo práctico: validar entrada
        String[] entradas = {"", "   ", "Juan", null};
        System.out.println("\nValidación de entradas:");
        for (int i = 0; i < entradas.length; i++) {
            String entrada = entradas[i];
            System.out.print("Entrada " + i + ": ");
            if (entrada == null || entrada.trim().isEmpty()) {
                System.out.println("✗ Inválida");
            } else {
                System.out.println("✓ Válida: \"" + entrada + "\"");
            }
        }
        System.out.println();
    }
    
    
    // ===== SEPARACIÓN EN PARTES =====
    public static void separacionPartes() {
        System.out.println("--- 4. SEPARACIÓN EN PARTES (SPLIT) ---");
        
        // split(String separador) - divide la cadena
        String frase = "En un lugar de la Mancha";
        String[] palabras = frase.split(" ");
        
        System.out.println("Frase: \"" + frase + "\"");
        System.out.println("split(\" \"):");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println("  [" + i + "]: \"" + palabras[i] + "\"");
        }
        
        // Split con diferentes separadores
        String csv = "Juan,García,25,Ingeniero";
        String[] datos = csv.split(",");
        
        System.out.println("\nCSV: \"" + csv + "\"");
        System.out.println("split(\",\"):");
        System.out.println("  Nombre: " + datos[0]);
        System.out.println("  Apellido: " + datos[1]);
        System.out.println("  Edad: " + datos[2]);
        System.out.println("  Profesión: " + datos[3]);
        
        // Split con múltiples caracteres
        String fecha = "2024-11-30";
        String[] partesFecha = fecha.split("-");
        
        System.out.println("\nFecha: \"" + fecha + "\"");
        System.out.println("split(\"-\"):");
        System.out.println("  Año: " + partesFecha[0]);
        System.out.println("  Mes: " + partesFecha[1]);
        System.out.println("  Día: " + partesFecha[2]);

        System.out.println();
    }
    
    
    // ===== CONVERSIÓN CON ARRAYS =====
    public static void conversionArrays() {
        System.out.println("--- 5. CONVERSIÓN CON ARRAYS DE CARACTERES ---");
        
        // toCharArray() - convierte String a char[]
        String palabra = "Java";
        char[] caracteres = palabra.toCharArray();
        
        System.out.println("String a char[]:");
        System.out.println("Original: \"" + palabra + "\"");
        System.out.print("Array: [");
        for (int i = 0; i < caracteres.length; i++) {
            System.out.print("'" + caracteres[i] + "'");
            if (i < caracteres.length - 1) {
            	System.out.print(", ");
            }
        }
        System.out.println("]");
        
        // Modificar el array no afecta al String original
        caracteres[0] = 'M';
        System.out.println("\nDespués de modificar array[0] = 'M':");
        System.out.println("String original: \"" + palabra + "\"");
        System.out.println("Array modificado: [" + String.valueOf(caracteres) + "]");
        
        // valueOf(char[]) - convierte char[] a String
        char[] letras = {'H', 'o', 'l', 'a'};
        String cadena = String.valueOf(letras);
        
        System.out.println("\nchar[] a String:");
        System.out.println("Array: [H, o, l, a]");
        System.out.println("String: \"" + cadena + "\"");
        
        // valueOf(char[], inicio, cantidad)
        char[] abecedario = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        String subcadena = String.valueOf(abecedario, 2, 3);
        
        System.out.println("\nSubconjunto del array:");
        System.out.println("Array completo: [a, b, c, d, e, f, g]");
        System.out.println("valueOf(array, 2, 3): \"" + subcadena + "\"");
    }

}
