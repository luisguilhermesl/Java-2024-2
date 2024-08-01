package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Crie um ArrayList de strings, adicione cinco nomes de países, use um loop for com índice para imprimir cada país na lista.
 * @author Luis
 */
public class IterarComIndice {
    public static void main(String[] args) {
        ArrayList<String> paises = new ArrayList<>();
        Collections.addAll(paises, "Brasil","Argentina","Chile");
        for(int i=0; i < paises.size(); i++){
            System.out.println("País " + (i+1) + ":" + paises.get(i));
        }
                
    }
}
