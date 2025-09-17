package Adapter;

public class Libro {
    private String tipo;
    private int paginas;
    private String titulo;

    public Libro(String tipo, int paginas, String titulo) {
        this.tipo = tipo;
        this.paginas = paginas;
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
