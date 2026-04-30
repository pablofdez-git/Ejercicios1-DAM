package figurasGeométricas;

public class Circulo extends Figura {
	
	private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public String toString() {
        return "Círculo - " + super.toString() + ", Radio: " + radio + ", Área: " + calcularArea();
    }

	@Override
	public double perimetro() {
		return 2*Math.PI * radio;
	}

}
