package gestionEmpleados;

public class _Principal {

    public static void main(String[] args) {

        Comercial comercial1 = new Comercial("Carlos", 35, 1200, 250);
        Comercial comercial2 = new Comercial("Ana", 28, 1100, 300);
        Repartidor repartidor1 = new Repartidor("Luis", 23, 1000, Zona.ZONA_3);
        Repartidor repartidor2 = new Repartidor("Marta", 30, 1000, Zona.ZONA_1);

        System.out.println("=== Estado Inicial ===");
        System.out.println(comercial1);
        System.out.println(comercial2);
        System.out.println(repartidor1);
        System.out.println(repartidor2);

        comercial1.plus();
        comercial2.plus();
        repartidor1.plus();
        repartidor2.plus();

        System.out.println("=== Con plus ===");
        System.out.println(comercial1);
        System.out.println(comercial2);
        System.out.println(repartidor1);
        System.out.println(repartidor2);
    }
}
