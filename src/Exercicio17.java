/* Questão 1 (Nível Básico) — Vetores + Laços + Condicionais

Escreva um programa em Java que:

Crie um vetor de 10 números inteiros, preenchido pelo usuário via teclado.
Percorra o vetor e classifique cada número como par ou ímpar, exibindo o resultado.
Ao final, exiba a soma de todos os números pares e a soma de todos os números ímpares.

Conceitos praticados: declaração e preenchimento de vetores, laço for, estrutura if/else.

*/

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];
        int soma_par = 0;
        int soma_impar = 0;

        for (int i = 0; i < 10; i++){
            vetor[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++){
            if (vetor[i] % 2 == 0){
                System.out.printf("\n%d -> par", vetor[i]);
                soma_par+=vetor[i];
            } else {
                System.out.printf("\n%d -> impar", vetor[i]);
                soma_impar+=vetor[i];
            }
        }
        System.out.printf("\nSoma Par: %d | Soma Impar: %d", soma_par, soma_impar);
        scanner.close();
    }
}
