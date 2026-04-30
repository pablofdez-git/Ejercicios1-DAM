package actividadResuelta4_10;

import java.util.Scanner;

public class ActividadResuelta4_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el valor de base: ");
		int base = sc.nextInt();
		System.out.print("Introduce el valor de exponente: ");
		int exp = sc.nextInt();
		
		double solIterativa = iterativa(base,exp);
		System.out.println("iterativa: " +solIterativa);
		
		double solRecursiva = recursiva(base,exp);
		System.out.println("recursiva: " +solRecursiva);

	}
	/**
	 * Funcion iterativa para calcular la potencia de un numero
	 * @param base
	 * @param exponente
	 * @return devuelve resultado de elevar a^n
	 */
	public static double iterativa(int base, int exponente) {
		double solucion=1;
		
		for(int i = 0; i<exponente;i++) {
			solucion *= base;
		}
		return solucion;
	}
	/**
	 * Funcion recursiva para calcular la potencia de un numero
	 * @param base
	 * @param exponente
	 * @return devuelve el resultado de elevar a^n
	 */
	public static double recursiva(int base, int exponente) {
		double solucion;
		
		if(exponente == 0) {	//Caso base
			solucion = 1;
		}else {
			solucion = base * recursiva(base, exponente -1);
		}
		
		
		return solucion;
	}
}
