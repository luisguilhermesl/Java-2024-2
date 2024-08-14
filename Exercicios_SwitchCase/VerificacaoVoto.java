package exerciciosswitchcase;

import java.util.Scanner;

/**
 *6. Verificação de Voto: Crie um programa que recebe a idade de uma 
 * pessoa e exibe se ela deve votar (opcional, obrigatório, não pode 
 * votar) usando uma estrutura switch-case.
 * @author Luis
 */
public class VerificacaoVoto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        
         switch (idade) {
            case 16:
            case 17:
            case 70:
                System.out.println("Voto opcional.");
                break;
            default:
                if (idade < 16) {
                    System.out.println("Não pode votar.");
                } else if (idade > 70) {
                    System.out.println("Voto opcional.");
                } else {
                    System.out.println("Voto obrigatório.");
                }
        }
    }
}
      