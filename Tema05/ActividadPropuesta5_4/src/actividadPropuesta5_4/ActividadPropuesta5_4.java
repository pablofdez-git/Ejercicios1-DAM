package actividadPropuesta5_4;

public class ActividadPropuesta5_4 {

	public static void main(String[] args) {
		
		int[] array = {3,5,7,8,3,6};
		int clave = 2;
		
		int posicion = buscar(array, clave);
		
		System.out.println("La clave "+clave+ " esta en la posicion "+posicion);

	}
	
	public static int buscar(int[] t, int clave) {
		int resultado = -1;
		
		for(int i = 0; i < t.length; i++) {
			if(t[i] == clave && resultado == -1) {
				resultado = i;
			}
		}
		return resultado;
	}

}
