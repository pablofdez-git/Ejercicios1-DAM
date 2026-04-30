package resuelta7_04;

public class CuentaCorriente {
	
	String dni;
	public String titular;
	private double saldo;
	public String banco;
	
	
	CuentaCorriente(String dni, String titular, double saldo, String banco) {
		this.dni = dni;
		this.titular = titular;
		this.saldo = saldo;
		this.banco = banco;
	}
	
	CuentaCorriente(String dni, String titular, String banco) {
		this(dni,  titular, 0, banco);
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
		System.out.println("Banco: " +banco);
		System.out.println("--------------------");
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}
	
	
	
	
}
