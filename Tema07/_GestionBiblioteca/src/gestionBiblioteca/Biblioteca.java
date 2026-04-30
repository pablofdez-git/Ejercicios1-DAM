package gestionBiblioteca;

public class Biblioteca {
	
    final String NOMBRE;
    Libro[] libros;
    int numLibrosActuales;
    
    // Constructor
    public Biblioteca(String nombre, int capacidad) {
        this.NOMBRE = nombre;
        this.libros = new Libro[capacidad];
        this.numLibrosActuales = 0;
    }
    
    
    public void agregarLibro(Libro libro) {
        if (numLibrosActuales < libros.length) {
            libros[numLibrosActuales] = libro;
            numLibrosActuales++;
            System.out.println("Libro agregado a la biblioteca");
        } else {
            System.out.println("La biblioteca está llena");
        }
    }
    
    public int contarLibrosPrestados() {
        int contador = 0;
        for (int i = 0; i < numLibrosActuales; i++) {
            if (libros[i].isPrestado()) {
                contador++;
            }
        }
        return contador;
    }
    
    public void buscarLibro(String nombre) {
    	
    	boolean encontrado = false;
    	
    	for(int i = 0; i < numLibrosActuales;i++) {
    		if(libros[i].getTitulo().toLowerCase().contains(nombre.toLowerCase())) {
    			System.out.println("Se ha encontrado en la posicion "+i);
    			libros[i].mostarInforLibro();
    			encontrado = true;
    		}
    	}
    	
    	if(!encontrado) {
    		System.out.println("No se encontraron libros que coincidan con la búsqueda");
    	}
    }
    
    public void eliminarLibro(String titulo) {
    	for(int i = 0; i<numLibrosActuales;i++) {
    		if(libros[i].getTitulo().equalsIgnoreCase(titulo)) {
    			for(int j = i; j<numLibrosActuales -1; j++) {
    				libros[j] = libros[j+1];
    			}
    			libros[numLibrosActuales - 1] = null;
    			numLibrosActuales--;
    			System.out.println("Libro '"+titulo+ "' eliminado con éxito");
    			return;
    		}
    	}
    	System.out.println("No se encontró el libro '"+titulo+"'");
    }
    
    public void mostrarBiblioteca() {
        System.out.println("=== Libros en " + NOMBRE + " ===");
        for (int i = 0; i < numLibrosActuales; i++) {
            System.out.println("\nLibro " + (i + 1) + ":");
            libros[i].mostarInforLibro();
        }
    }


}
