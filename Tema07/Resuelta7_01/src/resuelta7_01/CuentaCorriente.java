package resuelta7_01;

public class CuentaCorriente {
	
	String dni;
	String titular;
	double saldo;
	
	
	void crearCuenta(String dni, String titular) {
		this.dni = dni;
		this.titular = titular;
		this.saldo = 0;
	}

	void sacarDinero(double retirar) {
		if(retirar < saldo) {
			saldo = saldo - retirar;
			System.out.println("Has podido retirar el dinero");
		}else {
			System.out.println("No tienes suficiente saldo");
		}
	}
	
	void ingresarDinero(double ingreso) {
		saldo += ingreso;
		System.out.println("Has ingresado dinero");
	}
	
	void mostrarInformacion() {
		System.out.println("--------------------");
		System.out.println("Nombre: " +titular);
		System.out.println("DNI: " +dni);
		System.out.println("Saldo: " +saldo);
		System.out.println("--------------------");
	}
}
