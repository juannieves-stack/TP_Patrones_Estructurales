package Flyweigth;

import java.util.HashMap;
import java.util.Map;

public class FabricaDeArboles {
    private Map<String, Arbol> arboles = new HashMap<>();

    public Arbol obtenerArbol(String tipoArbol, String color, String textura) {
        String clave = tipoArbol + "-" +  color + "-" + textura;
        Arbol arbol = arboles.get(clave);
        if (arbol == null) {
            arbol = new ArbolConcreto(tipoArbol, color, textura);
            arboles.put(clave, arbol);
        }
        return arbol;
    }
}
