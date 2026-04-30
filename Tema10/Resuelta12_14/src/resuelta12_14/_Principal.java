package resuelta12_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class _Principal {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<RegistroTemperatura> registro = new ArrayList<>();	//Utilizar un linkedHashSet
		int respuesta;
		
		do {
			System.out.println("===== Menú =====");
			System.out.println("1- Nuevo Registro");
			System.out.println("2- Listar Registros");
			System.out.println("3- Mostrar Estadística");
			System.out.println("4- Salir");
			System.out.print("Respuesta: ");
			respuesta = sc.nextInt();
			
			switch(respuesta) {
				case 1:
					System.out.print("Introduce la temperatura: ");
					double temp = sc.nextDouble();
					RegistroTemperatura t1 = new RegistroTemperatura(temp);
					registro.add(t1);		
					break;
				case 2:
					System.out.println("=== Contenido Registro ===");
					if(registro.isEmpty()) {
						System.out.println("No hay ninguna temperatura guardada");
					}else {
						for(int i = 0;i<registro.size();i++) {
							System.out.println(registro.get(i));
						}
					}
					break;
				case 3:
					System.out.println("=== Estadistica ===");
					System.out.println("Valor Máximo: "+Collections.max(registro));
					System.out.println("Valor Mínimo: "+Collections.min(registro));
					double suma =0;
					for(RegistroTemperatura t : registro) {
						suma += t.getTemperatura();
					}
					double media = suma / registro.size();
					System.out.println("Media: "+media);
					break;
				case 4:
					System.out.println("Has salido del programa");
					break;
				default:
					System.out.println("Valor inválido");
			}
		}while(respuesta != 4);
		
		
		
	}

}
