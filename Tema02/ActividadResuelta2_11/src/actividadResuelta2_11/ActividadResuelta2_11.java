package actividadResuelta2_11;

import java.util.Scanner;

public class ActividadResuelta2_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inbtroduce un numero entre el 1 y el 7: ");
		int numSemana = sc.nextInt();
		
		switch (numSemana) {
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3: 
				System.out.println("Miércoles");
				break;
			case 4:
				System.out.println("Jueves");
				break;
			case 5:
				System.out.println("Viernes");
				break;
			case 6:
				System.out.println("Sábado");
				break;
			case 7:
				System.out.println("Domingo");
				break;
			default:
				System.out.println("El numero tiene que estar entre el 1 y el 7");
				break;
		}
		

	}

}
