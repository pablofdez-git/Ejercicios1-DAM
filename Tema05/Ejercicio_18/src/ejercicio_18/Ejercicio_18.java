package ejercicio_18;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int matriz [][] = new int [4][4];
		
		for(int fila = 0; fila < matriz.length; fila++) {
			for(int columna = 0; columna < matriz[0].length; columna++) {
				System.out.print("Introduce un valor para la posicion " +fila+", "+columna+": ");
				matriz[fila][columna] = sc.nextInt();
			}
		}
		int objetivo = 0;
		for(int i = 0; i<4;i++) {
			objetivo += matriz[0][i];
		}
		
		int sumaFilas = 0;
		int sumaColumnas = 0;
		boolean magica = true;
		
		for(int i = 0; i < 4 && magica; i++) {
			sumaFilas = 0;
			sumaColumnas = 0;
			for(int j = 0; j < 4; j++) {
				sumaFilas += matriz[i][j];
				sumaColumnas += matriz[j][i];
			}
			if(sumaFilas != objetivo) {
				magica = false;
			}
			if(sumaColumnas != objetivo) {
				magica = false;
			}
		}
		

		
		if(magica) {
			System.out.println("magica");
		}else {
			System.out.println("no magica");
		}
		
		

	}

}
