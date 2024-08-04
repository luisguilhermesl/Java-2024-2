package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Crie um ArrayList de inteiros, adicione dez números com alguns duplicados,
 * eemova as duplicatas sem usar estruturas de dados adicionais e imprima a
 * lista.
 *
 * @author Luis
 */
public class RemoverDuplicatas {

    public static void main(String[] args) {
        ArrayList<Integer> numerosComDuplicatas = new ArrayList<>();
        Collections.addAll(numerosComDuplicatas, 1, 2, 3, 4, 5, 2, 3, 9, 7, 4, 1, 2);
        ArrayList<Integer> numerosComDuplicatas2 = new ArrayList<>(numerosComDuplicatas);
        Collections.addAll(numerosComDuplicatas2, 1, 85, 9, 5, 3, 4, 2, 3);
        for (Integer numero : numerosComDuplicatas2) {
            if (!numerosComDuplicatas.contains(numero)) {
                numerosComDuplicatas.add(numero);
            }
        }
        System.out.println("Lista após remover duplicatas: " + numerosComDuplicatas);
    }
}