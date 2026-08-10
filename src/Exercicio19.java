/* Questão 3 (Nível Avançado) — ArrayList + Lógica combinada

Escreva um programa em Java que simule um cadastro de alunos,
usando um ArrayList<String> para armazenar os nomes e um ArrayList<Double>
(ou uma classe Aluno própria, se preferir praticar POO) para armazenar as notas correspondentes. O programa deve:

Permitir que o usuário cadastre um número indefinido de alunos (usando um laço while com opção de "continuar ou não").
Ao final do cadastro, calcular e exibir a média geral da turma.
Listar somente os alunos aprovados (nota ≥ 6.0), exibindo nome e nota.
Identificar e exibir o aluno com a maior nota.

*/

import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio19 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        ArrayList <String> alunos_nome = new ArrayList();
        ArrayList <Double> alunos_nota = new ArrayList();
        String op = "Sim";
        double soma = 0;
        int indice_maior = 0;

        while (op.equalsIgnoreCase("Sim")){
            System.out.println("Nome do aluno: ");
            String nome = scanner.nextLine();
            alunos_nome.add(nome);

            System.out.println("Nota do aluno: ");
            double nota = scanner.nextDouble();
            scanner.nextLine();
            alunos_nota.add(nota);

            System.out.println("Continuar? Sim - Não");
            op = scanner.nextLine();
        }

        for (int i = 0; i < alunos_nota.size(); i++){
            if (alunos_nota.get(i) >= 6.0){
                System.out.println("\nAprovado! ");
            } else {
                System.out.println("\nReprovado! ");
            }
            System.out.printf("Aluno: %s | Nota: %.2f\n" ,alunos_nome.get(i), alunos_nota.get(i));
            soma += alunos_nota.get(i);
        }
        System.out.printf("\nMédia da turma: %.2f", (soma/alunos_nota.size()));
        for (int i = 0; i < alunos_nota.size(); i++){
            if (alunos_nota.get(i) > alunos_nota.get(indice_maior)){
                indice_maior = i;
            }
        }

        System.out.printf("\nAluno com maior nota: %s -> %.2f", alunos_nome.get(indice_maior), alunos_nota.get(indice_maior));
        scanner.close();
    }
}
