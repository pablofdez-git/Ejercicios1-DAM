package actividadResuelta1_7;

import java.util.Scanner;

public class ActividadResuelta1_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el radio de la circunferencia: ");
		double radio = sc.nextDouble();
		
		//Longitud = 2*PI*r
		double longitud = (2*Math.PI*radio);
		System.out.println("La longitud es: "+longitud);
		
		//Area = PI*r^2
		double area = Math.PI * Math.pow(radio,2);
		System.out.println("El área es: "+area);
		
		
		

	}

}
