package Decorator;

public class HD extends DecoradorAbstracto{
    public HD(Suscripcion suscripcion) {
        super(suscripcion);
    }
    @Override
    public int precio() {
        return suscripcion.precio() + 500;
    }
}


