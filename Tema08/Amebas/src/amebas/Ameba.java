package amebas;

public class Ameba {
	
	private int peso;

	public Ameba() {
		this.peso = 3;
	}
	
	void come(int pesoComida) {
		if(pesoComida>0) {
			this.peso += (pesoComida -1);
		}
	}
	
	void come(Ameba otra) {
		this.peso += (otra.peso -1);
		otra.setPeso(0);
	}
	
	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Soy una ameba y peso "+peso+" microgramos";
	}
	
	
	
	

}
