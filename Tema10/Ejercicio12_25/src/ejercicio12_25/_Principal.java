package ejercicio12_25;

import java.util.*;
import java.time.LocalDate;

public class _Principal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Map<String, Socio> socios = new HashMap<>();
		int opcion=0;
		
		do {
			System.out.println("1. - Dar de alta a un socio");
			System.out.println("2. - Dar de baja a un socio");
			System.out.println("3. - Modificar un socio");
			System.out.println("4. - Listar socios por apodo");
			System.out.println("5. - Listar socios por antiguedad");
			System.out.println("6. - Listar socio con alta anterior a un año determinado");
			System.out.println("7. - Salir");
			System.out.print("Respuesta: ");
			opcion = sc.nextInt();
			
			switch(opcion) {
				case 1:
					System.out.println("Apodo:");
					String apodo = sc.nextLine();
					if(!socios.containsKey(apodo)) {
						System.out.println("Nombre:");
						String nombre = sc.nextLine();
						System.out.println("Fecha (YYYY-MM-DD):");
						LocalDate fecha = LocalDate.parse(sc.nextLine());
						socios.put(apodo, new Socio(apodo, nombre, fecha));
						System.out.println("El socio de apodo: "+apodo+" se ha insertado");
					}else {
						System.out.println("El socio de apodo "+apodo+" no se ha insertado");
					}
					break;
				case 2:
					System.out.println("Apodo:");
					apodo = sc.nextLine();
					if(socios.containsKey(apodo)) {
						socios.remove(apodo);
						System.out.println("El socio de apodo "+apodo+" se ha eliminado");
					}else {
						System.out.println("El socio de apodo "+apodo+" no se ha eliminado");
					}
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7: 
					break;
			}
			
		}while(opcion != 7);
	}
}
