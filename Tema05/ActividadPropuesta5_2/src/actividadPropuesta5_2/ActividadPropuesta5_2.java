package actividadPropuesta5_2;

import java.util.*;


public class ActividadPropuesta5_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		double decimales [] = new double [5];
		
		for(int i = 0; i<decimales.length;i++) {
			System.out.print("Introduce un numero decimal: ");
			decimales[i] = sc.nextDouble();
		}
		System.out.println(Arrays.toString(decimales));

	}

}
