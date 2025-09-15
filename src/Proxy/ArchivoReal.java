package Proxy;

public class ArchivoReal implements  Archivo{
    private String archivo;

    public ArchivoReal(String archivo) {
        this.archivo = archivo;
        abrirArchivoDeDisco();
    }

    private void abrirArchivoDeDisco() {
        System.out.println("Se cargo desde el disco el archivo: " + archivo);
    }

    @Override
    public void abrir() {
        System.out.println("Se muestra el archivo: " + archivo);
    }
}
