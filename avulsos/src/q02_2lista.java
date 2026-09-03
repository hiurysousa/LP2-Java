import java.util.Scanner;

public class q02_2lista {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double totalVendas = 0;

        while (true){
            System.out.println("Informe o número do produto (1 a 4, 0 p/ sair): ");

            int produto = sc.nextInt();
            if (produto == 0){
                break;
            }

            System.out.println("Quantidade vendida: ");
            int quantidade = sc.nextInt();
            switch(produto){
                case 1:
                    totalVendas += quantidade * 2.98;
                    break;
                case 2:
                    totalVendas += quantidade * 4.50;
                    break;
                case 3:
                    totalVendas += quantidade * 9.98;
                    break;
                case 4:
                    totalVendas += quantidade * 4.49;
                    break;
                default:
                    System.out.println("Produto Inválido!");
            }
        }
        System.out.printf("Valor total de vendas: R$ %.2f\n", totalVendas);
        sc.close();
    }
}
