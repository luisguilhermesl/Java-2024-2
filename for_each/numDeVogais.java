package for_each;
import java.util.Scanner; //Importa a classe Scanner para ler a entrada do usuário.

/**
 *Utilize “for-each" para contar o número de vogais em uma string fornecida pelo usuário.
 * 
 * @author Luis
 */
public class NumDeVogais {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //Cria um objeto input da classe Scanner para ler a entrada do usuário.
        
        System.out.println("Digite uma frase: "); //Solicita ao usuário que digite uma frase.
        String frase = teclado.nextLine().toLowerCase(); // Lê a frase digitada, converte para minúsculas e armazena na variável frase. 
        
        int contadorVogais = 0; //Cria uma variável contadorVogais para armazenar a quantidade de vogais e a inicializa com 0.
        
        //frase.toCharArray()converte a string frase em um array de caracteres e o laço "for-each" percorre cada caractere (letra) no array.
        for(char letra : frase.toCharArray()){  
                                                
            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){ //Verifica se o caractere atual (letra) é uma vogal (a, e, i, o, u).
                contadorVogais++; //Se for uma vogal, incrementa o contadorVogais
            }
        }
        System.out.println("A frase contém " + contadorVogais + " vogais." ); //Imprime a quantidade de vogais encontradas na frase.
        teclado.close(); //Fecha o objeto Scanner para liberar os recursos.
    }
}
