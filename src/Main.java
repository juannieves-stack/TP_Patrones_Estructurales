import Proxy.Archivo;
import Proxy.ArchivoProxy;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n---------Prueba patron proxy----------");
        Archivo archivo1 = new ArchivoProxy("reporte.pdf", "admin");
        archivo1.abrir();

        Archivo archivo2 = new ArchivoProxy("secreto.txt", "juan");
        archivo2.abrir();
    }
}
