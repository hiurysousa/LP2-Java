package entities;

public class Subtracao implements OperacaoMatematica {
    private int a;
    private int b;

    public Subtracao(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int calcula(){
        return a - b;
    }
}
