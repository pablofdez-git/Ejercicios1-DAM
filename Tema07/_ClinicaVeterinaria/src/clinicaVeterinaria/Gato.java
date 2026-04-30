package clinicaVeterinaria;

public class Gato extends Animal {
	
	private boolean viviendaInterior;
    private String colorPelaje;
    private int horasSuenoDiarias;
    
    public Gato(String nombre, double peso, int edad, 
                boolean viviendaInterior, String colorPelaje, int horasSueno) {
        super(nombre, peso, edad);
        this.viviendaInterior = viviendaInterior;
        this.colorPelaje = colorPelaje;
        this.horasSuenoDiarias = horasSueno;
    }
    
    @Override		//Se utiliza Override para modificar un metodo de la clase padre
    public double calcularComidaDiaria() {
        // Los gatos que viven dentro comen menos
        double comidaBase = super.calcularComidaDiaria();
        if (viviendaInterior) {
            return comidaBase * 0.8; // 20% menos si vive dentro
        }
        return comidaBase;
    }
    
    @Override		//Se utiliza Override para modificar un metodo de la clase padre
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Vive en interior: " + (viviendaInterior ? "Sí" : "No"));
        System.out.println("Color de pelaje: " + colorPelaje);
        System.out.println("Horas de sueño diarias: " + horasSuenoDiarias);
    }

}
