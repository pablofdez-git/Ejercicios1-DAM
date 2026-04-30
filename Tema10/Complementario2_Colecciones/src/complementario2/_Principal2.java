package complementario2;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class _Principal2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Indique la cantidad de productos que se van a escanear: ");
        int numProductos = sc.nextInt();
        sc.nextLine();

        Map<String, Producto> mapaProductos = new HashMap<>();

        for (int i = 0; i < numProductos; i++) {
            System.out.println("\n--- Producto " + (i + 1) + " ---");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Cantidad: ");
            int cantidad = sc.nextInt();

            System.out.print("Precio: ");
            double precio = sc.nextDouble();
            sc.nextLine();

            Producto nuevoProducto = new Producto(nombre, cantidad, precio);
            
            
            mapaProductos.put(nombre.toLowerCase(), nuevoProducto);
        }

        System.out.println("\n**********Cantidad***Precio***Total");
        
        double precioFinal = 0.0;

        for (Producto p : mapaProductos.values()) {
            double totalProducto = p.precioFinal();
            precioFinal += totalProducto;

            System.out.printf("%-13s%-12d%-9.1f%s\n", 
                    p.getNombre(), 
                    p.getCantidad(), 
                    p.getPrecio(), 
                    totalProducto);
        }

        System.out.printf("%-34s%s\n", "Precio final", precioFinal);

    }
}