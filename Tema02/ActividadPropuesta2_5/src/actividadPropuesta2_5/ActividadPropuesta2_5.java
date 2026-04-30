package actividadPropuesta2_5;

import java.util.*;

public class ActividadPropuesta2_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//sc = useLocale(Locale.US);
		
		System.out.println("Introduce el aforo máximo: ");
		int aforoMax = sc.nextInt();
		System.out.println("Introduce el precio por entrada: ");
		double precioEntrada = sc.nextDouble();
		System.out.println("Introduce el numero de entradas vendidas: ");
		int entradasVendidas = sc.nextInt();
		
		double dineroRecaudado;
		double porcentajeVendidas = (double) entradasVendidas / aforoMax * 100;
		
		if (porcentajeVendidas <= 20) {
			System.out.println("Concierto cancelado");
		}else if(porcentajeVendidas <= 50) {
			precioEntrada = precioEntrada * 0.75;
			System.out.println("Las entradas se han rebajado un 25%");
			System.out.println("Precio actual: "+precioEntrada);
			dineroRecaudado = precioEntrada * entradasVendidas;
			System.out.println("El dinero recaudadoo es: " +dineroRecaudado+"€");
		}else {
			dineroRecaudado = precioEntrada * entradasVendidas;
			System.out.println("El dinero recaudadoo es: " +dineroRecaudado+"€");
		}
		
		

	}

}
