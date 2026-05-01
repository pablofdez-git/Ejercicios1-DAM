package complementario_2;

import java.util.Scanner;

public class Complementario_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el valor de  'm':");
		int valorM = sc.nextInt();
		System.out.println("Introduce el valor de 'b':");
		int valorB = sc.nextInt();
		System.out.println("Introduc el valor de 'x':");
		int valorX = sc.nextInt();
		
		int valorY = (valorM * valorX) + valorB;
		
		System.out.println("El valor de y es: " +valorY);

	}

}
