package ejercicio7_12;

public class SolucionEcuaciones {

	private int a;
	private int b;
	private int c;
	private double sol1;
	private double sol2;
	
	
	public SolucionEcuaciones(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	void solucion() {
		if(getDiscriminante() > 0) {
			sol1 = (-b + (Math.sqrt(Math.pow(b,2) - 4 * a * c)))/(2*a);
			sol2 = (-b - (Math.sqrt(Math.pow(b,2) - 4 * a * c)))/(2*a);
		}else if(getDiscriminante() == 0) {
			sol1 = (-b + (Math.sqrt(Math.pow(b,2) - 4 * a * c)))/(2*a);
		}
		
	}
	
	void mostarSol() {
		if(getDiscriminante() > 0) {
			System.out.println("Solucion 1: " +sol1);
			System.out.println("Solucion 2: " +sol2);
			System.out.println("El discriminante es positivo");
		}else if(getDiscriminante() < 0) {
			System.out.println("No hay solucion");
			System.out.println("El discriminante es negativo");
		}else if(getDiscriminante() < 0) {
			System.out.println("Solucion: " +sol1);
			System.out.println("El discriminante es igual a 0");
		}
		
	}
	
	double getDiscriminante() {
		return Math.pow(b,2) - (4 * a * c);
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public void setC(int c) {
		this.c = c;
	}
	
	
	
	
	
	
	
	
}
