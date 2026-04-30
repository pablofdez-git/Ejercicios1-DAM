package gestionBiblioteca;

public class Libro {
	
	// Atributos privados
    private String titulo;
    private String autor;
    private int numPaginas;
    private boolean prestado;
    
    // Constructor
    public Libro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.prestado = false;
    }
    
    // Getters y setters
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public int getNumPaginas() {
        return numPaginas;
    }
    
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    public boolean isPrestado() {
        return prestado;
    }
    
    public void setPrestado(boolean prestado) {
    	this.prestado = prestado;
    }
    
    public boolean prestar() {
    	boolean seHaPrestado = false;
        if (!prestado) {
            this.prestado = true;
            seHaPrestado = true;
        }
        return seHaPrestado;
    }
    
    public boolean devolver() {
    	boolean seHaDevuelto = false;
        if (prestado) {
            prestado = false;
            seHaDevuelto = true;
        } 
        return seHaDevuelto;
    }
    
    public void mostarInforLibro() {
    	System.out.println("Título: " + titulo + 
    		   				"\nAutor: " + autor + 
    		   				"\nNúmero de páginas: " + numPaginas + 
    		   				"\nEstado: " + (prestado ? "Prestado" : "Disponible"));
    }

	

}