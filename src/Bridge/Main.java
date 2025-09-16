package Bridge;

public class Main {
    public static void main(String[] args) {
        Notificacion alertaEmail = new Alerta(new EmailNotificacion());
        alertaEmail.enviarMensaje("Servidor caído.");

        Notificacion recordatorioSMS = new Recordatorio(new SMSNotificacion());
        recordatorioSMS.enviarMensaje("Reunión mañana a las 9 AM.");

        Notificacion promoEmail = new Promocion(new EmailNotificacion());
        promoEmail.enviarMensaje("50% de descuento en tu próxima compra!");
    }
}