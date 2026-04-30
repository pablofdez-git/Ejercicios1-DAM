package gestionBiblioteca;

public class _Principal {

	public static void main(String[] args) {
		
		// Crear una biblioteca
        Biblioteca biblioteca = new Biblioteca("Biblioteca Municipal", 100);
        
        // Crear algunos libros
        Libro libro1 = new Libro("Don Quijote", "Miguel de Cervantes", 863);
        Libro libro2 = new Libro("El Principito", "Antoine de Saint-Exupéry", 96);
        Libro libro3 = new Libro("Cien años de soledad", "Gabriel García Márquez", 432);
        Libro libro4 = new Libro("El Quijote de la Mancha", "Miguel de Cervantes", 428);
        
        // Agregar libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);
        
        // Mostrar todos los libros inicialmente
        biblioteca.mostrarBiblioteca();
        
        
        // Probar búsqueda de libros
        System.out.println("\n=== Prueba de búsqueda ===");
        biblioteca.buscarLibro("Quijote");  		// Debería encontrar dos libros
        biblioteca.buscarLibro("Principito");		// Debería encontrar un libro
        biblioteca.buscarLibro("Cervantes"); 		// No debería encontrar nada
        biblioteca.buscarLibro("Harry");     		// No debería encontrar nada
        
        
        // Probar préstamos y conteo
        System.out.println("\n=== Prueba de préstamos ===");
        libro1.prestar();
        libro3.prestar();
        System.out.println("Libros prestados actualmente: " + biblioteca.contarLibrosPrestados());  	// Debería mostrar 2
        
        //Probar devolución
        System.out.println("\n=== Prueba de devoluciones ===");
        System.out.println("Se ha podido devolver el libro: ");
        System.out.println(libro1.devolver());		//Todo ok
        System.out.println(libro2.devolver());		//No se puede porque nunca se presto
        
        
        // Probar eliminación
        System.out.println("\n=== Prueba de eliminación ===");
        biblioteca.eliminarLibro("El Principito");
        biblioteca.eliminarLibro("Libro Inexistente");  			// No debería encontrarlo
        
        // Mostrar estado final de la biblioteca
        System.out.println("\n=== Estado final de la biblioteca ===");
        biblioteca.mostrarBiblioteca();
        
        System.out.println("Libros prestados actualmente: " + biblioteca.contarLibrosPrestados());  	// Debería mostrar 1

	}

}
