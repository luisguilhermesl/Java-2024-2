package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Crie um ArrayList de strings, adicione cinco nomes de cidades, imprima todas as cidades na lista.
 * @author Luis
 */
public class AdicionarEImprimir {
    public static void main(String[] args) {
        
        
        ArrayList<String> cidades = new ArrayList<>();
        
        cidades.add("Tramandaí");
        cidades.add("Imbé");
        cidades.add("Osório");
        
        System.out.println("Cidades: " + cidades);
        
        
        //# Usando Collections
        /*
        List<String> cidades = new ArrayList<>();
        Collections.addAll(cidades, "Tramandaí", "Imbé", "Capão da Canoa");
        System.out.println("Cidades: " +cidades);
        
        */
        
        
        
        
    }
}
