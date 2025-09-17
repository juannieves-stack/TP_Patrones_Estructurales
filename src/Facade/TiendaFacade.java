package Facade;

public class TiendaFacade {
    private Carrito carrito;
    private Pago pago;
    private Envio envio;

    public TiendaFacade() {
        this.carrito = new Carrito();
        this.pago = new Pago();
        this.envio = new Envio();
    }

    public void comprar(String producto, double precio, String direccion) {
        carrito.agregarProducto(producto);
        carrito.mostrarCarrito();
        pago.procesarPago(precio);
        envio.coordinarEnvio(direccion);
        System.out.println("¡Compra finalizada con éxito!");
    }
}
