package Bridge;

public class Recordatorio extends Notificacion {
    public Recordatorio(CanalNotificacion canal) {
        super(canal);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        canal.enviar("[RECORDATORIO] " + mensaje);
    }
}
