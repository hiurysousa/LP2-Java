import java.util.Scanner;
import java.util.Arrays; // Importante para ordenar o vetor

public class Exercicio20 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[6];
        int soma = 0;

        // Transformados em double para não perder a precisão nos cálculos
        double mediana = 0;
        double media = 0;
        double variancia = 0;
        double desvio_padrao = 0;
        double coeficiente_variacao = 0;

        System.out.println("Digite os " + vetor.length + " valores:");
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = scanner.nextInt();
            soma += vetor[i];
        }

        // ORDENAÇÃO: Obrigatório para Amplitude e Mediana funcionarem
        Arrays.sort(vetor);

        System.out.print("Vetor ordenado: ");
        for(int i = 0; i < vetor.length; i++){
            System.out.printf("%d ", vetor[i]);
        }

        /* MÉDIA E MEDIANA */

        // (double) força a divisão a manter as casas decimais
        media = ((double)soma / vetor.length);

        System.out.printf("\n\nAmplitude: %d", (vetor[vetor.length - 1] - vetor[0]));

        // Lógica corrigida para os índices da mediana
        if(vetor.length % 2 == 0){
            int meio1 = vetor.length / 2 - 1;
            int meio2 = vetor.length / 2;
            mediana = (vetor[meio1] + vetor[meio2]) / 2.0;
        } else {
            int indice = vetor.length / 2;
            mediana = vetor[indice];
        }

        System.out.printf("\nMediana: %.2f", mediana);
        System.out.printf("\nMédia: %.2f\n", media);

        /* VARIANCIA - DESVIO PADRÃO - COEFICIENTE DE VARIAÇÃO */

        for (int i = 0; i < vetor.length; i++){
            System.out.printf("\n%d - %.2f = %.2f | Ao quadrado: %.2f",
                    vetor[i], media, (vetor[i] - media), Math.pow((vetor[i]-media),2));
            variancia += Math.pow((vetor[i]-media),2);
        }

        variancia = variancia/vetor.length; // Variância populacional
        desvio_padrao = Math.sqrt(variancia);
        coeficiente_variacao = (desvio_padrao/media)*100;

        System.out.printf("\n\nVariancia: %.2f | Desvio Padrao: %.2f | Coeficiente de Variação: %.2f%%",
                variancia, desvio_padrao, coeficiente_variacao);

        if (coeficiente_variacao < 15.0){
            System.out.println("\nBaixa dispersão.");
        } else if (coeficiente_variacao >= 15.0 && coeficiente_variacao <= 30.0){
            System.out.println("\nMédia dispersão.");
        } else {
            System.out.println("\nAlta dispersão.");
        }

        scanner.close();
    }
}