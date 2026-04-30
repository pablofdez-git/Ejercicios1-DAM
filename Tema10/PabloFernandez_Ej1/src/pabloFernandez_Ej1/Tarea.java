package pabloFernandez_Ej1;

public class Tarea implements Comparable<Tarea>{
	
	private int id;
    private String descripcion;
    private String categoria;
    private int prioridad; 		   // 1-5, donde 5 es máxima prioridad
    private boolean completada;

    /*
    *   CONSTRUCTORES
    */

    //Con todos los atributos menos completada, ya que por defecto las tareas al insertarse no estan completadas
    public Tarea(int id, String descripcion, String categoria, int prioridad) {
        this.id = id;
        this.descripcion = descripcion;
        this.categoria = categoria;
        setPrioridad(prioridad);
        this.completada = false;
    }
    
    //Con unicamente el id, que es el atributo necesario para verificar igualdad
    public Tarea(int id) {
        this.id = id;
    }


    /*
    *   GETTERS Y SETTERS
    */
    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPrioridad() {
        return prioridad;
    }

    //Si se introduce una prioridad menor a 1 se da valor 1 al atributo. Si se introduce mayor a 5 se da valor 5
    public void setPrioridad(int prioridad) {
        if (prioridad < 1) {
            this.prioridad = 1;
        } else if (prioridad > 5) {
            this.prioridad = 5;
        } else {
            this.prioridad = prioridad;
        }
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }



    //Compara las tareas por id
    @Override
    public int compareTo(Tarea t) {
    	return Integer.compare(this.id, t.id);
    }

    //Dos tareas son iguales si tienen el mismo id
    @Override
    public boolean equals(Object o) {
    	Tarea t = (Tarea) o;
        return id == t.id;
    }

	@Override
	public String toString() {
		return "Tarea [id=" + id + ", descripcion=" + descripcion + ", categoria=" + categoria + ", prioridad="
				+ prioridad + ", completada=" + completada + "]\n";
	}

}
