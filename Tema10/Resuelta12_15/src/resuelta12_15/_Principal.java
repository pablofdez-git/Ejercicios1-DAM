package resuelta12_15;

import java.util.HashMap;
import java.util.Scanner;

public class _Principal {

	public static void main(String[] args) {
	
		HashMap<String, Producto> tienda = new HashMap<>();
		
		Scanner sc = new Scanner(System.in);
		
		int opcion;
		
		do {
			System.out.println("\n1. Alta producto");
            System.out.println("2. Baja producto");
            System.out.println("3. Actualizar stock");
            System.out.println("4. Mostrar productos");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch(opcion) {
            	case 1:
            		System.out.print("Introduce el codigo: ");
            		String codigo = sc.nextLine();
            		System.out.print("Introduce el stock incial: ");
            		int stock = sc.nextInt();
            		
            		tienda.put(codigo, new Producto(codigo, stock));
            		break;
            	case 2:
            		System.out.print("Introduce el codigo a eliminar: ");
            		codigo = sc.nextLine();
            		tienda.remove(codigo);
            		break;
            	case 3:
            		System.out.println("Introduce el codigo: ");
            		codigo = sc.nextLine();
            		
            		if(tienda.containsKey(codigo)) {
            			System.out.print("Nuevo stock: ");
            			stock = sc.nextInt();
            			
            			tienda.get(codigo).getStock();
            		}else {
            			System.out.println("No existe el producto");
            		}
            		break;
            }
            
		}while(opcion != 0);
		
	}

}
