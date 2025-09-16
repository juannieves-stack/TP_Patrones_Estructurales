package Bridge;

public class SMSNotificacion implements CanalNotificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando SMS: " + mensaje);
    }
}
