package ejercicio2_13;

import java.util.Scanner;

/*En una granja se compra diariamente una cantidad (comidaDiaria) de comida para los
animales. El número de animales que alimentar (todos de la misma especie) es
numAnimales y sabemos que cada animal como una media de kilosPorAnimal.
Diseña un programa que solicite al usuario los valores anteriores y determine si se dispone
de alimento suficiente para cada animal. En caso negativo, ha de calcular cuál es la ración
que corresponde a cada uno de los animales.
Nota: Evitar que la aplicación realice divisiones entre 0.*/
public class Ejercicio2_13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Introduce la cantidad de comida diaria: ");
		double comidaDiaria = sc.nextInt();
		System.out.println("Introduce el numero de animales a alimentar: ");
		int numAnimales = sc.nextInt();
		System.out.println("Introduce la media de kilos de comida por animal: ");
		double kilosPorAnimal = sc.nextDouble();
		
		if (numAnimales<=0) {
			System.out.println("No hay animales que alimentar");
		}else {
			double comidaNecesaria = numAnimales * kilosPorAnimal;
			
			if (comidaDiaria >= comidaNecesaria) {
	            System.out.println("Hay suficiente comida para todos los animales.");
	        } else {
	            double racionPorAnimal = comidaDiaria / numAnimales;
	            System.out.println("No hay suficiente comida para todos.");
	            System.out.println("Cada animal recibirá " +racionPorAnimal+ "kg" );
	        }
		}
			

	}

}