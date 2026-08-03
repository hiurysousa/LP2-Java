import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para saber o dia da semana: ");
        int opcao = scanner.nextInt();
        switch(opcao){
            case 1:
                System.out.println("Domingo.");
                break;
            case 2:
                System.out.println("Segunda-feira.");
                break;
            default:
                System.out.println("Inválido.");
        }
    }
}
