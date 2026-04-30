package complementario_1;

import java.util.Scanner;

public class Complementario_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce x1: ");
		int x1 = sc.nextInt();
		System.out.println("Introduce y1: ");
		int y1 = sc.nextInt();
		System.out.println("Introduce x2: ");
		int x2 = sc.nextInt();
		System.out.println("Introduce y2: ");
		int y2 = sc.nextInt();
		System.out.println("Introduce r1: ");
		int r1 = sc.nextInt();
		System.out.println("Introduce r2: ");
		int r2 = sc.nextInt();
		
		double distancia = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1,2));
		
		if(distancia > (r1+r2)) {
			System.out.println("Exteriores");
		}else if (distancia == (r1+r2)) {
			System.out.println("Tangentes exteriores");
		}else if(distancia < (r1+r2)&&distancia < Math.abs(r1-r2)) {
			System.out.println("Secantes");
		}else if(distancia > 0 && distancia < Math.abs(r1-r2)) {
			System.out.println("Interiores");
		}else if (distancia == (r1-r2)) {
			System.out.println("Tangentes interiores");
		}else if (distancia ==0) {
			System.out.println("Concentricas");
		}else {
			System.out.println("error");
		}
		

	}

}
