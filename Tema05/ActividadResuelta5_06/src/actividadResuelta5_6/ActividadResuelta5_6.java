package actividadResuelta5_6;

public class ActividadResuelta5_6 {

	public static void main(String[] args) {
		
		int apuesta [] = {3, 10, 25, 33, 42, 47};
		int ganadora [] = {10, 15, 25, 33, 40, 47};
		
		int aciertos = contarAciertos(apuesta, ganadora);
		
		System.out.println("EL numero de aciertos es: " +aciertos);
		

	}
	/**
	 * Comprueba el numero de aciertos conseguidos en una determinada apuesta
	 * @param array no ordenado con la apuesta a validar
	 * @param array ordenado con la combinacion ganadora
	 * @return numero de aciertos conseguidos
	 */
	public static int contarAciertos(int[] apuesta, int [] ganadora) {
		int aciertos = 0;
		boolean acertado = false;
		
		for(int i = 0; i<apuesta.length;i++) {
			for(int j = 0;j<ganadora.length && !acertado;j++) {
				if(apuesta[i] == ganadora[j]) {
					aciertos++;
					acertado = true;
				}
			}
		}
		
		return aciertos;
	}
}
