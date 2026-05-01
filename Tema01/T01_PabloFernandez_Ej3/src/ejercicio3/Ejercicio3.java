package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Introducccion de valores
		System.out.println("Introduce un número entre 1 y 99: ");
		int numero1 = sc.nextInt();
		System.out.println("Introduce un número entre 1 y 99: ");
		int numero2 = sc.nextInt();
		System.out.println("Introduce un número entre 1 y 99: ");
		int numero3 = sc.nextInt();
		System.out.println("Introduce una operacion a realizar entre 1 y 7: ");
		int operacion = sc.nextInt();
		
		//Comprobacion de que no sean iguales entre si
		if((numero1 == numero2 || numero1 == numero3) || (numero2 == numero3)) {
			System.out.println("Error los numeros tienen que ser distintos entre si");
		}else {
			
			//Comprobacion para hallar el mayor, menor y el intermedio
			int max=0;
			int min=0;
			int intermedio=0;
			
			if(numero1 > numero2 && numero1 > numero3 && numero2 > numero3) {
				max = numero1;
				min = numero3;
				intermedio = numero2;
			}else if(numero2 > numero1 && numero2 > numero3 && numero1 > numero3) {
				max = numero2;
				min = numero3;
				intermedio = numero1;
			}else if(numero3 > numero1 && numero3 > numero2 && numero1 > numero2) {
				max = numero3;
				min = numero2;
				intermedio = numero1;
			}else if(numero1 > numero2 && numero1 > numero3 && numero2 < numero3) {
				max = numero1;
				min = numero2;
				intermedio = numero3;
			}else if(numero2 > numero1 && numero2 > numero3 && numero1 < numero3) {
				max = numero2;
				min = numero1;
				intermedio = numero3;
			}else if(numero3 > numero1 && numero3 > numero2 && numero1 < numero2) {
				max = numero3;
				min = numero1;
				intermedio = numero2;
			}
			
			switch(operacion) {
			case 1:
				System.out.println("Los numero impares son: ");
				
				//Si el modulo es diferente a 0 es impar
				if(numero1 % 2 != 0) {
					System.out.println(numero1);
				}
				if (numero2 % 2 != 0) {
					System.out.println(numero2);
				}
				if (numero3 % 2 != 0) {
					System.out.println(numero3);
				}
				break;
			case 2:
				//Suma de los tres numeros entre 3
				double media = (numero1 + numero2 + numero3)/3;
				System.out.println("La media es: "+media);
				break;
			case 3:
				//Se cojen los valores max, min y intermedio del principio
				System.out.println("El numero intermedio entre "+max+" y " +min+ " es "+intermedio);
				break;
			case 4:
				//Se utilizan en el aleatorio los valores max y min del principio
				int aleatorio = (int)(Math.random()*(max-min+1)+min);
				System.out.println("El numero aleatorio entre el maximo ("+max+") y el minimo ("+min+") es "+aleatorio);
				break;
			case 5:
				//Calculo de la raiz con Math
				double raiz = Math.sqrt(numero1 + numero2 + numero3);
				System.out.println("La raiz cuadrada es: "+raiz);
				break;
			case 6:
				//Calculo de elevar al cubo y al cuadrado con Math y max y min del principio
				double resultado = Math.pow(max, 2) + Math.pow(min, 3);
				System.out.println("El resultado de elevar el mayor ("+max+") y el menor ("+min+") es " +resultado);
				break;
			case 7:
				//Calculo de la progresion aritmetica
				if((max-intermedio)==(intermedio-min)) {
					System.out.println("Son intermedios");
				}else {
					System.out.println("No son intermedios");
				}	
				break;
			default:
				System.out.println("Has introducido una operacion erronea");
				break;
		}
		}
		
		

	}

}
