package Decorator;

public class DescargasOffline  extends DecoradorAbstracto{
    public DescargasOffline(Suscripcion suscripcion) {
        super(suscripcion);
    }
    @Override
    public int precio() {
        return suscripcion.precio() + 700;
    }
}
