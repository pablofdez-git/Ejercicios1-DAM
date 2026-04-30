package validadorContraseña;

public class Password {

	private int longitud = 8;
	private String contrasenia;
	
	public Password(int longitud) {
		this.setLongitud(longitud);
		this.contrasenia = generarPassword();
	}
	
	public boolean esFuerte() {
		boolean fuerte = false;
		int contadorMayus = 0;
		int contadorMin = 0;
		int contadorNum = 0;
		
		for(int i = 0; i<contrasenia.length();i++) {
			char letra = contrasenia.charAt(i);
			if(Character.isDigit(letra)) {
				contadorNum++;
			}else if(Character.isUpperCase(letra)) {
				contadorMayus++;
			}else if(Character.isLowerCase(letra)) {
				contadorMin++;
			}
		}
		
		if(contadorMayus > 2 && contadorMin > 1 && contadorNum > 3) {
			fuerte = true;
		}
		
		return fuerte;
	}
	
	String generarPassword() {
		/*char[] letras = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
			    'N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
			    'a','b','c','d','e','f','g','h','i','j','k','l','m',
			    'n','o','p','q','r','s','t','u','v','w','x','y','z',
			    '1','2','3','4','5','6','7','8','9'};*/
		String letrasString = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789";
		char[] letras = letrasString.toCharArray();
		int min = 0;
		int max = letras.length;
		int contador =0;
		String contrasenia = "";
		do {
			int aleatorio =(int) (Math.random()*(max - min)) + min;
			contrasenia += letras[aleatorio]; 
			contador++;
		}while(contador < longitud);
		
		return contrasenia;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		if(longitud >= 8) {
			this.longitud = longitud;
		}	
	}

	public String getContrasenia() {
		return contrasenia;
	}

}
