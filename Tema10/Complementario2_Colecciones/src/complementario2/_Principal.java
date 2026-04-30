package complementario2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class _Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Indique la cantidad de productos que se van a escanear: ");
        int numProductos = scanner.nextInt();
        scanner.nextLine();


        List<Producto> listaProductos = new ArrayList<>();

        for (int i = 0; i < numProductos; i++) {
            System.out.println("\n--- Producto " + (i + 1) + " ---");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Cantidad: ");
            int cantidad = scanner.nextInt();

            System.out.print("Precio: ");
            double precio = scanner.nextDouble();
            scanner.nextLine(); 


            listaProductos.add(new Producto(nombre, cantidad, precio));
        }

        System.out.println("\n**********Cantidad***Precio***Total");
        
        double precioFinal = 0.0;


        for (Producto p : listaProductos) {
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