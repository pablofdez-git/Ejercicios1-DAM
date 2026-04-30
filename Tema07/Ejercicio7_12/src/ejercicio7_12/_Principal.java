package ejercicio7_12;

public class _Principal {

	public static void main(String[] args) {
		
		SolucionEcuaciones s1 = new SolucionEcuaciones(1,-5,6);
		SolucionEcuaciones s2 = new SolucionEcuaciones(1,2,5);
		SolucionEcuaciones s3 = new SolucionEcuaciones(1,-6,9);
		
		s1.solucion();
		s1.mostarSol();
		System.out.println("------------------------------------");
		s2.solucion();
		s2.mostarSol();
		System.out.println("------------------------------------");
		s3.solucion();
		s3.mostarSol();
	}

}
