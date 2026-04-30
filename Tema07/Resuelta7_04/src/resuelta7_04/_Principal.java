package resuelta7_04;

public class _Principal {

	public static void main(String[] args) {
		
		CuentaCorriente p1 = new CuentaCorriente("12345678L", "Pablo", 1000, "BBVA");
		
		p1.mostrarInformacion();
		
		System.out.println("Nombre Banco: " +p1.getBanco());
		
		p1.setBanco("Santander");
		p1.mostrarInformacion();

		
		

	}

}
