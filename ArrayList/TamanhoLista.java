package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Crie um ArrayList de caracteres, adicione quatro letras e imprima o tamanho da lista.
 * @author Luis
 */
public class TamanhoLista {
    public static void main(String[] args) {
        
        ArrayList<Character> letras = new ArrayList<>();
        //Collections.addAll(letras, 'A', 'B', 'C', 'D');
        letras.add('A');
        letras.add('B');
        letras.add('C');
        letras.add('D');
        System.out.println("Tamanho da Lista: " + letras.size());
    }
    
}
