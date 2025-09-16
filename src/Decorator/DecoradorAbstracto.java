package Decorator;

abstract class DecoradorAbstracto implements Suscripcion {
    protected Suscripcion suscripcion;

    public DecoradorAbstracto(Suscripcion suscripcion) {
        this.suscripcion = suscripcion;
    }

    @Override
    public int precio() {
        return suscripcion.precio();
    }
}
