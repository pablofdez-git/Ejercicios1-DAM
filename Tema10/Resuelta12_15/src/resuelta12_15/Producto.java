package resuelta12_15;

public class Producto {
	
	private String codigo;
	private int stock;
	
	public Producto(String codigo, int stock) {
		this.codigo = codigo;
		this.stock = stock;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Producto [codigo=" + codigo + ", stock=" + stock + "]";
	}
	

}
