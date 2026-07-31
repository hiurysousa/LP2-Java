/*Exercício 1: Declaração e Operações com Variáveis
Objetivo: Praticar tipos primitivos e operadores aritméticos.
Tarefa:
Escreva um pequeno programa que: Declare duas variáveis inteiras chamadas nota1 e nota2.
Atribua os valores 8 e 6 a elas, respectivamente. Calcule a média dessas notas.
Imprima no console a frase: "A média final é: " seguida do valor calculado. */

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da nota 1: ");
        int nota1 = scanner.nextInt();
        System.out.println("Digite o valor da nota 2: ");
        int nota2 = scanner.nextInt();

        System.out.println("A média final é: " + (nota1+nota2)/2);
    }
}
