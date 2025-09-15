package Adapter;

public class AdapterImpresion implements ImpresoraPDF{
    private ImpresoraDeTexto impresionTexto;
    public AdapterImpresion (){
        impresionTexto = new ImpresoraDeTexto();
    }
    @Override
    public void imprimirPDF(Libro documento){
        if (documento.getTipo().equals("texto")){
            impresionTexto.imprimirTexto(documento.getTipo(), documento.getTitulo(), documento.getPaginas());
        }else {
            System.out.println("Tipo de archivo :\""+documento.getTipo()+"\" desconocido para esta impresora");
        }
    }
}
