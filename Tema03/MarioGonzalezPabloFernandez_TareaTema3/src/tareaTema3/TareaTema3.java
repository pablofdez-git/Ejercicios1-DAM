package tareaTema3;

import java.util.*;

public class TareaTema3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Introduccion de valores
		System.out.println("Introduce la cantidad de meses: ");
		final int MESES=sc.nextInt();
		System.out.println("Introduce el pago del primer mes: ");
		final int PRIMER_MES=sc.nextInt();

		
		long total=0;
		long siguienteMes = PRIMER_MES;
		
		//Validacion de datos
		if(MESES <=0 || PRIMER_MES <=0) {
			if(MESES <=0) {
				System.out.println("Los meses no pueden ser 0 o menores");
			}else if (PRIMER_MES <=0) {
				System.out.println("El pago del primer mes no puede ser 0 o menor");
			}
		}else {
			
			//Calcula el total y el mes siguiente
			for(int i=1; i<=MESES; i++) {
				System.out.println("Mes "+i+ ": " +siguienteMes);
				total += siguienteMes;
				siguienteMes *= 2;
				
			}
			System.out.println("Total "+ total);
		}
		

	}

}
