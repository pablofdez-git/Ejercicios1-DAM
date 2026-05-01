package actividadResuelta1_14;

import java.util.*;

public class ActividadResuelta1_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		/*
		System.out.println("Introduce un decimal: ");
		double decimal = sc.nextDouble();
		
		double entero = Math.round(decimal);
		
		System.out.println("El decimal redondeado es: "+entero);
		*/
		
		System.out.println("Introduce un decimal: ");
		double decimal = sc.nextDouble();
		
		//Numero sin decimal
		int num = (int) decimal;
		
		//Se obtiene el decimal solo
		double coma = decimal - num;
		
		int entero = coma >= 0.5 ? num+1 : num;
		
		System.out.println(entero);
		
		/*
		System.out.println("Introduce decimal: ");
		double numero = sc.nextDouble();
		int redondeado = (int) (numero + 0.5);
		System.out.println("EL número redondeado es: "+redondeado);
		*/

	}

}
