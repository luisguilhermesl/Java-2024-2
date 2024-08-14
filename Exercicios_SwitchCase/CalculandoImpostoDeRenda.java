package exerciciosswitchcase;

import java.util.Scanner;

/**
 * 9. Calculando Imposto de Renda: Enunciado: Crie um programa que recebe um 
 * salário e calcula o imposto de renda com base em faixas de valores usando 
 * uma estrutura switch-case.
 * 
 * @author Luis
 */
public class CalculandoImpostoDeRenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite o seu salário: ");
        double salario = sc.nextDouble();
        
        int faixa = 0;
        
        if(salario <= 1.900){
            faixa = 0;
        }else if(salario <= 2.800){
            faixa = 1;
        }else if (salario <= 3.900){
            faixa = 2;
        }else if (salario <= 4.680){
            faixa = 3;
        }else{
            faixa = 4;
        }
        
        switch(faixa){
            case 0:
                System.out.println("Isento de imposto de renda.");
                break;
            case 1:
                System.out.println("Imposto de renda: 7.5%");
                break;
            case 2:
                 System.out.println("Imposto de renda: 15%");
                break;
            case 3:
                 System.out.println("Imposto de renda: 22.5%");
                break;
            case 4:
                 System.out.println("Imposto de renda: 27.5%");
                break;
            default:
                System.out.println("Faixa de imposto de renda não encontrada");
        }
    }
}