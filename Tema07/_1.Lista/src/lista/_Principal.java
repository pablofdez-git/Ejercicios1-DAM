package lista;

public class _Principal {
    public static void main(String[] args) {

        // Crear lista
        Lista l1 = new Lista();

        // Insertar al final
        l1.insertarFinal(10);
        l1.insertarFinal(20);
        l1.insertarFinal(30);
        l1.mostrar();

        // Insertar al principio
        l1.insertarPrincipio(5);
        l1.mostrar();

        // Insertar en posición concreta
        l1.insertar(2, 15);
        l1.mostrar();

        // Obtener elemento
        System.out.println("Elemento en posición 3: " + l1.getElemento(3));

        // Buscar elemento
        System.out.println("Índice del 20: " + l1.buscar(20));
        System.out.println("Índice del 100: " + l1.buscar(100));

        // Eliminar elemento
        System.out.println("Elemento eliminado: " + l1.eliminar(2));
        l1.mostrar();

        // Número de elementos
        System.out.println("Número de elementos: " + l1.getNumeroElementos());

        // Segunda lista
        Lista l2 = new Lista();
        l2.insertarFinal(40);
        l2.insertarFinal(50);
        l2.mostrar();

        // Insertar una lista al final de otra
        l1.insertarFinal(l2);
        l1.mostrar();

        System.out.println("-------------------------");
        // Concatenar listas
        Lista l3 = Lista.concatena(l1, l2);
        l3.mostrar();
        System.out.println("-----------------------------");
    }
}
