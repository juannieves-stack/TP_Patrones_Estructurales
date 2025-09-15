package Adapter;

public class Main {
    public static void main(String[] args) {

    //Se cargan los libros
    Libro libro1 = new Libro("PDF",40,"Juegos de Guerra");
    Libro libro2 = new Libro("texto",34,"El poder de ahora");
    Libro libro3 = new Libro("PDF",143,"Alas de Sangre");
    Libro libro4 = new Libro("texto",23,"El Corsario");

    //Se pasa el libro y segun su tipo se imprime usando su metodo en particular para cada uno
    //Utilizando un Adapter
    imprimir impresion = new imprimir();
    impresion.imprimirPDF(libro1);
    impresion.imprimirPDF(libro2);
    impresion.imprimirPDF(libro3);
    impresion.imprimirPDF(libro4);

    }
}