package Bridge;

public class Promocion extends Notificacion {
    public Promocion(CanalNotificacion canal) {
        super(canal);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        canal.enviar("[PROMOCIÓN] " + mensaje);
    }
}
