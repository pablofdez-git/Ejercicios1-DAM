package figurasGeométricas;

public class Rectangulo extends Figura {

	private double base;
    private double altura;

    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public String toString() {
        return "Rectángulo - " + super.toString() + ", Base: " + base + ", Altura: " + altura + ", Área: " + calcularArea();
    }

	@Override
	public double perimetro() {
		return 2*base + 2 * altura;
	}
	
}
