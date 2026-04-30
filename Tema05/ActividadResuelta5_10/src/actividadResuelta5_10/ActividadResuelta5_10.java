package actividadResuelta5_10;

import java.util.Arrays;

public class ActividadResuelta5_10 {

	public static void main(String[] args) {
		
		int desordenado [] = {7,5,9,8,4,2,1,6,8,6};
		int valor = 7;
		
		desordenado= eliminarMayores(desordenado, valor);
		System.out.println(Arrays.toString(desordenado));
		System.out.println("--------------------------");
		desordenado= eliminarMayores2(desordenado, valor);
		System.out.println(Arrays.toString(desordenado));

	}
	
	public static int[] eliminarMayores(int t[], int valor) {
		
		int sinMayores[] = new int[0];
		
		for(int i = 0; i<t.length;i++) {
			if(t[i]<valor) {
				sinMayores = Arrays.copyOf(sinMayores, sinMayores.length +1);
				sinMayores[sinMayores.length -1] = t[i];
			}
		}
		
		return sinMayores;
	}
	
	public static int[] eliminarMayores2(int t[], int valor) {
		for(int i = 0; i<t.length;i++) {
			if(t[i]>valor && t[t.length-1]<valor) {
				t[i]=t[t.length-1];
				t = Arrays.copyOf(t,t.length-1);
			}else if(t[i]>=valor&&t[t.length-1]>=valor) {
				t[i] = t[t.length-1];
				t=Arrays.copyOf(t,t.length-1);
				i--;
			}
		}
		return t;
	}
}
