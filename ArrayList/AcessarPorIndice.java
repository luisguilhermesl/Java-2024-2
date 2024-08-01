package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Crie um ArrayList de doubles, adicione cinco números decimais, acesse e
 * imprima o terceiro elemento da lista.
 *
 * @author Luis
 */
public class AcessarPorIndice {

    public static void main(String[] args) {
        List<Double> decimais = new ArrayList<>();
       // Collections.addAll(decimais, 1.1,2.2,3.3,4.4,5.5);
        decimais.add(1.1);
        decimais.add(2.2);
        decimais.add(3.3);
        decimais.add(4.4);
        decimais.add(5.5);

        System.out.println("Terceiro elemento: " + decimais.get(2));
    }

}
