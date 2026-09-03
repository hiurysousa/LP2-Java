// Escreva um algoritmo que leia dois números e realize a soma de todos os pares que
//estiverem entre os números lidos.

import java.util.Scanner;

public class q03_lista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPar = 0;

        System.out.println("Começo: ");
        int comeco = sc.nextInt();
        System.out.println("Fim: ");
        int fim = sc.nextInt();

        for (int i = comeco; i < fim; i++) {
            if (i % 2 == 0) {
                totalPar += i;
            }
        }
        System.out.printf("A soma total entre os pares de %d a %d é: %d", comeco, fim, totalPar);
    }
}
