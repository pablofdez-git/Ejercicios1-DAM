package complementario_1;

import java.util.Scanner;

public class Complementario_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int horas [][] = new int [4][5];
		String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Vieres"};
		
		
		System.out.println("====== Introduce las horas trabajadas ======");
		for(int empleados = 0; empleados<4;empleados++) {
			for(int dias = 0; dias<5;dias++) {
				System.out.print("Empleado " +(empleados+1)+", Día " +(dias+1)+": ");
				horas [empleados][dias]= sc.nextInt();
			}
		}
		
		System.out.println("====== Horas trabajadas ======");
		
		for(int empleados = 0; empleados <4;empleados++){
			//System.out.print("Empleado "+empleados);
            for(int dias = 0; dias<5;dias++){
                System.out.print(horas[empleados][dias]+" ");
            }
            System.out.println();
        }
        
		System.out.println("====== Total de horas por empleado ======");
		int horasEmpleado = 0;
		int horasMax = 0;
		int empleadoMax = 1;
		for(int empleado = 0; empleado < 4; empleado++) {
			for(int dia = 0; dia < 5; dia++) {
				horasEmpleado += horas[empleado][dia];
			}
			
			System.out.println("Empleado " +(empleado+1)+": "+horasEmpleado);
			
			if(horasEmpleado > horasMax) {
				horasMax = horasEmpleado;
				empleadoMax = (empleado+1);
			}
			empleadoMax = 0;
			
		}
		
		System.out.println("====== Total de horas por día ======");
		int totalHorasDia = 0;
		
		for(int dia = 0; dia < 5; dia++) {
			for(int empleado = 0; empleado < 4; empleado++) {
				totalHorasDia += horas[empleado][dia];
			}
			
			System.out.println(diasSemana[dia] + ": " + totalHorasDia);;
		}
		
		System.out.println("El empleado que trabajó más horas en total es el emplado "+empleadoMax+" con "+horasMax+" horas");

	}

}
