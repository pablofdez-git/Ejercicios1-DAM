package actividadResuelta6_5;

public class ActividadResuelta6_5 {

	public static void main(String[] args) {

		String cadenaOrdenada = "odnum aloH";
		String cadenaDesordenada = invertir(cadenaOrdenada);
		
		System.out.println(cadenaDesordenada);

	}
	public static String invertir(String cadena) {
		String invertido = "";
		for(int i = cadena.length()-1 ; i>=0;i--) {
			char letra = cadena.charAt(i);
			
			invertido += letra; 
			
		}
		return invertido;
	}

}
