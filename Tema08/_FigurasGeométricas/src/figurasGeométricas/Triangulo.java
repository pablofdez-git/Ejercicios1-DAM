package figurasGeométricas;

public class Triangulo extends Figura {
	
    private double base;
    private double altura;

    public Triangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public String toString() {
        return "Triángulo - " + super.toString() + ", Base: " + base + ", Altura: " + altura + ", Área: " + calcularArea();
    }

	@Override
	public double perimetro() {
		double hipotenusa = Math.sqrt((Math.pow(altura,2))+(Math.pow(base,2)));
		return base + altura + hipotenusa;
	}

}
