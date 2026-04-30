package ejercicio7_17;

public class Cifrador {
	
	public static String cifrado(String palabra, int desplazamiento) {
		String resultado="";
		
		for(int i = 0;i<palabra.length();i++) {
			char letra = palabra.charAt(i);
			
			if(Character.isLowerCase(letra)) {
				char cifrada = (char) ((letra - 'a' + desplazamiento) % 26 + 'a');
				resultado += cifrada;
			}else if(Character.isUpperCase(letra)) {
				char cifrada = (char) ((letra - 'A' + desplazamiento) % 26 + 'A');
				resultado += cifrada;
			}else {
				resultado += letra;
			}
		}
		
		return resultado;
	}

}
