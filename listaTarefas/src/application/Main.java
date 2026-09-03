package application;
import entities.*;
import java.util.*;


public class Main {
    public static void main(String[] args){

        ArrayList<Tarefa> tarefas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Exibir Tarefas");
            System.out.println("3 - Remover Tarefa pelo Índice");
            System.out.println("4 - Sair");
            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("Titulo: ");
                    String titulo = sc.nextLine();
                    System.out.println("Descrição: ");
                    String descricao = sc.nextLine();
                    System.out.println("Concluída (sim/não): ");
                    String resposta = sc.nextLine().trim().toLowerCase();
                    boolean concluida = resposta.equals("sim");
                    Tarefa t1 = new Tarefa(titulo, descricao, concluida);
                    tarefas.add(t1);
                    break;
                case 2:
                    for (int i = 0; i < tarefas.size(); i++){
                        System.out.printf("Tarefa %d\n", i);
                        System.out.printf("Titulo: %s\n", tarefas.get(i).getTitulo());
                        System.out.printf("Descrição: %s\n", tarefas.get(i).getDescricao());
                        String statusConclusao = tarefas.get(i).isConcluida() ? "Sim" : "Não";
                        System.out.printf("Concluída: %s\n", statusConclusao);
                        System.out.println("--------------------------------\n");
                    }
                    break;
                case 3:
                    System.out.println("Digite o número da tarefa que deseja remover: ");
                    int indice = sc.nextInt();
                    tarefas.remove(indice);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Inválido !");
            }
        } while (opcao != 4);
    }
}
