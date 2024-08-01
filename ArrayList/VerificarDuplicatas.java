package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * Crie um ArrayList de inteiros, adicione dez números com alguns duplicados, verifique e imprima se há duplicatas na lista.
 * @author Luis
 */
public class VerificarDuplicatas {
    public static void main(String[] args) {
        ArrayList<Integer> numerosComDuplicatas = new ArrayList<>();
        Collections.addAll(numerosComDuplicatas,1,2,3,4,5,6,2,1,7,8,9,9,10);
        
        HashSet<Integer> set = new HashSet<>(numerosComDuplicatas);
        boolean hashDuplicatas = set.size() != numerosComDuplicatas.size();
        
        //Para simplificar mais, eu ainda poderia substituir as duas linhas acima por boolean hasDuplicates = numbersWithDuplicates.size() != new HashSet<>(numbersWithDuplicates).size();

        
        System.out.println("Há duplicatas? " + hashDuplicatas);
    }
}
