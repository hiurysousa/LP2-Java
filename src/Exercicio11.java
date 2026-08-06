import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[4];
        int[] idades = new int[4];

        for (int i=0; i < nomes.length; i++){
            System.out.println("Nome do " + (i+1) + ": ");
            nomes[i] = scanner.nextLine();
            System.out.println("Idade do " + (i+1) + ": ");
            idades[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("============ DADOS CADASTRADOS ============");
        for (int i=0; i < nomes.length; i++){
            System.out.println("Nome do " + (i+1) + ": " + nomes[i]);
            System.out.println("Idade do " + (i+1) + ": " + idades[i]);
            System.out.println("---------------------------------------");

        }

    }
}
