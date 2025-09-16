package Bridge;

public class Alerta extends Notificacion {
    public Alerta(CanalNotificacion canal) {
        super(canal);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        canal.enviar("[ALERTA] " + mensaje);
    }
}
