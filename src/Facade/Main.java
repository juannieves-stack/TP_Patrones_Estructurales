package Facade;

public class Main {
    public static void main(String[] args) {
        TiendaFacade tienda = new TiendaFacade();
        tienda.comprar("Laptop", 999.99, "Av. San Martin 1234, Capital,Mendoza");
    }
}
