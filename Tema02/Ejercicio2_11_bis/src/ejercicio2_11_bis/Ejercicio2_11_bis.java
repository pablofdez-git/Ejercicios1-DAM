package ejercicio2_11_bis;

import java.util.Scanner;

public class Ejercicio2_11_bis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaración de variables
		int num;
		int unidades;
		int decenas;
		int centenas;
		int millar;
		boolean capicua;
		System.out.print("Introduce un numero entre el 0 y el 9999: ");
		num = sc.nextInt();
		
		if(num>9999 || num<0) {
			System.out.println("Tu numero no es válido");
		}else {
			unidades = num%10;
			num = num/10;
			decenas = num%10;
			num = num/10;
			centenas = num%10;
			num = num/10;
			millar = num%10;
			
			if(millar ==0 && centenas==0 && unidades==decenas) {  		//para numeros de 2 cifras
				capicua = true;
			}else if (millar==0 && centenas==unidades) {				//para numeros de 3 cifras
				capicua = true;
			}else if (millar==unidades && centenas==decenas) {			//para numeros de 4 cifras
				capicua = true;
			}else if (millar==0 && centenas==0 && decenas==0) {			//para numeros de 1 cifras
				capicua = true;
			}else {
				capicua = false;
			}
			
			if (capicua) {
				System.out.println("Tu número es capicua");
			}else {
				System.out.println("Tu no número es capicua");
			}
		}

	}

}
