package tareaTema1;

import java.util.Scanner;

public class Complementario_9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Isercción de datos
		System.out.println("Introduce el capital inicial (€): ");
		double capitalInicial = sc.nextDouble();
		System.out.println("Introduce la tasa de interés anual (%): ");
		double tasaInteresAnual = sc.nextDouble();
		System.out.println("Introduce el numero de años completos: ");
		int aniosCompletos = sc.nextInt();
		
		//Calculo del interes simple: Interes = Capital x (Tasa/100) x Años
		double interesSimple = capitalInicial * (tasaInteresAnual/100.0) * aniosCompletos;
		System.out.println("El interes Simple es: " + interesSimple);
		
		//Calculo del interes Compuesto: Montofinal = Captial x (1 + Tasa/100)^Años
		double interesCompuesto = capitalInicial * Math.pow(1+ tasaInteresAnual/100.0, aniosCompletos);
		System.out.println("El interes Compuesto es: " +interesCompuesto);
		
		//Diferencia entre interes Simple y compuesto
		double diferencia = interesCompuesto - interesSimple;
		System.out.println("La diferencia entre interes simple y compuesto es: " +diferencia);
		
		//Porcentaje que representa la diferencia sobre el capital inicial
		double porcentaje = (diferencia * capitalInicial) /100.0;
		System.out.println("Porcentaje que representa la diferencia sobre el capital inicial es: "+diferencia);
		

	}

}
