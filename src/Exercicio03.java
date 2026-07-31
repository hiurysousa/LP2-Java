/* Exercício 3: Laços de Repetição (For/While)
Objetivo: Entender a iteração.
Tarefa:
Escreva um código que utilize um laço de repetição para imprimir a tabuada do número 5, do 1 ao 10, no seguinte formato:
5 x 1 = 5
5 x 2 = 10
... e assim por diante. */
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero para ver sua tabuada: ");
        int numero = scanner.nextInt();
        for (int i = 0; i < 10; i++){
            System.out.println(numero + " x " + i + " = " + numero*i);
        }
    }
}
