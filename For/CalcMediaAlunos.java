package For;

import java.util.Scanner;

/**
 *Calcular a média de notas de um aluno
 * @author Luis
 */
public class CalcMediaAlunos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Quantas notas você deseja inserir? ");
        
        int qtdNotas = teclado.nextInt();
        double somaNotas = 0;
        
        for(int i=1; i <= qtdNotas; i++){
            System.out.println("Digite a nota do aluno " +i+ ": ");
            double nota = teclado.nextDouble();
            somaNotas += nota;
        }
        double media = somaNotas / qtdNotas;
        System.out.println("A média das notas dos alunos é: "+ media);
        teclado.close();
    }
}
