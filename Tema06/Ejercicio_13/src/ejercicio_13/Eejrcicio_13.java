package ejercicio_13;

public class Eejrcicio_13 {

	public static void main(String[] args) {
	
		String sentencia = "if (a==3) /* igual a tres */ a++; /* incrementamos a */";
		String apertura = "/*";
		String cierre = "*/";
		int pos=0;
		
		while((pos = sentencia.indexOf(apertura, pos)) != -1) {
			
			 int pos2 = sentencia.indexOf(cierre, pos);
			 
			 if(pos2 == -1) {
				 pos = -1;
			 }else {
				 sentencia = sentencia.substring(0, pos) + sentencia.substring(pos2 + 2);
			 }
			
		}
		
		sentencia.trim();
		System.out.println(sentencia);

	}

}
