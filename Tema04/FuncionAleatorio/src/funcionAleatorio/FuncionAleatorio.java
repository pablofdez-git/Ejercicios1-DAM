package funcionAleatorio;

public class FuncionAleatorio {

	public static void main(String[] args) {
		
		int maximo = 100;
		int minimo = 1;

		System.out.println(aleatorios(maximo, minimo));
		
	}
	
	public static int aleatorios(int max, int min) {
		int aleatorio;
		
		aleatorio = (int)(Math.random()*(max-min+1))+min;
		
		
		return aleatorio;
	}

}
