package clinicaVeterinaria;

public class Animal {
	
	protected String nombre;
    protected double peso;
    protected int edad;
    
    public Animal(String nombre, double peso, int edad) {
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
    }
    
    public double calcularComidaDiaria() {
        return peso * 0.1; // Cálculo base para cualquier animal
    }
    
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Edad: " + edad + " años");
    }

}
