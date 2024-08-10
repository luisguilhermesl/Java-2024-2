package ExHashSetDificil;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 *5.Caracteres Únicos em Strings: Dada uma lista de strings, determine o 
 * conjunto de caracteres únicos presentes em todas as strings.
 * 
 * @author Luis
 */
public class CaracteresUnicosString {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("programação","jogos","informatica");
        HashSet<Character> caracUnicos = new HashSet<>();
        
        for(char c : palavras.get(0).toCharArray()){
            caracUnicos.add(c);
        }
        for (int i = 1 ; i < palavras.size(); i++) {
            HashSet<Character> caracAtual = new HashSet<>();
            for (char c : palavras.get(i).toCharArray()) {
                caracAtual.add(c);
            }
            caracUnicos.retainAll(caracAtual);
        }
        System.out.println("Caracteres únicos em todas as palavras: " +caracUnicos);
        }
    }