import java.util.*;

public class q02_lista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        int opcao = 0;

        do {
            System.out.println("Digite a opção (0 p/ sair): ");
            System.out.println("1 - Cadastrar venda (Produto 1, 2, 3, 4): ");
            System.out.println("2 - Exibir registros: ");
            opcao = sc.nextInt();
            sc.nextLine();
            System.out.println("");
            switch (opcao){
                case 1:
                    int produto;
                    double quantidade;
                    System.out.println("Produto (1 - R$ 2,98 | 2 - R$ 4,50 | 3 - 9,98 | 4 - R$ 4,49): ");
                    produto = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Quantidade: ");
                    quantidade = sc.nextDouble();
                    if (produto == 1){
                        p1 += (2.98*quantidade);
                    } else if (produto == 2){
                        p2 += (4.5*quantidade);
                    } else if (produto == 3){
                        p3 += (9.98*quantidade);
                    } else {
                        p4 += (4.49*quantidade);
                    }
                    break;
                case 2:
                    System.out.printf("\nTotal de Vendas: \n");
                    System.out.printf("Produto 1: %.2f\n", p1);
                    System.out.printf("Produto 2: %.2f\n", p2);
                    System.out.printf("Produto 3: %.2f\n", p3);
                    System.out.printf("Produto 4: %.2f\n", p4);
                    break;
                default:
                    System.out.println("Erro inesperado.");
            }
        } while (opcao != 0);
        sc.close();
    }
}