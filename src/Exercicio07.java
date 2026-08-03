import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor a ser pago: ");
        double valor = scanner.nextDouble();

        System.out.println("Digite a classificação do cliente: \n1- Cliente Comum \n2 - Funcionário\n3 - VIP");

        int classificacao = scanner.nextInt();

        switch(classificacao){
            case 1:
                System.out.println("Total a pagar: R$ " + valor);
                break;
            case 2:
                System.out.println("Total a pagar: R$ " + (valor-valor*0.1));
                break;
            case 3:
                System.out.println("Total a pagar: R$ " + (valor - valor*0.05));
                break;
            default:
                System.out.println("Inválido.");
        }
    }
}
