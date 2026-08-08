import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\nDigite o primeiro valor para operação: ");
            int n1 = scanner.nextInt();
            System.out.println("\nDigite o segundo valor para operação: ");
            int n2 = scanner.nextInt();
            System.out.println("\n1 - Soma\n2 - Substrair\n0 - Sair");

            opcao = scanner.nextInt();
            if (opcao == 1){
                System.out.printf("\nA soma entre %d e %d é igual a %d", n1, n2, (n1 + n2));
            } else if (opcao == 2){
                System.out.printf("\nA subtração entre %d e %d é igual a %d", n1, n2, (n1 - n2));
            } else {
                System.out.println("\nEncerrando o programa...");
            }
        } while (opcao != 0);

    }
}
