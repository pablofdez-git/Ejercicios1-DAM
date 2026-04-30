package clinicaVeterinaria;

public class _Principal {

	public static void main(String[] args) {
		
		// Creación de varios animales para pruebas
        Perro perro1 = new Perro("Max", 25.5, 3, TamanioPerro.GRANDE, true, 2);
        Perro perro2 = new Perro("Luna", 8.3, 5, TamanioPerro.PEQUENIO, false, 1);
        Gato gato1 = new Gato("Michi", 4.2, 2, true, "atigrado", 14);
        Gato gato2 = new Gato("Tom", 5.0, 3, false, "negro", 12);

        // Separador para mejor visualización
        System.out.println("=".repeat(50));
        System.out.println("PRUEBAS CON PERROS");
        System.out.println("=".repeat(50));

        // Pruebas con perro guardián grande
        System.out.println("Información del perro guardián grande:");
        perro1.mostrarInfo();
        System.out.println();
        
        System.out.println("*".repeat(50));

        // Pruebas con perro pequeño no guardián
        System.out.println("Información del perro pequeño:");
        perro2.mostrarInfo();

        // Separador para gatos
        System.out.println("\n\n" + "=".repeat(50));
        System.out.println("PRUEBAS CON GATOS");
        System.out.println("=".repeat(50));

        // Pruebas con gato de interior
        System.out.println("Información del gato de interior:");
        gato1.mostrarInfo();
        System.out.println();
        
        System.out.println("*".repeat(50));

        // Pruebas con gato de exterior
        System.out.println("Información del gato de exterior:");
        gato2.mostrarInfo();

        // Comparativa de comida
        System.out.println("\n\n" + "=".repeat(50));
        System.out.println("COMPARATIVA DE COMIDA DIARIA");
        System.out.println("=".repeat(50));
        System.out.print("Perro guardián grande (Max): "+ perro1.calcularComidaDiaria());
        System.out.print("\nPerro pequeño (Luna): "+ perro2.calcularComidaDiaria());
        System.out.print("\nGato interior (Michi): " + gato1.calcularComidaDiaria());
        System.out.print("\nGato exterior (Tom): " + gato2.calcularComidaDiaria());
    }

}
