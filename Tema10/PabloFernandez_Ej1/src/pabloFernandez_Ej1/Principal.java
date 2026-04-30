package pabloFernandez_Ej1;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Scanner;

public class Principal {
	
public static void main(String[] args) {
		
		//Estructura de datos para almacenar las tareas
	    Collection<String> tareas = new LinkedList<>();
	    
	    //Tareas de prueba
	    Tarea t1 = new Tarea(1, "Estudiar para examen de Java", "Estudio", 5) ;
	    Tarea t2 = new Tarea(2, "Hacer ejercicios BBDD", "Estudio", 4);
	    Tarea t3 = new Tarea(3, "Avanzar en el proyecto", "Estudio", 3);
	    Tarea t4 = new Tarea(4, "Limpiar la cocina", "Hogar", 2);
	    Tarea t5 = new Tarea(5, "Hacer la compra", "Hogar", 4);
	    Tarea t6 = new Tarea(6, "Regar las plantas", "Hogar", 1);
	    Tarea t7 = new Tarea(7, "Preparar presentación", "Trabajo", 5);
	    Tarea t8 = new Tarea(8, "Enviar correos pendientes", "Trabajo", 3);
	    Tarea t9 = new Tarea(9, "Actualizar documentación", "Trabajo", 2);

	    //Añadir tareas de prueba al sistema
	    tareas.addAll(tareas);
        

	    
	    
	    //Controlador para conocer el ultimo id usado
	    int controladorId = 9;
	    
	    Scanner sc = new Scanner(System.in);
        int opcion;
	    
	    do {
	    	
	    	System.out.println("\n===== SISTEMA DE GESTIÓN DE TAREAS =====");
	        System.out.println("1. Añadir nueva tarea");
	        System.out.println("2. Marcar tarea como completada");
	        System.out.println("3. Mostrar tareas pendientes");
	        System.out.println("4. Mostrar tareas por categoría");
	        System.out.println("5. Eliminar tareas completadas");
	        System.out.println("6. Mostrar todas las tareas registradas");
	        System.out.println("0. Salir");
	        System.out.println("=======================================");
	        
	        System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea
            
            switch (opcion) {
	            //Añadir tarea
	            case 1:
	            	System.out.println("--- AÑADIR NUEVA TAREA ---");
	            	System.out.println("Introduce la tarea nueva: ");
	            	String nuevaTarea = sc.next();
	            	
	            	
	                System.out.println("Introduce la descripción: ");
	                String nuevaDescripcion = sc.next();
	                System.out.println("Introduce la categoría: ");
	                String nuevaCategoria = sc.next();
	                System.out.println("Introduce la prioridad: ");
	                int prioridad = sc.nextInt();
	                
	                break;
	                
	            //Marcar tarea como completada
	            case 2:
	            	System.out.println("--- COMPLETAR TAREA ---");
	                System.out.println("Introduce el id de la Tarea: ");
	                
	
	                break;
	                
	            //Mostrar tareas pendientes
	            case 3:
	            	System.out.println("--- TAREAS PENDIENTES ---");
	                
	                
	                break;
	                
	            //Mostrar tareas por categoria
	            case 4:
	            	System.out.println("--- TAREAS POR CATEGORÍA ---");
	                

	                break;
	                
	            //Eliminar tareas marcadas como completadas    
	            case 5:
	            	System.out.println("--- ELIMINAR TAREAS COMPLETADAS ---");
	                

	                break;
	                
	            //Mostar todas las tareas registradas
	            case 6:
	            	System.out.println("--- TODAS LAS TAREAS ---");
	                
	                
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
