package ArrayList.HashSet;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *  Gerando Números Aleatórios Únicos em um Intervalo
 * @author Luis
 */
public class NumerosAleatoriosUnicos {
    public static void main(String[] args) {
        int qtd = 10; // Quantidade de números aleatórios a gerar
        int min = 1; // Valor mínimo do intervalo
        int max = 100; // Valor máximo do intervalo
        
        Set<Integer> numeros = new HashSet<>();
        Random rdm = new Random();
        
        while(numeros.size() < qtd){
            int numeroAleatorio = rdm.nextInt(max - min + 1);
            numeros.add(numeroAleatorio);
        }
        System.out.println("Números aleatórios únicos: " + numeros);
    }
}

/*Explicando o Código:
Um HashSet chamado numeros é criado para armazenar os números aleatórios.
Um objeto Random é usado para gerar números aleatórios.
Um laço while continua até que o conjunto numeros tenha a quantidade desejada de elementos.
Em cada iteração:
Um número aleatório é gerado dentro do intervalo especificado.
O método add() é usado para tentar adicionar o número ao conjunto. Se o número já existir, ele não será adicionado (pois o HashSet garante a unicidade).
O resultado é um conjunto contendo a quantidade desejada de números aleatórios únicos dentro do intervalo.
*/