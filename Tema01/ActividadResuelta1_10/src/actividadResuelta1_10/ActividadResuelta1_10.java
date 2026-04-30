package actividadResuelta1_10;

import java.util.Scanner;

public class ActividadResuelta1_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Esta lloviendo? ");
		boolean lloviendo = sc.nextBoolean();
		System.out.println("¿Has terminado la tarea? ");
		boolean terminadoTareas = sc.nextBoolean();
		System.out.println("¿Vas a ir a la biblioteca? ");
		boolean biblioteca = sc.nextBoolean();
		
		/*
		boolean salir = (!lloviendo && terminadoTareas) || biblioteca;
		System.out.println("¿Puedes salir?" +salir);
		*/
		
		String puedoSalir = (!lloviendo && terminadoTareas) || biblioteca ? "Si" : "No";
		System.out.println("¿Puedo salir? " +puedoSalir);

	}

}
