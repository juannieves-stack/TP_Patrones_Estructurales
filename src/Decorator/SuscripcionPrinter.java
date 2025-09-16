package Decorator;

public class SuscripcionPrinter {
    public static void imprimir(String nombre, Suscripcion s) {
        System.out.println(nombre + " -> Precio: $" + s.precio());
    }
}
