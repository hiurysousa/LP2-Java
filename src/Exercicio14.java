public class Exercicio14 {
    public static void main(String[] args){
        int matriz[][] = new int[2][2];
        matriz[0][0] = 10;
        matriz[0][1] = 20;
        matriz[1][0] = 30;
        matriz[1][1] = 40;

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                System.out.println(matriz[i][j]);
            }
        }
    }
}
