package Decorator;

public class UltraHD extends DecoradorAbstracto{
    public UltraHD(Suscripcion suscripcion) {
        super(suscripcion);
    }

    @Override
    public int precio() {
        return suscripcion.precio() + 1000;
    }
}
