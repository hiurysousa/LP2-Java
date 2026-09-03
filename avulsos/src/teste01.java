import java.util.Scanner;

public class teste01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        char nossaLetra = 'a';
        int n1 = 2;
        int n2 = 2;

        System.out.println("Digite uma letra: ");
        char letra = sc.next().charAt(0);

        System.out.printf("Letra %s\n", letra);

        if (nossaLetra == letra){ // TIPO PRIMITIVO
            System.out.println("É igual.\n");
        } else {
            System.out.println("Não é igual.\n");
        }


    }
}

