/*Exercício 2: Estrutura de Decisão (If/Else)
Objetivo: Aplicar lógica condicional.
Tarefa: Utilizando a média calculada no Exercício 1, incremente seu código para que:
Se a média for maior ou igual a 7, o programa imprima: "Status: Aprovado".
Se a média for entre 5 (inclusive) e 7 (exclusive), imprima: "Status: Recuperação".
Caso contrário, imprima: "Status: Reprovado". */

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da nota 1: ");
        double nota1 = scanner.nextInt();
        System.out.println("Digite o valor da nota 2: ");
        double nota2 = scanner.nextInt();

        double media = (nota1 + nota2) / 2.0;
        if (media >= 7.0) {
            System.out.println("Status: Aprovado. " + media);
        } else if (media >= 5) {
            System.out.println("Status: Recuperação. " + media);
        } else {
            System.out.println("Status: Reprovado. " + media);
        }
    }

}
