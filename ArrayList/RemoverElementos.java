package ArrayList;

import java.util.ArrayList;

/**
 * Crie um ArrayList de inteiros, adicione os números de 1 a 10, remova os números pares da lista, imprima a lista resultante.
 * @author Luis
 */
public class RemoverElementos {
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            numeros.add(i);
        }
        numeros.removeIf(n -> n % 2 == 0);
        System.out.println("Números após remover pares: " +numeros);
    }
}