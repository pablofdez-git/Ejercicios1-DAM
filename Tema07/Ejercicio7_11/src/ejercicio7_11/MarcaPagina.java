package ejercicio7_11;

public class MarcaPagina {
	
	int pagina;
	
	MarcaPagina(){
		pagina = 1;
	}
	
	void incrementarPagina() {
		pagina++;
	}
	int getPaginaActual() {
		return pagina;
	}
	
	void getUltimaPagina() {
		if(pagina > 1) {
			System.out.println("Tu ultima pagina es" +(pagina -1));
		}else {
			System.out.println("No has empezado");
		}
	}
	
	void irPrincipio() {
		pagina = 1;
	}
	
}
