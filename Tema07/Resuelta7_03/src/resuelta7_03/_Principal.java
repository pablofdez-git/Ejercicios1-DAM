package resuelta7_03;

public class _Principal {

	public static void main(String[] args) {
		
		CuentaCorriente p1 = new CuentaCorriente("12345678M", "Pablo");
		
		p1.mostrarInformacion();
		p1.dni = "12345678L";
		p1.mostrarInformacion();
		p1.titular = "Antonio";
		p1.mostrarInformacion();
		//p1.saldo = 200;
		

	}

}
