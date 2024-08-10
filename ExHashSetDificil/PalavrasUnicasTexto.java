package ExHashSetDificil;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 1.Palavras Únicas de um Texto: Dado um texto, crie um HashSet de 
 * palavras únicas. Em seguida, exiba a contagem de palavras únicas.
 * 
 * @author Luis
 */
public class PalavrasUnicasTexto {
    public static void main(String[] args) {
        String texto = "Este é um texto com palavras repetidas. Este texto serve para contar palavras unicas";
        HashSet<String> palavrasUnicas = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            palavrasUnicas.add(sc.next().toLowerCase().replaceAll("[^a-zA-Z]", ""));
        }
        sc.close();
        System.out.println("Número de palavras únicas: " +palavrasUnicas.size());
    }
}
