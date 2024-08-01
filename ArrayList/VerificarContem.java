package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Crie um ArrayList de strings, adicione três cores ("Vermelho", "Verde", "Azul"), verifique se a cor "Amarelo" está na lista e imprima o resultado.
 * @author Luis
 */
public class VerificarContem {
    public static void main(String[] args) {
        
        List<String> cores = new ArrayList<>();
      //  Collections.addAll(cores, "Vermelho","Azul","Marrom");
        cores.add("Vermelho");
        cores.add("Azul");
        cores.add("Marrom");
        System.out.println("Contém Amarelo? " + cores.contains("Amarelo"));
    }
}
