package complementario1;

public class Persona {
	
	private int edad;
    
    //Constructor por defecto
    public Persona(int edad){
        this.edad=edad;
    }
 
    //Devuelve la edad
    public int getEdad() {
        return edad;
    }
 
    //Modifica la edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

	@Override
	public String toString() {
		return "Persona [edad=" + edad + "]";
	}

}