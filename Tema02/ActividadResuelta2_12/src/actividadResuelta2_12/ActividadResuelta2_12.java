package actividadResuelta2_12;

import java.util.Scanner;

public class ActividadResuelta2_12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el día: ");
		int dia = sc.nextInt();
		System.out.println("Introduce el mes: ");
		int mes = sc.nextInt();
		System.out.println("Introduce el año: ");
		int anio = sc.nextInt();
		
		if(mes > 12 || mes <=0 || dia > 31 || dia <= 0 || anio == 0) {
			System.out.println("Fecha incorrecta");
		}else {
			switch (mes) {
			case 1,3,5,7,8,10,12:
				if(dia > 31) {
					System.out.println("Fecha incorrecta");
				}
				break;
			case 2:
				if (dia > 28){
					System.out.println("Fecha incorrecta");
				}
				break;
			case 4,6,9,11:
				if(dia > 30) {
					System.out.println("Fecha incorrecta");
				}
				break;
			default:
				System.out.println("La fecha es correcta: " +dia+"/"+mes+"/"+anio);
				break;
				
			}
		}
		

	}

}
