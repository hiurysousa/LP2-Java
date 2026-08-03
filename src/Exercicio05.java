import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade do candidato: ");
        int idade = scanner.nextInt();
        System.out.println("Digite a altura do candidato: ");
        float altura = scanner.nextFloat();

        if (idade > 18 && altura > 1.60f) {
            System.out.println("Classificado.");
        } else {
            System.out.println("Desclassificado.");
        }
    }
}
