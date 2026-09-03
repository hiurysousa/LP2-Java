import java.util.*;

public class ex03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];
        double maior = 0;
        int aprovados = 0;
        double media = 0;

        for (int i = 0; i < 5; i++){
            System.out.printf("Nota %d: ", i+1);
            notas[i] = sc.nextDouble();

            if (notas[i] > maior){
                maior = notas[i];
            }

            if (notas[i] >= 7.0){
                aprovados++;
            }

            media += notas[i];
        }
        System.out.printf("Tivemos %d aprovados, a média das notas foi %.2f e a maior nota foi %.2f", aprovados, media/5, maior);
        sc.close();
    }
}
