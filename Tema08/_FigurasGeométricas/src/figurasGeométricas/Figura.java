package figurasGeométricas;

import java.util.Objects;

public abstract class Figura {
	
	protected String color;			//Todas las figuras tendran color y el concepto color es igual para todas

	/*
	 * CONSTRUCTOR
	 * Una clase abstracta si puede tener constructores. 
	 * Como sabemos, no es posible crear objetos de una clase abstracta, pero de una clase, 
	 * la cual herede de una clase abstracta, si se pueden crear objetos, y como sabemos 
	 * cuando creamos un objeto de una clase que hereda, la primera llamada de su constructor puede ser 
	 * una llamada al constructor de la clase "padre", lo que permite que aunque no cree un objeto, 
	 * si se pueda utilizar su constructor.
	 * Este constructor solo se puede usar mediante super() en una clase hija, nunca en un main
	 */
    public Figura(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double calcularArea();		//Todas las figuras tendran area, pero sera distanta para cada una
    
    public abstract double perimetro();

    @Override
    public String toString() {
        return "Color: " + color;
    }
    /**
     * Son iguales si tienen el mismo tipo y el mismo color
     */
	@Override
	public boolean equals(Object obj) {
		Figura otraFigura = (Figura) obj;
		boolean iguales = false;
		if(this.getClass().equals(otraFigura.getClass())&& this.color.equals(otraFigura.color)) {
			iguales =true;
		}
		
		return iguales;
	}
    
	public boolean esMayorQue(Figura otra) {
		return this.calcularArea()> otra.calcularArea();
	}
    

}
