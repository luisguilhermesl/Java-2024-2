package exerciciosswitchcase;

import java.util.Scanner;

/**
 * 7.Classificação de Alimentos: Crie um programa que recebe o nome de um
 * alimento e exibe sua classificação (fruta, legume, verdura, outro) usando uma
 * estrutura switch-case.
 *
 * @author Luis
 */
public class ClassificacaoDeAlimentos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome de um alimento: ");
        String alimento = sc.nextLine().toLowerCase();

        switch (alimento) {
            case "maçã":
            case "banana":
            case "laranja":
                System.out.println("Classificação: Fruta"); 
                break;
                
            
            
            
        }

    }
}
