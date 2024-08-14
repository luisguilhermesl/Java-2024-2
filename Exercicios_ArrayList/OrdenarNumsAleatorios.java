package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Crie um ArrayList de inteiros, adicione dez números aleatórios, ordene a lista em ordem crescente e imprima.
 * @author Luis
 */
public class OrdenarNumsAleatorios {
    public static void main(String[] args) {
        List<Integer> numerosAleatorios = new ArrayList<>();
        Collections.addAll(numerosAleatorios, 34, 12, 89, 45, 67);
        Collections.sort(numerosAleatorios); //sort serve para ordenar crescentemente
        System.out.println("Números ordenador: " + numerosAleatorios);
        
    }
}
