/* Questão 2 (Nível Intermediário) — Matrizes + Condicionais

Escreva um programa em Java que:

Crie uma matriz 4x4 de números inteiros, preenchida pelo usuário.
Calcule e exiba a soma dos elementos da diagonal principal.


Conceitos praticados: matrizes bidimensionais, laços aninhados (for dentro de for),
lógica condicional mais elaborada.*/

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int soma_diagonal = 0;

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                matriz[i][j] = scanner.nextInt();
                if (i == j){
                    soma_diagonal += matriz[i][j];
                }
            }
        }

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.printf("\nSoma da diagonal: %d", soma_diagonal);
        }

    }
}
