import Adapter.Libro;
import Adapter.imprimir;
import Bridge.*;
import Facade.TiendaFacade;
import Proxy.*;
import Decorator.*;
import Flyweigth.*;
import static Decorator.SuscripcionPrinter.imprimir;
import javax.annotation.processing.SupportedSourceVersion;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n---------Prueba patron Adapter----------");

        //Se cargan los libros
        Libro libro1 = new Libro("PDF",40,"Juegos de Guerra");
        Libro libro2 = new Libro("texto",34,"El poder de ahora");
        Libro libro3 = new Libro("PDF",143,"Alas de Sangre");
        Libro libro4 = new Libro("texto",23,"El Corsario");

        //Se pasa el libro y según su tipo se imprime usando su metodo en particular para cada uno
        //Utilizando un Adapter
        imprimir impresion = new imprimir();
        impresion.imprimirPDF(libro1);
        impresion.imprimirPDF(libro2);
        impresion.imprimirPDF(libro3);
        impresion.imprimirPDF(libro4);


        System.out.println("\n---------Prueba patron Bridge----------");

        Notificacion alertaEmail = new Alerta(new EmailNotificacion());
        alertaEmail.enviarMensaje("Servidor caído.");

        Notificacion recordatorioSMS = new Recordatorio(new SMSNotificacion());
        recordatorioSMS.enviarMensaje("Reunión mañana a las 9 AM.");

        Notificacion promoEmail = new Promocion(new EmailNotificacion());
        promoEmail.enviarMensaje("50% de descuento en tu próxima compra!");


        System.out.println("\n---------Prueba patron Decorator----------");

        Suscripcion basica = new PlanBasico();
        imprimir("Básico", basica);

        Suscripcion basicaHD = new HD(new PlanBasico());
        imprimir("Básico + HD", basicaHD);

        Suscripcion basicaUHD = new UltraHD(new PlanBasico());
        imprimir("Básico + UltraHD", basicaUHD);

        Suscripcion basicaHDDesc = new DescargasOffline(new HD(new PlanBasico()));
        imprimir("Básico + HD + Descargas", basicaHDDesc);

        Suscripcion basicaUHDDesc = new DescargasOffline(new UltraHD(new PlanBasico()));
        imprimir("Básico + UltraHD + Descargas", basicaUHDDesc);


        System.out.println("\n---------Prueba patron Facade----------");

        TiendaFacade tienda = new TiendaFacade();
        tienda.comprar("Laptop", 999.99, "Av. San Martin 1234, Capital,Mendoza");



        System.out.println("\n---------Prueba patron Flyweigth----------");

        FabricaDeArboles fabrica = new FabricaDeArboles();
        String fila = "Pino Roble Pino Abedul Pino";

        int x = 0;
        for (String nombre : fila.split(" ")) {
            String textura, color;
            switch (nombre) {
                case "Pino"   -> { textura = "aguja";    color = "Verde"; }
                case "Roble"  -> { textura = "hoja";     color = "Marrón"; }
                case "Abedul" -> { textura = "fina";     color = "Verde Claro"; }
                default       -> { textura = "default";  color = "Gris"; }
            }
            Arbol arbol = fabrica.obtenerArbol(nombre, textura, color);
            arbol.colocar(x, 10);
            x += 10;
        }
        

        System.out.println("\n---------Prueba patron Proxy----------");

        Archivo archivo1 = new ArchivoProxy("reporte.pdf", "admin");
        archivo1.abrir();

        Archivo archivo2 = new ArchivoProxy("secreto.txt", "juan");
        archivo2.abrir();

    }
}

