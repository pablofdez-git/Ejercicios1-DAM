package clinicaVeterinaria;

public class Perro extends Animal {
	
	    private TamanioPerro tamanio;
	    private boolean esGuardian;
	    private int horasEjercicioDiario;
	    
	    public Perro(String nombre, double peso, int edad, 
	                 TamanioPerro tamanio, boolean esGuardian, int horasEjercicio) {
	        super(nombre, peso, edad);
	        this.tamanio = tamanio;
	        this.esGuardian = esGuardian;
	        this.horasEjercicioDiario = horasEjercicio;
	    }
	    
	    @Override		//Se utiliza Override para modificar un metodo de la clase padre
	    public double calcularComidaDiaria() {
	        double comidaBase = super.calcularComidaDiaria();
	        double extra = horasEjercicioDiario * 0.1;
	        
	        // Ajuste por tamaño
	        switch(tamanio) {
	            case PEQUENIO:
	                comidaBase *= 0.8; // 20% menos para perros pequeños
	                break;
	            case GRANDE:
	                comidaBase *= 1.2; // 20% más para perros grandes
	                break;
	        }
	        
	        if (esGuardian) {
	            extra += comidaBase * 0.2;
	        }
	        return comidaBase + extra;
	    }
	    
	    @Override		//Se utiliza Override para modificar un metodo de la clase padre	
	    public void mostrarInfo() {
	        super.mostrarInfo();
	        System.out.println("Tamaño: " + tamanio);
	        System.out.println("Es guardián: " + (esGuardian ? "Sí" : "No"));
	        System.out.println("Horas de ejercicio diario: " + horasEjercicioDiario);
	    }

}
