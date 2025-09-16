import Proxy.Archivo;
import Proxy.ArchivoProxy;
import Decorator.*;
import static Decorator.SuscripcionPrinter.imprimir;
import javax.annotation.processing.SupportedSourceVersion;
import java.sql.SQLOutput;




public class Main {
    public static void main(String[] args) {

        System.out.println("\n---------Prueba patron proxy----------");
        Archivo archivo1 = new ArchivoProxy("reporte.pdf", "admin");
        archivo1.abrir();

        Archivo archivo2 = new ArchivoProxy("secreto.txt", "juan");
        archivo2.abrir();

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

        Suscripcion combinacionExtraña = new UltraHD(new HD(new PlanBasico()));
        imprimir("Básico + HD + UltraHD (ejemplo técnico)", combinacionExtraña);
    }
}

