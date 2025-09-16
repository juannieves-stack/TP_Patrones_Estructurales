package Bridge;

public class EmailNotificacion implements CanalNotificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando EMAIL: " + mensaje);
    }
}