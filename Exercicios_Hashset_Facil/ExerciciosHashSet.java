package ExHashset;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Luis
 */

public class ExerciciosHashSet {
    public static void main(String[] args) {
        Set<String> frutas = new HashSet<>();
        
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Pera");
        frutas.add("Bergamota");
        frutas.add("Maçã");
        frutas.add("Pera");
        
        System.out.println(frutas);
        
        for(String fruta : frutas){
            System.out.println(fruta);
        }
        
        //Verificando se um elemento existe
        if(frutas.contains("Pera")){
            System.out.println("Pera encontrada!");
        }
    }
}
