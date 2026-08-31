package application;
import entities.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Jogo> jogos = new ArrayList<>();

        int opcao = 0;
        do {
            System.out.println("1 - Cadastrar Jogo Físico");
            System.out.println("2 - Exibir Jogos");
            System.out.println("0 - Sair");
            System.out.println("Digite uma opcao: ");
            opcao = sc.nextInt();
            sc.nextLine();
            switch(opcao){
                case 1:
                    System.out.println("Digite o titulo: ");
                    String titulo = sc.nextLine();

                    System.out.println("Digite o preço: ");
                    float preco = sc.nextFloat();

                    sc.nextLine();

                    System.out.println("Digite o lote: ");
                    String lote = sc.nextLine();

                    Jogo jogo = new Fisico(titulo, preco, lote);
                    jogos.add(jogo);
                    break;
                case 2:
                    for (int i = 0; i < jogos.size(); i++){
                        jogos.get(i).exibirJogo();
                    }
                    break;
                case 0:
                    System.out.println("Saiu! ");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

    }
}
