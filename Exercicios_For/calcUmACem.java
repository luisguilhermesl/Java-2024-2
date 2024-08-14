package For;

/**
 *Escreva um código que calcule a soma dos números de 1 a 100.
 * @author Luis
 */
public class CalcUmACem {
    public static void main(String[] args) {
        int soma = 0;
        for(int i = 1; i <= 100; i++){
            soma +=i;
        }
        System.out.println("A soma dos números de 1 a 100 é " +soma);
        
    }
    
}

/*
A variável soma é inicializada com 0 para armazenar o resultado.
O laço for percorre os números de 1 a 100.
A cada iteração, o valor atual de i é adicionado à variável soma.
Ao final do laço, a variável soma conterá a soma total.
*/