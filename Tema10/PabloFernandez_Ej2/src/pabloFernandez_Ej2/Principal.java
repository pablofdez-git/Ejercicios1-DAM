package pabloFernandez_Ej2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	
public static void main(String[] args) {
		
		// Estructura de datos para almacenar el inventario
		List<String>productos = new LinkedList<>();
		
		//Productos de prueba
		Producto p1 = new Producto("Laptop HP", "Electrónica", 899.99, 10);
        Producto p2 = new Producto("Mouse Logitech", "Accesorios", 29.99, 50);
        Producto p3 = new Producto("Monitor Dell", "Electrónica", 249.99, 15);
        Producto p4 = new Producto("Teclado mecánico", "Accesorios", 79.99, 20);
        Producto p5 = new Producto("Auriculares inalámbricos", "Audio", 129.99, 30);

        //Añadir productos de prueba al inventario
        
        

        
        Scanner sc = new Scanner(System.in);
        
        int opcion;
        
        do {
	    	
        	System.out.println("\n====== SISTEMA DE GESTIÓN DE INVENTARIO ======");
            System.out.println("1. Agregar producto al inventario");
            System.out.println("2. Actualizar stock");
            System.out.println("3. Mostrar inventario completo por orden de insercción");
            System.out.println("4. Mostrar productos por categoría (sin identificador)");
            System.out.println("5. Mostrar productos con stock bajo (con identificador)");
            System.out.println("6. Mostrar valor economico total del inventario");
            System.out.println("7. Eliminar productos sin stock");
            System.out.println("0. Salir");
            
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea
            
            switch (opcion) {
	            //Agregar nuevo producto
	            case 1:
	            	System.out.println("\n=== AGREGAR NUEVO PRODUCTO ===");
	            	System.out.println("Nombre del producto: ");
	            	String nombreProducto = sc.next();
	            	
	                
	                           
	                break;
	                
	            //Actualizar stock
	            case 2:
	            	System.out.println("\n=== ACTUALIZAR STOCK ===");
	                
	                	                
	                break;
	                
	            //Mostrar todos los productos del inventario por orden de insercción
	            case 3:
	            	System.out.println("\n=== INVENTARIO COMPLETO ===");
	                
	                
	                break;
	                
	            //Mostrar los productos de una categoria especifica (sin identificador)
	            case 4:
	            	System.out.println("\n=== PRODUCTOS POR CATEGORÍA ===");
	                
	               
	                break;
	                
	            //Mostrar los productos con un stock menor al dado (con identificador)
	            case 5:
	            	System.out.println("\n=== PRODUCTOS CON STOCK BAJO ===");
	            	
	            	
	                break;
	                
	            //Calcular y mostar el coste total del inventario
	            case 6:
	            	System.out.println("\n=== VALOR TOTAL DEL INVENTARIO ===");

	            	
	                break;
	                
	            //Eliminar productos sin stock
	            case 7:
	            	System.out.println("\n=== ELIMINAR PRODUCTOS SIN STOCK ===");
	                
	                
	            	break;
	            
	            //Salir    
	            case 0:
	                System.out.println("¡Hasta pronto!");
	                break;
	                
	            default:
	                System.out.println("Opción no válida. Intente de nuevo.");
	        }
	    	
	    }while(opcion!=0);

	}

}
