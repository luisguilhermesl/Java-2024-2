package ExHashset;

import java.util.HashSet;
import java.util.Random;

/**
 *
 * @author Luis
 */
public class InteirosAleatorios {
    public static void main(String[] args) {
        HashSet<Integer> numero = new HashSet<>();
        Random ran = new Random();
        for(int i = 0; i < 10; i++){
            numero.add(ran.nextInt(100));
        }
        System.out.println("Tamanho do conjunto: " + numero.size());
        
    }
}
