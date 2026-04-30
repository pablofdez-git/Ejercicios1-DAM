package actividadResuelta5_1;

import java.util.Arrays;

public class ActividadResuelta5_1 {

	public static void main(String[] args) {
		
		int aleatorios[] = new int[10];
		int max = 100;
		int min = 1;
		
		for(int i = 0;i<aleatorios.length;i++) {
			aleatorios[i] = (int)(Math.random()*(max-min+1))+min;
		}
		
		System.out.println(Arrays.toString(aleatorios));
		
		int suma = 0;
		for(int aleatorio : aleatorios) {
			suma += aleatorio;
		}
		
		System.out.println("Resultado: "+suma);

	}

}
