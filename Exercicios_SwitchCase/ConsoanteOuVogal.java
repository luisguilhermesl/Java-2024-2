package exerciciosswitchcase;

import java.util.Scanner;

/**
 * 10. Verificação de Consoante ou Vogal Enunciado: Crie um programa que recebe
 * uma letra e verifica se é uma vogal ou consoante usando uma estrutura
 * switch-case.
 *
 * @author Luis
 */
public class ConsoanteOuVogal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        char letra = sc.next().toLowerCase().charAt(0);
        switch (letra) {
            case 'a', 'e', 'i', 'o', 'u':
                System.out.println("Vogal");
                break;
            default:
                System.out.println("Consoante");
        }
    }
}