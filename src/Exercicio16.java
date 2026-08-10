/*
In this problem, the task is to read a code of a product 1, the number of units of product 1, the price for one unit of product 1, the code of a product 2, the number of units of product 2 and the price for one unit of product 2. After this, calculate and show the amount to be paid.d
Input
The input file contains two lines of data. In each line there will be 3 values: two integers and a floating value with 2 digits after the decimal point.

Output
The output file must be a message like the following example where "Valor a pagar" means Value to Pay. Remember the space after ":" and after "R$" symbol. The value must be presented with 2 digits after the point.

 */

import java.util.Scanner;

public class Exercicio16 { // Obrigatório ser Main
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int p1, p2;
        int qtd, qtd2;
        double preco, preco2;
        double total;

        p1 = scanner.nextInt();
        qtd = scanner.nextInt();
        preco = scanner.nextDouble();

        p2 = scanner.nextInt();
        qtd2 = scanner.nextInt();
        preco2 = scanner.nextDouble();

        total = (qtd * preco) + (qtd2 * preco2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);

        scanner.close();
    }
}


