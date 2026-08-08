import java.util.ArrayList;
import java.util.Arrays;

public class Exercicio15 {
    public static void main(String[] args){

        ArrayList<String> cores = new ArrayList(Arrays.asList("Verde", "Amarelo", "Azul", "Branco"));

        for (int i = 0; i < cores.size(); i++){
            System.out.print(cores.get(i) + " ");
        }

        cores.remove(1);
        System.out.println("\n");
        for (int i = 0; i < cores.size(); i++){
            System.out.print(cores.get(i) + " ");
        }
    }
}