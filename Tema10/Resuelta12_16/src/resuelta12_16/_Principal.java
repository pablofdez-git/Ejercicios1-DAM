package resuelta12_16;

import java.util.*;

public class _Principal {

	public static void main(String[] args) {
		
		Map<Character, Academico> academia = new TreeMap<>();
		
		Academico a1 = new Academico("Mario", 2010);
		Academico a2 = new Academico("Sofia", 2004);
		Academico a3 = new Academico("Jorge", 1997);
		Academico a4 = new Academico("Pedro", 1996);
		Academico a5 = new Academico("Laura",2006);
		
		nuevoAcademico(academia, a1, 'M');
		nuevoAcademico(academia, a2, 'S');
		nuevoAcademico(academia, a3, 'J');
		nuevoAcademico(academia, a4, 'P');
		nuevoAcademico(academia, a5, 'L');
		
		
		
		

	}
	
	public static boolean nuevoAcademico(Map<Character, Academico> academia, Academico nuevo, Character letra) {
		boolean insertado = false;
		if(Character.isLetter(letra)) {
			academia.put(letra, nuevo);
			insertado = true;
		}else {
			System.out.println("EL caracter no es una letra");
		}
		
		return insertado;
	}

}
