package actividadResuelta4_5;

public class ActividadResuelta4_5 {

	public static void main(String[] args) {
		
		char letra = 'a';
		
		boolean esVocal = comprobacionVocal (letra);
		System.out.println("¿Es vocal?: " +esVocal);
		
	}

	public static boolean comprobacionVocal(char letra) {
		boolean esVocal = false;
		
		if(letra == 'A' || letra == 'E'|| letra == 'I' || letra == 'O' || letra == 'U' || letra == 'a' || letra == 'e' || letra == 'i' ||letra == 'o' || letra == 'u') {
			esVocal = true;
		}
		
		return esVocal;
	}
}
