package actividadResuelta4_3;

import java.util.Scanner;

public class ActividadResuelta4_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce 1 para el area o 2 para el volumen");
		int tipo = sc.nextInt();
		System.out.println("Introduce el valor del radio de la base: ");
		int radioBase = sc.nextInt();
		System.out.println("Introduce el valor de la altura: ");
		int altura = sc.nextInt();
		
		double result = calculoCilindro(tipo, radioBase, altura);
		
		if(result == -1) {
			System.out.println("Error, solo se puede 1 o 2");
		}else {
			System.out.println("El resultado es: "+result);
		}
		

	}
	
	public static double calculoCilindro(int tipo, int radioBase, int altura) {
		
		double resultado;
		
		switch(tipo) {
			case 1:			//Area
				double area = 2*Math.PI*radioBase*(radioBase + altura);
				resultado = area;
				break;
			case 2:			//Volumen
				double volumen = Math.PI*Math.pow(radioBase,2)*altura;
				resultado = volumen;
				break;
			default:
				resultado = -1;
				break;
		}
		
		return resultado;
	}

}
