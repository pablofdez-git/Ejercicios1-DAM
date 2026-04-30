package figurasGeométricas;

import java.util.Scanner;

public class _Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int opcion=0;
		String color;
		
		Figura f;	//podemos crear variables de la clase abstracta, pero no crear un objeto
		//Figura f = new Figura();		//No se puede crear un objeto de tipo Figura porque es clase abstracta
		
		
		Figura rectangulo = new Rectangulo("Rojo", 2.0, 4.0);
		Circulo c = new Circulo("Amarillo", 3.0);
		
		System.out.println("UN RECTANGULO");
		System.out.println("El area del rectangulo es: " +rectangulo.calcularArea());
		System.out.println("El color del rectangulo es: " +rectangulo.getColor());
		System.out.println(" ");
		
		
		do {
			System.out.println("1. Crear Circulo");
			System.out.println("2. Crear Triangulo");
			System.out.println("3. Salir");
			System.out.println(" ");
			System.out.print("Elige una opcion: ");
			opcion = sc.nextInt();
			
			switch(opcion) {
				case 1:
					System.out.print("Introduzca el radio: ");
					double r = sc.nextDouble();
					sc.nextLine();
					System.out.print("Introduzca un color: ");
					color = sc.nextLine();
					
					f=new Circulo(color, r);	//Creamos un objeto circulo pasandole los parametros
					
					System.out.println("El area del circulo es: " +f.calcularArea());
					System.out.println("El color del circulo es: " +f.getColor());
					System.out.println("");
					break;
					
					
				case 2:
					System.out.print("Introduzca el la base: ");
					double x = sc.nextDouble();
					System.out.print("Introduzca la altura: ");
					double y = sc.nextDouble();
					sc.nextLine();
					System.out.print("Introduzca un color: ");
					color = sc.nextLine();
					
					f=new Triangulo(color, x, y);		//Creamos un objeto triangulo pasandole los parametros
					
					System.out.println("El area del triangulo es: " +f.calcularArea());
					System.out.println("El color del triangulo es: " +f.getColor());
					System.out.println("");
					break;
					
					
				case 3:
					break;
			}
			
		} while (opcion!=3);

	}

}
