package complementario_1;

import java.util.*;

public class Complementario_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		System.out.print("Introduce el importe de la cuenta: ");
		double importeCuenta=sc.nextDouble();
		System.out.print("Introduce el porcentaje de la propina: ");
		int porcentajePropina=sc.nextInt();
		
		double importePropina = (importeCuenta * porcentajePropina) / 100;
		double total = importePropina + importeCuenta;
		
		System.out.println("El importe de la propina es: "+importePropina);
		System.out.println("El total a pagar es: " +total);

	}

}
