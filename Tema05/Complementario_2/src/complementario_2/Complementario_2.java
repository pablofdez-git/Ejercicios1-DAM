package complementario_2;

import java.util.Arrays;

public class Complementario_2 {

	public static void main(String[] args) {
		
		int array[] = new int[20];
		array = rellenar(array, 0, 99);
		
		System.out.println(Arrays.toString(array));
		
		//Valor maximo y posicion
		int mayor = encontrarMayor(array);
		int posicionMayor = encontrarPosicion(array, mayor);
		
		//Valor minimo y posicion
		int menor = encontrarMayor(array);
		int posicionMenor = encontrarPosicion(array, menor);
		
		//Suma total de todos los numeros
		int sumaTotal = sumador(array);
		
		//Comprobar si esta el 99
		int num99 = encontrarPosicion(array, 99);
		if(num99 < array.length) {
			System.out.println("El numero 99 esta dentro del array");
		}else {
			System.out.println("El numero 99 no esta dentro del array");
		}
		
		for(int num : array) {
			if(esPrimo(num)) {
				System.out.println(num);
			}
		}
		
		
		

	}
	
	public static int[] rellenar(int t[], int min, int max) {
		for(int i = 0; i<t.length;i++) {
			t[i] = (int)(Math.random()*(max-min+1))+min;
		}
		return t;
	}
	
	public static int encontrarMayor(int t[]) {
		int mayor = 0;
		
		for(int n : t) {
			if(n > mayor) {
				mayor = n;
			}
		}
		return mayor;
	}
	public static int encontrarMenor(int t[]) {
		int menor = 0;
		
		for(int n : t) {
			if(n > menor) {
				menor = n;
			}
		}
		return menor;
	}
	
	public static int encontrarPosicion(int t[], int elemento) {
		int indiceBusqueda = 0;

        while (indiceBusqueda < t.length && t[indiceBusqueda] != elemento) {
	        indiceBusqueda++;
        }
        return indiceBusqueda;
	}
	
	public static int sumador(int t[]) {
		int suma = 0;
		for(int n : t) {
			suma += n;
		}
		return suma;
	}
	
	public static boolean esPrimo(int n) {
		boolean esPrimo = true;
		if(n<2) {
			esPrimo = false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				esPrimo = false;
			}
		}
		return esPrimo;
	}
	 public static int[] impares(int t[]) {
		 
	 }

}
