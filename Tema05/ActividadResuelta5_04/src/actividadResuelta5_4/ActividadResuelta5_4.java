package actividadResuelta5_4;

public class ActividadResuelta5_4 {

	public static void main(String[] args) {
		
		int numeros[] = {5, 7, 20, 7, 8, 8, 7, 10};
		int maximoValor = maximo(numeros);
		System.out.println(maximoValor);

	}

	public static int maximo(int t[]) {
		int maximo = 0;
		
		for(int i=0;i<t.length;i++) {
			if(t[i]>maximo) {
				maximo = t[i];
			}
		}
		
		return maximo;
	}
}
