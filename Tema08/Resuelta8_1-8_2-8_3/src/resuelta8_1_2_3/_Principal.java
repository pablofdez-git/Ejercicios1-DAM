package resuelta8_1_2_3;

public class _Principal {

	public static void main(String[] args) {
		
		Hora h1 = new Hora(3, 48);
		Hora h2 = new Hora(30, 80);
		
		System.out.println("Horas h1 y h2:");
		System.out.println(h1);
		System.out.println(h2);
		
		System.out.println("Incremento h1:");
		h1.inc();
		System.out.println(h1);
		
		System.out.println("Asignar hora y minutos h2");
		h2.setMinutos(50);
		h2.setHora(5);
		System.out.println(h2);
		
		HoraExacta HE1= new HoraExacta(3,48,59);
		System.out.println("Hora exacta: ");
		System.out.println(HE1);
		
		System.out.println("Incremento:");
		HE1.inc();
		System.out.println(HE1);
		
		System.out.println("Asignar Segundos:");
		HE1.setSegundo(38);
		System.out.println(HE1);
		
		System.out.println("Comparacion");
		h1.setHora(6);
		h1.setMinutos(40);
		h2.setHora(6);
		h2.setMinutos(40);
		boolean iguales = h1.equals(h2);
		
		if(iguales) {
			System.out.println("Son iguales");
		}else {
			System.out.println("No son iguales");
		}
		
		

	}

}
