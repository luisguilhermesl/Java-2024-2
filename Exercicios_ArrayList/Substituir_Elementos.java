package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Crie um ArrayList de strings, adicione cinco nomes de frutas e substitua o terceiro nome por "Morango". Imprima a lista resultante.
 * @author Luis
 */
public class Substituir_Elementos {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        Collections.addAll(frutas, "Maçã","Banana","Uva");
        frutas.set(2,"Morango");
        System.out.println("Lista de frutas após a substituição: " + frutas);  
        
    }
    
}
