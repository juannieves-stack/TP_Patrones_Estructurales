package Adapter;


public class imprimir implements ImpresoraPDF{
    private AdapterImpresion adapterImpresion;

    @Override
    public void imprimirPDF (Libro documento){
        if (documento.getTipo().equals("PDF")){
            System.out.println("Se esta imprimiendo un libro tipo "+documento.getTipo()+" con el titulo \""+documento.getTitulo()+"\" con un numero "+documento.getPaginas()+" de paginas...");
        } else {
            adapterImpresion = new AdapterImpresion();
            adapterImpresion.imprimirPDF(documento);
        }
    }
}
