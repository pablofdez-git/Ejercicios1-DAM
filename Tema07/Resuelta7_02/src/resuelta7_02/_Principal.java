package resuelta7_02;

public class _Principal {

	public static void main(String[] args) {
		
		CuentaCorriente p1 = new CuentaCorriente("12345678M", "Pablo");
		
		
		p1.mostrarInformacion();
		p1.ingresarDinero(5000);
		p1.mostrarInformacion();
		p1.sacarDinero(2000);
		p1.mostrarInformacion();
		p1.sacarDinero(5000);
		p1.mostrarInformacion();
		

	}

}
