import java.util.Scanner;

public class ex02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String nomeCompleto;
        int opcao = 0;

        System.out.println("Digite seu nome: ");
        nomeCompleto = sc.nextLine();

        System.out.println("\n1 - Administrador\n2 - Instrutor\n3 - Aluno");
        opcao = sc.nextInt();

        switch(opcao){
            case 1:
                System.out.printf("Seja bem vindo Admin %s", nomeCompleto);
                break;
            case 2:
                System.out.printf("Seja bem vindo Instrutor %s", nomeCompleto);
                break;
            case 3:
                System.out.printf("Seja bem vindo Aluno %s", nomeCompleto);
                break;
            default:
                System.out.println("Perfil inválido.");
        }
        System.out.printf("\nTamanho do nome: %d", nomeCompleto.length());
        System.out.printf("\nPrimeira letra do nome: %s", Character.toUpperCase(nomeCompleto.charAt(0)));
        System.out.printf("\nÚltima letra do nome: %s", Character.toUpperCase(nomeCompleto.charAt(nomeCompleto.length() - 1)));
    }
}
