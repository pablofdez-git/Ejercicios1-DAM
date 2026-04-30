package complementario2;

public class Producto implements Comparable<Producto> {
	
	private String nombre;
	private int cantidad;
    private double precio;
     
    //Constructor por defecto
    public Producto(String nombre, int cantidad, double precio){
    	this.nombre=nombre;
        this.cantidad=cantidad;
        this.precio=precio;
    }
 
    
	public String getNombre() {
		return nombre;
	}
    
    public int getCantidad() {
        return cantidad;
    }
 
    
    public double getPrecio() {
        return precio;
    }
 
    
    //Devuelve el precio final que tiene un producto
    public double precioFinal(){
        return (this.precio * this.cantidad);
    }
    
    
	@Override
	public int compareTo(Producto o) {
		return nombre.compareTo(o.nombre);
	}
	
    @Override
    public boolean equals(Object o) {
        return nombre.equals(((Producto) o).nombre);
    }

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + "]";
	}


}
