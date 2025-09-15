package Proxy;

public class ArchivoProxy implements Archivo {
    private ArchivoReal archivoReal;
    private String nombreArchivo;
    private String usuario;

    public ArchivoProxy(String nombreArchivo, String usuario) {
        this.nombreArchivo = nombreArchivo;
        this.usuario = usuario;
    }

    @Override
    public void abrir() {
        if (tienePermiso(usuario)) {
            if (archivoReal == null) {
                archivoReal = new ArchivoReal(nombreArchivo);
            }
            archivoReal.abrir();
        } else {
            System.out.println("Acceso denegado para el usuario: " + usuario);
        }
    }

    private boolean tienePermiso(String usuario) {
        return usuario.equalsIgnoreCase("admin");
    }
}
