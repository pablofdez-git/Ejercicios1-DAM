package cola;

public class _Principal {

    public static void main(String[] args) {

        // Crear una cola vacía
        Cola cola = new Cola();

        System.out.println("Estado inicial de la cola:");
        cola.mostrar();
        System.out.println("Longitud: " + cola.longitud());
        System.out.println();

        // Encolar elementos
        System.out.println("Encolando elementos 10, 20, 30...");
        cola.encolar(10);
        cola.encolar(20);
        cola.encolar(30);
        cola.mostrar();
        System.out.println("Longitud: " + cola.longitud());
        System.out.println();

        // Consultar el primero sin eliminar
        System.out.println("Elemento primero: " + cola.primero());
        cola.mostrar();
        System.out.println();

        // Desencolar elementos
        System.out.println("Desencolando un elemento: " + cola.desencolar());
        cola.mostrar();
        System.out.println("Desencolando otro elemento: " + cola.desencolar());
        cola.mostrar();
        System.out.println("Elemento primero ahora: " + cola.primero());
        System.out.println();

        // Encolar otro elemento
        System.out.println("Encolando 40...");
        cola.encolar(40);
        cola.mostrar();
        System.out.println();

        // Vaciar la cola
        System.out.println("Vaciando la cola...");
        cola.vaciar();
        cola.mostrar();
        System.out.println("Longitud final: " + cola.longitud());
    }
}
