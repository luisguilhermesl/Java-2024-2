package For;

/**
 *Desenvolva um programa que inverta uma string.
 * @author Luis
 */
public class InverterString {
    public static void main(String[] args) {
        String original = "Luis"; //A string original armazena a string a ser invertida.
        String invertida = ""; //A string invertida é inicializada como vazia para armazenar o resultado.
        
        /*
        O laço for percorre a string original de trás para frente (começando do último índice 
        original.length() - 1 e indo até o índice 0). A cada iteração, o caractere na posição i 
        da string original é adicionado ao início da string invertida.
        */
        for(int i = original.length() - 1; i >= 0; i--){
            invertida += original.charAt(i);
        }
        
        System.out.println("String original: " + original);
        System.out.println("String invertida: " + invertida);
    }
}
