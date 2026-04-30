package complementario1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Double> notas = new ArrayList<>();
		
		double respuesta = 0.0;
		
		do {
			System.out.print("Introduce un número: ");
			respuesta = sc.nextDouble();
			if(respuesta != -1 && respuesta >= 0 && respuesta <= 10) {
				notas.add(respuesta);
			}else {
				System.out.println("Entre 0 y 10");
			}
		}while(respuesta >=0 || notas.size() < 5);
		
		System.out.println("Notas: ");
		for(int i = 0;i<notas.size();i++) {
			System.out.println("Nota "+(i+1)+ ": "+notas.get(i));
		}
		
		System.out.println("La tercera nota es: "+notas.get(2));
		
		System.out.println("Modificar la cuarta nota");
		System.out.print("Introduce la nueva nota: ");
		double nueva = sc.nextDouble();
		notas.set(3, nueva);
		System.out.println(notas);
		
		double suma = 0;
		
		for(int i = 0;i<notas.size();i++) {
			suma += notas.get(i);
		}
		
		double media = suma / notas.size();
		System.out.println("La media es: " +media);
		

	}

}
