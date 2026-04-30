package pabloFernandez_TareaTema6;

import java.util.Scanner;

public class PabloFernandez_TareaTema6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Declaración de variables
		String sufijo = "aca";
		int respuesta;
		char numeros [] = {'0','1','2','3','4'};
		char vocales [] = {'a','e','i','o','u'};
		
		//Solicitud de datos
		System.out.print("Introduce una palabra: ");
		String palabraUser = sc.next().toLowerCase();
		int longitud = palabraUser.length();

		//Seleccion del programa
		System.out.println("Introduce 1 para encriptar");
		System.out.println("Introduce 2 para desencriptar");
		respuesta = sc.nextInt();
		respuesta = validador(respuesta);
		
		//Para realizar la selección
		if(respuesta == 1) {
			String palabraEncriptada = encriptador(palabraUser, numeros, vocales, sufijo, longitud);
			System.out.println("Encriptada: " +palabraEncriptada);
		}else if(respuesta == 2) {
			String palabraDesencriptada = desencriptador(palabraUser, numeros, vocales, sufijo);
			System.out.println("Desencriptada: "+ palabraDesencriptada);
		}
				
	}
	/**
	 * Funcion que encripta las palabras cambiando las vocales por numeros
	 * @param palabra a encriptar
	 * @param numeros array con los numeros para sustituir las vocales
	 * @param vocales array con vocales a sustituir
	 * @param sufijo para el final de la palabra
	 * @param longitud longitud total de la palabra
	 * @return la palabra encriptada
	 */
	public static String encriptador(String palabra, char numeros[], char vocales[], String sufijo, int longitud) {
		//Se invierte la palabra
		palabra = invertir(palabra);
		
		//Recorremos el array vocales y remplazamos cada vocal por un numero del array de numeros
		for(int i = 0; i<vocales.length;i++) {
			palabra = palabra.replace(vocales[i], numeros[i]);
		}
		
		//Añadimos el sufijo y la longitd
		palabra = palabra + sufijo + longitud;
		return palabra;
	}
	/**
	 * Funcion que desencripta las palabras cambiando los numeros por vocales
	 * @param palabra a desencriptar
	 * @param numeros array con los numeros a sustituir 
	 * @param vocales array con vocales para sustituir los nuermos
	 * @param sufijo para quitarlo de la palabra
	 * @return la palabra desencriptada
	 */
	public static String desencriptador(String palabra, char numeros[], char vocales[], String sufijo) {
		//Nos quedamos solo con lo que esta antes del sufijo
		String aux [] = palabra.split(sufijo);
		palabra = aux[0];
		
		//Se invierte la palabra
		palabra = invertir(palabra);

		//Recorremos el array numeros y remplazamos cada numero por una vocal del array de vocales
		for(int i = 0; i<numeros.length;i++) {
			palabra = palabra.replace(numeros[i], vocales[i]);
		}
		//palabra = palabra.substring(0).toUpperCase() + palabra.substring(1,palabra.length());
		return palabra;
	}
	/**
	 * Funcion para invertir una palabra
	 * @param cadena recibe la cadena a invertir
	 * @return devuelve la palabra invertida
	 */
	public static String invertir(String cadena) {
		String invertido = "";
		for(int i = cadena.length()-1 ; i>=0;i--) {
			char letra = cadena.charAt(i);
			
			invertido += letra; 
			
		}
		return invertido;
	}
	/**
	 * Funcion que valida que la respuesta tenga los valores requeridos
	 * Se ejecuta hasta que sea uno de los valores requeridos
	 * @param respuesta recibe el valor del usuario
	 * @return retorna el valor deseado 1 o 2
	 */
	public static int validador(int respuesta) {
		Scanner sc = new Scanner(System.in);
		while(respuesta < 1 || respuesta > 2) {
			System.out.println("Error. Solo se pueden 1 o 2");
			System.out.print("Vuelve a introducir un valor: ");
			respuesta = sc.nextInt();
		}
		return respuesta;
	}
	

}
