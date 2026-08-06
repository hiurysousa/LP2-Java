import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 1;
        System.out.println("Digite a quantidade de repetições: ");
        int qtd = scanner.nextInt();

        while (i < qtd){
            System.out.println(i + " * " + qtd + " = " + i*qtd);
            i++;
        }
    }
}
