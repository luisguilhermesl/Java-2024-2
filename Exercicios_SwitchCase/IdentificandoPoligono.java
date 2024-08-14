package exerciciosswitchcase;

import java.util.Scanner;

/**
 * 8. Identificando um Polígono: Crie um programa que recebe o número de lados 
 * de um polígono e exibe seu nome (3: triângulo, 4: quadrado, 5: pentágono, etc.) 
 * usando uma estrutura switch-case.
 * 
 * @author Luis
 */
public class IdentificandoPoligono {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Digite o número de lados de polígono: ");
        int lados = sc.nextInt();

        switch(lados){
            case 3:
                System.out.println("Triângulo");
                break;
            case 4:
                System.out.println("Quadrado ou Retângulo");
                break;
            case 5:
                System.out.println("Pentágono");
                break;
            case 6:
                System.out.println("Hexágono");
                break;
            case 7:
                System.out.println("Heptágono");
                break;
            case 8:
                System.out.println("Octógono");
                break;  
            default:
                System.out.println("Polígono não identificado ou com mais de 8 lados");
        }
    }
}