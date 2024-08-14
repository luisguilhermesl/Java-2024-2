package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Crie um ArrayList de strings, adicione quatro nomes de animais, copie todos os elementos para outro ArrayList e imprima o novo ArrayList.
 * @author Luis
 */
public class CopiarParaOutroArrayList {
    public static void main(String[] args) {
        List<String> animais = new ArrayList<>();
        Collections.addAll(animais, "Cachorro", "Coelho", "Leão");
        
        List<String> copiarAnimal = new ArrayList<>(animais);
        System.out.println("Novo ArrayList de animais: " + copiarAnimal);
    }
}
