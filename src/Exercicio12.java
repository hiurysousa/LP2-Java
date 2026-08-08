import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = scanner.nextInt();

        int contador_numeros = 0;
        int soma = 0;
        while (valor > 0){
            soma += valor;
            contador_numeros++;

            System.out.println("Digite um valor: ");
            valor = scanner.nextInt();
        }
        System.out.printf("Programa encerrado. Try Again!\nSoma: %d e Qtd: %d", soma, contador_numeros);
        scanner.close();
    }
}
