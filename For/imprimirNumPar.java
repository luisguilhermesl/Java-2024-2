package For;

/**
 *Crie um programa que imprima os números pares de 0 a 20.
 * @author Luis
 */
public class ImprimirNumPar {
    public static void main(String[] args) {
        for(int i = 0; i<=20; i+=2){
            System.out.println(i);
        }
        
    }
}

/*
O laço for começa com i em 0.
A condição i <= 20 garante que o laço continue enquanto i for menor ou igual a 20.
A cada iteração, i é incrementado em 2 (i += 2), garantindo que apenas números pares sejam impressos.
*/