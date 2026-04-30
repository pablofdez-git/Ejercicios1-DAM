package complementario_3;

import java.util.Scanner;

public class Complementario_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un año: ");
		int anio = sc.nextInt();
		
		if(anio%4==0 || (anio%400==0 && anio%100 !=0)) {
			System.out.println(anio+" Es bisiesto");
		}else {
			System.out.println(anio+" No es bisiesto");
		}

	}

}
