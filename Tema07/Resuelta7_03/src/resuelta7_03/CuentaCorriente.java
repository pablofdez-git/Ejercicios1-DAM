package resuelta7_03;

public class CuentaCorriente {
	
	String dni;
	public String titular;
	private double saldo;
	
	
	CuentaCorriente(String dni, String titular, double saldo) {
		this.dni = dni;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	CuentaCorriente(String dni, String titular) {
		this(dni,  titular, 0);
	}
	
	CuentaCorriente(String dni, double saldo) {
		this.dni = dni;
		this.saldo = saldo;
	}

	void sacarDinero(double retirar) {
		System.out.println("Dinero a retirar: " +retirar);
		if(retirar <= saldo) {
			saldo -= retirar;
			System.out.println("Has podido retirar el dinero");
		}else {
			System.out.println("No tienes suficiente saldo");
		}
	}
	
	void ingresarDinero(double ingreso) {
		System.out.println("Dinero a ingresar: " +ingreso);
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
