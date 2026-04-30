package complementario3;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, String> diccionario = new TreeMap<>();
		int opcion = 1;
		
		do {
			System.out.println(" ====== Gestion de Diccionario ======");
			System.out.println("1. Añadir nueva entrada");
			System.out.println("2. Modificar palabra");
			System.out.println("3. Listado en orden alfabético atendiendo a las palabras en español");
			System.out.println("4. Listado en orden alfabético atendiendo a las palabras en inglés");
			System.out.println("5. Mostrar aquellas palabras en ingles, contenidas en el diccionario, que empiecen por una letra determinada");
			System.out.println("0. Salir");
			System.out.print("Respuesta: ");
			opcion = sc.nextInt();
			
			switch(opcion) {
				case 1:
					System.out.print("Introduce una nueva palabra en Español: ");
					String esp = sc.next().toLowerCase();
					if(diccionario.containsKey(esp)) {
						System.out.println("Error: La palabra ya esta dentro del diccionario");
					}else {
						System.out.print("Introduce la traduccion de la palabra en Ingles: ");
						String ing = sc.next().toLowerCase();
						diccionario.put(esp, ing);
						System.out.println("Palabra "+esp+" añadida con su traduccion "+ing);
					}
					break;
				case 2:
					System.out.print("Introduce la palabra para modificar su traduccion: ");
					String espMod = sc.next().toLowerCase();
					if(diccionario.containsKey(espMod)) {
						System.out.print("Introduce la nueva traduccion de la palabra: ");
						String nuevoIng = sc.next().toLowerCase();
						diccionario.replace(espMod, nuevoIng);
						System.out.println("La palabra "+espMod+" se ha modificado con exito");
					}else {
						System.out.println("Error: La palabra no se encuentra dentro del diccionario");
					}
					break;
				case 3:
					System.out.println("Diccionario ordenado por Español");
					if(diccionario.isEmpty()) {
						System.out.println("El diccionario esta vacío");
					}else {
						for(String esp1 : diccionario.keySet()) {
							String ing = diccionario.get(esp1);
							System.out.println("Español: "+esp1+" e Ingles: "+ing);
						}
					}
					break;
				case 4:
					
					break;
				case 5:
					
					break;
				case 0:
					System.out.println("Saliendo");
					break;
			}
		}while(opcion != 0);

	}

}
