package ejercicio4_17;

import java.util.Scanner;

public class Ejercicio4_17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el primer numero: ");
		int num1 = sc.nextInt();
		System.out.print("Introduce el segundo numero: ");
		int num2 = sc.nextInt();
		
		sonAmigos(num1, num2);

	}
	/**
	 * 
	 * @param num
	 * @return
	 */
	public static int sumaDivisoresPropios(int num) {
		int suma = 0;
		
		for(int i=1; i<num;i++) {
			if(num%i==0) {
				suma += i;
			}
		}
		return suma;
	}
	/**
	 * 
	 * @param num1
	 * @param num2
	 */
	public static void sonAmigos(int num1, int num2) {
		if(sumaDivisoresPropios(num1)==num2 && sumaDivisoresPropios(num2)==num1) {
			System.out.println("Los números " +num1+ " y "+num2+" son amigos");
		}else {
			System.out.println("Los números " +num1+ " y "+num2+" no son amigos");
		}
	}

}
