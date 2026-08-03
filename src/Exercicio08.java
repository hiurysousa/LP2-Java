import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        for (int i = 3; i <= 30; i++){
            if (i % 3 == 0){
                System.out.println("Multiplo de 3: " + i);
            }
        }
    }
}
