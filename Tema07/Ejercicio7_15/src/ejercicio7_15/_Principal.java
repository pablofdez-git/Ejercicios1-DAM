package ejercicio7_15;

public class _Principal {

	public static void main(String[] args) {
		
		Calendario c1 = new Calendario (28,2,2025);
		Calendario c2 = new Calendario (31,12,2026);
		Calendario c3 = new Calendario (1,1,2024);
		

        System.out.println("Fechas iniciales:");
        c1.mostrar();
        c2.mostrar();
        c3.mostrar();
        System.out.println("---------------------------");
        System.out.println("Incrementar día:");
        c1.incrementarDia();
        c1.mostrar();
        System.out.println("---------------------------");
        System.out.println("Incrementar mes:");
        c3.incrementarMes();
        c3.mostrar();
        System.out.println("---------------------------");
        System.out.println("Incrementar día en fin de año:");
        c2.incrementarDia();
        c2.mostrar();
        System.out.println("---------------------------");
        System.out.println("Incrementar año:");
        c3.incrementarAnio(2);
        c3.mostrar();
        System.out.println("---------------------------");
        System.out.println("Comparar fechas:");
        Calendario c4 = new Calendario(1, 1, 2024);

        if (c1.iguales(c4)) {
            System.out.println("c1 y c4 son iguales");
        } else {
            System.out.println("c1 y c4 son distintas");
        }
        System.out.println("---------------------------");

	}

}
