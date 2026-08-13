import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args){
        System.out.printf("Soma: %d\n", somar(8, 9));

        int sub = subtrair();
        System.out.printf("Subtração: %d\n", sub);

        parImpar(8);

        System.out.printf("O maior é: %d\n", maior(20, 10));

        System.out.printf("O valor de delta é: %d\n", delta());

        System.out.printf("A temperatura é: %.2f", conversao());
    }

    public static int somar(int a, int b){
        return a + b;
    }

    public static int subtrair(){
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        return n1 - n2;
    }

    public static void parImpar(int n1){
        if (n1 % 2 == 0){
            System.out.printf("%d É par.\n", n1);
        } else {
            System.out.printf("%d É impar.\n", n1);
        }
    }

    public static int maior(int n1, int n2){
        if (n1 > n2){
            return n1;
        } else {
            return n2;
        }
    }

    public static int delta(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a: \n");
        int a = scanner.nextInt();
        System.out.println("Digite b: \n");
        int b = scanner.nextInt();
        System.out.println("Digite c: \n");
        int c = scanner.nextInt();

        return (b*b - (4*a*c));
    }

    public static double conversao(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n1 - Celsius\n2 - Fahrenheit");
        int op = scanner.nextInt();

        System.out.println("\nTemperatura: ");
        double temperatura = scanner.nextDouble();

        switch (op){
            case 1:
                temperatura = (9*temperatura/5)+32;
                break;
            case 2:
                temperatura = 5*(temperatura-32)/9;
                break;
        }
        return temperatura;
    }
}


