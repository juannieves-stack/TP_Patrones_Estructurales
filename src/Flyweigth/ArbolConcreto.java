package Flyweigth;

public class ArbolConcreto implements  Arbol {
    private final String tipoArbol;
    private final String textura;
    private final String color;

    public ArbolConcreto(String tipoArbol, String textura, String color) {
        this.tipoArbol = tipoArbol;
        this.textura = textura;
        this.color = color;
        System.out.println("Creando objeto para arbol: " + tipoArbol + " " + textura + " " + color);
    }

    @Override
    public void colocar(int x, int y) {
        System.out.println("Colocando el arbol "+ tipoArbol +" de color " + color + " y textura "+ textura + " en posicion (" + x + ", " + y + ")");
    }
}
