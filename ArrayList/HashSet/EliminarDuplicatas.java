package ArrayList.HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Eliminando Palavras Duplicadas de um Texto
 * @author Luis
 */
public class EliminarDuplicatas {
    public static void main(String[] args) {
        String texto = "Este é um exemplo de texto texto com palavras repetidas repetidas";
        String[] palavras = texto.split("\\s+");
        Set<String> palavrasUnicas = new HashSet<>(Arrays.asList(palavras));
        System.out.println("Palavras únicas: " + palavrasUnicas);
    }
}

/*
Explicando o código:
O texto é dividido em palavras usando o método split().
Um HashSet chamado palavrasUnicas é criado a partir da lista de palavras.
Como o HashSet não permite duplicatas, as palavras repetidas são automaticamente eliminadas.
O resultado é um conjunto contendo apenas as palavras únicas do texto original.
*/