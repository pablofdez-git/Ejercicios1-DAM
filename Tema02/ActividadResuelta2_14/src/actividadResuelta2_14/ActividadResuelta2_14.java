package actividadResuelta2_14;

import java.util.Scanner;

public class ActividadResuelta2_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un día: ");
		int dia = sc.nextInt();
		System.out.println("Introduce un mes: ");
		int mes = sc.nextInt();
		System.out.println("Introduce un año: ");
		int anio = sc.nextInt();
		
		if(dia <= 0 || dia > 31 || mes <= 0 || mes > 12) {
			System.out.println("Fecha no válida");
		}else {
			switch (mes) {
			case 1,3,5,7,8,10,12:
				dia +=1;
				if(dia > 31) {
					dia = 1;
					mes +=1;
					if(mes > 12) {
						mes = 1;
						anio +=1;
					}
				}
			System.out.println("La fecha el día siguiente es: " +dia+"/"+mes+"/"+anio);
			break;
			case 2:
				dia +=1;
				if(dia > 28) {
					dia = 1;
					mes +=1;
					if(mes > 12) {
						mes = 1;
						anio +=1;
					}
				}
			System.out.println("La fecha el día siguiente es: " +dia+"/"+mes+"/"+anio);
			break;
			case 4,6,9,11:
				dia +=1;
				if(dia > 30) {
					dia = 1;
					mes +=1;
					if(mes > 12) {
						mes = 1;
						anio +=1;
					}
				}
			System.out.println("La fecha el día siguiente es: " +dia+"/"+mes+"/"+anio);
			break;
			}
		}

	}

}
