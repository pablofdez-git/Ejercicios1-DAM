package vehiculos;

public class _Principal {

	public static void main(String[] args) {
		Coche coche1 = new Coche("Ford", 150, 4, Combustible.GASOLINA);
		Coche coche2 = new Coche("Ford", 150, 4, Combustible.GASOLINA);
		Coche coche3 = new Coche("Tesla", 200, 4, Combustible.ELECTRICO);
		
		Barco barco1 = new Barco("Yamaha", 80, 12.5, true);
		Submarino submarino1 = new Submarino("Nautilus", 40, 50.0, 350);
		
		Vehiculo[] listaVehiculos = new Vehiculo[4];
		listaVehiculos[0] = coche1;
		listaVehiculos[1] = coche3;
		listaVehiculos[2] = barco1;
		listaVehiculos[3] = submarino1;
		
		System.out.println("========== LISTA DE VEHÍCULOS ==========");
		for (int i = 0; i < listaVehiculos.length; i++) {
			System.out.println(listaVehiculos[i].toString());
			System.out.println("----------------------------------------");
		}
		

		System.out.println("========== PRUEBA DE EQUALS ==========");
		System.out.println("Coche1 igual a Coche2? " + coche1.equals(coche2));
		System.out.println("Coche1 igual a Coche3? " + coche1.equals(coche3));
		System.out.println();
		
		System.out.println("========== CÁLCULOS ESPECÍFICOS ==========");
		
		double costoCoche = coche1.calcularCostoCombustible(500, 1.75, 0.06);
		System.out.println("Coste combustible coche1: " + costoCoche + " €");
		
		double cargaBarco = barco1.calcularCargaMaxima(500.0);
		System.out.println("Carga máxima barco1: " + cargaBarco + " kg");
		
		double presionSubmarino = submarino1.calcularPresionAgua();
		System.out.println("Presión máxima submarino1: " + presionSubmarino + " atm");

	}

}
