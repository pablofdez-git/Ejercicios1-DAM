package actividadResuelta1_11;

import java.util.*;

public class ActividadResuelta1_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final double PRECIO_KG_MANZANAS = 2.35;
		final double PRECIO_KG_PERAS = 1.95;
		
		
		System.out.println("¿Cuántos kg de manzanas se han vendido en el primer semestre?");
		double kgManzanasSemestreUno = sc.nextDouble();
		System.out.println("¿Cuántos kg de peras se han vendido en el primer semestre?");
		double kgPerasSemestreUno = sc.nextDouble();
		
		System.out.println("¿Cuántos kg de manzanas se han vendido en el segundo semestre?");
		double kgManzanasSemestreDos = sc.nextDouble();
		System.out.println("¿Cuántos kg de peras se han vendido en el segundo semestre?");
		double kgPerasSemestreDos = sc.nextDouble();
		
		
		double totalManzanas = (kgManzanasSemestreUno + kgManzanasSemestreDos)  * PRECIO_KG_MANZANAS;
		double totalPeras = (kgPerasSemestreUno + kgPerasSemestreDos) * PRECIO_KG_PERAS;
		
		double importeTotal = totalManzanas + totalPeras;
		
		System.out.println("El importe total es de: "+importeTotal+" Euros");

	}

}
